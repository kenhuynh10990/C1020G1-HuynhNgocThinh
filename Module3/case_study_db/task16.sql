delete from nhan_vien  
where not exists ( 
select hop_dong.id_hop_dong 
from hop_dong
 where hop_dong.ngay_lam_hop_dong between "2017-01-01" and "2019-12-31" 
 and nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien );
