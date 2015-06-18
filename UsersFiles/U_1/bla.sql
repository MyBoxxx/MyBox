CREATE DATABASE  IF NOT EXISTS `myBox` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `myBox`;
-- MySQL dump 10.13  Distrib 5.6.22, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: myBox
-- ------------------------------------------------------
-- Server version	5.6.24

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
-- Table structure for table `AdminRequsts`
--

DROP TABLE IF EXISTS `AdminRequsts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AdminRequsts` (
  `requestID` int(11) NOT NULL AUTO_INCREMENT,
  `RequestType` varchar(45) NOT NULL,
  `status` int(11) NOT NULL,
  `UserId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`requestID`),
  KEY `UserId_idx` (`UserId`),
  CONSTRAINT `UserId` FOREIGN KEY (`UserId`) REFERENCES `Users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AdminRequsts`
--

LOCK TABLES `AdminRequsts` WRITE;
/*!40000 ALTER TABLE `AdminRequsts` DISABLE KEYS */;
INSERT INTO `AdminRequsts` VALUES (0,'AddToGroup 1231',1,3),(1,'RemoveFromGroup 1234',0,3);
/*!40000 ALTER TABLE `AdminRequsts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DeletedFile`
--

DROP TABLE IF EXISTS `DeletedFile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DeletedFile` (
  `IDFile` int(11) unsigned NOT NULL,
  `TimeDeleted` date NOT NULL,
  `IDUser` int(10) unsigned NOT NULL,
  `IDDeleted` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IDDeleted`),
  KEY `IDUser_idx` (`IDUser`),
  KEY `IDfile` (`IDFile`),
  CONSTRAINT `IDUser` FOREIGN KEY (`IDUser`) REFERENCES `Users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `IDfile` FOREIGN KEY (`IDFile`) REFERENCES `Files` (`FileId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DeletedFile`
--

LOCK TABLES `DeletedFile` WRITE;
/*!40000 ALTER TABLE `DeletedFile` DISABLE KEYS */;
/*!40000 ALTER TABLE `DeletedFile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Files`
--

DROP TABLE IF EXISTS `Files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Files` (
  `FileId` int(15) unsigned NOT NULL AUTO_INCREMENT,
  `FileName` varchar(45) NOT NULL,
  `FilePath` varchar(70) NOT NULL,
  `CreatedTime` date NOT NULL,
  `Modified` date NOT NULL,
  `Permission` varchar(70) NOT NULL,
  `Owner` int(10) unsigned NOT NULL,
  `IsDeleted` int(11) NOT NULL,
  `Description` varchar(30) NOT NULL,
  `isDirectory` int(11) NOT NULL,
  PRIMARY KEY (`FileId`),
  KEY `OwnerID_idx` (`Owner`),
  CONSTRAINT `OwnerID` FOREIGN KEY (`Owner`) REFERENCES `Users` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Files`
--

LOCK TABLES `Files` WRITE;
/*!40000 ALTER TABLE `Files` DISABLE KEYS */;
/*!40000 ALTER TABLE `Files` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Group`
--

DROP TABLE IF EXISTS `Group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Group` (
  `IDGroup` int(11) NOT NULL,
  `GroupName` varchar(45) NOT NULL,
  `GroupAdmin` varchar(45) NOT NULL,
  `Permission` varchar(70) NOT NULL,
  `GroupLimit` int(11) NOT NULL,
  `MembersCount` int(11) NOT NULL,
  PRIMARY KEY (`IDGroup`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Group`
--

LOCK TABLES `Group` WRITE;
/*!40000 ALTER TABLE `Group` DISABLE KEYS */;
/*!40000 ALTER TABLE `Group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserInGroup`
--

DROP TABLE IF EXISTS `UserInGroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserInGroup` (
  `IDGroup` int(11) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `GroupName` varchar(45) NOT NULL,
  `GroupAdmin` varchar(45) NOT NULL,
  `DateJoined` date NOT NULL,
  PRIMARY KEY (`IDGroup`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserInGroup`
--

LOCK TABLES `UserInGroup` WRITE;
/*!40000 ALTER TABLE `UserInGroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `UserInGroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `UserID` int(15) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `isAdmin` int(11) NOT NULL,
  `isLogin` int(11) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES (1,'eyal.pano@gmail.com','1234',0,0),(2,'jaron0123@gmail.com','1234',1,0),(3,'eransemo@hotmail.com','1234',0,0),(4,'gennin@gmail.com','1234',0,0),(5,'admin','admin',1,0),(6,'Mishigene@gmail.com','1234',0,0);
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-16 20:28:21
