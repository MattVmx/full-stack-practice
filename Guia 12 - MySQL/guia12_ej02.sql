SELECT * FROM producto;

SELECT * FROM fabricante;

#1
SELECT nombre FROM producto;

#2
SELECT nombre, precio FROM producto;

#3
SELECT * FROM producto;

#4
SELECT nombre, ROUND(precio) FROM producto;

#5 y 6
SELECT codigo_fabricante, f.nombre, COUNT(p.nombre) AS 'Cant productos' FROM fabricante f, producto p
WHERE  codigo_fabricante = f.codigo
GROUP BY  f.nombre
ORDER BY codigo_fabricante;

#7
SELECT nombre FROM fabricante
ORDER BY nombre;

#8
SELECT nombre, precio FROM producto
ORDER BY nombre ASC, precio DESC;

#9 
SELECT * FROM fabricante
LIMIT 5;

#10
SELECT nombre, precio FROM producto
ORDER BY precio
LIMIT 1;

#11
SELECT nombre, precio FROM producto
ORDER BY precio DESC
LIMIT 1;

#12
SELECT nombre, precio FROM producto
WHERE precio <= 120;

#13
SELECT nombre, precio FROM producto
WHERE precio BETWEEN 60 AND 200;

#14
SELECT codigo_fabricante, nombre FROM producto
WHERE codigo_fabricante IN (1, 3, 5);

#15
SELECT nombre FROM producto
WHERE nombre LIKE '%Portátil%';

# MULTITABLAS

#1
SELECT p.codigo, p.nombre AS 'Nombre producto', f.codigo AS 'Cod fab', f.nombre AS 'Nombre fab' FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo;

#2
SELECT p.nombre, p.precio, f.nombre FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo
ORDER BY f.nombre;

#3
SELECT p.nombre, p.precio, f.nombre FROM producto p 
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo
ORDER BY p.precio
LIMIT 1;

#4
SELECT p.*, f.nombre FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo AND f.nombre LIKE 'Lenovo';

#5
SELECT p.*, f.nombre FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo AND f.nombre LIKE '%Crucial%' AND p.precio >= 200;

#6
SELECT p.*, f.nombre FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo AND f.nombre IN ('Asus', 'Hewlett-Packard');

#7
SELECT p.nombre, p.precio, f.nombre FROM producto p
INNER JOIN fabricante f
ON p.codigo_fabricante = f.codigo AND p.precio >= 180
ORDER BY p.precio DESC, p.nombre ASC;


# MULTITABLAS RIGH/LEFT JOIN

#1
SELECT * FROM fabricante f
LEFT JOIN producto p
ON p.codigo_fabricante = f.codigo;

#2
SELECT * FROM fabricante f
WHERE NOT EXISTS (SELECT p.codigo_fabricante FROM producto p
WHERE p.codigo_fabricante = f.codigo);


# SUBCONSULTAS CON WHERE

#1
SELECT * FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo AND f.nombre LIKE 'Lenovo';

SELECT * FROM producto
WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre LIKE 'Lenovo');

#2
SELECT * FROM producto
WHERE precio = (SELECT MAX(precio) FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre LIKE 'Lenovo');

#3
SELECT nombre, precio FROM producto
WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre LIKE 'Lenovo')
ORDER BY precio DESC
LIMIT 1;

#4
SELECT * FROM producto, fabricante f 
WHERE codigo_fabricante = f.codigo AND f.nombre LIKE 'Asus' 
AND precio > (SELECT AVG(precio) FROM producto p, fabricante f WHERE codigo_fabricante = f.codigo AND f.nombre LIKE 'Asus');


# Subconsultas con IN y NOT IN

#1
SELECT nombre FROM fabricante WHERE nombre IN (SELECT f.nombre FROM fabricante f, producto p WHERE codigo_fabricante = f.codigo);

#2
SELECT nombre FROM fabricante WHERE nombre NOT IN (SELECT f.nombre FROM fabricante f, producto p WHERE codigo_fabricante = f.codigo);


# Subconsultas (En la cláusula HAVING)

#1
SELECT COUNT(codigo_fabricante) AS 'Num productos' FROM fabricante f, producto p WHERE codigo_fabricante = f.codigo AND f.nombre LIKE 'Lenovo'
GROUP BY f.nombre; 

SELECT f.nombre, COUNT(codigo_fabricante) AS 'Num productos' FROM fabricante f, producto p
WHERE codigo_fabricante = f.codigo
GROUP BY f.nombre
HAVING COUNT(codigo_fabricante) = (SELECT COUNT(codigo_fabricante) AS 'Num productos' FROM fabricante f, producto p WHERE codigo_fabricante = f.codigo AND f.nombre LIKE 'Lenovo');

