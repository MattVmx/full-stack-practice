#1
SELECT * FROM EMPLEADO;

#2
SELECT * FROM DEPARTAMENTO;

#3
SELECT nombre_depto FROM DEPARTAMENTO;

#4
SELECT nombre, salario FROM EMPLEADO;

#5
SELECT comision FROM EMPLEADO;

#6
SELECT * FROM EMPLEADO
WHERE cargo = 'Secretaria';

#7
SELECT * FROM EMPLEADO
WHERE cargo = 'Vendedor'
ORDER BY nombre;

#8
SELECT nombre, cargo FROM EMPLEADO
ORDER BY salario;

#9
SELECT nombre AS Nombre, cargo as Cargo FROM EMPLEADO;

#10
SELECT nombre, salario, comision, EMPLEADO.id_depto FROM EMPLEADO
WHERE EMPLEADO.id_depto = 2000
ORDER BY comision;

#11
SELECT nombre, salario, comision, (salario+comision+500) AS Pago_estimado FROM EMPLEADO
WHERE id_depto = 3000
ORDER BY nombre;

#12
SELECT nombre FROM EMPLEADO
WHERE nombre LIKE 'J%';

#13
SELECT nombre, salario, comision, (salario+comision) AS SALARIO_TOTAL FROM EMPLEADO
WHERE comision > 1000;

#14
SELECT nombre, salario, comision, (salario+comision) AS SALARIO_TOTAL FROM EMPLEADO
WHERE comision = 0;

#15
SELECT nombre, salario, comision FROM EMPLEADO
WHERE comision > salario;

#16
SELECT nombre, salario, comision FROM EMPLEADO
WHERE comision <= (salario*0.3); 

#17
SELECT nombre FROM EMPLEADO
WHERE nombre NOT LIKE '%ma%';

#18
SELECT nombre_depto FROM DEPARTAMENTO
WHERE nombre_depto IN ('Ventas', 'Investigacion', 'Mantenimiento');

#19
SELECT nombre_depto FROM DEPARTAMENTO
WHERE nombre_depto NOT IN ('Ventas', 'Investigacion', 'Mantenimiento');

#20
SELECT nombre, MAX(salario) AS 'mayor salario' FROM EMPLEADO
WHERE salario = (SELECT MAX(salario) FROM EMPLEADO); 

#21
SELECT nombre FROM EMPLEADO
ORDER BY nombre DESC
LIMIT 1;

#22
SELECT MAX(salario) AS 'Mayor salario', MIN(salario) AS 'Menor salario', MAX(salario) - MIN(salario) AS 'Resultado' FROM EMPLEADO;

#23
SELECT id_depto, AVG(salario) FROM EMPLEADO
GROUP BY id_depto; 

SELECT d.id_depto, nombre_depto, AVG(e.salario) FROM EMPLEADO e
INNER JOIN DEPARTAMENTO d
ON e.id_depto = d.id_depto
GROUP BY d.id_depto; 

#24
SELECT d.id_depto, nombre_depto, COUNT(nombre) AS 'Num empleados' FROM EMPLEADO e, DEPARTAMENTO d
WHERE d.id_depto = e.id_depto
GROUP BY d.id_depto 
HAVING COUNT(nombre) >= 3;

#25
SELECT e.nombre, e.cargo, e.cod_jefe, COUNT(*) AS 'Num empleados' FROM EMPLEADO e, EMPLEADO e2
WHERE e.cod_jefe = e2.cod_jefe
GROUP BY e.nombre
HAVING COUNT(*) >= 2
ORDER BY COUNT(*);

#26
SELECT d.id_depto, nombre_depto, COUNT(*) AS 'Num empleados' FROM EMPLEADO e, DEPARTAMENTO D
WHERE d.id_depto = e.id_depto
GROUP BY d.id_depto
HAVING COUNT(*) = null;

#27
SELECT ROUND(AVG(salario)) AS 'PROMEDIO' FROM EMPLEADO;

SELECT * FROM EMPLEADO
WHERE salario > (SELECT AVG(salario) FROM EMPLEADO); 
