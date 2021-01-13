SELECT 
    hop_dong.id_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc,
    count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) so_luong_dich_vu_di_kem
    from hop_dong
    join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
    group by hop_dong.id_hop_dong;