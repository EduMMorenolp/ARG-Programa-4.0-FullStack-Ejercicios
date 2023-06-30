

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

SELECT c.nombre_cliente, e.nombre AS nombre_representante, o.ciudad AS ciudad_oficina FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.codigo_cliente IS NULL;

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.

SELECT o.linea_direccion1, o.linea_direccion2, o.ciudad, o.pais FROM oficina o WHERE o.codigo_oficina IN (SELECT e.codigo_oficina FROM empleado e INNER JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE c.ciudad = 'Fuenlabrada');

-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad 
-- de la oficina a la que pertenece el representante.

select c.nombre_cliente, e.nombre, o.ciudad from cliente c inner join empleado e on e.codigo_empleado = e.codigo_empleado inner join oficina o on o.codigo_oficina = e.codigo_oficina ;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.

select e.nombre as nombre_empleado, j.nombre as nombre_jefe from empleado e left join empleado j on e.codigo_jefe = j.codigo_empleado;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.

SELECT c.nombre_cliente FROM cliente c INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente WHERE p.fecha_entrega > p.fecha_esperada;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.

SELECT c.codigo_cliente, c.nombre_cliente, GROUP_CONCAT(DISTINCT p.gama SEPARATOR ', ') AS gamas_compradas FROM cliente c INNER JOIN pedido pd ON c.codigo_cliente = pd.codigo_cliente INNER JOIN detalle_pedido dp ON pd.codigo_pedido = dp.codigo_pedido INNER JOIN producto p ON dp.codigo_producto = p.codigo_producto GROUP BY c.codigo_cliente, c.nombre_cliente;

/*
Consultas multitabla (Composición externa)
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
*/

-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago

SELECT c.codigo_cliente, c.nombre_cliente FROM cliente c LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.codigo_cliente IS NULL;

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.

SELECT c.codigo_cliente, c.nombre_cliente FROM cliente c LEFT JOIN pedido p ON c.codigo_cliente = p.codigo_cliente WHERE p.codigo_cliente IS NULL;

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido

SELECT c.codigo_cliente, c.nombre_cliente, 'Sin pago' AS tipo FROM cliente c LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.codigo_cliente IS NULL UNION SELECT c.codigo_cliente, c.nombre_cliente, 'Sin pedido' AS tipo FROM cliente c LEFT JOIN pedido pd ON c.codigo_cliente = pd.codigo_cliente WHERE pd.codigo_cliente IS NULL;

-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.

SELECT e.* FROM empleado e left JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE o.codigo_oficina IS NULL;

-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.

SELECT e.* FROM empleado e LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE c.codigo_empleado_rep_ventas IS NULL;

-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los 
-- que no tienen un cliente asociado.

SELECT e.* FROM empleado e LEFT JOIN oficina o ON e.codigo_oficina = o.codigo_oficina LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE o.codigo_oficina IS NULL AND c.codigo_empleado_rep_ventas IS NULL;

-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.

SELECT p.* FROM producto p LEFT JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto WHERE dp.codigo_producto IS NULL;

/*
8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los 
representantes de ventas de algún cliente que haya realizado la compra de algún producto 
de la gama Frutales
*/

SELECT o.* FROM oficina o LEFT JOIN empleado e ON o.codigo_oficina = e.codigo_oficina LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas LEFT JOIN pedido p ON c.codigo_cliente = p.codigo_cliente LEFT JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido LEFT JOIN producto pr ON dp.codigo_producto = pr.codigo_producto LEFT JOIN gama_producto gp ON pr.gama = gp.gama WHERE gp.gama = 'Frutales' AND e.codigo_empleado IS NULL;

-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.

SELECT c.* FROM cliente c INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente LEFT JOIN pago pa ON c.codigo_cliente = pa.codigo_cliente WHERE pa.codigo_cliente IS NULL;

-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el 
-- nombre de su jefe asociado

SELECT e1.*, e2.nombre AS nombre_jefe FROM empleado e1 LEFT JOIN empleado e2 ON e1.codigo_jefe = e2.codigo_empleado WHERE e1.codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);

-- Consultas resumen

-- 1. ¿Cuántos empleados hay en la compañía?

select count(codigo_empleado) as cant_empleados from empleado;

-- 2. ¿Cuántos clientes tiene cada país?

select pais, count(*) as cant_clientes from cliente group by pais;

-- 3. ¿Cuál fue el pago medio en 2009?

select avg(total) as pago_medio from pago WHERE fecha_pago >= '2009-01-01' AND fecha_pago <= '2009-12-31'; 

-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos

SELECT estado, COUNT(*) AS cantidad_pedidos FROM pedido GROUP BY estado ORDER BY cantidad_pedidos DESC;

-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.

SELECT MAX(precio_venta) AS precio_mas_caro, MIN(precio_venta) AS precio_mas_barato FROM producto;

-- 6. Calcula el número de clientes que tiene la empresa.

select count(*) as cantidad_clientes from cliente;

-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?

select count(*) as cantidad_clientes from cliente where ciudad = 'Madrid';

-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?

select ciudad, count(*) as cantidad_clientes from cliente where ciudad like 'M%' group by ciudad;

-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.

select e.nombre, count(c.codigo_cliente) as num_clientes from empleado e inner join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado group by e.nombre;

-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.

SELECT COUNT(*) AS cantidad_clientes_sin_representante FROM cliente WHERE codigo_empleado_rep_ventas IS NULL;

-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente

SELECT c.nombre_cliente, c.nombre_contacto, c.apellido_contacto, MIN(pa.fecha_pago) AS primera_fecha_pago, MAX(pa.fecha_pago) AS ultima_fecha_pago FROM cliente c right JOIN pago pa ON c.codigo_cliente = pa.codigo_cliente GROUP BY c.codigo_cliente, c.nombre_cliente, c.nombre_contacto, c.apellido_contacto;

-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos

SELECT codigo_pedido, COUNT(DISTINCT codigo_producto) AS cantidad_productos_diferentes FROM detalle_pedido GROUP BY codigo_pedido;

-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos
-- NO HECHO
select dp.codigo_pedido, COUNT(DISTINCT dp.codigo_producto) as cant_productos, count(po.precio_venta) from detalle_pedido dp join pedido p on p.codigo_pedido = dp.codigo_pedido join producto po on po.codigo_p = dp.codigo_pedido GROUP BY dp.codigo_pedido ;

-- CONSULTAS HECHAS.... 
SELECT distinct emp.nombre, c.nombre_cliente, p.codigo_pedido, p.fecha_pedido, p.comentarios, dp.codigo_producto, dp.precio_unidad, dp.cantidad, pa.total from detalle_pedido dp join pedido p on dp.codigo_pedido=p.codigo_pedido join cliente c on p.codigo_cliente=c.codigo_cliente join empleado emp on c.codigo_empleado_rep_ventas= emp.codigo_empleado join pago pa on c.codigo_cliente= pa.codigo_cliente;

