update dich_vu_di_kem
set gia = gia * 2
where id_dich_vu_di_kem in (
	select id_dich_vu_di_kem
    from hop_dong_chi_tiet 
    group by hop_dong_chi_tiet.id_dich_vu_di_kem
    having sum(hop_dong_chi_tiet.so_luong) > 10
);
