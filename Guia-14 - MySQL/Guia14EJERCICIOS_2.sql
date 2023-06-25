
-- GUIA 14 - MySQL - EJERCICIO 2

-- Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e 
-- insertar datos en las mismas. A continuación, generar el modelo de entidad relación. 

-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Lista el nombre de todos los productos que hay en la tabla producto

select nombre from producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.

select nombre, precio from producto;

-- 3. Lista todas las columnas de la tabla producto

select * from producto;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando 
-- el valor del precio

select nombre, round(precio) from producto;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto

select * from producto where codigo_fabricante in (select codigo from producto); 

-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar 
-- los repetidos

SELECT DISTINCT codigo_fabricante FROM producto;

-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente

select nombre from fabricante order by nombre asc;

-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma 
-- ascendente y en segundo lugar por el precio de forma descendente

select nombre, precio from producto order by nombre asc, precio desc;

-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante

select * from fabricante limit 5;

-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas 
-- ORDER BY y LIMIT

select nombre, precio from producto order by precio asc limit 1;

-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas 
-- ORDER BY y LIMIT

select nombre, precio from producto order by precio desc limit 1;

-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120

select nombre, precio from producto where precio <= 120;

-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN

select nombre, precio from producto where precio between 60 and 200;

-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN

select * from producto where codigo_fabricante in (1,3,5);

-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil 
-- en el nombre

select nombre from producto where nombre like '%Portatil%';


-- CONSULTAS MULTITABLA

-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante 
-- y nombre del fabricante, de todos los productos de la base de datos

select p.codigo, p.nombre, f.codigo, f.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo;





