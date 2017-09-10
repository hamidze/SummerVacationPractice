<?php
/**
 * 连接数据库并返回数据库连接句柄
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/9
 * Time: 12:10
 */
$pdo = new PDO('mysql:host=localhost;dbname=restful','root','000000');
$pdo->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);
return $pdo;