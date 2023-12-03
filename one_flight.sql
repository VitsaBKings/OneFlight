-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: one_flight
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `airlines`
--

DROP TABLE IF EXISTS `airlines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airlines` (
  `airline_id` int NOT NULL AUTO_INCREMENT,
  `airline_name` varchar(255) DEFAULT NULL,
  `airline_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`airline_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airlines`
--

LOCK TABLES `airlines` WRITE;
/*!40000 ALTER TABLE `airlines` DISABLE KEYS */;
/*!40000 ALTER TABLE `airlines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_booking_fees`
--

DROP TABLE IF EXISTS `flight_booking_fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_booking_fees` (
  `flight_booking_fee_id` int NOT NULL AUTO_INCREMENT,
  `flight_booking_id` int DEFAULT NULL,
  `charge_name` varchar(255) DEFAULT NULL,
  `amount` float DEFAULT NULL,
  PRIMARY KEY (`flight_booking_fee_id`),
  KEY `flight_booking_id` (`flight_booking_id`),
  CONSTRAINT `flight_booking_fees_ibfk_1` FOREIGN KEY (`flight_booking_id`) REFERENCES `flight_bookings` (`flight_booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_booking_fees`
--

LOCK TABLES `flight_booking_fees` WRITE;
/*!40000 ALTER TABLE `flight_booking_fees` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight_booking_fees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_bookings`
--

DROP TABLE IF EXISTS `flight_bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_bookings` (
  `flight_booking_id` int NOT NULL AUTO_INCREMENT,
  `queueing_office_id` int DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `origin_location_code` varchar(255) DEFAULT NULL,
  `destination_location` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `round_trip_tag` varchar(255) DEFAULT NULL,
  `number_of_passenger` int DEFAULT NULL,
  `reference_number` varchar(255) DEFAULT NULL,
  `flight_offer_id` int DEFAULT NULL,
  `total_charged_amount` float DEFAULT NULL,
  PRIMARY KEY (`flight_booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_bookings`
--

LOCK TABLES `flight_bookings` WRITE;
/*!40000 ALTER TABLE `flight_bookings` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight_bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_itineraries`
--

DROP TABLE IF EXISTS `flight_itineraries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_itineraries` (
  `flight_itinerary_id` int NOT NULL AUTO_INCREMENT,
  `flight_booking_id` int DEFAULT NULL,
  `itinerary_order` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flight_itinerary_id`),
  KEY `flight_booking_id` (`flight_booking_id`),
  CONSTRAINT `flight_itineraries_ibfk_1` FOREIGN KEY (`flight_booking_id`) REFERENCES `flight_bookings` (`flight_booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_itineraries`
--

LOCK TABLES `flight_itineraries` WRITE;
/*!40000 ALTER TABLE `flight_itineraries` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight_itineraries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_segments`
--

DROP TABLE IF EXISTS `flight_segments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_segments` (
  `flight_segment_id` int NOT NULL AUTO_INCREMENT,
  `flight_itinerary_id` int DEFAULT NULL,
  `departure_aita_code` varchar(255) DEFAULT NULL,
  `departure_datetime` datetime DEFAULT NULL,
  `departure_terminal` varchar(255) DEFAULT NULL,
  `arrival_aita_code` varchar(255) DEFAULT NULL,
  `arrival_datetime` datetime DEFAULT NULL,
  `arrival_terminal` varchar(255) DEFAULT NULL,
  `carrier_code` varchar(255) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  `duration_in_hours` time DEFAULT NULL,
  `aircraft_code` varchar(255) DEFAULT NULL,
  `aircraft_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flight_segment_id`),
  KEY `flight_itinerary_id` (`flight_itinerary_id`),
  CONSTRAINT `flight_segments_ibfk_1` FOREIGN KEY (`flight_itinerary_id`) REFERENCES `flight_itineraries` (`flight_itinerary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_segments`
--

LOCK TABLES `flight_segments` WRITE;
/*!40000 ALTER TABLE `flight_segments` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight_segments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passport_details`
--

DROP TABLE IF EXISTS `passport_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passport_details` (
  `passport_detail_id` int NOT NULL AUTO_INCREMENT,
  `passport_type` varchar(255) NOT NULL,
  `country_code` varchar(255) NOT NULL,
  `passport_number` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `middle_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nationality` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `place_of_birth` varchar(255) NOT NULL,
  `date_of_issue` date DEFAULT NULL,
  `valid_until` date DEFAULT NULL,
  `issuing_authority` varchar(255) NOT NULL,
  PRIMARY KEY (`passport_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passport_details`
--

LOCK TABLES `passport_details` WRITE;
/*!40000 ALTER TABLE `passport_details` DISABLE KEYS */;
INSERT INTO `passport_details` VALUES (1,'','','','','','Jumawan','','M',NULL,'',NULL,NULL,''),(2,'','','','','','Jumawan','','M',NULL,'',NULL,NULL,''),(3,'','','','','','Jumawan','','M',NULL,'',NULL,NULL,''),(4,'','','','','','Jumawan','','M',NULL,'',NULL,NULL,''),(5,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(6,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(7,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(8,'','','','','','Jumawan','','M',NULL,'',NULL,NULL,''),(9,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(10,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(11,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(12,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(13,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(14,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(15,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(16,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(17,'','','','','','Jumawan','Filipino','M',NULL,'',NULL,NULL,''),(18,'','','','','','','Filipino','M',NULL,'',NULL,NULL,''),(19,'','','','','','','Filipino','M',NULL,'',NULL,NULL,'Jethro'),(20,'123','123','123456','Jethro','Baterina','','Filipino','M','2021-01-01','Quezon City','2021-01-01','2021-01-01','Jethro'),(21,'123','123','123456','Jethro','Baterina','','Filipino','M','2021-01-01','Quezon City','2021-01-01','2021-01-01','Jethro');
/*!40000 ALTER TABLE `passport_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `middle_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `birthday` date NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `passport_detail_id` int DEFAULT NULL,
  `role` varchar(255) NOT NULL,
  `status` tinyint NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `passport_detail_id` (`passport_detail_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`passport_detail_id`) REFERENCES `passport_details` (`passport_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'guest@email.com','password','jethro','baterina','jumawan','2001-01-01','123',NULL,'guest',1),(2,'guest@email.com','password','jethro','baterina','jumawan','2001-01-01','123',NULL,'guest',1),(3,'guest@email.com','password','jethro','baterina','jumawan','2001-01-01','123',NULL,'guest',1),(12,'joshua@email.com','password','','','','2021-01-01','0',0,'guest',1),(13,'joshua@email.com','password','Jethro','Baterina','Jumawan','2021-01-01','0',0,'guest',1),(14,'joshua@email.com','password','Jethro','Baterina','Jumawan','2021-01-01','0',21,'guest',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-03 20:37:30
