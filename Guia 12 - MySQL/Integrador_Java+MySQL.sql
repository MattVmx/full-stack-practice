
#CANDADO A

#POSICION:
SELECT COUNT(Asistencias_por_partido) AS 'POSICION' FROM estadistica
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadistica)
ORDER BY Asistencias_por_partido DESC;

#CLAVE:
SELECT SUM(j.peso) AS 'CLAVE' FROM jugador j 
INNER JOIN equipo e
ON j.nombre_equipo = e.nombre AND e.conferencia LIKE 'East' AND j.posicion LIKE '%C%'
ORDER BY j.nombre;


#CANDADO B

#POSICION:
SELECT COUNT(*) AS 'JUGADORES HEAT' FROM jugador j, equipo eq
WHERE j.nombre_equipo = eq.nombre AND eq.nombre LIKE 'Heat'
GROUP BY eq.nombre
ORDER BY j.nombre DESC;

SELECT COUNT(Asistencias_por_partido) AS 'POSICION' FROM estadistica
WHERE Asistencias_por_partido > (SELECT COUNT(*) FROM jugador j, equipo eq
WHERE j.nombre_equipo = eq.nombre AND eq.nombre LIKE 'Heat'
GROUP BY eq.nombre);

#CLAVE:
SELECT COUNT(*) AS 'CLAVE' FROM partido p
WHERE p.temporada LIKE '%99%';


#CANDADO C

#POSICION:
SELECT j.nombre, j.procedencia, e.conferencia FROM jugador j
INNER JOIN equipo e
ON j.nombre_equipo = e.nombre AND e.conferencia LIKE 'West' AND j.procedencia LIKE '%Michigan%';

SELECT COUNT(*) AS 'CANT JUGADORES' FROM jugador
WHERE peso >= 195
ORDER BY peso;

select round(((count(j.nombre) / (select count(nombre) from jugador where peso >= 195)) + 0.9945)) as 'posición'
from jugador j, equipo e
where e.nombre = j.nombre_equipo
and j.procedencia like ('%MICHIGAN%');

#CLAVE:
SELECT AVG(e.Puntos_por_partido) FROM estadistica e, equipo eq, jugador j
WHERE e.jugador = j.codigo
AND eq.nombre = j.nombre_equipo
AND eq.division LIKE '%Central%';

SELECT COUNT(e.Asistencias_por_partido) FROM estadistica e, equipo eq, jugador j
WHERE e.jugador = j.codigo
AND eq.nombre = j.nombre_equipo
AND eq.division LIKE '%Central%';

SELECT SUM(e.Tapones_por_partido) FROM estadistica e, equipo eq, jugador j
WHERE e.jugador = j.codigo
AND eq.nombre = j.nombre_equipo
AND eq.division LIKE '%Central%';

SELECT ROUND(AVG(e.Puntos_por_partido) + 
COUNT(e.Asistencias_por_partido) + 
SUM(e.Tapones_por_partido)) AS 'CLAVE' 
FROM estadistica e, equipo eq, jugador j
WHERE e.jugador = j.codigo
AND eq.nombre = j.nombre_equipo
AND eq.division LIKE '%Central%';


#CANDADO D

#POSICION:
SELECT ROUND(e.Tapones_por_partido) AS 'POSICION' FROM jugador j
INNER JOIN estadistica e
ON j.codigo = e.jugador
AND j.nombre LIKE 'Corey Maggette'
AND e.temporada LIKE '%00/01%';

#CLAVE:
SELECT ROUND(SUM(e.Puntos_por_partido)) AS 'CLAVE' FROM jugador j, estadistica e
WHERE j.codigo = e.jugador 
AND j.procedencia LIKE 'Argentina'