

-- Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e 
-- insertar datos en las mismas

-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:

-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente

select nombre from jugadores order by nombre asc;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente

select nombre, posicion, peso from jugadores where Posicion = 'C' and peso > 200;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente

select nombre from equipos order by nombre asc;

-- 4. Mostrar el nombre de los equipos del este (East)

select nombre, Conferencia from equipos where Conferencia = 'East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.

select * from equipos where ciudad like 'c%' order by nombre;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

select j.* from jugadores j inner join equipos e on e.nombre = j.Nombre_equipo order by e.Nombre;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.

select j.* from jugadores j inner join equipos e on  e.nombre = j.Nombre_equipo where e.nombre = 'raptors' order by j.Nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.

select e.puntos_por_partido, j.nombre, e.temporada from estadisticas e inner join jugadores j on e.jugador = j.codigo where j.Nombre = 'Pau Gasol';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.

select e.puntos_por_partido, j.nombre, e.temporada from estadisticas e inner join jugadores j on e.jugador = j.codigo where j.Nombre = 'Pau Gasol' and e.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.

SELECT j.Nombre, SUM(e.Puntos_por_partido) AS Total_Puntos FROM jugadores j INNER JOIN estadisticas e ON j.codigo = e.jugador GROUP BY j.codigo, j.Nombre;

-- 11. Mostrar el número de jugadores de cada equipo.

SELECT e.Nombre AS Nombre_equipo, COUNT(j.codigo) AS Numero_jugadores FROM equipos e INNER JOIN jugadores j ON e.Nombre = j.Nombre_equipo GROUP BY e.Nombre;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.

SELECT j.Nombre AS Nombre_jugador, SUM(e.Puntos_por_partido) AS Total_puntos FROM jugadores j INNER JOIN estadisticas e ON j.codigo = e.jugador GROUP BY j.codigo, j.Nombre HAVING SUM(e.Puntos_por_partido) = ( SELECT MAX(total_puntos) FROM (SELECT jugador, SUM(Puntos_por_partido) AS total_puntos FROM estadisticas GROUP BY jugador ) AS subquery);

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.

SELECT e.Nombre AS Nombre_equipo, e.Conferencia, e.Division FROM jugadores j INNER JOIN equipos e ON j.Nombre_equipo = e.Nombre WHERE j.Altura = (SELECT MAX(Altura) FROM jugadores);

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
-- diferencia de puntos.

SELECT p.equipo_local, p.equipo_visitante, ABS(p.puntos_local - p.puntos_visitante) AS diferencia FROM partidos p WHERE ABS(p.puntos_local - p.puntos_visitante) = (SELECT MAX(ABS(puntos_local - puntos_visitante))FROM partidos);

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- equipo_ganador), en caso de empate sera null.

SELECT codigo, equipo_local, equipo_visitante, CASE WHEN puntos_local > puntos_visitante THEN equipo_local WHEN puntos_local < puntos_visitante THEN equipo_visitante ELSE NULL END AS equipo_ganador FROM partidos;

-- MENTORA EJERCICIO
SELECT partidos.codigo, partidos.equipo_local, partidos.equipo_visitante, equipos.Nombre as 'Equipo ganador'
FROM partidos JOIN equipos ON partidos.equipo_local or partidos.equipo_visitante = equipos.Nombre
WHERE equipos.Nombre in ((SELECT equipo_local FROM equipos WHERE puntos_local> puntos_visitante limit 1), 
(SELECT equipo_visitante FROM equipos WHERE puntos_local< puntos_visitante limit 1), (SELECT equipo_visitante FROM equipos WHERE puntos_local= puntos_visitante limit 1))
LIMIT 0, 1000 ;