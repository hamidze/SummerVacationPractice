<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/7
 * Time: 8:30
 */
function addAlbum($link, $arr){
    insert("imooc_album", $arr, $link);
}