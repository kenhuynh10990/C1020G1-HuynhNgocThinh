insert into vi_tri
value (1,'lễ tân'), (2,'phục vụ'), (3, 'chuyên viên'),(4, 'giám sát'),(5,'quản lý'), (6, 'giám đốc');

insert into trinh_do
value (1,'trung cấp'), (2,'cao đẳng'),(3, 'đại học'),(4,'sau đại học');

insert into bo_phan
value (1, 'sale- marketing'),(2,'hành chính'),(3, 'phục vụ'),(4,'quản lý');

insert into nhan_vien
value 
(1, 'Hoang Lan Hong', 1, 1, 1, '1993-09-12', 123456789, 1234567893, 123456789, 'cho@gmai.com', 'Quảng Trị'),
(2, 'Nguyen Tien Van', 2, 2, 1, '1990-09-11', 123666789, 123666789, 123666789, 'occho@gmai.com', 'đà nẵng'),
(3, 'Tran Thu Do', 1, 3, 1, '2000-12-01', 123555789, 123555789, 123555789, 'meo@gmai.com', 'Quảng Trị'),
(4, 'Kim Long', 2, 4, 1, '1998-09-12', 123444789, 123444789, 123444789, 'asdsfbc@abc.com', 'huế'),
(5, 'Phan Kim Lien', 3, 1, 1, '1999-12-12', 13000000, 13000000, 13000000, 'heo@abc.com', 'đà nẵng'),
(6, 'Kim Binh Mai', 4, 2, 1, '1998-01-01', 242131, 242131, 242131, 'trau@abc.com', 'huế'),
(7, 'Hai Khi', 1, 3, 1, '1999-12-12', 23245, 4545, 345346, 'dog@abc.com', 'quảng nam');

insert into dich_vu_di_kem 
 value
(1, 'massage', 100, 1, 'not ok'),
(2, 'karaoke', 100, 1, 'ok'),
(3, 'thức ăn', 50, 1, 'ok'),
(4, 'nước uống', 25, 1, 'ok'),
(5, 'xe tham quan resort', 300, 1, 'not ok');

insert into loai_khach
value (1,'Diamond'),(2,'Platinum'),(3,'Gold'),(4,'Silver'),(5,'Member');

insert into khach_hang 
 value
(1, 1, 'Phan Trung Sơn', '1993-06-16', 1313213213, 1312312, 'nui@gmail.com', 'huế'),
(2, 1, 'Trần Ánh', '1995-10-10', 1313213213, 1312312, 'anh@gmail.com', 'nghệ an'),
(3, 2, 'Nui Phan', '1999-12-12', 1313213213, 1312312, 'son@gmail.com', 'quảng trị'),
(4, 3, 'Phan Nguyên', '1997-12-12', 1313213213, 1312312, 'abc@anc.com', 'đà nẵng');

insert into loai_dich_vu
value (1, 'villa'),(2,'house'),(3,'room');

insert into kieu_thue
value (1, 'giờ',500),(2, 'ngày',1000),(3,'tháng',2000 );

insert into dich_vu 
value
(1, 'villa', 123, 123, 13, 1231312, 1, 1, 'trống'),
(2, 'house', 123, 123, 13, 1231312, 1, 1, 'trống'),
(3, 'room', 123, 123, 13, 1231312, 1, 1, 'trống'),
(4, 'villa', 123, 123, 13, 1231312, 1, 1, 'hết');

insert into hop_dong 
 value
(1, 2, 1, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(2, 2, 2, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(3, 2, 3, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(4, 2, 4, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(5, 2, 3, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(6, 2, 1, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(7, 2, 2, 2, '1999-12-12', '1999-12-12', 123123123, 123123123);

insert into hop_dong_chi_tiet 
 value
(1, 6, 5, 10), (2, 2, 2, 13), (3, 3, 3, 14), (4, 4, 4, 15), (5, 4, 4, 15), (6, 4, 4, 15), 
(7, 4, 4, 15), (8, 3, 3, 14), (9, 3, 3, 14), (10, 3, 3, 14);




