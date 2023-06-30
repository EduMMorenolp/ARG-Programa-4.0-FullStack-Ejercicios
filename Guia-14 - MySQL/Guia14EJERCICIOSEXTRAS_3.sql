
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

/*
NO ME SALIO .... 
select * from nivel_aprendizaje;
select * from forma_aprendizaje;
select * from pokemon_forma_evolucion;
select * from tipo_forma_aprendizaje;
SELECT p.nombre
FROM pokemon p
JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje = p.numero_pokedex
JOIN tipo_forma_aprendizaje tfa ON tfa.id_tipo_aprendizaje = fa.id_tipo_aprendizaje
WHERE tfa.tipo_aprendizaje = 'Intercambio';
*/

-- 9. Mostrar el nombre del movimiento con más prioridad.


/*
10. Mostrar el pokemon más pesado.
11. Mostrar el nombre y tipo del ataque con más potencia.
12. Mostrar el número de movimientos de cada tipo.
13. Mostrar todos los movimientos que puedan envenenar.
14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
15. Mostrar todos los movimientos que aprende pikachu.
16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
19. Mostrar todos los pokemon que evolucionan por piedra. 
20. Mostrar todos los pokemon que no pueden evolucionar. 
21. Mostrar la cantidad de los pokemon de cada tipo. 
*/


