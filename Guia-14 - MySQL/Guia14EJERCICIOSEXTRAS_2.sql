

-- Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las 
-- tablas e insertar datos en las mismas.

-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- Consultas sobre una tabla

-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.

select codigo_oficina, ciudad from oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.

select ciudad, telefono from oficina where pais = 'España';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
-- código de jefe igual a 7.

select nombre, apellido1, apellido2 from empleado where codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa

select puesto, nombre, apellido1, apellido2 , email from empleado where codigo_empleado = 1;

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean 
-- representantes de ventas.

select nombre, apellido1, apellido2, puesto from empleado where puesto != 'representante ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.

select nombre_cliente, pais from cliente where pais = 'spain';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.

select distinct estado from pedido;

/*
8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago 
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan 
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores
*/

-- Utilizando la función YEAR de MySQL

SELECT DISTINCT codigo_cliente FROM pago WHERE YEAR(fecha_pago) = 2008;

-- Utilizando la función DATE_FORMAT de MySQL.

SELECT DISTINCT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008';

-- Sin utilizar ninguna de las funciones anteriores

SELECT DISTINCT codigo_cliente FROM pago WHERE fecha_pago >= '2008-01-01' AND fecha_pago <= '2008-12-31';

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de 
-- entrega de los pedidos que no han sido entregados a tiempo.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega > fecha_esperada;

/*
10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de 
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha 
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.
*/

-- Utilizando la función ADDDATE de MySQL.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega <= ADDDATE(fecha_esperada, -2);

-- Utilizando la función DATEDIFF de MySQL.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE DATEDIFF(fecha_esperada, fecha_entrega) >= 2;

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009

select * from pedido where estado = 'rechazado' and YEAR(fecha_pedido) = 2009;

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.

select * from pedido where month(fecha_pedido) = 1;

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. 
-- Ordene el resultado de mayor a menor

select * from pago where forma_pago = 'paypal' and YEAR(fecha_pago) = 2008 order by total desc;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en 
-- cuenta que no deben aparecer formas de pago repetidas.

select distinct forma_pago from pago;

/*
15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que 
tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de 
venta, mostrando en primer lugar los de mayor precio
*/

SELECT * FROM producto WHERE gama = 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo 
-- representante de ventas tenga el código de empleado 11 o 30

SELECT * FROM cliente WHERE ciudad = 'Madrid' AND codigo_empleado_rep_ventas IN (11, 30);

/*
Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
*/

-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas

select c.nombre_cliente, e.nombre as nombre_repre, e.apellido1 as apellido_repre from cliente as c inner join empleado as e on c.codigo_empleado_rep_ventas = e.codigo_empleado;

-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.

SELECT c.nombre_cliente, e.nombre AS nombre_representante FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente;

-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas

SELECT c.nombre_cliente, e.nombre AS nombre_representante FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.codigo_cliente IS NULL;

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes 
-- junto con la ciudad de la oficina a la que pertenece el representante.

SELECT c.nombre_cliente, e.nombre AS nombre_representante, o.ciudad AS ciudad_oficina FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente;

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus 
-- representantes junto con la ciudad de la oficina a la que pertenece el representante


