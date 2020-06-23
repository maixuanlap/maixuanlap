<?php
$files = "urs/local/apache2/htdocs/example.txt";

$to = "recipient@example.com";
$from = "yourname@example.com";
$subject = "Test e-mail";
$message = "Sample message";
$header = "From: $from";

$semi_rand = md5(time());
$mine_boundary = "==Multipart_Boundary_x($semi_rand)x";


$headers .= "\nMINE-Version: 1.0\n"."Content-Type: multipart/mixed;
             \n"."boundary=\"($mine_boundary)\"";

$message = "This is an example for mail attachment in MINE format.
            \n\n"."--($mine_boundary)\n".
    "Content-Type: text/plain; charset=\"iso-8859-1\"\n".
    $message . // "\n\n";
    $message .= "--($mine_boundary)\n";

$file = fopen($files,"rb");
$content = fread($file,filesize($files));
fclose($file);
$message .= "Content-Type: {\"application/octet-stream\");\n"."name=\"$files\"\n". "Content-Disposition: attachment;\n"."filename=\"$files\"\n".$content."\n\n";
$message .= "--($mine_boundary)\n";

$send_mail = @mail($to,$subject,$message,$headers);
if ($send_mail)
{
    echo "<p>Mail sent to $to!!!!</p>";
}
else
{
    echo "<p>Mail could not be sent to $to </p>";
}
?>