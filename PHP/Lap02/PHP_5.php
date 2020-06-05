<?php
for($count =1;$count <= 10;$count++){
    echo $count. '' ."<br>";
}
echo "<br>";
for($count =1;$count <= 10;$count = $count +3){
    echo $count. ''."<br>";
}
echo "<br>";
for($count =1;$count <= 10;$count++){
    $roll = rand(1,6);
    echo '<p>You rolled a '.$roll.'</p>';
    if ($roll ==6 ){
        echo '<p>You win!</p>';
    }
    else
    {
        echo '<p>Sorry, you didn\'t win, better luck next time!</p>';
    }
}
echo '<p>Thanks for playing</p>';
echo "<br>";
$roll = rand(1,6);
echo '<p>You rolled a '. $roll.'</p>';
if ($roll == 6){
    echo '<p>You win!</p>';
}
else
{
    echo '<p>Sorry,you didn\'t,better luck next time!</p>';
}
?>