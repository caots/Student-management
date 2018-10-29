DROP database IF EXISTS `student_db`;
create database `student_db`;
use student_db;
DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(64) DEFAULT NULL,
`dob` datetime NOT NULL,
`math_id` int(11) NOT NULL,
`physics_id` int(11) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'hoanganhtuan','1996-05-02 00:00:00',1,2),(2,'tuyen','1992-12-12 00:00:00',3,4),(3,'huy','1998-03-02 00:00:00',5,6);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`mark` decimal(5,2) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,8.50),(2,8.00),(3,5.00),(4,8.00),(5,10.00),(6,10.00);
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;