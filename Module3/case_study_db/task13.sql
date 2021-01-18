select dich_vu_di_kem.*, count(*) as so_luong_dich_vu_di_kem
from hop_dong_chi_tiet
	join dich_vu_di_kem using(id_dich_vu_di_kem)
group by id_dich_vu_di_kem
having so_luong_dich_vu_di_kem in (
	select max(so_luong_dich_vu_di_kem)
	from (
		select dich_vu_di_kem.*, count(*) as so_luong_dich_vu_di_kem
		from hop_dong_chi_tiet
			join dich_vu_di_kem using(id_dich_vu_di_kem)
		group by id_dich_vu_di_kem
	) as temp 
); 
