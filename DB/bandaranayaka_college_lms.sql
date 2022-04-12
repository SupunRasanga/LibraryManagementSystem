-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 10, 2021 at 07:14 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bandaranayaka_college_lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `BookID` varchar(50) NOT NULL,
  `PublisherYear` varchar(20) NOT NULL,
  `BookName` varchar(100) NOT NULL,
  `Publisher` varchar(50) NOT NULL,
  `Price` varchar(20) NOT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BookID`, `PublisherYear`, `BookName`, `Publisher`, `Price`) VALUES
('256', '1989', 'Magulkama', 'Kumarathunga Munidasa', 'Rs.250.00'),
('257', '1975', 'Gamperaliya', 'Martin Wikramasinghe', 'Rs.500.00'),
('258', '1983', 'Abayaluwo', 'T.B.Ilangarathna', 'Rs.300.00'),
('259', '1985', 'Dobagala Nidanaya', 'Mahinda Jayathilaka', 'Rs.450.00');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

DROP TABLE IF EXISTS `issue`;
CREATE TABLE IF NOT EXISTS `issue` (
  `BookID` varchar(50) DEFAULT NULL,
  `IndexNumber` varchar(50) DEFAULT NULL,
  `BookName` varchar(50) DEFAULT NULL,
  `FullName` varchar(50) DEFAULT NULL,
  `IssueDate` varchar(20) DEFAULT NULL,
  `DueDate` varchar(20) DEFAULT NULL,
  `ReturnBook` varchar(20) DEFAULT NULL,
  KEY `IndexNumber` (`IndexNumber`),
  KEY `BookID` (`BookID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nonacodemy`
--

DROP TABLE IF EXISTS `nonacodemy`;
CREATE TABLE IF NOT EXISTS `nonacodemy` (
  `IDNumber` varchar(50) NOT NULL,
  `FullName` varchar(100) NOT NULL,
  `NameWithInitials` varchar(50) DEFAULT NULL,
  `PermenetAddress` varchar(80) DEFAULT NULL,
  `ContactNumber` int(10) NOT NULL,
  PRIMARY KEY (`IDNumber`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nonacodemy`
--

INSERT INTO `nonacodemy` (`IDNumber`, `FullName`, `NameWithInitials`, `PermenetAddress`, `ContactNumber`) VALUES
('1411', 'Rathnayake Mudiyanselage Pubudu Malin Rathnayake', 'R.M.P. Malith Rathnayake', '122/4Maligathenna Veyangoda', 785637818),
('1412', 'Alankara Dewage Eshan Ranjana Kumara', 'A.D.E. Ranjana Kumara', 'No.33/1,Wadurawa,Veyangoda', 768890696),
('1413', 'Jayalath archchilage Kavindya Subodini Jayalath', 'J.A.K.S.Jayalath', 'No.337/1,parakadamulla,henegama', 716327603);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `IndexNumber` varchar(50) NOT NULL,
  `StudentName` varchar(100) NOT NULL,
  `NameWithInitials` varchar(50) DEFAULT NULL,
  `PermenetAddress` varchar(80) DEFAULT NULL,
  `ParentsName` varchar(50) DEFAULT NULL,
  `ContactNumber` int(10) NOT NULL,
  `Grade` int(5) DEFAULT NULL,
  `ClassRoom` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`IndexNumber`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`IndexNumber`, `StudentName`, `NameWithInitials`, `PermenetAddress`, `ParentsName`, `ContactNumber`, `Grade`, `ClassRoom`) VALUES
('002', 'Harankaha Pathirannehellage Dilki Bhagya Pathirana', 'H.P.D.B. Pathirana', 'I 123/17B,galkanda,morawaththa,ruwanwella', 'G.V.S.ranathunga', 717133613, 7, 'B'),
('001', 'Subasinghe Arachchilage Thamindu Dasantha Subasinghe ', 'S.A. Thamindu Dasantha', 'F-295,Mahinkanda Road Kahanawita,Dehiowita ', 'N.V.H Jayasili', 761144051, 6, 'A'),
('003', 'Nilwaththe Kankanamalage Uditha Chandima Jayathilaka', 'N.K.U.C. Jayathilaka', 'No 150, Indurana ,Waharaka', 'N.P.Inoka Sanjeewani', 770709248, 8, 'C'),
('004', 'Nilwala Gamaralalage Sahan Kalpa Dayarathna', 'N.G. S.K.Dayarathna', '121/3 debagama,dehiowita', 'K.T.N.kumari', 768036102, 9, 'D'),
('005', 'Rupilage Dewmi Mandeera Dilshani Wijayawardhana', 'R.D.M.D. Wijayawardhana', '297/A Dummaladeniya,Galpatha,Ruwanwella ', 'R.P.S Wijayawardhana', 772339066, 10, 'A'),
('006', 'Thilakarathna Mudiyanselage Mindya Jayashani', 'T.M.M. Jayashani', 'No.75,Baduragoda Road,Veyangoda', 'T.M.S.K.Jayantha ', 776689652, 11, 'B'),
('007', 'Ilangakoon Pathiranage Nishami Kaushika Ilangakoon', 'I.P.N.K. Ilangakoon', '205/2,Etikehelgalla,waliweriya', 'I.P.R.Ilangakoon', 704824384, 6, 'B'),
('008', 'Lahiru Lakmal Navarathne ', 'L . L Navarathne ', '32/C, Wathulumulla, Udugampola ', 'G.R. Navarathne ', 777557895, 9, 'D'),
('009', 'Kahadawala Arachchilaga Sankhabhanu Ridma Kahadawala ', 'K.A.S. Ridma Kahandawala', '1/14 Galhenawatta godagama ellakala ', 'K.A. Rohana Ranjet kumara', 776657481, 8, 'D');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `IDNumber` varchar(50) NOT NULL,
  `FullName` varchar(100) NOT NULL,
  `NameWithInitials` varchar(50) DEFAULT NULL,
  `PermenetAddress` varchar(80) DEFAULT NULL,
  `ContactNumber` int(10) NOT NULL,
  PRIMARY KEY (`IDNumber`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`IDNumber`, `FullName`, `NameWithInitials`, `PermenetAddress`, `ContactNumber`) VALUES
('1211', 'Thennakoon Mudiyanselage Tharindu Bandara Dimbulana', 'T.M.T. Bandara Dimbulana', '82/7, Gamamada Road, Marapola, Veyangoda', 776190870),
('1212', 'Samaraweera Adhikaram Mohottilage Don Piyumi Nadeeshani ', 'S.A.M.D. Piyumi Nadeeshani', 'NO: 182/A, Ihalagama, Gampaha ', 723006788),
('1213', 'Wijesundarage Thilani Nimasha Wijesundara ', 'W.T.N. Wijesundara', 'No.375,Eluwapitiya,Veyangoda ', 784889504);

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

DROP TABLE IF EXISTS `useraccount`;
CREATE TABLE IF NOT EXISTS `useraccount` (
  `UserName` varchar(20) NOT NULL,
  `Pword` varchar(20) NOT NULL,
  `ConfirmPword` varchar(20) NOT NULL,
  `Admin` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `useraccount`
--

INSERT INTO `useraccount` (`UserName`, `Pword`, `ConfirmPword`, `Admin`) VALUES
('supun', '456', '456', '@u$erAdministrator');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
