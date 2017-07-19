<?php
$var = "大家来学PHP";
echo $var;
echo "<br />";
$var = "学PHP上慕课网";
echo $var;

$my_book = "我的小写的book";
$my_BOOK = "我的大写的BOOK";
echo $my_book;
echo "<br />";
echo $my_BOOK;
echo "<br />";
$my_book = "这次奇迹要发生啦";
echo $my_book;
echo "<br />";

echo $m1 = memory_get_usage();
echo "<br />";
$var_string = "123";
echo $m2 = memory_get_usage()-$m1;
echo "<br />";
$n=123;
echo $m3 = memory_get_usage()-$m1-$m2;
echo "<br />";
$f=123.00;
echo $m4 = memory_get_usage()-$m1-$m2-$m3;
echo "<br />";
$var_array = array("123");
echo $m5 = memory_get_usage()-$m1-$m2-$m3-$m4;

$string = "就是就是";
var_dump($string);
echo "<br />";
$string = 9494;
var_dump($string);
echo "<br />";
?>