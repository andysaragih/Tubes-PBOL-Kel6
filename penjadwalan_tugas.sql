-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Nov 26, 2023 at 04:10 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjadwalan_tugas`
--

-- --------------------------------------------------------

--
-- Table structure for table `penjadwalan`
--

CREATE TABLE `penjadwalan` (
  `id` int NOT NULL,
  `nama_tugas` varchar(255) NOT NULL,
  `deskripsi` text NOT NULL,
  `due_date` timestamp NOT NULL,
  `date_added` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `selesai` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penjadwalan`
--

INSERT INTO `penjadwalan` (`id`, `nama_tugas`, `deskripsi`, `due_date`, `date_added`, `selesai`) VALUES
(1, 'Laporan Tugas Besar PBOL', 'Kumpul dengan format PDF', '2023-11-29 17:00:00', '2023-11-26 07:48:44', 1),
(2, 'Tugas 1', 'Tugas-nya berat bund', '2023-11-29 17:00:00', '2023-11-26 10:14:37', 1),
(3, 'Tugas 2', 'Tugas nya gitu deh', '2023-11-29 17:00:00', '2023-11-26 10:16:51', 1),
(4, 'A', 'A', '2023-11-29 23:06:42', '2023-11-26 11:06:45', 1),
(5, 'Tugas PBOL 1', 'Semangat dirikuh', '2023-11-29 02:57:40', '2023-11-26 14:57:42', 0),
(7, 'Tugas Besar PBOL', 'Membuat program Java', '2023-12-08 04:03:47', '2023-11-26 16:03:59', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penjadwalan`
--
ALTER TABLE `penjadwalan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `penjadwalan`
--
ALTER TABLE `penjadwalan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
