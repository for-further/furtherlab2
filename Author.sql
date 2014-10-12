CREATE TABLE `author` (
  `AuthorID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Age` varchar(45) NOT NULL,
  `Country` varchar(45) NOT NULL,
  PRIMARY KEY (`AuthorID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
INSERT INTO `author` VALUES (1,'Joanne Rowling','48','UK'),(2,'L.G. Alexander','60','UK'),(3,'David Mitchell','45','UK'),(4,'Mitch Albom','55','USA'),(5,'Donna Tartt','51','USA'),(6,'Neil Gaiman','54','UK'),(7,'aaa','22','China');
