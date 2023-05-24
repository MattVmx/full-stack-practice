

#1
SELECT nombre FROM pokemon;

#2
SELECT * FROM pokemon
WHERE peso < 10;

#3
SELECT p.numero_pokedex, p.nombre, t.nombre AS 'Tipo' FROM pokemon p, pokemon_tipo pt, tipo t
WHERE pt.id_tipo = t.id_tipo 
AND p.numero_pokedex = pt.numero_pokedex 
AND t.nombre LIKE 'Agua';

#4
SELECT p.numero_pokedex, p.nombre, t.nombre AS 'Tipo' FROM pokemon p, pokemon_tipo pt, tipo t
WHERE pt.id_tipo = t.id_tipo 
AND p.numero_pokedex = pt.numero_pokedex 
AND t.nombre IN ('Agua', 'Fuego', 'Tierra')
ORDER BY t.nombre;

#5
SELECT p.numero_pokedex, p.nombre, t.nombre AS 'Tipo' FROM pokemon p, pokemon_tipo pt, tipo t
WHERE pt.id_tipo = t.id_tipo 
AND p.numero_pokedex = pt.numero_pokedex 
AND t.nombre IN ('Fuego', 'Volador');

#6
SELECT p.numero_pokedex, p.nombre, eb.ps FROM pokemon p, estadisticas_base eb 
WHERE p.numero_pokedex = eb.numero_pokedex
AND eb.ps > 200;

#7
SELECT p.nombre, p.peso, p.altura FROM pokemon p, evoluciona_de ev
WHERE p.numero_pokedex = ev.pokemon_origen
AND ev.pokemon_evolucionado = (SELECT p.numero_pokedex FROM pokemon p WHERE p.nombre LIKE 'Arbok');

#8
SELECT * FROM pokemon_forma_evolucion;
SELECT * FROM forma_evolucion;
SELECT * FROM tipo_evolucion;

SELECT p.*, tev.tipo_evolucion FROM pokemon p, pokemon_forma_evolucion pfev, forma_evolucion fev, tipo_evolucion tev
WHERE p.numero_pokedex = pfev.numero_pokedex
AND pfev.id_forma_evolucion = fev.id_forma_evolucion
AND fev.tipo_evolucion = tev.id_tipo_evolucion
AND tev.tipo_evolucion LIKE 'Intercambio';

#9
SELECT * FROM pokemon_movimiento_forma;
SELECT * FROM movimiento;

SELECT nombre, prioridad FROM movimiento
WHERE prioridad = (SELECT MAX(prioridad) FROM movimiento);

#10
SELECT * FROM pokemon 
WHERE peso = (SELECT MAX(peso) FROM pokemon);

#11
SELECT nombre, potencia FROM movimiento 
WHERE potencia = (SELECT MAX(potencia) FROM movimiento);

#12
SELECT t.nombre, COUNT(*) AS 'Num movimientos' FROM movimiento m, tipo t
WHERE t.id_tipo = m.id_tipo
GROUP BY t.nombre;

#13
SELECT * FROM efecto_secundario;

SELECT m.nombre FROM movimiento m, movimiento_efecto_secundario mes, efecto_secundario es
WHERE m.id_movimiento = mes.id_movimiento
AND mes.id_efecto_secundario = es.id_efecto_secundario
AND es.efecto_secundario LIKE '%ENVENENAMIENTO%';

#14
SELECT * FROM movimiento
WHERE potencia > 0
ORDER BY nombre;

#15
SELECT m.nombre FROM pokemon p, pokemon_movimiento_forma pmf, movimiento m
WHERE p.numero_pokedex = pmf.numero_pokedex
AND pmf.id_movimiento = m.id_movimiento
AND p.nombre LIKE 'Pikachu';

#16
SELECT m.nombre FROM pokemon p, pokemon_movimiento_forma pmf, movimiento m
WHERE p.numero_pokedex = pmf.numero_pokedex
AND pmf.id_movimiento = m.id_movimiento
AND p.nombre LIKE 'Pikachu';

SELECT * FROM MO;