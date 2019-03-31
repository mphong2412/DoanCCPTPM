-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2019 at 04:29 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangcap`
--

CREATE TABLE `bangcap` (
  `BangCap` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bangcap`
--

INSERT INTO `bangcap` (`BangCap`) VALUES
('Nhat Ngu N3'),
('Tieng Anh B1');

-- --------------------------------------------------------

--
-- Table structure for table `bophan`
--

CREATE TABLE `bophan` (
  `BoPhan` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bophan`
--

INSERT INTO `bophan` (`BoPhan`) VALUES
('BaoVe');

-- --------------------------------------------------------

--
-- Table structure for table `chucdanh`
--

CREATE TABLE `chucdanh` (
  `ChucDanh` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `chucdanh`
--

INSERT INTO `chucdanh` (`ChucDanh`) VALUES
('Giam Doc');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `ChucVu` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`ChucVu`) VALUES
('Giam Doc Kinh Doanh');

-- --------------------------------------------------------

--
-- Table structure for table `cmnd`
--

CREATE TABLE `cmnd` (
  `NoiCapCM` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cmnd`
--

INSERT INTO `cmnd` (`NoiCapCM`) VALUES
('CA Lam Dong'),
('CA TP HCM');

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE `dantoc` (
  `DanToc` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`DanToc`) VALUES
('Hoa'),
('Kinh'),
('Muong Lac');

-- --------------------------------------------------------

--
-- Table structure for table `diadiemlamviec`
--

CREATE TABLE `diadiemlamviec` (
  `DiaDiemLamViec` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diadiemlamviec`
--

INSERT INTO `diadiemlamviec` (`DiaDiemLamViec`) VALUES
('ONha');

-- --------------------------------------------------------

--
-- Table structure for table `donvi`
--

CREATE TABLE `donvi` (
  `DonVi` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `donvi`
--

INSERT INTO `donvi` (`DonVi`) VALUES
('Hoi so');

-- --------------------------------------------------------

--
-- Table structure for table `loainv`
--

CREATE TABLE `loainv` (
  `LoaiNhanVien` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loainv`
--

INSERT INTO `loainv` (`LoaiNhanVien`) VALUES
('Nhan Vien Chinh Thuc'),
('Nhan Vien Parttime'),
('Nhan Vien Thu Viec');

-- --------------------------------------------------------

--
-- Table structure for table `nganhang`
--

CREATE TABLE `nganhang` (
  `NganHang` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nganhang`
--

INSERT INTO `nganhang` (`NganHang`) VALUES
('ACB'),
('Agribank');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `Phai` char(3) DEFAULT NULL,
  `CMND` int(11) DEFAULT NULL,
  `NgayCapCMND` varchar(45) DEFAULT NULL,
  `NoiCapCMND` varchar(45) DEFAULT NULL,
  `Sothe` varchar(45) DEFAULT NULL,
  `HoTen` varchar(45) DEFAULT NULL,
  `NamSinh` varchar(45) DEFAULT NULL,
  `NoiSinh` varchar(45) DEFAULT NULL,
  `DiaChiThuongTru` varchar(45) DEFAULT NULL,
  `DiaChiTamTru` varchar(45) DEFAULT NULL,
  `DienThoaiThuongTru` int(11) DEFAULT NULL,
  `DiDong` int(11) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `NgayVaoDoan` varchar(45) DEFAULT NULL,
  `NgayVaoDang` varchar(45) DEFAULT NULL,
  `DanToc` varchar(45) DEFAULT NULL,
  `TonGiao` varchar(45) DEFAULT NULL,
  `QuocTich` varchar(45) DEFAULT NULL,
  `Passport` int(11) DEFAULT NULL,
  `NgayCapPassport` varchar(45) DEFAULT NULL,
  `NoiCapPassport` varchar(45) DEFAULT NULL,
  `TinhTrangHonNhan` varchar(45) DEFAULT NULL,
  `MaSoThue` int(11) DEFAULT NULL,
  `NgayCapMST` varchar(45) DEFAULT NULL,
  `SoTaiKhoan` int(11) DEFAULT NULL,
  `MaTaiKhoan` varchar(45) DEFAULT NULL,
  `NganHang` varchar(45) DEFAULT NULL,
  `TrinhDo` varchar(45) DEFAULT NULL,
  `BangCap` varchar(45) DEFAULT NULL,
  `HocHam` varchar(45) DEFAULT NULL,
  `ChuyenMon` varchar(45) DEFAULT NULL,
  `KNLVChuyenMon` varchar(45) DEFAULT NULL,
  `LoaiNhanVien` varchar(45) DEFAULT NULL,
  `DonVi` varchar(45) DEFAULT NULL,
  `PhongBan` varchar(45) DEFAULT NULL,
  `BoPhan` varchar(45) DEFAULT NULL,
  `ChucDanh` varchar(45) DEFAULT NULL,
  `ChucVu` varchar(45) DEFAULT NULL,
  `DiaDiemLamViec` varchar(45) DEFAULT NULL,
  `LuongThuViec` varchar(45) DEFAULT NULL,
  `LuongCB` varchar(45) DEFAULT NULL,
  `LuongKD` varchar(45) DEFAULT NULL,
  `NgayVaoCty` varchar(45) DEFAULT NULL,
  `NgayHetHanTV` varchar(45) DEFAULT NULL,
  `NgayVaoChinhThuc` varchar(45) DEFAULT NULL,
  `img` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Phai`, `CMND`, `NgayCapCMND`, `NoiCapCMND`, `Sothe`, `HoTen`, `NamSinh`, `NoiSinh`, `DiaChiThuongTru`, `DiaChiTamTru`, `DienThoaiThuongTru`, `DiDong`, `Email`, `NgayVaoDoan`, `NgayVaoDang`, `DanToc`, `TonGiao`, `QuocTich`, `Passport`, `NgayCapPassport`, `NoiCapPassport`, `TinhTrangHonNhan`, `MaSoThue`, `NgayCapMST`, `SoTaiKhoan`, `MaTaiKhoan`, `NganHang`, `TrinhDo`, `BangCap`, `HocHam`, `ChuyenMon`, `KNLVChuyenMon`, `LoaiNhanVien`, `DonVi`, `PhongBan`, `BoPhan`, `ChucDanh`, `ChucVu`, `DiaDiemLamViec`, `LuongThuViec`, `LuongCB`, `LuongKD`, `NgayVaoCty`, `NgayHetHanTV`, `NgayVaoChinhThuc`, `img`) VALUES
(12, 'Nam', 123, '10-20-2019', 'CA Lam Dong', '123', '123', '17-20-2019', 'Lam Dong', '123', '123', 123, 123, '123', '02-00-2019', '01-19-2019', 'Hoa', 'Dao phat', 'Viet Nam', 13, '02-00-2019', '1231', 'Da Ket Hon', 123, '07-19-2019', 132123, '1231', 'ACB', 'Cao Dang', 'Nhat Ngu N3', '123123', '12313', '1', 'Nhan Vien Chinh Thuc', 'Hoi so', 'Ban Giam Doc', 'BaoVe', 'Giam Doc', 'Giam Doc Kinh Doanh', 'ONha', '12313', '123123', '123123', '03-20-2019', '02-20-2019', '-2035', NULL),
(312, 'Nam', 32313123, '02-24-2019', 'CA Lam Dong', '213123', '123', '16-24-2019', 'Lam Dong', '13123', '123123', 123123, 123, '233', '08-00-2019', '08-25-2019', 'Hoa', 'Dao phat', 'Viet Nam', 32, '09-25-2019', '34234', 'Da Ket Hon', 3423, '08-25-2019', 42424, '24342', 'ACB', 'Cao Dang', 'Nhat Ngu N3', '3434', '44434', '2', 'Nhan Vien Chinh Thuc', 'Hoi so', 'Ban Giam Doc', 'BaoVe', 'Giam Doc', 'Giam Doc Kinh Doanh', 'ONha', '33423', '24234', '234234', '09-25-2019', '09-25-2019', '-2035', NULL),
(1231, 'Nam', 123, '17-16-2019', 'CA Lam Dong', '13', 'qwe', '10-16-2019', 'Lam Dong', '13', '123', 123, 123, '123', '17-16-2019', '02-16-2019', 'Hoa', 'Dao phat', 'Viet Nam', 123, '09-00-2019', '123', 'Da Ket Hon', 123, '02-16-2019', 13, '13', 'ACB', 'Cao Dang', 'Nhat Ngu N3', '123', '13', '13', 'Nhan Vien Chinh Thuc', 'Hoi so', 'Ban Giam Doc', 'BaoVe', 'Giam Doc', 'Giam Doc Kinh Doanh', 'ONha', '131', '123123', '123', '02-00-2019', '02-17-2019', '-2025', NULL),
(3123, 'Nam', 3123, '09-20-2019', 'CA Lam Dong', '12313', '12312313', '02-20-2019', 'Lam Dong', '1123123', '1313', 12313, 13123, '123123', '15-20-2019', '21-20-2019', 'Hoa', 'Dao phat', 'Viet Nam', 2133, '08-20-2019', '123123', 'Da Ket Hon', 12312, '14-20-2019', 123, '123123', 'ACB', 'Cao Dang', 'Nhat Ngu N3', '1231', '123', '12', 'Nhan Vien Chinh Thuc', 'Hoi so', 'Ban Giam Doc', 'BaoVe', 'Giam Doc', 'Giam Doc Kinh Doanh', 'ONha', '123', '123123', '123123', '10-20-2019', '15-20-2019', '-2037', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `noisinh`
--

CREATE TABLE `noisinh` (
  `NoiSinh` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `noisinh`
--

INSERT INTO `noisinh` (`NoiSinh`) VALUES
('Lam Dong'),
('Soc Trang'),
('Thanh Hoa');

-- --------------------------------------------------------

--
-- Table structure for table `phai`
--

CREATE TABLE `phai` (
  `Phai` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phai`
--

INSERT INTO `phai` (`Phai`) VALUES
('Nam'),
('Nu');

-- --------------------------------------------------------

--
-- Table structure for table `phongban`
--

CREATE TABLE `phongban` (
  `PhongBan` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phongban`
--

INSERT INTO `phongban` (`PhongBan`) VALUES
('Ban Giam Doc');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE `quoctich` (
  `QuocTich` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `quoctich`
--

INSERT INTO `quoctich` (`QuocTich`) VALUES
('Viet Nam');

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE `tongiao` (
  `TonGiao` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`TonGiao`) VALUES
('Dao phat'),
('Khong');

-- --------------------------------------------------------

--
-- Table structure for table `trinhdo`
--

CREATE TABLE `trinhdo` (
  `TrinhDo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `trinhdo`
--

INSERT INTO `trinhdo` (`TrinhDo`) VALUES
('Cao Dang'),
('Dai Hoc'),
('Sau Dai Hoc');

-- --------------------------------------------------------

--
-- Table structure for table `tthn`
--

CREATE TABLE `tthn` (
  `TinhTrangHonNhan` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tthn`
--

INSERT INTO `tthn` (`TinhTrangHonNhan`) VALUES
('Da Ket Hon'),
('Doc Than');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangcap`
--
ALTER TABLE `bangcap`
  ADD PRIMARY KEY (`BangCap`);

--
-- Indexes for table `bophan`
--
ALTER TABLE `bophan`
  ADD PRIMARY KEY (`BoPhan`);

--
-- Indexes for table `chucdanh`
--
ALTER TABLE `chucdanh`
  ADD PRIMARY KEY (`ChucDanh`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`ChucVu`);

--
-- Indexes for table `cmnd`
--
ALTER TABLE `cmnd`
  ADD PRIMARY KEY (`NoiCapCM`);

--
-- Indexes for table `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`DanToc`);

--
-- Indexes for table `diadiemlamviec`
--
ALTER TABLE `diadiemlamviec`
  ADD PRIMARY KEY (`DiaDiemLamViec`);

--
-- Indexes for table `donvi`
--
ALTER TABLE `donvi`
  ADD PRIMARY KEY (`DonVi`);

--
-- Indexes for table `loainv`
--
ALTER TABLE `loainv`
  ADD PRIMARY KEY (`LoaiNhanVien`);

--
-- Indexes for table `nganhang`
--
ALTER TABLE `nganhang`
  ADD PRIMARY KEY (`NganHang`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `Phai` (`Phai`),
  ADD KEY `DanToc` (`DanToc`),
  ADD KEY `TonGiao` (`TonGiao`),
  ADD KEY `TinhTrangHonNhan` (`TinhTrangHonNhan`),
  ADD KEY `TrinhDo` (`TrinhDo`),
  ADD KEY `BangCap` (`BangCap`),
  ADD KEY `LoaiNhanVien` (`LoaiNhanVien`),
  ADD KEY `DonVi` (`DonVi`),
  ADD KEY `PhongBan` (`PhongBan`),
  ADD KEY `BoPhan` (`BoPhan`),
  ADD KEY `ChucDanh` (`ChucDanh`),
  ADD KEY `ChucVu` (`ChucVu`),
  ADD KEY `DiaDiemLamViec` (`DiaDiemLamViec`),
  ADD KEY `NoiSinh` (`NoiSinh`),
  ADD KEY `NganHang` (`NganHang`),
  ADD KEY `NoiCapCMND` (`NoiCapCMND`),
  ADD KEY `QuocTich` (`QuocTich`);

--
-- Indexes for table `noisinh`
--
ALTER TABLE `noisinh`
  ADD PRIMARY KEY (`NoiSinh`);

--
-- Indexes for table `phai`
--
ALTER TABLE `phai`
  ADD PRIMARY KEY (`Phai`);

--
-- Indexes for table `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`PhongBan`);

--
-- Indexes for table `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`QuocTich`);

--
-- Indexes for table `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`TonGiao`);

--
-- Indexes for table `trinhdo`
--
ALTER TABLE `trinhdo`
  ADD PRIMARY KEY (`TrinhDo`);

--
-- Indexes for table `tthn`
--
ALTER TABLE `tthn`
  ADD PRIMARY KEY (`TinhTrangHonNhan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`Phai`) REFERENCES `phai` (`Phai`),
  ADD CONSTRAINT `nhanvien_ibfk_10` FOREIGN KEY (`LoaiNhanVien`) REFERENCES `loainv` (`LoaiNhanVien`),
  ADD CONSTRAINT `nhanvien_ibfk_11` FOREIGN KEY (`DonVi`) REFERENCES `donvi` (`DonVi`),
  ADD CONSTRAINT `nhanvien_ibfk_12` FOREIGN KEY (`ChucDanh`) REFERENCES `chucdanh` (`ChucDanh`),
  ADD CONSTRAINT `nhanvien_ibfk_13` FOREIGN KEY (`BangCap`) REFERENCES `bangcap` (`BangCap`),
  ADD CONSTRAINT `nhanvien_ibfk_14` FOREIGN KEY (`ChucVu`) REFERENCES `chucvu` (`ChucVu`),
  ADD CONSTRAINT `nhanvien_ibfk_15` FOREIGN KEY (`TonGiao`) REFERENCES `tongiao` (`TonGiao`),
  ADD CONSTRAINT `nhanvien_ibfk_16` FOREIGN KEY (`NoiSinh`) REFERENCES `noisinh` (`NoiSinh`),
  ADD CONSTRAINT `nhanvien_ibfk_17` FOREIGN KEY (`DanToc`) REFERENCES `dantoc` (`DanToc`),
  ADD CONSTRAINT `nhanvien_ibfk_18` FOREIGN KEY (`NganHang`) REFERENCES `nganhang` (`NganHang`),
  ADD CONSTRAINT `nhanvien_ibfk_19` FOREIGN KEY (`NoiCapCMND`) REFERENCES `cmnd` (`NoiCapCM`),
  ADD CONSTRAINT `nhanvien_ibfk_20` FOREIGN KEY (`QuocTich`) REFERENCES `quoctich` (`QuocTich`),
  ADD CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`DiaDiemLamViec`) REFERENCES `diadiemlamviec` (`DiaDiemLamViec`),
  ADD CONSTRAINT `nhanvien_ibfk_5` FOREIGN KEY (`PhongBan`) REFERENCES `phongban` (`PhongBan`),
  ADD CONSTRAINT `nhanvien_ibfk_6` FOREIGN KEY (`TrinhDo`) REFERENCES `trinhdo` (`TrinhDo`),
  ADD CONSTRAINT `nhanvien_ibfk_8` FOREIGN KEY (`BoPhan`) REFERENCES `bophan` (`BoPhan`),
  ADD CONSTRAINT `nhanvien_ibfk_9` FOREIGN KEY (`TinhTrangHonNhan`) REFERENCES `tthn` (`TinhTrangHonNhan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
