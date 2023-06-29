-- Guia14 EJERCICIO 1 

-- Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos 
-- “personal”, se creen las tablas y se inserten todos los datos en las tablas para que quede de la 
-- siguiente manera:

-- a) A continuación, realizar las siguientes consultas sobre la base de datos personal

-- 1. Obtener los datos completos de los empleados

select * from empleados;

-- 2. Obtener los datos completos de los departamentos.

select * from departamentos;

-- 3. Listar el nombre de los departamentos

select nombre_depto from departamentos;

-- 4. Obtener el nombre y salario de todos los empleados.

select nombre, sal_emp from empleados;

-- 5. Listar todas las comisiones.

select comision_emp from empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.

select * from empleados where cargo_emp like '%Secretaria%';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre
-- alfabéticamente.

select * from empleados where cargo_emp = 'Vendedor' order by nombre ASC;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
-- mayor

select nombre, cargo_emp, sal_emp from empleados order by sal_emp;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
-- de “Ciudad Real”


select a.nombre, d.ciudad, a.cargo_emp from empleados as a inner join departamentos as d on a.id_depto = d.id_depto where a.cargo_emp like '%jefe%' and d.ciudad like 'Ciudad Real';

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
-- respectivas tablas de empleados

select nombre as nombre, cargo_emp as cargo from empleados;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
-- por comisión de menor a mayor

SELECT sal_emp, comision_emp FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;

-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
-- de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
-- empleado y el total a pagar, en orden alfabético

select nombre, sal_emp + comision_emp + 500 as sumatotal from empleados where id_depto = 3000 order by nombre asc;

-- 13. Muestra los empleados cuyo nombre empiece con la letra J

select nombre from empleados where nombre like 'j%';

-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
-- empleados que tienen comisión superior a 1000

select sal_emp, comision_emp, sal_emp + comision_emp as salario_total, nombre from empleados where comision_emp > 1000;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
-- comisión 

select sal_emp, comision_emp, sal_emp + comision_emp as salario_total, nombre from empleados where comision_emp = 0;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.

select nombre, comision_emp, sal_emp from empleados where comision_emp > sal_emp;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo

select * from empleados where comision_emp <= sal_emp * 0.3;

-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA"

select * from empleados where nombre not like '%MA%';

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
-- ‘Mantenimiento”

select * from departamentos where nombre_depto IN ('Ventas', 'Investigación', 'Mantenimiento');

-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
-- “Investigación” ni ‘Mantenimiento

select * from departamentos where nombre_depto not IN ('Ventas', 'Investigación', 'Mantenimiento');

-- 21. Mostrar el salario más alto de la empresa

-- select * from empleados where sal_emp > 1 order by sal_emp desc limit 1;
SELECT MAX(sal_emp) AS salario_maximo FROM empleados;

-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético

select nombre from empleados order by nombre desc limit 1;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.

select max(sal_emp) as maxsal, min(sal_emp) as minsal, max(sal_emp) - min(sal_emp) as difsal from empleados;

-- 24. Hallar el salario promedio por departamento

SELECT id_depto, AVG(sal_emp) AS salario_promedio FROM empleados GROUP BY id_depto;

-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
-- empleados de esos departamentos

SELECT cargo_emp, COUNT(*) AS cantidad_empleados FROM empleados GROUP BY cargo_emp HAVING COUNT(*) > 3; 

-- por departamento usando sentencia join.
select nombre_depto, count(nombre) from empleados e join departamentos d on d.id_depto=e.id_depto group by nombre_depto having count(nombre)>3;

-- 26. Hallar los departamentos que no tienen empleados

SELECT id_depto FROM departamentos WHERE id_depto NOT IN (SELECT cargo_emp FROM empleados);
-- SELECT d.id_depto FROM departamentos d LEFT JOIN empleados e ON d.id_depto = e.id_depto WHERE e.id_emp IS NULL;

-- 27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada departamento

select nombre, cargo_emp, nombre_jefe_depto from empleados right join departamentos on empleados.id_depto=departamentos.id_depto;

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
-- empresa. Ordenarlo por departamento

select * from empleados where sal_emp >= (SELECT AVG(sal_emp) FROM empleados) order by id_depto asc;

