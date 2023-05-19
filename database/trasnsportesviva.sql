-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: inventario_repuestosviva
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `vNit` varchar(10) NOT NULL,
  `vNombre` varchar(50) NOT NULL,
  `vPais` varchar(20) NOT NULL,
  `vCiudad` varchar(20) NOT NULL,
  PRIMARY KEY (`vNit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('1','Ninguno','Guatemala','Guatemala'),('107945525','Jorge Andres Villagran','Guatemala','Guatemala'),('699332k','Jorge Villagran','Guatemala','Guatemala');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `idCompra` int NOT NULL AUTO_INCREMENT,
  `vCodigo` varchar(100) NOT NULL,
  `iPrecioCompra` int NOT NULL,
  `dFechaCompra` datetime DEFAULT CURRENT_TIMESTAMP,
  `iUnidades` int NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `compra_ibfk_1` (`vCodigo`),
  CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`vCodigo`) REFERENCES `producto` (`vCodigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,'PRUEBA123',15,'2023-05-17 00:00:00',100),(2,'HEROHTPULS1546',20,'2023-05-18 00:00:00',50),(4,'HEROHTPULS154661',20,'2023-05-18 00:00:00',1),(5,'PRUEBA123',20,'2023-05-18 00:00:00',10);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!50001 DROP VIEW IF EXISTS `compras`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `compras` AS SELECT 
 1 AS `vCodigo`,
 1 AS `compras`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `inventariototal`
--

