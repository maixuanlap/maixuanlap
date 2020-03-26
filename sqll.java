

        CREATE TABLE `sach` (
        `sachs_id` int(11) NOT NULL AUTO_INCREMENT,
        `tac_gias_id`int(11)NOT NULL,
        `nxbs_id`int (11)NOT NULL,
        `name` varchar(50) NOT NULL,
        `năm_xb` VARCHAR(50) NOT NULL,
        `slxb` int NOT NULL,
        `giaban` Decimal(5,2)NOT NULL,
        ` soluong` int NOT NULL,
        PRIMARY KEY (`sachs_id`),
        KEY `FK_nxbs_id` (`nxbs_id`),
        KEY `FK_loai_sachs` (`loai_sachs_id`),
        KEY `FK_tac_gias_id` (`tac_gias_id`),
        CONSTRAINT `FK_nxbs_id` FOREIGN KEY (`nxbs_id`) REFERENCES `nxb` (`nxbs_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
        CONSTRAINT `FK_loai_sachs_id` FOREIGN KEY (`loai_sachs_id`) REFERENCES `loai_sach` (`loai_sachs_id`) ON UPDATE CASCADE,
        CONSTRAINT `FK_tac_gias_id` FOREIGN KEY (`tac_gias_id`) REFERENCES `tac_gia` (`tac_gias_id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
        INSERT INTO `sach` VALUES('Toán Học',2019,5,15,1000);
        INSERT INTO`sach`VALUES('Văn',2019,5,15,1000);
        INSERT INTO`sach`VALUES('Hóa',2019,5,15,1000);
        INSERT INTO`sach`VALUES('Lí',2019,5,15,1000);
        INSERT INTO`sach`VALUES('Sử',2019,5,15,1000);

        CREATE TABLE `don_hang` (
        `don_hangs_id` int(11) NOT NULL,
        ` khach_hangs_id`int(11) NOT NULL ,
        `name` VARCHAR(50)NOT NULL,
        ` ngaychot` int NOT NULL,
        ` ngaynhan` int(50)NOT NULL,
        PRIMARY KEY(`don_hangs_id`),
        KEY `FK_khach_hangs_id` (`khach_hangs_id`),
        CONSTRAINT `FK_khach_hangs_id` FOREIGN KEY (`khach_hangs_id`) REFERENCES `khach_hang` (`khach_hangs_id`) ON DELETE RESTRICT ON UPDATE CASCADE
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
        INSERT INTO`don_hang`VALUES(1,'sách Toán','15-4-2019','15-4-2020');
        INSERT INTO`don_hang`VALUES(2,'sách Văn','15-4-2019','15-4-2020');
        INSERT INTO`don_hang`VALUES(3,'sách Hóa','15-4-2019','15-4-2020');
        INSERT INTO`don_hang`VALUES(4,'sách Lí','15-4-2019','15-4-2020');
        INSERT INTO`don_hang`VALUES(5,'sách Sử','15-4-2019','15-4-2020');

        CREATE TABLE `don_hang_chi_tiet` (
        `don_hang_chi_tiets_id`int(11) NOT NULL,
        `don_hangs_id` int(11) NOT NULL,
        `sachs_id` int(11) NOT NULL AUTO_INCREMENT,
        ` name` VARCHAR(50)NOT NULL,
        ` gia` Decimal(5,2)NOT NULL,
        ` soluong` int NOT NULL,
        PRIMARY KEY(`don_hang_chi_tiets_id`),
        KEY `FK_don_hangs_id` (`don_hangs_id`),
        KEY `FK_sachs_id` (`sachs_id`),
        CONSTRAINT `FK_don_hangs_id` FOREIGN KEY (`don_hangs_id`) REFERENCES `don_hang` (`don_hangs_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
        CONSTRAINT `FK_sachs_id` FOREIGN KEY (`sachs_id`) REFERENCES `sach` (`sachs_id`) ON DELETE RESTRICT ON UPDATE CASCADE
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

        INSERT INTO`don_hang_chi_tiet`VALUES(1,'đơn hàng 1',150000000,2363738);
        INSERT INTO`don_hang_chi_tiet`VALUES(2,'đơn hàng 2',150000000,2363738);
        INSERT INTO`don_hang_chi_tiet`VALUES(3,'đơn hàng 3',150000000,2363738);
        INSERT INTO`don_hang_chi_tiet`VALUES(4,'đơn hàng 4',150000000,2363738);
        INSERT INTO`don_hang_chi_tiet`VALUES(5,'đơn hàng 5',150000000,2363738);

        CREATE TABLE `khach_hang` (
        ` khach_hangs_id`int(11) NOT NULL ,
        ` ten` VarCHAR(50) NOT NULL,
        `  diachi` VARCHAR(50)NOT NULL,
        `  sdt` VARCHAR(50)NOT NULL,
        `ngay_sinh` VARCHAR(50)NOT NULL,
        `email` Varchar(50)NOT NULL,
        PRIMARY KEY (`khach_hangs_id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
        INSERT INTO`khach_hang`VALUES(1,'nguyễn văn a','hà nội',0123456789,15-4-2001,'1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(2,'nguyễn văn b','hà nội',0123456789,15-4-2001,'1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(3,'nguyễn văn c','hà nội',0123456789,15-4-2001,'1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(4,'nguyễn văn d','hà nội',0123456789,15-4-2001,'1542001lap@gmail.com');
        INSERT INTO`khach_hang`VALUES(5,'nguyễn văn e','hà nội',0123456789,15-4-2001,'1542001lap@gmail.com');

        CREATE TABLE`loai_sach` (
        `loai_sachs_id` int(11)NOT NULL,
        ` name` VARCHAR(50) NOT NULL,
        PRIMARY KEY (`loai_sachs_id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

        INSERT INTO`loai_sach`VALUES(1,'tri thức');
        INSERT INTO`loai_sach`VALUES(2,'Văn học');

        CREATE TABLE `tac_gia`(
        ` tac_gias_id` int(11) NOT NULL ,
        ` ten` VARCHAR(50) NOT NULL,
        ` ngay_sinh` VARCHAR(50) NOT NULL,
        ` soluoc` VARCHAR(50)NOT NULL,
        PRIMARY KEY (tac_gias_id)
        ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

        INSERT INTO`tac_gia`VALUES(1,'nguyễn văn a','24-26-2637','rất giàu');

        CREATE TABLE `nxb`(
        `nxbs_id`int(11) NOT NULL,
        `ten `varchar(50)NOT NULL,
        `diachi `VARCHAR(50)NOT NULL,
        PRIMARY KEY(`nxbs_id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

        INSERT INTO`nxb`VALUES(1,'aaaaaa','số 8 tôn thất thuyết');
        INSERT INTO`nxb`VALUES(2,'bbbbbbbb','số 9 tôn thất thuyết');
        INSERT INTO`nxb`VALUES(3,'ccccccc','số 7 tôn thất thuyết');


                DROP DATABASE IF EXISTS `invoicing`;
                CREATE DATABASE `invoicing`;
                USE `invoicing`;

                SET NAMES utf8 ;
                SET character_set_client = utf8mb4 ;

                CREATE TABLE `payment_methods` (
                `payment_method_id` tinyint(4) NOT NULL AUTO_INCREMENT,
                `name` varchar(50) NOT NULL,
                PRIMARY KEY (`payment_method_id`)
                ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
                INSERT INTO `payment_methods` VALUES (1,'Credit Card');
                INSERT INTO `payment_methods` VALUES (2,'Cash');
                INSERT INTO `payment_methods` VALUES (3,'PayPal');
                INSERT INTO `payment_methods` VALUES (4,'Wire Transfer');

                CREATE TABLE `clients` (
                `client_id` int(11) NOT NULL,
                `name` varchar(50) NOT NULL,
                `address` varchar(50) NOT NULL,
                `city` varchar(50) NOT NULL,
                `state` char(2) NOT NULL,
                `phone` varchar(50) DEFAULT NULL,
                PRIMARY KEY (`client_id`)
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
                INSERT INTO `clients` VALUES (1,'Vinte','3 Nevada Parkway','Syracuse','NY','315-252-7305');
                INSERT INTO `clients` VALUES (2,'Myworks','34267 Glendale Parkway','Huntington','WV','304-659-1170');
                INSERT INTO `clients` VALUES (3,'Yadel','096 Pawling Parkway','San Francisco','CA','415-144-6037');
                INSERT INTO `clients` VALUES (4,'Kwideo','81674 Westerfield Circle','Waco','TX','254-750-0784');
                INSERT INTO `clients` VALUES (5,'Topiclounge','0863 Farmco Road','Portland','OR','971-888-9129');

                CREATE TABLE `invoices` (
                `invoice_id` int(11) NOT NULL,
                `number` varchar(50) NOT NULL,
                `client_id` int(11) NOT NULL,
                `invoice_total` decimal(9,2) NOT NULL,
                `payment_total` decimal(9,2) NOT NULL DEFAULT '0.00',
                `invoice_date` date NOT NULL,
                `due_date` date NOT NULL,
                `payment_date` date DEFAULT NULL,
                PRIMARY KEY (`invoice_id`),
                KEY `FK_client_id` (`client_id`),
                CONSTRAINT `FK_client_id` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`) ON DELETE RESTRICT ON UPDATE CASCADE
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
                INSERT INTO `invoices` VALUES (1,'91-953-3396',2,101.79,0.00,'2019-03-09','2019-03-29',NULL);
                INSERT INTO `invoices` VALUES (2,'03-898-6735',5,175.32,8.18,'2019-06-11','2019-07-01','2019-02-12');
                INSERT INTO `invoices` VALUES (3,'20-228-0335',5,147.99,0.00,'2019-07-31','2019-08-20',NULL);
                INSERT INTO `invoices` VALUES (4,'56-934-0748',3,152.21,0.00,'2019-03-08','2019-03-28',NULL);
                INSERT INTO `invoices` VALUES (5,'87-052-3121',5,169.36,0.00,'2019-07-18','2019-08-07',NULL);
                INSERT INTO `invoices` VALUES (6,'75-587-6626',1,157.78,74.55,'2019-01-29','2019-02-18','2019-01-03');
                INSERT INTO `invoices` VALUES (7,'68-093-9863',3,133.87,0.00,'2019-09-04','2019-09-24',NULL);
                INSERT INTO `invoices` VALUES (8,'78-145-1093',1,189.12,0.00,'2019-05-20','2019-06-09',NULL);
                INSERT INTO `invoices` VALUES (9,'77-593-0081',5,172.17,0.00,'2019-07-09','2019-07-29',NULL);
                INSERT INTO `invoices` VALUES (10,'48-266-1517',1,159.50,0.00,'2019-06-30','2019-07-20',NULL);
                INSERT INTO `invoices` VALUES (11,'20-848-0181',3,126.15,0.03,'2019-01-07','2019-01-27','2019-01-11');
                INSERT INTO `invoices` VALUES (13,'41-666-1035',5,135.01,87.44,'2019-06-25','2019-07-15','2019-01-26');
                INSERT INTO `invoices` VALUES (15,'55-105-9605',3,167.29,80.31,'2019-11-25','2019-12-15','2019-01-15');
                INSERT INTO `invoices` VALUES (16,'10-451-8824',1,162.02,0.00,'2019-03-30','2019-04-19',NULL);
                INSERT INTO `invoices` VALUES (17,'33-615-4694',3,126.38,68.10,'2019-07-30','2019-08-19','2019-01-15');
                INSERT INTO `invoices` VALUES (18,'52-269-9803',5,180.17,42.77,'2019-05-23','2019-06-12','2019-01-08');
                INSERT INTO `invoices` VALUES (19,'83-559-4105',1,134.47,0.00,'2019-11-23','2019-12-13',NULL);

                CREATE TABLE `payments` (
                `payment_id` int(11) NOT NULL AUTO_INCREMENT,
                `client_id` int(11) NOT NULL,
                `invoice_id` int(11) NOT NULL,
                `date` date NOT NULL,
                `amount` decimal(9,2) NOT NULL,
                `payment_method` tinyint(4) NOT NULL,
                PRIMARY KEY (`payment_id`),
                KEY `fk_client_id_idx` (`client_id`),
                KEY `fk_invoice_id_idx` (`invoice_id`),
                KEY `fk_payment_payment_method_idx` (`payment_method`),
                CONSTRAINT `fk_payment_client` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`) ON UPDATE CASCADE,
                CONSTRAINT `fk_payment_invoice` FOREIGN KEY (`invoice_id`) REFERENCES `invoices` (`invoice_id`) ON UPDATE CASCADE,
                CONSTRAINT `fk_payment_payment_method` FOREIGN KEY (`payment_method`) REFERENCES `payment_methods` (`payment_method_id`)
                ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
                INSERT INTO `payments` VALUES (1,5,2,'2019-02-12',8.18,1);
                INSERT INTO `payments` VALUES (2,1,6,'2019-01-03',74.55,1);
                INSERT INTO `payments` VALUES (3,3,11,'2019-01-11',0.03,1);
                INSERT INTO `payments` VALUES (4,5,13,'2019-01-26',87.44,1);
                INSERT INTO `payments` VALUES (5,3,15,'2019-01-15',80.31,1);
                INSERT INTO `payments` VALUES (6,3,17,'2019-01-15',68.10,1);
                INSERT INTO `payments` VALUES (7,5,18,'2019-01-08',32.77,1);
                INSERT INTO `payments` VALUES (8,5,18,'2019-01-08',10.00,2);