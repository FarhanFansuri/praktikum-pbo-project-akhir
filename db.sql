-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 13, 2023 at 12:35 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan_online`
--
CREATE DATABASE IF NOT EXISTS `penjualan_online` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `penjualan_online`;

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
  `id_barang_pembelian` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `barang` varchar(255) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `metode_pembayaran` varchar(255) NOT NULL,
  PRIMARY KEY (`id_barang_pembelian`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id_barang_pembelian`, `username`, `barang`, `jumlah`, `total_harga`, `status`, `metode_pembayaran`) VALUES
(10, 'User', 'tas', 1, 120000, 'pesanan selesai', 'ovo'),
(11, 'User', 'tas', 2, 240000, 'menunggu konfirmasi', 'ovo');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
