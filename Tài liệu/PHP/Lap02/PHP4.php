<?php
$roll = rand(1,6);
echo '<p>You rolled a '.$roll. '</p>';
if ($roll == 6 or $roll ==5){
    echo '<p>You win!</p>'."<br>";
}
else
{
    echo '<p>Sorry, you didn\'t win, better luck next time!</p>';
}
echo "Thanks for playing";
?>