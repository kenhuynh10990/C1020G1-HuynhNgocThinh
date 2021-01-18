delete from khach_hang
where exists (
select hop_dong.id_hop_dong 
from hop_dong
where hop_dong.ngay_lam_hop_dong < "2016-01-01"
and khach_hang.id_khach_hang = hop_dong.id_khach_hang
);