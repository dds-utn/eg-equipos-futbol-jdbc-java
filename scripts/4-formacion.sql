INSERT INTO formacion
(goles, equipo_id)
select 2, equipo_id from equipos where nombre = 'Boca';

INSERT INTO formacion
(goles, equipo_id)
select 0, equipo_id from equipos where nombre = 'Independiente';
