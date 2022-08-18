<?php
$num2=0;
echo"the multiplication value od 14*15 is<br>";
function mutiply()
{
    $num1=14;
    $num2=15;
    $num2=$num1*$num2;
    echo$num2;
}
mutiply();
echo"<br>the value of the local variable on exiting a function is<br>";
echo$num2;

?>