select * from khach_hang
where (( DATE_FORMAT(NOW(), '%Y') - DATE_FORMAT(ngay_sinh, '%Y') - (DATE_FORMAT(NOW(), '00-%m-%d') < DATE_FORMAT(ngay_sinh, '00-%m-%d'))) between 18 and 50)
and (dia_chi like 'Quảng Trị' or dia_chi like 'Đà Nẵng');