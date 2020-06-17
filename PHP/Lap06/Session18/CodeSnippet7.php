<?php
$server='';
$username='root';
$password='';
$connect_mysql=mysqli_connect($server,$username,$password);
if($connect_mysql)
{
    echo"Connection established<br>";
}
else{
    die("Unable to connect<br>");
}
$db="user";
$mysql_db=mysqli_select_db($connect_mysql,'USER');
if($mysql_db)
{
    echo"<br><br>Connection to the database<br>";
}
else {
    die("Unable to connect to the database");
}
$sql_insert="INSERT INTO user_contact(user_id,user_name,user_email_id VALUES(101,'John','john@gmail.com')";
$result=mysqli_query($connect_mysql,$sql_insert);
if($result)
{
    echo"<br><br>The records have been added to the table ";
}
else{
    echo"Unable to insert records";
    mysqli_error();
}
?>