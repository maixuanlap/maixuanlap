CREATE TABLE gallery (
idGallery int(11) AUTO_INCREMENT PRIMARY KEY not null,
titleGallery LONGTEXT not null,
descGallery LONGTEXT not null,
imgFullNameGallery LONGTEXT not null,
orderGallery int(11) not null
);
INSERT INTO `gallery` (`idGallery`, `titleGallery`, `descGallery`, `imgFullNameGallery`, `orderGallery`) VALUES
(1, 'Nail', 'Softly hand', 'hand.jpg', 1),
(2, 'Teamwork', 'Working together', 'teamwork.jpg', 2),
(3, 'Sky', 'Walking on the Sky', 'bluesky.jpg', 3),
(4, 'Cascade', 'Panorama picture', 'cascade.jpg', 4),
(5, 'Mount', 'Mount is nice view', 'mount.jpg', 5),
(6, 'Face', 'Its sexy girl', 'face.jpg', 6),
(7, 'Flying', 'Flying on the Skype', 'flying.jpg', 7),
(8, 'Country', 'Country side is very beautiful', 'countryside.jpg', 8);