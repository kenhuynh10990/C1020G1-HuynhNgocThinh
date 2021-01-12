select month(hop_dong.ngay_lam_hop_dong) `month`, count(month(hop_dong.ngay_lam_hop_dong)) as so_nguoi_dat_phong
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = '2019'
group by `month`;
