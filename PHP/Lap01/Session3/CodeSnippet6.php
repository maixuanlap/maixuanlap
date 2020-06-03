<?php
function e() {
    echo "This is e()\n";
};
function f() {
    echo "This is f()\n";
    echo '</br>';
    return 'e';
};
function g() {
    echo "This is g()\n";
    echo '</br>';
    return  'f' ;
};
g();
echo"***********\n";
echo '</br>';
g()();
echo "**********\n";
echo '</br>';
g()()();
?>
