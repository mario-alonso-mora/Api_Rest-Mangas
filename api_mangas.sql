

DROP TABLE IF EXISTS `api_mangas`;

CREATE TABLE `api_mangas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `editorial` varchar(255) DEFAULT NULL,
  `finalizado` varchar(255) DEFAULT NULL,
  `numero_de_tomos` int DEFAULT NULL,
  `precio_por_tomos` double DEFAULT NULL,
  `creador` varchar(255) DEFAULT NULL,
  `fecha_de_estreno` date DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




LOCK TABLES `api_mangas` WRITE;

INSERT INTO `api_mangas` VALUES (1,'Hakusensha','No',40,14.25,'Kentaro Miura','1989-08-12','AcciÃ³n, fantasÃ­a oscura, tragedia','Berserk'),(2,'Shueisha,','No',101,6.6,'EiichirÅ� Oda','1997-07-22','AcciÃ³n, Aventura, FantasÃ­a, Comedia','One Piece'),(3,'Shueisha,','Si',73,7.12,'Masashi Kishimoto','1999-09-21','AcciÃ³n, Aventura, FantasÃ­a, Comedia','Naruto'),(4,'Shueisha,','Si',74,5.12,'Tite Kubo','2001-08-11','AcciÃ³n, aventura, sobrenatural','Bleach'),(5,'Shueisha,','No',24,9.12,'One, Yusuke Murata','2012-06-14','AcciÃ³n,â€‹â€‹ comedia, ciencia ficciÃ³n','One Punch-Man'),(6,'Shueisha,','Si',24,8.12,'Koyoharu GotÅ�ge','2016-02-15','AcciÃ³n ,aventura,drama,fantasÃ­a oscura,â€‹ histÃ³rico, sobrenatural','Kimetsu no Yaiba');

UNLOCK TABLES;

