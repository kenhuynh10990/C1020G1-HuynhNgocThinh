SELECT 
    khach_hang.*,
    COUNT(hop_dong.id_khach_hang) AS so_lan_dat_phong
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
        JOIN
    loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach
WHERE
    loai_khach.ten_loai_khach LIKE 'Diamond'
GROUP BY khach_hang.id_khach_hang
ORDER BY so_lan_dat_phong;

