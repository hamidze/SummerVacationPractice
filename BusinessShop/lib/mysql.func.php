<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/3
 * Time: 10:08
 */

$link = "";

/**
 * 连接数据库
 * @return resource
 */
function connect($link1){
    mysqli_set_charset($link1, DB_CHARSET);
    mysqli_select_db($link1, DB_NAME) or die("指定数据库打开失败");
    global $link;
    $link = $link1;
    return $link1;
}

/**
 * 完成记录插入的操作
 * @param string $table
 * @param array $array
 * @return number
 */
function insert($table,$array){
    $keys=join(",",array_keys($array));
    $vals="'".join("','",array_values($array))."'";
    $sql="insert {$table}($keys) values({$vals})";
    global $link;
    mysqli_query($link, $sql);
    return mysqli_insert_id();
}

//update imooc_admin set username='king' where id=1
/**
 * 记录的更新操作
 * @param string $table
 * @param array $array
 * @param string $where
 * @return number
 */
function update($table,$array,$where=null){
    $str = null;
    foreach($array as $key=>$val){
        if($str==null){
            $sep="";
        }else{
            $sep=",";
        }
        $str.=$sep.$key."='".$val."'";
    }
    $sql="update {$table} set {$str} ".($where==null?null:" where ".$where);
    global $link;
    $result=mysqli_query($link, $sql);
    //var_dump($result);
    //var_dump(mysql_affected_rows());exit;
    if($result){
        return mysqli_affected_rows();
    }else{
        return false;
    }
}

/**
 *	删除记录
 * @param string $table
 * @param string $where
 * @return number
 */
function delete($table,$where=null){
    $where=$where==null?null:" where ".$where;
    $sql="delete from {$table} {$where}";
    global $link;
    mysqli_query($link,$sql);
    return mysqli_affected_rows();
}

/**
 *得到指定一条记录
 * @param string $sql
 * @param string $result_type
 * @return multitype:
 */
function fetchOne($sql,$result_type=MYSQL_ASSOC){
    global $link;
    $result=mysqli_query($link, $sql);
    $row=mysqli_fetch_array($result,$result_type);
    return $row;
}


/**
 * 得到结果集中所有记录 ...
 * @param string $sql
 * @param string $result_type
 * @return multitype:
 */
function fetchAll($sql,$result_type=MYSQL_ASSOC){
    global $link;
    $result=mysqli_query($link, $sql);
    while(@$row=mysqli_fetch_array($result,$result_type)){
        $rows[]=$row;
    }
    return $rows;
}

/**
 * 得到结果集中的记录条数
 * @param unknown_type $sql
 * @return number
 */
function getResultNum($sql){
    global $link;
    $result=mysqli_query($link,$sql);
    return mysqli_num_rows($result);
}

/**
 * 得到上一步插入记录的ID号
 * @return number
 */
function getInsertId(){
    return mysqli_insert_id();
}