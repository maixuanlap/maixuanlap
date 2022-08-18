<?php
$connect=mysqli_connect('localhost','root','','publiccations');
if($result=mysqli_query($connect,"SELECT*FROM classics"))
{
    $rows=mysqli_num_rows($result);
    echo"The table contains $rows rows.<br>";

}
?>