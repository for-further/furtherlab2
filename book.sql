CREATE TABLE `book` (
  `ISBN` varchar(45) NOT NULL,
  `TITLE` varchar(100) NOT NULL,
  `AuthorID` int(11) NOT NULL,
  `Publisher` varchar(45) NOT NULL,
  `PublishDate` varchar(45) NOT NULL,
  `Price` varchar(45) NOT NULL,
  PRIMARY KEY (`ISBN`),
  KEY `AuthorID_idx` (`AuthorID`),
  CONSTRAINT `AuthorID` FOREIGN KEY (`AuthorID`) REFERENCES `author` (`AuthorID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `book` VALUES ('0000000000000','TAT',7,'my','1 October 2014','2'),('010101010101','QAQ',7,'my','1 October 2014','4'),('1010101010101','lalala',7,'my','1 October 2014','3'),('1111111111111','sfdff',7,'my','1 October 2014','1'),('7-02-003344-X','Harry Potter and the Chamber of Secrets',1,'Bloomsbury','2 July 1998','22'),('7-02-003463-2','Harry Potter and the Goblet of Fire',1,'Bloomsbury','8 July 2000','39.8'),('978-7-5600-1346-6','New Concept English 1',2,'Foreign Language Teaching and Research','1 October 1997','29.9'),('978-702-0033454','Harry Potter and the Prisoner of Azkaban',1,'Bloomsbury','8 September 1999','27'),('9780316286398','The Goldfinch',5,'Hachette','1 June 2014','69'),('9780751536829','Five People You Meet in Heaven B',4,'little brown','1 June 2014','108'),('9781444761788','Cloud Atlas - Movie Tie-In Ed',3,'Orion','1 June 2012','96'),('9781472200327','The Ocean at the End of the Lane',6,'Hodder','1 June 2013','204'),('9787560013473','New Concept English 2',2,'Foreign Language Teaching and Research','1 October 1997','38.9'),('9787560013480','New Concept English 3',2,'Foreign Language Teaching and Research','1 October 1997','28'),('9787560013497','New Concept English 4',2,'Foreign Language Teaching and Research','1 October 1997','30');
