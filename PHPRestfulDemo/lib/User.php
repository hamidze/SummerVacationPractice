<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/9
 * Time: 12:10
 */
require __DIR__.'/MyHttpException.php';
class User
{

    /**
     * 数据库连接句柄
     * @var
     */
    private $db = null;

    /**
     * @var string MD5加密混淆
     */
    private $salt = 'imooc';

    /**
     * User constructor.
     * @param $_db
     */
    public function __construct($db)
    {
        $this->db = $db;
    }


    /**
     * 登录
     * @param string $username
     * @param string $password
     * @return array
     * @throws Exception
     */
    public function login($username, $password)
    {
        $sql = 'SELECT * FROM `user` WHERE `username`=:username';
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam(':username', $username);
        $stmt->execute();
        $user = $stmt->fetch(PDO::FETCH_ASSOC);
        if (empty($user))
        {
            throw new MyHttpException(422, '用户名或密码错误');
        }
        if ($user['password'] != md5($password . $this->salt))
        {
            throw new MyHttpException(422, '用户名或密码错误');
        }
        //TOOD:使用授权表
        unset($user['password']);
        return $user;
    }

    /**
     * 注册
     * @param string $username
     * @param string $password
     * @return array
     * @throws Exception
     */
    public function register($username, $password)
    {
        $username = trim($username);
        if (empty($username))
        {
            throw new MyHttpException(422, '用户名不能为空');
        }
        $password = trim($password);
        if (empty($password))
        {
            throw new MyHttpException(422, '密码不能为空');
        }
        //检测是否存在该用户
        if ($this->isUsernameExists($username))
        {
            throw new MyHttpException(422, '用户名已存在');
        }
        $password = md5($password . $this->salt);
        $createdAt = time();
        if ($this->db === null)
        {
            throw new MyHttpException(500, '数据库连接失败');
        }
        $sql = 'INSERT INTO `user`(`username`,`password`,`createdAt`) VALUES(:username,:password,:createdAt)';
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam(':username', $username);
        $stmt->bindParam(':password', $password);
        $stmt->bindParam(':createdAt', $createdAt);
        if (!$stmt->execute())
        {
            throw new MyHttpException(500, '注册失败');
        }
        $userId = $this->db->lastInsertId();
        return [
            'userId' => $userId,
            'username' => $username,
            'createdAt' => $createdAt
        ];
    }

    /**
     * 检测用户名是否存在
     * @param $username
     * @return bool
     * @throws Exception
     */
    private function isUsernameExists($username)
    {
        if ($this->db === null)
        {
            throw new MyHttpException(500, '数据库连接失败');
        }
        $sql = 'SELECT userId FROM `user` WHERE username = :username';
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam(':username', $username);
        $stmt->execute();
        $result = $stmt->fetch(PDO::FETCH_ASSOC);
        return !empty($result);
    }

}