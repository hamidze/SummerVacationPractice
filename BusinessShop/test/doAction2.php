<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/6
 * Time: 16:55
 */
require_once '../lib/string.func.php';
require_once 'upload.func.php';
header("content-type:text/html;charset=utf-8");
//print_r($_FILES);
foreach($_FILES as $val){
    $mes=uploadFile($val);
    echo $mes;
}