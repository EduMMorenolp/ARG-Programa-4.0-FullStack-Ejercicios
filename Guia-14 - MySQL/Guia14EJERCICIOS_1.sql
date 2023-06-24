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


