<?php
$server='';
$username='root';
$password='';
$connect_mysql=mysqli_connect($server,$username,$password);
if($connect_mysql)
{
    echo"Connect established<br>";
}
else{
    die("Unable to connect<br>");
}
$mysql_db=mysqli_select_db($connect_mysql,'user');
if($mysql_db)
{
    echo"Connected to the database <br>";
}
else{
    die("Unable to connect to the database<br>");
}
$sql_update=("UPDATE user_contact SET USER_NAME='David'WHERE USER_ID='102'");
$result=mysqli_query($connect_mysql,$sql_update);
if($result)
{
    echo"RECORDS UPDATED:$result<br>";
}
else{
    echo"UNABLE TO UPDATE RECORDS";
    printf("Error message:%s\n,mysqli_error($connect_mysql)");
}
?>