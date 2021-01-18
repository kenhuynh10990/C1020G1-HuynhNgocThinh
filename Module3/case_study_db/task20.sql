select id_khach_hang id, ho_va_ten ho_va_ten, email, so_dien_thoai, ngay_sinh, dia_chi
from khach_hang
union
select id_nhan_vien id, ho_ten ho_va_ten, email,sdt so_dien_thoai, ngay_sinh, dia_chi
from nhan_vien;