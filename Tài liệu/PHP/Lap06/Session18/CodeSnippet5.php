<?php
$connect_mysql = mysqli_connect('localhost','root','','publiccations');
$result = mysqli_query($connect_mysql,'select * from customers');
while ($row = mysqli_fetch_row($result)){
    printf("%s (%s)\n<br>", $row[0], $row[1]);
}

