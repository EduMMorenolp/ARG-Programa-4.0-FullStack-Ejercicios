/*
Realizar un menú en java a través del cual se permita elegir qué consulta se desea realizar. 
Las consultas a realizar sobre la BD son las siguientes:
*/

-- a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.

select * from familias where num_hijos >= 3 and edad_maxima < 10;

-- b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 
-- 2020 y el 31 de agosto de 2020 en Reino Unido.

select * from casas where pais like 'Reino Unido' and fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31';

-- c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.

select * from familias where email like '%hotmail%';

-- d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada 
-- y un número de días específico.

-- deberás proporcionar los valores '?' correspondientes a los parámetros en el mismo orden en el que aparecen en la consulta

select * from casas where fecha_desde >= '?' AND fecha_hasta <= '?' AND tiempo_minimo_dias >= '?' AND tiempo_maximo_dias <= '?';

-- e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la 
-- descripción de la casa donde la realizaron.

SELECT c.*, co.comentario AS descripcion_casa FROM clientes c INNER JOIN estancias e ON c.id_cliente = e.id_cliente INNER JOIN casas ca ON e.id_casa = ca.id_casa inner join comentarios co on co.id_casa = ca.id_casa ;

/*
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y 
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a 
la anterior*/

SELECT e.*, cl.nombre AS Nombre, cl.pais AS Pais, cl.ciudad AS Ciudad, c.*
FROM estancias e 
JOIN clientes cl ON e.id_cliente = cl.id_cliente
JOIN casas c ON e.id_casa = c.id_casa;

/*
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el 
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios 
actualizados.
*/

UPDATE casas
SET precio_habitacion = precio_habitacion * 1.05
WHERE pais = 'Reino Unido' LIMIT 100;


-- h) Obtener el número de casas que existen para cada uno de los países diferentes.

SELECT pais, COUNT(*) AS numero_casas
FROM casas
GROUP BY pais; 

-- i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) 
-- que están ‘limpias’.

SELECT c.*, co.comentario
FROM casas c
INNER JOIN comentarios co ON c.id_casa = co.id_casa
WHERE c.pais = 'Reino Unido' AND co.comentario LIKE '%limpia%' ;

-- j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.

SELECT *
FROM estancias
WHERE (fecha_desde <= 'fecha_fin_nueva' AND fecha_hasta >= 'fecha_inicio_nueva')
   OR (fecha_desde >= 'fecha_inicio_nueva' AND fecha_hasta <= 'fecha_fin_nueva')
   OR (fecha_desde <= 'fecha_inicio_nueva' AND fecha_hasta >= 'fecha_fin_nueva')
