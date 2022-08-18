<?php
if(isset($_COOKIE['NAME']))
{
    $last=$_COOKIE['NAME'];
    echo"Welcome back!<br>your name is  ".$last;
}
else
{
    echo"Welcome to our site!";
}
?>