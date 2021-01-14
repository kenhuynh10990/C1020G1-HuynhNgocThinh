select hop_dong.id_hop_dong, nhan_vien.ho_ten, khach_hang.ho_va_ten, khach_hang.so_dien_thoai, dich_vu.ten_dich_vu,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) so_luong_dich_vu_di_kem, hop_dong.tien_dat_coc from hop_dong
join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu 
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
where not exists (
select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between "2019-01-01" and "2019-06-30"
) and exists (
select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between "2019-10-01" and "2019-12-31"
group by hop_dong.id_hop_dong
);