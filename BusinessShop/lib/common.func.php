<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/3
 * Time: 10:09
 */
function alertMes($mes,$url){
    echo "<script>alert('{$mes}');</script>";
    echo "<script>window.location='{$url}';</script>";
}