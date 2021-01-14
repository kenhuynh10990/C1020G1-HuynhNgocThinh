select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.sdt, nhan_vien.dia_chi,
count(hop_dong.id_nhan_vien) so_lan_lap_hop_dong
from nhan_vien
join trinh_do on nhan_vien.id_trinh_do = trinh_do.id_trinh_do
join bo_phan on nhan_vien.id_bo_phan = bo_phan.id_bo_phan
join hop_dong on nhan_vien. id_nhan_vien = hop_dong.id_nhan_vien
where hop_dong.ngay_lam_hop_dong between "2018-01-01" and "2019-12-31"
group by nhan_vien.ho_ten
having so_lan_lap_hop_dong <=3;