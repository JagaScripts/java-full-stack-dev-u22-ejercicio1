CREATE DATABASE IF NOT EXISTS `ud22_ejercicios_db_clientes`;
USE `ud22_ejercicios_db_clientes`;
CREATE TABLE `cliente` (
`id` int (11) NOT NULL AUTO_INCREMENT,
`nombre` varchar(250) DEFAULT NULL,
`apellido` varchar (250) DEFAULT NULL,
`direccion` varchar (258) DEFAULT NULL,
`dni` int (11) DEFAULT NULL,
`fecha` date DEFAULT NULL,
PRIMARY KEY (`id`)
);