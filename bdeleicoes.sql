-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.31 - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para bdeleicoes
CREATE DATABASE IF NOT EXISTS `bdeleicoes` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bdeleicoes`;

-- Copiando estrutura para tabela bdeleicoes.candidato
CREATE TABLE IF NOT EXISTS `candidato` (
  `can_numero` int(2) NOT NULL,
  `can_nome` varchar(60) DEFAULT '',
  `can_vice` varchar(60) DEFAULT '',
  `can_partido` varchar(10) DEFAULT '',
  `can_foto` varchar(50) DEFAULT NULL,
  `can_fotovice` varchar(50) DEFAULT NULL,
  `can_votos` int(11) DEFAULT '0',
  PRIMARY KEY (`can_numero`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdeleicoes.candidato: 7 rows
/*!40000 ALTER TABLE `candidato` DISABLE KEYS */;
INSERT IGNORE INTO `candidato` (`can_numero`, `can_nome`, `can_vice`, `can_partido`, `can_foto`, `can_fotovice`, `can_votos`) VALUES
	(10, 'Carlos Drummond Andrade', 'Monteiro Lobato', 'AA', 'carlosdrummond.png', 'monteirolobato.png', 0),
	(20, 'Machado de Assis', 'Guimarães Rosa', 'BB', 'machadoassis.png', 'guimaraesrosa.png', 0),
	(30, 'Graciliano Ramos', 'José de Alencar', 'CC', 'gracilianoramos.png', 'josealencar.png', 0),
	(40, 'Clarice Lispector', 'Cecília Meireles', 'DD', 'clarice.png', 'ceciliameireles.png', 0),
	(50, 'Jorge Amado', 'Mário de Andrade', 'EE', 'jorgeamado.png', 'marioandrade.png', 0),
	(0, 'Voto em Branco', 'Voto em Branco', '', '', '', 0),
	(99, 'Voto Nulo', 'Voto Nulo', '', '', '', 0);
/*!40000 ALTER TABLE `candidato` ENABLE KEYS */;

-- Copiando estrutura para tabela bdeleicoes.eleitor
CREATE TABLE IF NOT EXISTS `eleitor` (
  `ele_titulo` varchar(20) NOT NULL,
  `ele_rg` varchar(20) DEFAULT NULL,
  `ele_nome` varchar(60) DEFAULT NULL,
  `ele_dataNasc` varchar(10) DEFAULT NULL,
  `ele_zona` varchar(4) DEFAULT NULL,
  `ele_secao` varchar(4) DEFAULT NULL,
  `ele_votou` varchar(1) DEFAULT NULL,
  `ele_foto` varchar(20) DEFAULT NULL,
  `ele_cidade` varchar(40) DEFAULT NULL,
  `ele_estado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`ele_titulo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdeleicoes.eleitor: 15 rows
/*!40000 ALTER TABLE `eleitor` DISABLE KEYS */;
INSERT IGNORE INTO `eleitor` (`ele_titulo`, `ele_rg`, `ele_nome`, `ele_dataNasc`, `ele_zona`, `ele_secao`, `ele_votou`, `ele_foto`, `ele_cidade`, `ele_estado`) VALUES
	('1', '21.711.866-5', 'Marcos Vinicius Elias Duarte', '24/01/1981', '298', '0083', 'N', 'f1.png', 'Bragança Paulista', 'SP'),
	('2', '30.534.312-9', 'Augusto Lorenzo Murilo Santos', '17/01/1971', '298', '0083', 'N', 'f2.png', 'Bragança Paulista', 'SP'),
	('3', '32.750.462-6', 'Anderson Otávio Galvão', '18/11/1999', '298', '0083', 'N', 'f3.png', 'Bragança Paulista', 'SP'),
	('4', '48.377.932-5', 'Marcela Laura Daiane Peixoto', '14/10/1978', '298', '0083', 'N', 'f4.png', 'Bragança Paulista', 'SP'),
	('5', '26.810.090-1', 'Emanuel Osvaldo Cauê Barbosa', '13/09/1966', '298', '0083', 'N', 'f5.png', 'Bragança Paulista', 'SP'),
	('6', '18.688.153-8', 'Mário Breno Assis', '02/04/1975', '298', '0083', 'N', 'f6.png', 'Bragança Paulista', 'SP'),
	('7', '31.564.921-5', 'Isabelle Antonella Raquel Pires', '18/11/1958', '298', '0083', 'N', 'f7.png', 'Bragança Paulista', 'SP'),
	('8', '19.437.690-4', 'Sarah Débora Maitê Aragão', '23/05/1989', '298', '0083', 'N', 'f8.png', 'Bragança Paulista', 'SP'),
	('9', '27.872.608-2', 'Milena Sara Bárbara Cardoso', '26/11/1986', '298', '0083', 'N', 'f9.png', 'Bragança Paulista', 'SP'),
	('10', '18.222.685-2', 'Marcos Vinicius Victor Arthur da Rocha', '19/05/1946', '298', '0083', 'N', 'f10.png', 'Bragança Paulista', 'SP'),
	('11', '25.875.324-9', 'Isabel Heloise das Neves', '24/12/1963', '298', '0083', 'N', 'f11.png', 'Bragança Paulista', 'SP'),
	('12', '19.544.691-4', 'Fernanda Stefany Isabelle Corte Real', '19/05/1945', '298', '0083', 'N', 'f12.png', 'Bragança Paulista', 'SP'),
	('13', '48.456.552-7', 'Lorenzo Erick Baptista', '25/10/1953', '298', '0083', 'N', 'f13.png', 'Bragança Paulista', 'SP'),
	('14', '47.668.380-4', 'Clarice Olivia Tânia da Rosa', '22/08/1998', '298', '0083', 'N', 'f14.png', 'Bragança Paulista', 'SP'),
	('15', '33.958.318-6', 'Emanuelly Maitê Silva', '10/07/1992', '298', '0083', 'N', 'f15.png', 'Bragança Paulista', 'SP');
/*!40000 ALTER TABLE `eleitor` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
