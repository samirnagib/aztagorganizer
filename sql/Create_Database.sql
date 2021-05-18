CREATE DATABASE  IF NOT EXISTS `tagorgdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tagorgdb`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 192.168.175.10    Database: tagorgdb
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `tbApplication`
--

DROP TABLE IF EXISTS `tbApplication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbApplication` (
  `idApp` int unsigned NOT NULL AUTO_INCREMENT,
  `idTag` int DEFAULT NULL,
  `ApplicationName` varchar(50) NOT NULL,
  PRIMARY KEY (`idApp`),
  KEY `fk_tag_app_idx` (`idTag`),
  CONSTRAINT `fk_tag_app` FOREIGN KEY (`idTag`) REFERENCES `tbTags` (`idTag`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbServers`
--

DROP TABLE IF EXISTS `tbServers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbServers` (
  `idServer` int NOT NULL AUTO_INCREMENT,
  `SubscriptionName` varchar(30) DEFAULT NULL,
  `SubscriptionID` varchar(40) DEFAULT NULL,
  `VmName` varchar(40) DEFAULT NULL,
  `ResourceGroupName` varchar(50) DEFAULT NULL,
  `Region` varchar(40) DEFAULT NULL,
  `Size` varchar(40) DEFAULT NULL,
  `VirturalNetwork` varchar(40) DEFAULT NULL,
  `Subnet` varchar(40) DEFAULT NULL,
  `PrivateIpAddress` varchar(40) DEFAULT NULL,
  `OsType` varchar(40) DEFAULT NULL,
  `PowerState` varchar(40) DEFAULT NULL,
  `LicenseType` varchar(40) DEFAULT NULL,
  `OS_Disk_Size` varchar(50) DEFAULT NULL,
  `OS_Disk_Sku` varchar(50) DEFAULT NULL,
  `Data_Disks_Sizes` varchar(50) DEFAULT NULL,
  `Data_Disks_Skus` varchar(50) DEFAULT NULL,
  `Nic_Name` varchar(50) DEFAULT NULL,
  `PublicIPAddress` varchar(50) DEFAULT NULL,
  `AvailabilitySet` varchar(50) DEFAULT NULL,
  `ApplicationSecurityGroup` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idServer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbTags`
--

DROP TABLE IF EXISTS `tbTags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbTags` (
  `idTag` int NOT NULL AUTO_INCREMENT,
  `IdServer` int NOT NULL,
  `start_workday` varchar(30) DEFAULT NULL,
  `stop_workday` varchar(30) DEFAULT NULL,
  `os_name` varchar(50) DEFAULT NULL,
  `support_group_so` varchar(50) DEFAULT NULL,
  `os_version` varchar(50) DEFAULT NULL,
  `support_group` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idTag`),
  KEY `fk_Server_tag_idx` (`IdServer`),
  CONSTRAINT `fk_Server_tag` FOREIGN KEY (`IdServer`) REFERENCES `tbServers` (`idServer`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-18 19:25:07
