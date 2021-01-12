SELECT 
    dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
WHERE EXISTS( SELECT 
            hop_dong.id_dich_vu
        FROM
            hop_dong
        WHERE
            (hop_dong.ngay_lam_hop_dong BETWEEN '2018-01-01' AND '2018-12-31')
                AND hop_dong.id_dich_vu = dich_vu.id_dich_vu);