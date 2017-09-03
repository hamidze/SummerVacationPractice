<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/3
 * Time: 15:07
 */
require_once '../include.php';
$username = $_POST['username'];
$password = md5($_POST['password']);
$verify = $_POST['verify'];
$verify1 = $_SESSION['verify'];
if($verify == $verify1){
    $sql = "select * from imooc_admin where username='{$username}' and password='{$password}'";
    $row = checkAdmin($sql);
//    var_dump($res);
    if($row){
        $_SESSION['adminName']=$row['username'];
        $_SESSION['adminId']=$row['id'];
//        header("location:index.php");
        alertMes("登陆成功","index.php");
    }else{
        alertMes("登陆失败，重新登陆","login.php");
    }
}else{
    alertMes("验证码错误","login.php");
}