<?php
class Greeting{
    private $word="Hello";
}
$Closude=function($whom){
    echo"$this->word $whom\n";
};
$obj=new Greeting();
$Closude->call($obj,'John');
$Closude->call($obj,'Kevin');
?>

