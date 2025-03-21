-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.19-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.7.0.6859
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para tiendaonlinebd
CREATE DATABASE IF NOT EXISTS `tiendaonlinebd` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `tiendaonlinebd`;

-- Volcando estructura para tabla tiendaonlinebd.administradores
CREATE TABLE IF NOT EXISTS `administradores` (
  `id` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla tiendaonlinebd.administradores: ~0 rows (aproximadamente)
DELETE FROM `administradores`;

-- Volcando estructura para tabla tiendaonlinebd.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `imagen` varchar(50) DEFAULT NULL,
  `descripcionCompleta` varchar(50) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `imagenGrande` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla tiendaonlinebd.producto: ~1 rows (aproximadamente)
DELETE FROM `producto`;
INSERT INTO `producto` (`id`, `nombre`, `descripcion`, `precio`, `imagen`, `descripcionCompleta`, `stock`, `imagenGrande`) VALUES
	(1, 'camiseta', 'algodonnnn', 15, 'camiAzul.jpg', NULL, NULL, NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
