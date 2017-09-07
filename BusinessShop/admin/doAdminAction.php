<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/3
 * Time: 19:10
 */
require_once '../include.php';
checkLogined();
$act=$_REQUEST['act'];
$id=$_REQUEST['id']?$_REQUEST['id']:null;
if($act=="logout"){
    logout();
}elseif($act=="addAdmin") {
    $mes = addAdmin($link);
}elseif($act=="editAdmin"){
    $mes=editAdmin($id, $link);
}elseif($act=="delAdmin"){
    $mes=delAdmin($id, $link);
}elseif($act=="addCate") {
    $mes = addCate($link);
}elseif($act=="editCate"){
    $where="id={$id}";
    $mes=editCate($link, $where);
}elseif($act=="delCate"){
    $mes=delCate($link, $id);
}elseif($act=="addPro"){
    $mes=addPro($link);
}

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<?php
if($mes){
    echo $mes;
}
?>
</body>
</html>
