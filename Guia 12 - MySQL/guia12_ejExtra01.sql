

#1
SELECT nombre FROM jugador
ORDER BY nombre;

#2
SELECT nombre, posicion, peso FROM jugador
WHERE posicion LIKE 'C' AND peso > 200
ORDER BY nombre;

#3
SELECT nombre FROM equipo
ORDER BY nombre;

#4
SELECT nombre, conferencia FROM equipo
WHERE conferencia LIKE 'East';

#5
SELECT * FROM equipo
WHERE ciudad LIKE 'C%'
ORDER BY nombre;

#6
SELECT * FROM jugador j
INNER JOIN equipo e
ON e.nombre = j.nombre_equipo;

#7
SELECT * FROM jugador
WHERE nombre_equipo LIKE 'Raptors'
ORDER BY nombre;

#8
SELECT j.codigo, j.nombre, e.temporada, e.Puntos_por_partido FROM jugador j
INNER JOIN estadistica e
ON j.codigo = e.jugador AND j.nombre LIKE 'Pau Gasol';

#9
SELECT j.codigo, j.nombre, e.temporada, e.Puntos_por_partido FROM jugador j
INNER JOIN estadistica e
ON j.codigo = e.jugador AND j.nombre LIKE 'Pau Gasol' AND e.temporada LIKE '04/05';

#10
SELECT j.codigo, j.nombre, e.temporada, ROUND(SUM(e.Puntos_por_partido)) AS 'Total pts' FROM jugador j
INNER JOIN estadistica e
ON j.codigo = e.jugador
GROUP BY j.nombre;

#11
SELECT e.nombre, COUNT(j.nombre) AS 'Num jugadores' FROM equipo e
INNER JOIN jugador j
ON j.nombre_equipo = e.nombre
GROUP BY e.nombre
ORDER BY e.nombre;

#12
SELECT j.*, ROUND(SUM(e.Puntos_por_partido)) AS 'Total pts' FROM jugador j
INNER JOIN estadistica e
ON j.codigo = e.jugador
GROUP BY j.nombre
ORDER BY ROUND(SUM(e.Puntos_por_partido)) DESC
LIMIT 1;

#13
SELECT j.nombre, j.altura, e.nombre, e.conferencia, e.division FROM equipo e
INNER JOIN jugador j
ON e.nombre = j.nombre_equipo
ORDER BY j.altura DESC
LIMIT 1;

#14
SELECT * FROM jugador j
INNER JOIN equipo e
ON j.nombre_equipo = e.nombre AND e.division LIKE 'Pacific'
GROUP BY e.nombre;

SELECT AVG(est.Puntos_por_partido) AS 'Promedio pts' FROM equipo e, estadistica est
WHERE e.division LIKE 'Pacific';

select eq.nombre, avg(puntos_por_partido), eq.division from equipo eq, estadistica e, jugador j 
where eq.nombre=j.nombre_equipo and j.codigo=e.jugador and division='pacific' 
group by eq.nombre;


#15
SELECT MAX(ABS(puntos_local - puntos_visitante)) FROM partido;

SELECT *, ABS(puntos_local - puntos_visitante) AS 'Dif de pts' FROM partido
WHERE ABS(puntos_local - puntos_visitante) = (SELECT MAX(ABS(puntos_local - puntos_visitante)) FROM partido);

#16
select eq.nombre, avg(puntos_por_partido), eq.division from equipo eq, estadistica e, jugador j 
where eq.nombre=j.nombre_equipo and j.codigo=e.jugador and division='pacific' 
group by eq.nombre;

#17
SELECT t.equipo, SUM(t.pts) AS 'Total pts' FROM (SELECT equipo_local AS equipo, SUM(puntos_local) AS pts FROM partido 
GROUP BY equipo_local
UNION ALL
SELECT equipo_visitante AS equipo, SUM(puntos_visitante) AS pts FROM partido 
GROUP BY equipo_visitante) t
GROUP BY t.equipo
ORDER BY equipo;

#18
SELECT codigo, equipo_local, equipo_visitante,
CASE WHEN puntos_local > puntos_visitante THEN equipo_local
WHEN puntos_local < puntos_visitante THEN equipo_visitante
ELSE null end as equipo_ganador
FROM partido p;




