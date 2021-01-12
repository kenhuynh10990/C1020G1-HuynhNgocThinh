select *
from khach_hang 
group by khach_hang.ho_va_ten;

select distinct khach_hang.ho_va_ten
from khach_hang;

select ho_va_ten 
from khach_hang
union
select ho_va_ten 
from khach_hang;