update khach_hang, (
select hop_dong.*
from hop_dong
join khach_hang on hop_dong.id_khach_hang=khach_hang.id_khach_hang
where khach_hang.id_loai_khach = 2 and hop_dong.tong_tien >1000000 and year(hop_dong.ngay_lam_hop_dong) = '2019'
) as temp_table
set khach_hang.id_loai_khach = 1
where khach_hang.id_khach_hang = temp_table.id_khach_hang
;

