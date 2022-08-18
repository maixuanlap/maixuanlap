<?php
$connect_mysql=mysqli_connect('localhost','root','','publiccations');
$mysqli_db=mysqli_select_db($connect_mysql,"classics");

if (!$mysqli_db){
    die("Connection failed");
}
else
{
    echo "Current Database is selected";
}
?>