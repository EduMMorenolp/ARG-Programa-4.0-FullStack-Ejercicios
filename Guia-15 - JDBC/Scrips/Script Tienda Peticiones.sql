
-- PETICIONES A LA BASE DE DATOS;

-- a) Lista el nombre de todos los productos que hay en la tabla producto.
select nombre from producto;
-- b) Lista los nombres y los precios de todos los productos de la tabla producto. 
select nombre, precio from producto;
-- c) Listar aquellos productos que su precio esté entre 120 y 202. 
select * from producto where precio between 120 and 200;
 -- d) Buscar y listar todos los Portátiles de la tabla producto. 
select * from producto where nombre like "%Portatil%";
-- e) Listar el nombre y el precio del producto más barato. 
select nombre, precio from producto order by precio limit 1;
-- f) Ingresar un producto a la base de datos.
INSERT INTO producto  VALUES (nombre, precio, codigo_fabricante) ;
-- g) Ingresar un fabricante a la base de datos
INSERT INTO fabricante VALUES (nombre);
-- h) Editar un producto con datos a elección.
update producto set precio = 755 where codigo = 5;  

