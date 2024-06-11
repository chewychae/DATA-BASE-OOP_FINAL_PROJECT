CREATE DATABASE  IF NOT EXISTS `my` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `my`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: my
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Course_code` varchar(45) DEFAULT NULL,
  `Course_title` varchar(80) DEFAULT NULL,
  `INSTRUCTOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_COURSE_INSTRUCTOR1_idx` (`INSTRUCTOR_ID`),
  CONSTRAINT `fk_COURSE_INSTRUCTOR1` FOREIGN KEY (`INSTRUCTOR_ID`) REFERENCES `instructor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'EPHYS 121','Physics for Engineers 1',2),(2,'EPHYS 110','Physics for Engineers 2',8),(3,'CCIS 111','Introduction to Computer Science',7),(4,'CCIS 335','Artificial Intelligence and Machine Learning',9),(5,'ANAT 201','Human Anatomy and Physiology',6),(6,'PHAR 301','Pharmacology and Public Health',5),(7,'EDUC 101','Introduction to Education',1),(8,'ARTS 201','Art History and Appreciation',3),(9,'ENGR 101','Introduction to Engineering Design',2),(10,'BUSI 201','Business Ethics',4),(11,'ACCT 101','Financial Accounting',4);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ilibrary`
--

DROP TABLE IF EXISTS `ilibrary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ilibrary` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Book_title` varchar(100) DEFAULT NULL,
  `Book_type` varchar(80) DEFAULT NULL,
  `Date_borrow` date DEFAULT NULL,
  `Date_return` date DEFAULT NULL,
  `INSTRUCTOR_ID` int(11) NOT NULL,
  `Book_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ilibrary_INSTRUCTOR1_idx` (`INSTRUCTOR_ID`),
  KEY `fk_inventory_ID` (`Book_ID`),
  CONSTRAINT `fk_ilibrary_INSTRUCTOR1` FOREIGN KEY (`INSTRUCTOR_ID`) REFERENCES `instructor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ilibrary`
--

