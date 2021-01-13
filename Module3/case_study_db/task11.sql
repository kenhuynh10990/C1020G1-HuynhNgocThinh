select dich_vu_di_kem.*
from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where 
loai_khach.ten_loai_khach = 'Diamond' and (khach_hang.dia_chi= 'Vinh' or khach_hang.dia_chi= 'Quảng Ngãi');

