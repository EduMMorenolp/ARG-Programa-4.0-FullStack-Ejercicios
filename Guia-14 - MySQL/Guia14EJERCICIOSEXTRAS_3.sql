
/*
Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas 
las tablas e insertar los registros en las mismas. A continuación, generar el modelo de entidad 
relación y reorganizar las tablas para mayor claridad de sus relaciones.
*/

-- A continuación, se deben realizar las siguientes consultas:

-- 1. Mostrar el nombre de todos los pokemon.

select nombre from pokemon;

-- 2. Mostrar los pokemon que pesen menos de 10k.

select * from pokemon where peso < 10;

-- 3. Mostrar los pokemon de tipo agua.

select p.nombre from pokemon p 
join pokemon_tipo pt on pt.numero_pokedex = p.numero_pokedex 
where pt.id_tipo = ( select t.id_tipo from tipo t where t.nombre like 'agua' );

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.

SELECT p.nombre, t.nombre
FROM pokemon p
JOIN pokemon_tipo pt ON pt.numero_pokedex = p.numero_pokedex
JOIN tipo t ON t.id_tipo = pt.id_tipo
WHERE t.nombre IN ('agua', 'fuego', 'tierra')
ORDER BY t.nombre;

-- 5. Mostrar los pokemon que son de tipo fuego y volador.

SELECT p.nombre, t.nombre
FROM pokemon p
JOIN pokemon_tipo pt ON pt.numero_pokedex = p.numero_pokedex
JOIN tipo t ON t.id_tipo = pt.id_tipo
WHERE t.nombre IN ( 'fuego', 'volador');

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.

SELECT p.nombre, eb.ps
FROM pokemon p
JOIN estadisticas_base eb ON eb.numero_pokedex = p.numero_pokedex
WHERE eb.ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

SELECT p.nombre, p.peso, p.altura
FROM pokemon p
JOIN forma_evolucion fe ON fe.id_forma_evolucion = p.numero_pokedex
JOIN evoluciona_de ed ON ed.pokemon_evolucionado = fe.id_forma_evolucion
JOIN pokemon prevolucion ON prevolucion.numero_pokedex = ed.pokemon_origen
WHERE p.nombre = 'Arbok';

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.

SELECT p.nombre
FROM pokemon p
JOIN pokemon_forma_evolucion pfe ON pfe.numero_pokedex = p.numero_pokedex
JOIN forma_evolucion fe ON fe.id_forma_evolucion = pfe.id_forma_evolucion
join tipo_evolucion te on te.id_tipo_evolucion = fe.id_forma_evolucion
WHERE te.tipo_evolucion = 'Intercambio';

-- 9. Mostrar el nombre del movimiento con más prioridad.

SELECT nombre
FROM movimiento
WHERE prioridad = (SELECT MAX(prioridad) FROM movimiento);

-- 10. Mostrar el pokemon más pesado.

select nombre from pokemon where peso = ( select max(peso) from pokemon );

-- 11. Mostrar el nombre y tipo del ataque con más potencia.

SELECT m.nombre, t.nombre as tipo , m.potencia 
FROM movimiento m
JOIN tipo t ON m.id_tipo = t.id_tipo
WHERE m.potencia = (SELECT MAX(potencia) FROM movimiento);

-- 12. Mostrar el número de movimientos de cada tipo.

SELECT t.nombre AS tipo, COUNT(*) AS cantidad_movimientos
FROM movimiento m
JOIN tipo t ON m.id_tipo = t.id_tipo
GROUP BY t.nombre;

-- 13. Mostrar todos los movimientos que puedan envenenar.

SELECT m.nombre
FROM movimiento m
JOIN movimiento_efecto_secundario nes ON nes.id_movimiento = m.id_movimiento
JOIN efecto_secundario es ON es.id_efecto_secundario = nes.id_efecto_secundario
WHERE es.efecto_secundario LIKE 'enve%';

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.

SELECT nombre FROM movimiento WHERE potencia > 0 ORDER BY nombre ASC;

-- 15. Mostrar todos los movimientos que aprende pikachu.

SELECT m.nombre
FROM movimiento m
JOIN pokemon_movimiento_forma pmf ON pmf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje
JOIN pokemon p ON p.numero_pokedex = pmf.numero_pokedex
WHERE p.numero_pokedex = 25;

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).

SELECT m.nombre
FROM movimiento m
JOIN pokemon_movimiento_forma pmf ON pmf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje
JOIN MT mt ON mt.id_forma_aprendizaje = fa.id_forma_aprendizaje
JOIN pokemon p ON p.numero_pokedex = pmf.numero_pokedex
WHERE p.numero_pokedex = 25;

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.

SELECT m.nombre
FROM movimiento m
JOIN pokemon_movimiento_forma pmf ON pmf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje
JOIN nivel_aprendizaje na ON na.id_forma_aprendizaje = fa.id_forma_aprendizaje
JOIN pokemon p ON p.numero_pokedex = pmf.numero_pokedex
JOIN tipo t ON t.id_tipo = m.id_tipo
WHERE p.numero_pokedex = 25
  AND t.nombre = 'Normal'
  AND fa.id_tipo_aprendizaje = 3;
  
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.

SELECT m.nombre, es.efecto_secundario, mes.probabilidad
FROM movimiento m
JOIN movimiento_efecto_secundario mes ON mes.id_movimiento = m.id_movimiento
JOIN efecto_secundario es ON es.id_efecto_secundario = mes.id_efecto_secundario
WHERE mes.probabilidad > 30;

-- 19. Mostrar todos los pokemon que evolucionan por piedra. 

SELECT p.nombre, f.tipo_evolucion, tp.nombre_piedra
FROM pokemon p
JOIN pokemon_forma_evolucion pfe ON pfe.numero_pokedex = p.numero_pokedex
JOIN forma_evolucion f ON f.id_forma_evolucion = pfe.id_forma_evolucion
JOIN piedra pi ON pi.id_forma_evolucion = f.id_forma_evolucion
JOIN tipo_piedra tp ON tp.id_tipo_piedra = pi.id_tipo_piedra;

-- 20. Mostrar todos los pokemon que no pueden evolucionar. 

SELECT p.nombre
FROM pokemon p
LEFT JOIN pokemon_forma_evolucion pfe ON pfe.numero_pokedex = p.numero_pokedex
WHERE pfe.numero_pokedex IS NULL;

-- 21. Mostrar la cantidad de los pokemon de cada tipo. 

SELECT t.nombre AS tipo, COUNT(p.numero_pokedex) AS cantidad
FROM tipo t
LEFT JOIN pokemon_tipo pt ON pt.id_tipo = t.id_tipo
JOIN pokemon p ON p.numero_pokedex = pt.numero_pokedex
GROUP BY t.nombre;

-- BUEN CICLO Y CIERRE PARA TODAS Y TODOS.... y feliz MySQL ! 