LOCK TABLES `ilibrary` WRITE;
/*!40000 ALTER TABLE `ilibrary` DISABLE KEYS */;
INSERT INTO `ilibrary` VALUES (1,'Textbook','Univerity Physics with Modern Physics by Hugh D. Yound and Roger A. Freedman','0000-00-00','0000-00-00',2,1),(2,'Textbook','Material Science and Engineering','0000-00-00','0000-00-00',8,6),(3,'Textbook','Accounting Principles: A business Perspective by Hermanson, Edwards, Maher','0000-00-01','0000-00-00',4,4),(5,'Non-Fiction','The Library Book','0000-00-00','0000-00-00',4,7),(7,'Fiction','DEWEY: The Small-Town Liblary Cat Who touched the World','0000-00-00','0000-00-00',1,9),(8,'Textbook','Material Science and Engineering','0000-00-00','0000-00-00',9,6),(9,'Fiction','DEWEY: The Small-Town Liblary Cat Who touched the World','0000-00-00','0000-00-00',7,9),(10,'Textbook','Accounting Principles: A business Perspective by Hermanson, Edwards, Maher','0000-00-00','0000-00-00',4,4);
/*!40000 ALTER TABLE `ilibrary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `instructor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Full_Name` varchar(100) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Age` varchar(20) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Contact` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Email_Address` varchar(100) DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (1,'Im, Nayeon','Female','28','1995-07-22','09563248265','Seoul, South Korea','bunny@gmail.com','CEDAS'),(2,'Yoo, Jeongyeon','Male','28','1996-11-01','09586425371','Suwon, South Korea','ostrich@gmail.com','COE'),(3,'Hirai, Momo','Female','28','1996-11-09','09658213654','Kyoto, Japan','raccoon@gmail.com','CEDAS'),(4,'Minatozaki, Sana','Female','28','1996-12-09','09256832657','Osaka, Japan','hamster@gmail.com','CABE'),(5,'Park, Jihyo','Female','27','1997-02-01','09632125478','Guri, South Korea','owl@gmail.com','CHS'),(6,'Myoi, Mina','Female','27','1997-03-24','09562148753','Tokyo, Japan','penguin@gmail.com','CHS'),(7,'Kim, Dahyun','Male','26','1998-05-28','0985642156','Gyeonggi-do, South Korea','eagle@gmail.com','CCIS'),(8,'Son, Chaeyoung','Male','25','1999-04-23','09652341568','Gangdong, South Korea','tiger@gmail.com','COE'),(9,'Chou, Tzuyu','Male','25','1999-06-14','09854672135','Tainan, Taiwan','deer@gmail.com','CCIS'),(10,'ewf','we','wef','0000-00-00','efwf','gegrege','egg','gerge');
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventorylib`
--

DROP TABLE IF EXISTS `inventorylib`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inventorylib` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Book_title` varchar(100) DEFAULT NULL,
  `Book_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventorylib`
--

LOCK TABLES `inventorylib` WRITE;
/*!40000 ALTER TABLE `inventorylib` DISABLE KEYS */;
INSERT INTO `inventorylib` VALUES (1,'Univerity Physics with Modern Physics by Hugh D. Yound and Roger A. Freedman','Textbook'),(2,'Introduction to Electrodynamics by David J. Griffiths','Textbook'),(3,'The Feynman Lectures on Physics by Ritchard P. Feynman','Textbook'),(4,'Accounting Principles: A business Perspective by Hermanson, Edwards, Maher','Textbook'),(5,'The AMA Handbook of financial Risk Management by John J. Hampton','Reference/Handbook'),(6,'Material Science and Engineering','Textbook'),(7,'The Library Book','Non-Fiction'),(8,'The Midnight Library','Fiction'),(9,'DEWEY: The Small-Town Liblary Cat Who touched the World','Fiction'),(10,'The Great Gatsby by F. Scott Fitzgerald','Fiction'),(11,'DEWEY: The Small-Town Liblary Cat Who touched the World','Non-Fiction'),(12,'The tale of two Cities by Charles Dickens','Classic'),(13,'Sapiens: A Brief History of Humankind by Yuval Noah Harari','Non-Fiction'),(14,'vdd','bfdb');
/*!40000 ALTER TABLE `inventorylib` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `library`
--

DROP TABLE IF EXISTS `library`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `library` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Book_title` varchar(100) DEFAULT NULL,
  `Book_type` varchar(70) DEFAULT NULL,
  `Date_borrow` varchar(45) DEFAULT NULL,
  `Date_return` date DEFAULT NULL,
  `STUDENTS_ID` int(11) NOT NULL,
  `Book_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_library_STUDENTS_idx` (`STUDENTS_ID`),
  KEY `fk_inventory` (`Book_ID`),
  CONSTRAINT `fk_inventory` FOREIGN KEY (`Book_ID`) REFERENCES `inventorylib` (`id`),
  CONSTRAINT `fk_library_STUDENTS` FOREIGN KEY (`STUDENTS_ID`) REFERENCES `student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `library`
--

LOCK TABLES `library` WRITE;
/*!40000 ALTER TABLE `library` DISABLE KEYS */;
INSERT INTO `library` VALUES (1,'Accounting Principles: A business Perspective by Hermanson, Edwards, Maher','Textbook','2024-02-17','2024-02-22',3,4),(2,'The Midnight Library','Fiction','2024-02-17','2024-02-29',3,8),(3,'DEWEY: The Small-Town Liblary Cat Who touched the World','Fiction','2024-02-17','2024-03-01',3,11),(4,'The Great Gatsby by F. Scott Fitzgerald','Fiction','2024-03-03','2024-03-13',2,10),(5,'Sapiens: A Brief History of Humankind by Yuval Noah Harari','Non-Fiction','2024-03-03','2024-03-17',8,13),(6,'University Physic with Modern Physics by Hugh D. Young and Roger A. Freedman','Textbook','2024-03-04','2024-03-30',3,1),(7,'Univerity Physics with Modern Physics by Hugh D. Yound and Roger A. Freedman','Textbook','0000-00-00','0000-00-00',1,1),(8,'DEWEY: The Small-Town Liblary Cat Who touched the World','Non-Fiction','0000-00-00','0000-00-00',1,11),(9,'DEWEY: The Small-Town Liblary Cat Who touched the World','Non-Fiction','0000-00-00','0000-00-00',1,11),(11,'Univerity Physics with Modern Physics by Hugh D. Yound and Roger A. Freedman','Textbook','0000-00-00','0000-00-00',1,1),(12,'DEWEY: The Small-Town Liblary Cat Who touched the World','Non-Fiction','0000-00-00','0000-00-00',1,11),(13,'The Great Gatsby by F. Scott Fitzgerald','Fiction','0000-00-00','0000-00-00',2,10),(14,'vdd','bfdb','0000-00-00','0000-00-00',5,14),(15,'The Library Book','Non-Fiction','0000-00-00','0000-00-00',14,1),(16,'Univerity Physics with Modern Physics by Hugh D. Yound and Roger A. Freedman','Textbook','0000-00-00','0000-00-00',1,1);
/*!40000 ALTER TABLE `library` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Full_Name` varchar(100) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Age` varchar(20) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Contact` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Email_Address` varchar(100) DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  `INSTRUCTOR_ID` int(11) NOT NULL,
  `COURSE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_STUDENTS_INSTRUCTOR1_idx` (`INSTRUCTOR_ID`),
  KEY `fk_STUDENTS_COURSE1_idx` (`COURSE_ID`),
  CONSTRAINT `fk_STUDENTS_COURSE1` FOREIGN KEY (`COURSE_ID`) REFERENCES `course` (`id`),
  CONSTRAINT `fk_STUDENTS_INSTRUCTOR1` FOREIGN KEY (`INSTRUCTOR_ID`) REFERENCES `instructor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Yu, Jimin','Female','24','2000-04-11','09856421358','Gyeonggi-do, South Korea','jimin@gmail.com','CHS',7,3),(2,'Uchinaga, Aeri','Male','24','2000-10-30','09854263157','Seoul, South Korea','aeri@gmail.com','COE',2,9),(3,'Kim, Minjeong','Male','23','2001-01-01','098564265478','Busan, South Korean','winter@gmail.com','COE',2,9),(4,'Yizhou, Ning','Female','22','2002-10-23','09564287651','Harbon, China','star@gmail.com','CABE',4,10),(5,'Hwang, Yeji','Female','24','2000-05-26','09855356214','Jeonju, South Korea','whitefury@gmail.com','CEDAS',3,8),(6,'Shin, Ryujin','Male','23','2001-04-07','09854762514','Gangwon, South Korea','ryu@gmail.com','COE',2,8),(7,'Lee, Chaeryeong','Female','23','2001-06-05','09845123674','Yongin, South Korea','chae@gmail.com','CABE',4,11),(8,'Shin, Yuna','Male','21','2003-12-09','09854263517','Suwon, South Korea','shin2@gmail.com','CCIS',9,4),(9,'Choi, Jisu','Female','24','2000-07-21','09874562314','Incheon, South Korea','jisu@gmail.com','CHS',6,5),(10,'Kim, Chaewon','Male','24','2000-08-01','09847562154','Seoul, South Korea','chaewon@gmail.com','COE',8,2),(11,'Miyawaki, Sakura','Female','23','2001-03-19','09456821756','Kagoshima City, Japan','flower@gmail.com','CABE',4,10),(12,'Huh, Yunjin','Male','23','2001-10-08','09874521653','Seoul. South Korea','jin@gmail.com','COE',8,2),(13,'Nakamura, Kazuha','Male','21','2003-08-09','09784512365','Osaka, Japan','kuzu@gmail.com','CCIS',7,3),(14,'Hong, Eunchae','Female','18','2006-11-10','09568214352','Miryang, South Korea','wonche@gmail.com','CEDAS',1,7);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-11 15:18:26
