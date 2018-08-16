insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Abbondanzieri';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Ibarra';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Schiavi';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Diaz';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Krupoviesa';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Battaglia';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Gago';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Bilos';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Insúa';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Palacio';
 
 insert into formacion_jugador
select 1, jugador_id
  from jugadores
 where nombre = 'Palermo';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Ustari';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Lorgio Alvarez';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Abraham';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Cáceres';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Eduardo Domínguez';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Pusineri';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Biglia';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Orteman';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Armenteros';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Bustos Montoya';
 
 insert into formacion_jugador
select 2, jugador_id
  from jugadores
 where nombre = 'Aguero';
 
 select j.nombre
   from formacion_jugador fj, jugadores j
  where fj.jugador_id = j.jugador_id
    and fj.formacion_id = 1;