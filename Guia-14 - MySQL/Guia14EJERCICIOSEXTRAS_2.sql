

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

select *, (cantidad * precio_unidad) as suma_productos from detalle_pedido;

/*
14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que 
se han vendido de cada uno. El listado deberá estar ordenado por el número total de 
unidades vendidas.
*/

SELECT p.codigo_producto, p.nombre, SUM(dp.cantidad) AS total_unidades_vendidas FROM producto p JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto GROUP BY p.codigo_producto, p.nombre ORDER BY total_unidades_vendidas DESC LIMIT 20;

/*
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el 
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el 
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base 
imponible, y el total la suma de los dos campos anteriores.
*/

SELECT
  SUM(dp.cantidad * p.precio_venta) AS base_imponible,
  SUM(dp.cantidad * p.precio_venta * 0.21) AS iva,
  SUM(dp.cantidad * p.precio_venta) + SUM(dp.cantidad * p.precio_venta * 0.21) AS total_facturado
FROM detalle_pedido dp
JOIN producto p ON dp.codigo_producto = p.codigo_producto;

-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto

SELECT
  SUM(dp.cantidad * p.precio_venta) AS base_imponible,
  SUM(dp.cantidad * p.precio_venta * 0.21) AS iva,
  SUM(dp.cantidad * p.precio_venta) + SUM(dp.cantidad * p.precio_venta * 0.21) AS total_facturado
FROM detalle_pedido dp
JOIN producto p ON dp.codigo_producto = p.codigo_producto group by p.codigo_producto;

-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto 
-- filtrada por los códigos que empiecen por OR.

SELECT
  p.codigo_producto,
  SUM(dp.cantidad * p.precio_venta) AS base_imponible,
  SUM(dp.cantidad * p.precio_venta * 0.21) AS iva,
  SUM(dp.cantidad * p.precio_venta) + SUM(dp.cantidad * p.precio_venta * 0.21) AS total_facturado
FROM detalle_pedido dp
JOIN producto p ON dp.codigo_producto = p.codigo_producto where p.codigo_producto like 'OR%' group by p.codigo_producto;

/*
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se 
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% 
IVA
*/

SELECT
  p.nombre AS nombre_producto,
  dp.cantidad AS unidades_vendidas,
  dp.cantidad * p.precio_venta AS total_facturado,
  dp.cantidad * p.precio_venta * 1.21 AS total_facturado_con_impuestos
FROM detalle_pedido dp
JOIN producto p ON dp.codigo_producto = p.codigo_producto
GROUP BY p.nombre, unidades_vendidas, total_facturado, total_facturado_con_impuestos
HAVING total_facturado > 3000;

/*
Subconsultas con operadores básicos de comparación
*/

-- 1. Devuelve el nombre del cliente con mayor límite de crédito.

select nombre_cliente, limite_credito from cliente order by limite_credito desc limit 1;

SELECT nombre_cliente, limite_credito
FROM cliente
WHERE limite_credito = (SELECT MAX(limite_credito) FROM cliente);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.

select nombre, precio_venta from producto where precio_venta = ( select max(precio_venta) from producto );

/*
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta 
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada 
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código 
del producto, puede obtener su nombre fácilmente.)
*/

SELECT p.nombre
FROM producto p
JOIN (
  SELECT codigo_producto, SUM(cantidad) AS total_unidades
  FROM detalle_pedido
  GROUP BY codigo_producto
  ORDER BY total_unidades DESC
  LIMIT 1
) d ON p.codigo_producto = d.codigo_producto;

-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN)

/*
La función COALESCE es una función en SQL que se utiliza para devolver el primer valor no nulo de una lista de expresiones.
 Toma como argumento una lista de expresiones separadas por comas y devuelve el primer valor no nulo de esa lista.
*/

SELECT nombre_cliente
FROM cliente
WHERE limite_credito > (
  SELECT COALESCE(SUM(total), 0)
  FROM pago
  WHERE pago.codigo_cliente = cliente.codigo_cliente
);

-- 5. Devuelve el producto que más unidades tiene en stock.

select nombre, cantidad_en_stock from producto where cantidad_en_stock = ( select max(cantidad_en_stock) from producto); 

-- 6. Devuelve el producto que menos unidades tiene en stock.

select nombre, cantidad_en_stock from producto where cantidad_en_stock = ( select min(cantidad_en_stock) from producto); 

-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria

SELECT e.nombre, e.apellido1, e.apellido2, e.email
FROM empleado AS e
JOIN empleado AS jefe ON e.codigo_jefe = jefe.codigo_empleado
WHERE jefe.nombre = 'Alberto' AND jefe.apellido1 = 'Soria';

-- Subconsultas con ALL y ANY

/*
ALL: Este operador se utiliza para comparar un valor con todos los valores resultantes de una subconsulta.
La condición se considera verdadera si la comparación es verdadera para todos los valores de la subconsulta.

ANY o SOME: Estos operadores se utilizan para comparar un valor con al menos uno de los valores resultantes de una subconsulta.
 La condición se considera verdadera si la comparación es verdadera para al menos uno de los valores de la subconsulta.
 
 En resumen, ALL se utiliza para comparaciones con todos los valores de una subconsulta,
 mientras que ANY o SOME se utiliza para comparaciones con al menos uno de los valores de una subconsulta.
*/

-- 1. Devuelve el nombre del cliente con mayor límite de crédito

SELECT nombre_cliente
FROM cliente
WHERE limite_credito >= ALL (SELECT limite_credito FROM cliente);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.


select nombre, precio_venta from producto where precio_venta >= ALL ( select precio_venta from producto );

-- 3. Devuelve el producto que menos unidades tiene en stock.

select * from producto where cantidad_en_stock = any ( select min(cantidad_en_stock) from producto );

-- Subconsultas con IN y NOT IN

-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente

SELECT nombre, apellido1, puesto
FROM empleado
WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

select nombre_cliente from cliente where codigo_cliente not in ( select codigo_cliente from pago);

-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.

select nombre_cliente from cliente where codigo_cliente in ( select codigo_cliente from pago);

-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.

SELECT *
FROM producto
WHERE codigo_producto NOT IN (SELECT DISTINCT codigo_producto FROM detalle_pedido);

-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que 
-- no sean representante de ventas de ningún cliente.

SELECT e.nombre, e.apellido1, e.apellido2, e.puesto, o.telefono
FROM empleado e
JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
WHERE e.codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente WHERE codigo_empleado_rep_ventas IS NOT NULL);

-- Subconsultas con EXISTS y NOT EXISTS

-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

SELECT c.nombre_cliente, c.nombre_contacto, c.apellido_contacto
FROM cliente c
WHERE NOT EXISTS (SELECT 1 FROM pago p WHERE p.codigo_cliente = c.codigo_cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.

SELECT c.nombre_cliente, c.nombre_contacto, c.apellido_contacto
FROM cliente c
WHERE EXISTS (SELECT 1 FROM pago p WHERE p.codigo_cliente = c.codigo_cliente);

-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.

SELECT p.codigo_producto, p.nombre
FROM producto p
WHERE NOT EXISTS (SELECT 1 FROM detalle_pedido dp WHERE dp.codigo_producto = p.codigo_producto);

-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.

SELECT p.codigo_producto, p.nombre
FROM producto p
WHERE EXISTS (SELECT 1 FROM detalle_pedido dp WHERE dp.codigo_producto = p.codigo_producto);