select product_code, product_name, input_cost, quantity_in_stock from products
where input_cost > 56.76 and quantity_in_stock > 10;

select product_code, product_name, input_cost, quantity_in_stock, product_vendor, produc_line_id 
from products 
where produc_line_id = 'Classic Cars' or product_vendor = 'Min Lin Diecast'