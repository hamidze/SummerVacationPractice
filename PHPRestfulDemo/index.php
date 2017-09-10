<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/9
 * Time: 12:09
 */
require __DIR__.'/lib/User.php';
$pdo = require __DIR__ . '/lib/db.php';
$user = new User($pdo);
print_r($user->login('admin', 'admin'));