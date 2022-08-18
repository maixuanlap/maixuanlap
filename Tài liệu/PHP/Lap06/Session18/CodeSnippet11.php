<html>
<body>
<?php
$server = 'localhost';
$username = 'root';
$password = '';
$connect_mysql = mysqli_connect($server, $username, $password);
if ($connect_mysql)
    echo "Connection established";
$mysql_db = mysqli_select_db($connect_mysql,'user');
if ($mysql_db)
    echo "<br><br>Connected to the database<br><br>";
echo "<TABLE BORDER BGCOLOR = 'WHITE'> ";
echo "<TR><TH>user_id</TH><TH>user_name</TH><TH>user_email_id</TH>";
echo "<DBQUERY q> SELECT * FROM user_contact";
echo "<DBROW><TR><TD><? q.user.id</TD><? q.user_name></TD><TD><? q.user_email_id></TD><TR></TR>";
echo "</DBQUERY>";
echo "</TR>";
echo "</TABLE>";
?>
</body>
</html>
