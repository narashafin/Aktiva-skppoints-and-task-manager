-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2025 at 07:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aktiva`
--

-- --------------------------------------------------------

--
-- Table structure for table `kegiatan_akademik`
--

CREATE TABLE `kegiatan_akademik` (
  `id_kegA` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `nama_tugas` varchar(100) NOT NULL,
  `mata_kuliah` varchar(50) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kegiatan_akademik`
--

INSERT INTO `kegiatan_akademik` (`id_kegA`, `id_user`, `nama_tugas`, `mata_kuliah`, `deadline`, `deskripsi`) VALUES
(2, 8, 'pertemuan 3', 'basis data', '2025-11-22 23:59:00', '-'),
(9, 8, 'pertemuan 4', 'basis data', '2025-11-20 04:25:00', '-'),
(10, 5, 'pertemuan 1', 'adbo', '2025-11-28 12:30:00', ''),
(12, 9, 'PPT GENETIK', 'genetika tanaman', '2025-11-20 13:24:00', '');

-- --------------------------------------------------------

--
-- Table structure for table `kegiatan_nonakademik`
--

CREATE TABLE `kegiatan_nonakademik` (
  `id_kegNA` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `namaKegiatan` varchar(100) DEFAULT NULL,
  `tgl_kegiatan` date DEFAULT NULL,
  `waktu_kegiatan` time DEFAULT NULL,
  `tempat_kegiatan` varchar(100) DEFAULT '-',
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kegiatan_nonakademik`
--

INSERT INTO `kegiatan_nonakademik` (`id_kegNA`, `id_user`, `namaKegiatan`, `tgl_kegiatan`, `waktu_kegiatan`, `tempat_kegiatan`, `deskripsi`) VALUES
(1, 8, 'seminar diesnat', '2025-11-22', '07:30:00', 'gedung syekh quro', 'janlup bawa terminal + absen panitia');

-- --------------------------------------------------------

--
-- Table structure for table `notif_sent`
--

CREATE TABLE `notif_sent` (
  `id_notif` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_jenis` int(11) DEFAULT NULL,
  `kategori` enum('akademik','nonakademik','skp') DEFAULT NULL,
  `jeniswaktu` varchar(20) NOT NULL,
  `waktu_kirim` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notif_sent`
--

INSERT INTO `notif_sent` (`id_notif`, `id_user`, `id_jenis`, `kategori`, `jeniswaktu`, `waktu_kirim`) VALUES
(1, 9, 11, 'akademik', 'besok', '2025-11-20 17:52:48'),
(2, 9, 13, 'akademik', '1min', '2025-11-20 18:41:44'),
(3, 9, 14, 'akademik', '1min', '2025-11-20 18:43:21'),
(4, 9, 15, 'akademik', '1min', '2025-11-21 01:32:43'),
(5, 11, 16, 'akademik', '1min', '2025-11-21 01:59:10');

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_skp`
--

CREATE TABLE `riwayat_skp` (
  `id_skp` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `poin` int(11) NOT NULL,
  `tgl_perolehan` date DEFAULT NULL,
  `mode_masa` enum('Tanggal','Durasi','Lifetime') DEFAULT NULL,
  `masa_tanggal` date DEFAULT NULL,
  `masa_durasi` varchar(50) DEFAULT NULL,
  `masa_lifetime` tinyint(1) DEFAULT 0,
  `sertifikat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `riwayat_skp`
--

INSERT INTO `riwayat_skp` (`id_skp`, `id_user`, `nama`, `jenis`, `kategori`, `poin`, `tgl_perolehan`, `mode_masa`, `masa_tanggal`, `masa_durasi`, `masa_lifetime`, `sertifikat`) VALUES
(4, 9, 'dies natalis pertanian', 'WEBINAR/SEMINAR', 'PESERTA WEBINAR', 20, '2025-11-18', 'Lifetime', NULL, NULL, 1, '1763619956795_Detail.txt'),
(13, 11, 'HIMTIKA', 'ORMAWA', 'WAKIL/SEKRETARIS/BENDAHARA ORMAWA', 30, '2025-11-21', 'Tanggal', '2028-11-03', NULL, 0, '1763690276267_2410631170067_Dhinara Shaffina Turham_Praktikum Jaringan Komputer (Switching).pkt');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `namaUser` varchar(50) NOT NULL,
  `registeredUser` varchar(20) NOT NULL,
  `registeredPass` varchar(255) NOT NULL,
  `npmUser` varchar(15) DEFAULT NULL,
  `fakultasUser` varchar(70) DEFAULT NULL,
  `prodiUser` varchar(40) DEFAULT NULL,
  `semesterUser` int(11) DEFAULT NULL,
  `kelasUser` varchar(10) DEFAULT NULL,
  `alamatUser` varchar(255) DEFAULT NULL,
  `lahirUser` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `namaUser`, `registeredUser`, `registeredPass`, `npmUser`, `fakultasUser`, `prodiUser`, `semesterUser`, `kelasUser`, `alamatUser`, `lahirUser`) VALUES
(5, 'dhinara', 'naraaa', '1234', '2410631170067', 'ilmu komputer', 'informatika', 3, 'B', 'serang', '2206-05-27'),
(6, 'karina', 'fina12', '1234', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, 'carmen', 'fina123', '123456', '241063', 'ilmu komputer', 'informatika', 3, 'B', 'Bali', '1970-01-01'),
(8, 'lee know', 'leebits03', 'ino1234', '2403034784', 'hukum', 'hukum', 3, 'A', 'bekasi', '2003-11-03'),
(9, 'tasya', 'cookiesmentai', '12345678', '356575564446', 'pertanian', 'hukum', 5, 'B', 'jatinangor', '2025-11-07'),
(10, 'RAY', 'JIRLAH', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, 'Ananda Fahrizal', 'Fer123', '123456', '007', 'FASILKOM', 'IF', 3, 'B', 'Karawang', '2011-11-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kegiatan_akademik`
--
ALTER TABLE `kegiatan_akademik`
  ADD PRIMARY KEY (`id_kegA`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `kegiatan_nonakademik`
--
ALTER TABLE `kegiatan_nonakademik`
  ADD PRIMARY KEY (`id_kegNA`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `notif_sent`
--
ALTER TABLE `notif_sent`
  ADD PRIMARY KEY (`id_notif`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `riwayat_skp`
--
ALTER TABLE `riwayat_skp`
  ADD PRIMARY KEY (`id_skp`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `registeredUser` (`registeredUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kegiatan_akademik`
--
ALTER TABLE `kegiatan_akademik`
  MODIFY `id_kegA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `kegiatan_nonakademik`
--
ALTER TABLE `kegiatan_nonakademik`
  MODIFY `id_kegNA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `notif_sent`
--
ALTER TABLE `notif_sent`
  MODIFY `id_notif` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `riwayat_skp`
--
ALTER TABLE `riwayat_skp`
  MODIFY `id_skp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kegiatan_akademik`
--
ALTER TABLE `kegiatan_akademik`
  ADD CONSTRAINT `kegiatan_akademik_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);

--
-- Constraints for table `kegiatan_nonakademik`
--
ALTER TABLE `kegiatan_nonakademik`
  ADD CONSTRAINT `kegiatan_nonakademik_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);

--
-- Constraints for table `notif_sent`
--
ALTER TABLE `notif_sent`
  ADD CONSTRAINT `notif_sent_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);

--
-- Constraints for table `riwayat_skp`
--
ALTER TABLE `riwayat_skp`
  ADD CONSTRAINT `riwayat_skp_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
