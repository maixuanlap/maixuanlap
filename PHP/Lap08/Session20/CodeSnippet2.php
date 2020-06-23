<?php
$val1 = $_GET['logname'];
$val2 = $_GET['pass'];

setcookie("logname",$val1);
if ($val1=="")
{
    echo "Please enter the name!";
    echo "<html>";
    echo "<head>";
    echo "<title> Validate </title>";
    echo "</head>";
    echo "<body>";
    echo "<br>";
    echo "<a href ='CodeSnippet1.php'>Back</a>";
    echo "</body>";
    echo "</html>";
}
else if ($val2=="")
{
    echo "Please enter the password!";
    echo "<html>";
    echo "<head>";
    echo "<title> Validate </title>";
    echo "</head>";
    echo "<body>";
    echo "<br>";
    echo "<a href ='CodeSnippet1.php'>Back</a>";
    echo "</body>";
    echo "</html>";
}
else
{
    Header("Location: CodeSnippet1.php");
}
?>