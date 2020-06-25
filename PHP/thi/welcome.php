
<?php
$hn = 'localhost';
$un = 'root';
$pw = '';
$db = 'register';
$connection = mysqli_connect($hn,$un,$pw,$db);
if ($connection->connect_error) die("Fatal Error");
$fullname = $_POST['fullname'];
$email = $_POST['email'];
$username = $_POST['username'];
$password = $_POST['password'];


if (isset($_POST['Register']))
{
    if (isset($_POST['fullname']) &&
        isset($_POST['email']) &&
        isset($_POST['username']) &&
        isset($_POST['password'])) {
        $fn_temp = mysql_entities_fix_string($connection, $_POST['fullname']);
        $em_temp = mysql_entities_fix_string($connection, $_POST['email']);
        $un_temp = mysql_entities_fix_string($connection, $_POST['username']);
        $pw_temp = mysql_entities_fix_string($connection, $_POST['password']);
        $hash = password_hash($pw_temp,PASSWORD_DEFAULT);

        if($fullname == "" || $email == "" || $username == "" || $hash == "")
        {
            echo "Nhập thông tin";
        }
        else
        {
            $sql = "insert into register (fullname, email, username, password) values ('$fullname', '$email', '$username', '$hash')";
            echo "Welcome $fullname";
            $result = mysqli_query($connection,$sql);
            if (!$result) die("Đăng kí thất bại");
            else
            {
                setcookie("fullname",$fullname);
                setcookie("user", $username);
            }

        }
    }
}
$connection->close();

function mysql_entities_fix_string($connection, $string)
{
    return htmlentities(mysql_fix_string($connection, $string));
}

function mysql_fix_string($connection, $string)
{
    if (get_magic_quotes_gpc()) $string = stripslashes($string);
    return $connection->real_escape_string($string);
}
?>