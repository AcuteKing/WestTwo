
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class` (
  `cid` int NOT NULL,
  `enrolled` date DEFAULT NULL,
  `major` text,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

INSERT INTO `class` (`cid`, `enrolled`, `major`) VALUES (772101,'2021-09-01','21级软件工程1班');
INSERT INTO `class` (`cid`, `enrolled`, `major`) VALUES (772201,'2022-09-01','22级软件工程1班');
INSERT INTO `class` (`cid`, `enrolled`, `major`) VALUES (772202,'2022-09-01','22级软件工程2班');
INSERT INTO `class` (`cid`, `enrolled`, `major`) VALUES (782201,'2022-09-01','22级人工智能1班');
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sid` int NOT NULL,
  `sname` text,
  `sgender` text,
  `cid` int DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (77210101,'林一','男',772101);
INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (77210102,'林二','女',772101);
INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (77220101,'林三','男',772201);
INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (77220102,'林四','男',772201);
INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (77220201,'林五','男',772202);
INSERT INTO `student` (`sid`, `sname`, `sgender`, `cid`) VALUES (78220101,'林六','女',782201);
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

