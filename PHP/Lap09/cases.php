<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>My Portfolio</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
<header>
    <a href="#" class="header-brand">GALLARY</a>
    <nav>
        <ul>
            <li><a href="portfolio.html">Portfolio</a></li>
            <li><a href="about.html">About me</a></li>
            <li><a href="contact.html">Contact</a></li>
        </ul>
        <a href="cases.php" class="header-cases">Album</a>
    </nav>
</header>
<main>
    <section class="cases-links">
        <div class="wrapper">
            <h2>GALLARY</h2>
            <?php
            $hn = 'localhost';
            $un = 'root';
            $pw = '';
            $db = 'mygallery';

            $connection = new mysqli($hn, $un, $pw, $db);
            if ($connection->connect_error) die("Fatal Error");

            $query = "SELECT * FROM gallery";
            $result = $connection->query($query);
            if (!$result) die("User not found");

            $rows = $result->num_rows;
            for ($j = 0;$j < $rows; $j++)
            {
                $row = $result->fetch_array(MYSQLI_ASSOC);
                echo '<a href="styles/cases.html">
                <div class="cases-link">
                    <img width="236px" height="236px class ="cases-link" src="img/gallery/' .$row['imgFullNameGallery'].'">
                    <h3  class="cases-title">'.$row['titleGallery'].'</h3>
                    <p class="cases-desc">'.$row['descGallery'].'</p>
                </div>
            </a>';
            }
            ?>
        </div>
    </section>

</main>
<div class="wrapper">
    <footer>
        <ul class="footer-links-main">
            <li><a href="#">Home</a></li>
            <li><a href="#">Cases</a></li>
            <li><a href="#">Portfolio</a></li>
            <li><a href="#">About me</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <ul class="footer-links-cases">
            <li><p>Latest cases</p></li>
            <li><a href="#">MALING SHAOLIN - WEB DEVELOPMENT</a></li>
            <li><a href="#">EXCELLENTO - WEB DEVELOPMENT, SEO</a></li>
            <li><a href="#">MMTUTS - YOUTUBE CHANNEL</a></li>
            <li><a href="#">WELTEC - VIDEO PRODUCTION</a></li>
        </ul>
        <div class="footer-sm">
            <a href="#">
                <img src="img/youtube-symbol.png" alt="youtube icon">
            </a>
            <a href="#">
                <img src="img/twitter-logo-button.png" alt="youtube icon">
            </a>
            <a href="#">
                <img src="img/facebook-logo-button.png" alt="youtube icon">
            </a>
        </div>
    </footer>
</div>
</body>
</html>