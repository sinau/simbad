-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 20. Maret 2016 jam 00:06
-- Versi Server: 5.1.37
-- Versi PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `simbad`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `absensi`
--

CREATE TABLE IF NOT EXISTS `absensi` (
  `id_agt` varchar(30) NOT NULL,
  `nama_agt` varchar(150) DEFAULT NULL,
  `nama_item` varchar(100) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `hari` varchar(20) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `jam` time DEFAULT NULL,
  KEY `FKabsensi712410` (`id_agt`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `absensi`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `id_agt` varchar(30) NOT NULL,
  `nama_agt` varchar(150) DEFAULT NULL,
  `alamat` varchar(1000) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `jeniskelamin` varchar(20) DEFAULT NULL,
  `asal_sekolah` varchar(200) DEFAULT NULL,
  `no_tlpn` varchar(30) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_agt`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `inventaris`
--

CREATE TABLE IF NOT EXISTS `inventaris` (
  `id_inventaris` varchar(30) NOT NULL,
  `nama` varchar(200) DEFAULT NULL,
  `qty_total` int(10) DEFAULT NULL,
  `qty_baik` int(10) DEFAULT NULL,
  `qty_rusak` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_inventaris`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `inventaris`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `invois`
--

CREATE TABLE IF NOT EXISTS `invois` (
  `id_invois` varchar(30) NOT NULL,
  `id_rs` varchar(30) NOT NULL,
  `keterangan` varchar(50) DEFAULT NULL,
  `tgl_bayar` date DEFAULT NULL,
  `totalbayar` varchar(30) DEFAULT NULL,
  `terbayar` varchar(30) DEFAULT NULL,
  `terhutang` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_invois`),
  KEY `FKinvois802990` (`id_rs`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `invois`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `invois_payment`
--

CREATE TABLE IF NOT EXISTS `invois_payment` (
  `id_inp` varchar(30) NOT NULL,
  `id_invois` varchar(30) NOT NULL,
  `keterangan` varchar(50) DEFAULT NULL,
  `totalbayar` varchar(30) DEFAULT NULL,
  `terbayar` varchar(30) DEFAULT NULL,
  `terhutang` varchar(30) DEFAULT NULL,
  `nama_tp` varchar(30) NOT NULL,
  `tgl_bayar` date DEFAULT NULL,
  PRIMARY KEY (`id_inp`),
  KEY `FKinvois_pay928821` (`nama_tp`),
  KEY `FKinvois_pay965323` (`id_invois`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `invois_payment`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `Id_item` varchar(30) NOT NULL,
  `nama_item` varchar(100) DEFAULT NULL,
  `Column` int(10) DEFAULT NULL,
  PRIMARY KEY (`Id_item`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `item`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE IF NOT EXISTS `jadwal` (
  `id_jadwal` varchar(30) NOT NULL,
  `id_agt` varchar(30) NOT NULL,
  `hari` varchar(20) DEFAULT NULL,
  `jam` time DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`id_jadwal`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwal`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwalreques`
--

CREATE TABLE IF NOT EXISTS `jadwalreques` (
  `id_jadwal` varchar(30) NOT NULL,
  `id_rs` varchar(30) NOT NULL,
  `hari` varchar(20) DEFAULT NULL,
  `jam` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwalreques`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `penggajian`
--

CREATE TABLE IF NOT EXISTS `penggajian` (
  `id_agt` varchar(30) NOT NULL,
  `nama_agt` varchar(150) DEFAULT NULL,
  `gaji` varchar(30) DEFAULT NULL,
  KEY `FKpenggajian634956` (`id_agt`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penggajian`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `registrasi`
--

CREATE TABLE IF NOT EXISTS `registrasi` (
  `id_rs` varchar(30) NOT NULL,
  `nama` varchar(150) DEFAULT NULL,
  `alamat` varchar(1000) DEFAULT NULL,
  `asal_sekolah` varchar(200) DEFAULT NULL,
  `no_tlpn` varchar(30) DEFAULT NULL,
  `tgl_pembuatan` date DEFAULT NULL,
  `tgl_update` date DEFAULT NULL,
  PRIMARY KEY (`id_rs`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `registrasi`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `registrasi_item`
--

CREATE TABLE IF NOT EXISTS `registrasi_item` (
  `id_rs` varchar(30) NOT NULL,
  `id_item` varchar(30) NOT NULL,
  KEY `FKregistrasi514618` (`id_rs`),
  KEY `FKregistrasi57157` (`id_item`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `registrasi_item`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `roll`
--

CREATE TABLE IF NOT EXISTS `roll` (
  `id_roll` varchar(30) NOT NULL,
  `nama` varchar(150) DEFAULT NULL,
  `id_agt` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_roll`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `roll`
--


-- --------------------------------------------------------

--
-- Struktur dari tabel `tipe_pembayaran`
--

CREATE TABLE IF NOT EXISTS `tipe_pembayaran` (
  `id_tp` varchar(30) NOT NULL,
  `nama_tp` int(50) DEFAULT NULL,
  PRIMARY KEY (`id_tp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tipe_pembayaran`
--


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
