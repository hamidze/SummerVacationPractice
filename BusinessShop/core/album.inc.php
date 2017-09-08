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

/**
 * 根据商品id得到商品图片
 * @param int $id
 * @return array
 */
function getProImgById($link, $id){
    $sql="select albumPath from imooc_album where pid={$id} limit 1";
    $row=fetchOne($link, $sql);
    return $row;
}

/**
 * 根据商品id得到所有图片
 * @param int $id
 * @return array
 */
function getProImgsById($link, $id){
    $sql="select albumPath from imooc_album where pid={$id} ";
    $rows=fetchAll($sql, $link);
    return $rows;
}