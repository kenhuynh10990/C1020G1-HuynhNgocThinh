SELECT 
    khach_hang.id_khach_hang,
    khach_hang.ho_va_ten,
    loai_khach.ten_loai_khach,
    hop_dong.id_hop_dong,
    dich_vu.ten_dich_vu,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    (dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) AS tong_tien
FROM
    khach_hang
        LEFT JOIN
    loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach
        LEFT JOIN
    hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
        LEFT JOIN
    dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
        LEFT JOIN
    dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem;
