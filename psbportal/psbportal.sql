-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: psbportal
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `address_lineOne` varchar(45) NOT NULL,
  `addresss_city` varchar(45) NOT NULL,
  `address_state` varchar(20) NOT NULL,
  `address_zip` int(11) NOT NULL,
  PRIMARY KEY (`address_id`),
  UNIQUE KEY `address_id_UNIQUE` (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'3061 Wizzard Rd','Austin','Texas',78717),(2,'5360 Legacy Drive','Plano','Texas',75024),(3,'3050 Regent Blvd','Irving','Texas',75063),(4,'800 W Renner Rd','Richardson','Texas',75080),(5,'131 E Spring Drive','Plano','Texas',75023),(6,'2333 Kingdom Rd','Irving','Texas',75075);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `business` (
  `business_id` int(11) NOT NULL AUTO_INCREMENT,
  `business_name` varchar(45) NOT NULL,
  `business_address_id` int(11) NOT NULL,
  `business_contact_id` int(11) NOT NULL,
  PRIMARY KEY (`business_id`),
  UNIQUE KEY `business_id_UNIQUE` (`business_id`),
  KEY `business_contact_id_idx` (`business_contact_id`),
  KEY `business_address_id_idx` (`business_address_id`),
  CONSTRAINT `business_address_id` FOREIGN KEY (`business_address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `business_contact_id` FOREIGN KEY (`business_contact_id`) REFERENCES `contactinfo` (`contactinfo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
INSERT INTO `business` VALUES (1,'psbportal',1,1);
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactinfo`
--

DROP TABLE IF EXISTS `contactinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactinfo` (
  `contactinfo_id` int(11) NOT NULL,
  `contactinfo_name` varchar(45) NOT NULL,
  `contactinfo_email` varchar(45) NOT NULL,
  `contactinfo_phone` varchar(45) NOT NULL,
  PRIMARY KEY (`contactinfo_id`),
  UNIQUE KEY `contactInfo_id_UNIQUE` (`contactinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactinfo`
--

LOCK TABLES `contactinfo` WRITE;
/*!40000 ALTER TABLE `contactinfo` DISABLE KEYS */;
INSERT INTO `contactinfo` VALUES (1,'Patrick','psbportal@psbportal.com','320-959-8625'),(2,'Alice','wisdom.tech@psbportal.com','469-545-2359'),(3,'Bob','royal.tech@psbportal.com','959-468-9586'),(4,'Cindy','prairie.land@psbportal.com','469-856-9950'),(5,'Emma','ranch.park@psbportal.com','957-862-7575'),(6,'Firona','houdini.tech@psbportal.com','415-628-5523'),(7,'Julia','mike@gmail.com','456-925-8235'),(8,'Tomas','roma@gmail.com','469-525-8659'),(9,'Albert','bule@gmail.com','235-956-4820'),(10,'Baber','terminal@gmail.com','954-856-9985'),(11,'Calvin','beeboo@gmail.com','958-972-8652'),(12,'Dale','ektha@gmail.com','952-863-5213'),(13,'Eddie','ace@gmail.com','842-653-9952'),(14,'Edison','comon.cycle@gmail.com','458-963-1532'),(15,'Fenton','diamond@gmail.com','485-965-5862'),(16,'Garry','emma@gmail.com','496-632-8569'),(17,'Hank','javacamp@gmail.com','301-956-5520'),(18,'Jacob','fifo@gmail.com','959-862-5423'),(19,'Ken','git@gmail.com','956-985-9632'),(20,'Lanny','hibernate@gmail.com','954-985-9632'),(21,'Magee','ice@gmail.com','646-854-9533');
/*!40000 ALTER TABLE `contactinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `property_id` int(11) NOT NULL AUTO_INCREMENT,
  `property_name` varchar(45) NOT NULL,
  `property_address_id` int(11) NOT NULL,
  `property_contact_id` int(11) NOT NULL,
  `property_business_id` int(11) NOT NULL,
  PRIMARY KEY (`property_id`),
  KEY `business_id_idx` (`property_business_id`),
  KEY `contact_id_idx` (`property_contact_id`),
  KEY `address_id_idx` (`property_address_id`),
  CONSTRAINT `property_address_id` FOREIGN KEY (`property_address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `property_business_id` FOREIGN KEY (`property_business_id`) REFERENCES `business` (`business_id`),
  CONSTRAINT `property_contact_id` FOREIGN KEY (`property_contact_id`) REFERENCES `contactinfo` (`contactinfo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,'Wisdom Tech',2,2,1),(2,'Royal Tech',3,3,1),(3,'Prairie Land',4,4,1),(4,'Ranch Park',5,5,1),(5,'Houdini Tech',6,6,1);
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenant`
--

DROP TABLE IF EXISTS `tenant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tenant` (
  `tenant_id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant_name` varchar(45) NOT NULL,
  `tenant_property_id` int(11) NOT NULL,
  `tenant_suite` int(11) NOT NULL,
  `tenant_contact_id` int(11) NOT NULL,
  PRIMARY KEY (`tenant_id`),
  KEY `property_id_idx` (`tenant_property_id`),
  KEY `contact_id_idx` (`tenant_contact_id`),
  CONSTRAINT `tenant_contact_id` FOREIGN KEY (`tenant_contact_id`) REFERENCES `contactinfo` (`contactinfo_id`),
  CONSTRAINT `tenant_property_id` FOREIGN KEY (`tenant_property_id`) REFERENCES `property` (`property_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenant`
--

LOCK TABLES `tenant` WRITE;
/*!40000 ALTER TABLE `tenant` DISABLE KEYS */;
INSERT INTO `tenant` VALUES (1,'Nivtek',1,150,7),(2,'Roma Inc',2,300,8),(3,'Blue Area',3,120,9),(4,'Terminal',4,240,10),(5,'Beeboo',5,140,11),(6,'Ektha Solution',1,210,12),(7,'Ace',2,110,13),(8,'Comon Cycle',3,200,14),(9,'Diamond Tech',4,360,15),(10,'Emma Cure',5,170,16),(11,'JavaCamp',1,190,17),(12,'Fifo Age',2,200,18),(13,'Git',3,210,19),(14,'Hibernate',4,120,20),(15,'Ice',5,210,21);
/*!40000 ALTER TABLE `tenant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-16  9:35:08
