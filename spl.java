CREATE TABLE `sach` (
        `sachs_id`int (11)NOT NULL,
        `name` varchar(50) NOT NULL,
        `năm_xb` VARCHAR(50) NOT NULL,
        `slxb` int NOT NULL,
        `giaban` Decimal(5,2)NOT NULL,
        ` soluong` int NOT NULL,
        PRIMARY KEY (`sachs_id`),
        `nxbs_id`  SMALLINT UNSIGNED NOT NULL REFERENCES `nxb`(`nxbs_id`),
        `tac_gias_id`  SMALLINT UNSIGNED NOT NULL REFERENCES `tac_gia`(`tac_gias_id`),
        `loai_sachs_id` SMALLINT UNSIGNED NOT NULL REFERENCES `loai_sach`(`loai_sachs_id`));




        CREATE TABLE `don_hang` (
        `don_hangs_id` int(11) NOT NULL,
        `name` VARCHAR(50)NOT NULL,
        ` ngaychot` int NOT NULL,
        ` ngaynhan` int(50)NOT NULL,
        PRIMARY KEY(`don_hangs_id`),
        `khach_hangs_id` SMALLINT UNSIGNED NOT NULL REFERENCES `khach_hang`(`khach_hangs_id`));
        INSERT INTO`don_hang`VALUES(1,'sách Toán','15-4-2019','15-4-2020','');
        INSERT INTO`don_hang`VALUES(2,'sách Văn','15-4-2019','15-4-2020','');
        INSERT INTO`don_hang`VALUES(3,'sách Hóa','15-4-2019','15-4-2020','');
        INSERT INTO`don_hang`VALUES(4,'sách Lí','15-4-2019','15-4-2020','');
        INSERT INTO`don_hang`VALUES(5,'sách Sử','15-4-2019','15-4-2020','');




        CREATE TABLE `don_hang_chi_tiet` (
        `don_hang_chi_tiets_id`int(11) NOT NULL,
        ` name` VARCHAR(50)NOT NULL,
        ` gia` Decimal(5,2)NOT NULL,
        ` soluong` int NOT NULL,
        PRIMARY KEY(`don_hang_chi_tiets_id`),
        `don_hangs_id` SMALLINT UNSIGNED NOT NULL REFERENCES `don_hang`(`don_hangs_id`),
        `sachs_id` SMALLINT UNSIGNED NOT NULL REFERENCES `sach`(`sachs_id`));
        INSERT INTO`don_hang_chi_tiet`VALUES(1,'đơn hàng 1',150000000,2363738,'','');
        INSERT INTO`don_hang_chi_tiet`VALUES(2,'đơn hàng 2',150000000,2363738,'','');
        INSERT INTO`don_hang_chi_tiet`VALUES(3,'đơn hàng 3',150000000,2363738,'','');
        INSERT INTO`don_hang_chi_tiet`VALUES(4,'đơn hàng 4',150000000,2363738,'','');
        INSERT INTO`don_hang_chi_tiet`VALUES(5,'đơn hàng 5',150000000,2363738,'','');


        CREATE TABLE`loai_sach` (
        `loai_sachs_id` int(11)NOT NULL,
        ` name` VARCHAR(50) NOT NULL,
        PRIMARY KEY (`loai_sachs_id`)
        );
        INSERT INTO`loai_sach`VALUES(1,'tri thức');
        INSERT INTO`loai_sach`VALUES(2,'Văn học');

        CREATE TABLE `nxb`(
        `nxbs_id`int(11) NOT NULL,
        `name`VARCHAR(50)NOT NULL,
        `address`VARCHAR(50)NOT NULL,
        PRIMARY KEY(`nxbs_id`));
        INSERT INTO`nxb`VALUES(1,'aaaaaa','số 8 tôn thất thuyết');
        INSERT INTO`nxb`VALUES(2,'bbbbbbbb','số 9 tôn thất thuyết');
        INSERT INTO`nxb`VALUES(3,'ccccccc','số 7 tôn thất thuyết');



        CREATE TABLE `tac_gia`(
        `id` int(11) NOT NULL,
        `name` VARCHAR(50) NOT NULL,
        ` ngay_sinh` VARCHAR(50) NOT NULL,
        ` so_luoc` text NOT NULL,
        PRIMARY KEY (`id`));
        INSERT INTO`tac_gia`VALUES(1,'nguyễn văn a','24-26-2637','rất giàu');

        CREATE TABLE `khach_hang`(
        `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
        `name` VARCHAR(50) NOT NULL,
        `address` VARCHAR(50)NOT NULL,
        `phone` VARCHAR(50)NOT NULL,
        `date` VARCHAR(50)NOT NULL,
        `email` VARCHAR(50)NOT NULL,
        PRIMARY KEY (`id`) );
        INSERT INTO`khach_hang`VALUES(1,'nguyễn văn a','hà nội',0123456789,'15-4-2001','1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(2,'nguyễn văn b','hà nội',0123456789,'15-4-2001','1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(3,'nguyễn văn c','hà nội',0123456789,'15-4-2001','1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(4,'nguyễn văn d','hà nội',0123456789,'15-4-2001','1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(5,'nguyễn văn e','hà nội',0123456789,'15-4-2001','1542001lap@gmail.com');







