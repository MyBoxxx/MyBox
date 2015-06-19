-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: mybox
-- ------------------------------------------------------
-- Server version	5.6.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminrequsts`
--

DROP TABLE IF EXISTS `adminrequsts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminrequsts` (
  `requestID` int(11) NOT NULL AUTO_INCREMENT,
  `RequestType` varchar(45) NOT NULL,
  `status` int(2) NOT NULL,
  `UserId` int(15) unsigned NOT NULL,
  PRIMARY KEY (`requestID`),
  KEY `UserId_idx` (`UserId`),
  CONSTRAINT `UserId` FOREIGN KEY (`UserId`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminrequsts`
--

LOCK TABLES `adminrequsts` WRITE;
/*!40000 ALTER TABLE `adminrequsts` DISABLE KEYS */;
INSERT INTO `adminrequsts` VALUES (0,'AddToGroup 1231',1,3),(1,'RemoveFromGroup 1234',0,3);
/*!40000 ALTER TABLE `adminrequsts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deletedfile`
--

DROP TABLE IF EXISTS `deletedfile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deletedfile` (
  `IDFile` int(15) unsigned NOT NULL,
  `TimeDeleted` date NOT NULL,
  `IDUser` int(15) unsigned NOT NULL,
  `IDDeleted` int(15) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IDDeleted`),
  KEY `IDUser_idx` (`IDUser`),
  KEY `IDfile` (`IDFile`),
  CONSTRAINT `IDUser` FOREIGN KEY (`IDUser`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `IDfile` FOREIGN KEY (`IDFile`) REFERENCES `files` (`FileId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deletedfile`
--

LOCK TABLES `deletedfile` WRITE;
/*!40000 ALTER TABLE `deletedfile` DISABLE KEYS */;
INSERT INTO `deletedfile` VALUES (1,'2015-05-30',1,1),(2,'2027-02-14',1,2),(3,'2015-05-30',1,3),(1,'2015-05-22',1,4),(2,'2015-05-30',2,7),(1,'2015-05-30',1,9),(1,'2015-05-22',1,11),(1,'2015-05-22',1,44),(1,'2014-02-02',1,45),(1,'2015-06-01',2,55),(2,'2015-05-22',2,113);
/*!40000 ALTER TABLE `deletedfile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fileingroup`
--

DROP TABLE IF EXISTS `fileingroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fileingroup` (
  `FileID` int(15) NOT NULL,
  `AddDate` varchar(45) NOT NULL,
  `GroupID` int(15) unsigned DEFAULT NULL,
  PRIMARY KEY (`FileID`),
  KEY `GroupID_idx` (`GroupID`),
  CONSTRAINT `GroupID` FOREIGN KEY (`GroupID`) REFERENCES `groups` (`IDGroup`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fileingroup`
--

LOCK TABLES `fileingroup` WRITE;
/*!40000 ALTER TABLE `fileingroup` DISABLE KEYS */;
INSERT INTO `fileingroup` VALUES (1,'2015-22-05',1),(2,'2015-22-05',2);
/*!40000 ALTER TABLE `fileingroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `files`
--

DROP TABLE IF EXISTS `files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `files` (
  `FileId` int(15) unsigned NOT NULL AUTO_INCREMENT,
  `FileName` varchar(45) NOT NULL,
  `FilePath` varchar(140) NOT NULL,
  `CreatedTime` date DEFAULT NULL,
  `Modified` date DEFAULT NULL,
  `Permission` int(3) DEFAULT NULL,
  `Owner` int(15) unsigned DEFAULT NULL,
  `IsDeleted` int(1) DEFAULT NULL,
  `Description` varchar(30) DEFAULT NULL,
  `isDirectory` int(1) DEFAULT NULL,
  PRIMARY KEY (`FileId`),
  KEY `OwnerID_idx` (`Owner`),
  CONSTRAINT `OwnerID` FOREIGN KEY (`Owner`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `files`
--

LOCK TABLES `files` WRITE;
/*!40000 ALTER TABLE `files` DISABLE KEYS */;
INSERT INTO `files` VALUES (0,'.','\\UsersFiles\\U_0\\',NULL,NULL,NULL,0,NULL,NULL,1),(1,'.','\\UsersFiles\\U_1\\',NULL,NULL,NULL,1,NULL,NULL,1),(2,'.','\\UsersFiles\\U_2\\',NULL,NULL,NULL,2,1,NULL,1),(3,'.','\\UsersFiles\\U_3\\',NULL,NULL,NULL,3,NULL,NULL,0),(4,'.','\\UsersFiles\\U_4\\',NULL,NULL,NULL,4,NULL,NULL,1),(12,'yaron','',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `files` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups`
--

DROP TABLE IF EXISTS `groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `IDGroup` int(15) unsigned NOT NULL,
  `GroupName` varchar(45) NOT NULL,
  `GroupAdmin` int(15) unsigned NOT NULL,
  `Permission` varchar(70) NOT NULL,
  `GroupLimit` int(11) NOT NULL,
  `MembersCount` int(11) NOT NULL,
  PRIMARY KEY (`IDGroup`),
  UNIQUE KEY `GroupName_UNIQUE` (`GroupName`),
  KEY `group_idx` (`GroupAdmin`),
  CONSTRAINT `admin` FOREIGN KEY (`GroupAdmin`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups`
--

LOCK TABLES `groups` WRITE;
/*!40000 ALTER TABLE `groups` DISABLE KEYS */;
INSERT INTO `groups` VALUES (1,'test',1,'',10,7),(2,'tester',2,'',10,7);
/*!40000 ALTER TABLE `groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sharing`
--

DROP TABLE IF EXISTS `sharing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sharing` (
  `idSharing` int(15) NOT NULL AUTO_INCREMENT,
  `Id_share` int(15) unsigned NOT NULL,
  `Id_sharedwith` int(15) unsigned NOT NULL,
  `id_file` int(15) unsigned NOT NULL,
  `id_premition` int(3) NOT NULL,
  PRIMARY KEY (`idSharing`),
  KEY `id_share_idx` (`Id_share`),
  KEY `file_idx` (`id_file`),
  KEY `user_idx` (`Id_sharedwith`),
  CONSTRAINT `file` FOREIGN KEY (`id_file`) REFERENCES `files` (`FileId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user` FOREIGN KEY (`Id_share`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user2` FOREIGN KEY (`Id_sharedwith`) REFERENCES `users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sharing`
--

LOCK TABLES `sharing` WRITE;
/*!40000 ALTER TABLE `sharing` DISABLE KEYS */;
/*!40000 ALTER TABLE `sharing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useringroup`
--

DROP TABLE IF EXISTS `useringroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `useringroup` (
  `IDGroup` int(15) unsigned NOT NULL,
  `DateJoined` date NOT NULL,
  `IdUser` int(15) unsigned NOT NULL,
  KEY `user_idx` (`IdUser`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `useringroup`
--

LOCK TABLES `useringroup` WRITE;
/*!40000 ALTER TABLE `useringroup` DISABLE KEYS */;
INSERT INTO `useringroup` VALUES (1,'2012-07-15',1),(2,'2013-07-15',1),(2,'2013-07-15',2);
/*!40000 ALTER TABLE `useringroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `UserID` int(15) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `isAdmin` int(11) NOT NULL,
  `isLogin` int(11) NOT NULL,
  `memberSience` varchar(45) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'eyal.pano@gmail.com','1234',0,0,'2015-12-08'),(2,'jaron0123@gmail.com','1234',1,0,''),(3,'eransemo@hotmail.com','1234',0,0,''),(4,'gennin@gmail.com','1234',0,0,''),(5,'admin','admin',1,0,''),(6,'Mishigene@gmail.com','1234',0,0,'');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mybox'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-18 21:26:05