DROP TABLE IF EXISTS `inventariototal`;
/*!50001 DROP VIEW IF EXISTS `inventariototal`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `inventariototal` AS SELECT 
 1 AS `vCodigo`,
 1 AS `vNombreProducto`,
 1 AS `vDescripcion`,
 1 AS `vNombrePieza`,
 1 AS `vNombreRepuesto`,
 1 AS `vAlias`,
 1 AS `vMarca`,
 1 AS `vLinea`,
 1 AS `iAnio`,
 1 AS `iCc`,
 1 AS `vNombreProveedor`,
 1 AS `vTel`,
 1 AS `vDireccion`,
 1 AS `compras`,
 1 AS `ventas`,
 1 AS `existencias`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `marca_moto`
--

DROP TABLE IF EXISTS `marca_moto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca_moto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `vAlias` varchar(30) NOT NULL,
  `vMarca` varchar(30) NOT NULL,
  `vLinea` varchar(30) NOT NULL,
  `iAnio` int NOT NULL,
  `iCc` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca_moto`
--

LOCK TABLES `marca_moto` WRITE;
/*!40000 ALTER TABLE `marca_moto` DISABLE KEYS */;
INSERT INTO `marca_moto` VALUES (4,'Apache 2025','TVS','Apache 4V',2025,160);
/*!40000 ALTER TABLE `marca_moto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca_repuesto`
--

DROP TABLE IF EXISTS `marca_repuesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca_repuesto` (
  `idMarcaRepuesto` int NOT NULL AUTO_INCREMENT,
  `vNombre` varchar(20) NOT NULL,
  PRIMARY KEY (`idMarcaRepuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca_repuesto`
--

LOCK TABLES `marca_repuesto` WRITE;
/*!40000 ALTER TABLE `marca_repuesto` DISABLE KEYS */;
INSERT INTO `marca_repuesto` VALUES (1,'Vini'),(2,'Hunk');
/*!40000 ALTER TABLE `marca_repuesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `vCodigo` varchar(100) NOT NULL,
  `vNombreProducto` varchar(50) NOT NULL,
  `iPieza` int NOT NULL,
  `iMarcaRepuesto` int NOT NULL,
  `vDescripcion` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`vCodigo`),
  KEY `iPieza` (`iPieza`),
  KEY `iMarcaRepuesto` (`iMarcaRepuesto`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`iPieza`) REFERENCES `tipopieza` (`idPieza`),
  CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`iMarcaRepuesto`) REFERENCES `marca_repuesto` (`idMarcaRepuesto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('HEROHTPULS1546','Prueba',6,2,'Pastillas para pulsar y hero hunk'),('HEROHTPULS15466','Prueba2',6,2,'Pastillas para pulsar y hero hunk'),('HEROHTPULS154661','Prueba3',6,2,'Pastillas para pulsar y hero hunk'),('PRUEBA123','Pastillas Hero',6,2,'Pastillas para hero hunk'),('PRUEBA1234','Prueba4',6,2,'Hola');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `productototal`
--

DROP TABLE IF EXISTS `productototal`;
/*!50001 DROP VIEW IF EXISTS `productototal`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `productototal` AS SELECT 
 1 AS `vCodigo`,
 1 AS `vNombreProducto`,
 1 AS `vDescripcion`,
 1 AS `vNombrePieza`,
 1 AS `vNombreRepuesto`,
 1 AS `vAlias`,
 1 AS `vMarca`,
 1 AS `vLinea`,
 1 AS `iAnio`,
 1 AS `iCc`,
 1 AS `vNombreProveedor`,
 1 AS `vTel`,
 1 AS `vDireccion`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idProveedor` int NOT NULL AUTO_INCREMENT,
  `vNombreProveedor` varchar(20) NOT NULL,
  `vTel` varchar(8) NOT NULL,
  `vDireccion` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (2,'Prueba2','24427155','Postman'),(4,'Prueba','24427155','Postman');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipopieza`
--

DROP TABLE IF EXISTS `tipopieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipopieza` (
  `idPieza` int NOT NULL AUTO_INCREMENT,
  `vNombrePieza` varchar(20) DEFAULT NULL,
  `iMoto` int NOT NULL,
  `iProveedor` int NOT NULL,
  PRIMARY KEY (`idPieza`),
  KEY `tipopieza_ibfk_1` (`iMoto`),
  KEY `tipopieza_ibfk_2` (`iProveedor`),
  CONSTRAINT `tipopieza_ibfk_1` FOREIGN KEY (`iMoto`) REFERENCES `marca_moto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tipopieza_ibfk_2` FOREIGN KEY (`iProveedor`) REFERENCES `proveedor` (`idProveedor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipopieza`
--

LOCK TABLES `tipopieza` WRITE;
/*!40000 ALTER TABLE `tipopieza` DISABLE KEYS */;
INSERT INTO `tipopieza` VALUES (6,'Prueba2',4,2);
/*!40000 ALTER TABLE `tipopieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `vCodigo` varchar(100) NOT NULL,
  `iPrecioventa` int NOT NULL,
  `dFechaVenta` date NOT NULL,
  `iUnidades` int NOT NULL,
  `vCliente` varchar(20) NOT NULL,
  PRIMARY KEY (`idventa`),
  KEY `venta_ibfk_1` (`vCodigo`),
  KEY `venta_ibfk_2` (`vCliente`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`vCodigo`) REFERENCES `producto` (`vCodigo`),
  CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`vCliente`) REFERENCES `cliente` (`vNit`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (2,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(3,'HEROHTPULS1546',25,'2024-06-04',2,'1'),(4,'HEROHTPULS1546',25,'2023-05-17',2,'1'),(5,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(6,'HEROHTPULS1546',25,'2023-05-17',2,'1'),(7,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(8,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(9,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(11,'HEROHTPULS1546',25,'2023-05-18',2,'1'),(12,'HEROHTPULS1546',25,'2023-05-17',2,'1'),(13,'PRUEBA123',10,'2023-05-17',3,'1'),(14,'PRUEBA123',20,'2023-05-17',5,'1'),(15,'PRUEBA123',25,'2023-05-17',2,'1'),(16,'HEROHTPULS154661',25,'2023-05-17',1,'1');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!50001 DROP VIEW IF EXISTS `ventas`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ventas` AS SELECT 
 1 AS `vCodigo`,
 1 AS `ventas`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `compras`
--

/*!50001 DROP VIEW IF EXISTS `compras`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `compras` AS select `pdt`.`vCodigo` AS `vCodigo`,sum(`cp`.`iUnidades`) AS `compras` from (`productototal` `pdt` left join `compra` `cp` on((`pdt`.`vCodigo` = `cp`.`vCodigo`))) group by `pdt`.`vCodigo` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `inventariototal`
--

/*!50001 DROP VIEW IF EXISTS `inventariototal`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `inventariototal` AS select `pdt`.`vCodigo` AS `vCodigo`,`pdt`.`vNombreProducto` AS `vNombreProducto`,`pdt`.`vDescripcion` AS `vDescripcion`,`pdt`.`vNombrePieza` AS `vNombrePieza`,`pdt`.`vNombreRepuesto` AS `vNombreRepuesto`,`pdt`.`vAlias` AS `vAlias`,`pdt`.`vMarca` AS `vMarca`,`pdt`.`vLinea` AS `vLinea`,`pdt`.`iAnio` AS `iAnio`,`pdt`.`iCc` AS `iCc`,`pdt`.`vNombreProveedor` AS `vNombreProveedor`,`pdt`.`vTel` AS `vTel`,`pdt`.`vDireccion` AS `vDireccion`,`cp`.`compras` AS `compras`,`vt`.`ventas` AS `ventas`,(`cp`.`compras` - `vt`.`ventas`) AS `existencias` from ((`productototal` `pdt` left join `compras` `cp` on((`pdt`.`vCodigo` = `cp`.`vCodigo`))) left join `ventas` `vt` on((`pdt`.`vCodigo` = `vt`.`vCodigo`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `productototal`
--

/*!50001 DROP VIEW IF EXISTS `productototal`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `productototal` AS select `pd`.`vCodigo` AS `vCodigo`,`pd`.`vNombreProducto` AS `vNombreProducto`,`pd`.`vDescripcion` AS `vDescripcion`,`tp`.`vNombrePieza` AS `vNombrePieza`,`mr`.`vNombre` AS `vNombreRepuesto`,`mm`.`vAlias` AS `vAlias`,`mm`.`vMarca` AS `vMarca`,`mm`.`vLinea` AS `vLinea`,`mm`.`iAnio` AS `iAnio`,`mm`.`iCc` AS `iCc`,`pv`.`vNombreProveedor` AS `vNombreProveedor`,`pv`.`vTel` AS `vTel`,`pv`.`vDireccion` AS `vDireccion` from ((((`producto` `pd` join `tipopieza` `tp` on((`pd`.`iPieza` = `tp`.`idPieza`))) join `marca_repuesto` `mr` on((`pd`.`iMarcaRepuesto` = `mr`.`idMarcaRepuesto`))) join `marca_moto` `mm` on((`tp`.`iMoto` = `mm`.`id`))) join `proveedor` `pv` on((`tp`.`iProveedor` = `pv`.`idProveedor`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ventas`
--

/*!50001 DROP VIEW IF EXISTS `ventas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ventas` AS select `pdt`.`vCodigo` AS `vCodigo`,sum(`vt`.`iUnidades`) AS `ventas` from (`productototal` `pdt` left join `venta` `vt` on((`pdt`.`vCodigo` = `vt`.`vCodigo`))) group by `pdt`.`vCodigo` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-18 22:20:26
