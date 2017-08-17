create schema `jugadores` ;

use jugadores;

/*
drop schema `jugadores` ;
drop table jugadores;
drop table equipos;
drop table formacion;
drop table partidos;
*/
create table equipos (
 equipo_id int not null auto_increment primary key,
 nombre varchar(100) not null
 );

create table jugadores (
 jugador_id int not null auto_increment primary key,
 nombre varchar(100) not null
);

create table formacion (
 formacion_id int not null auto_increment primary key,
 equipo_id int not null,
 goles int,
 constraint formacion_equipo foreign key (equipo_id) references equipos (equipo_id)
);

create table formacion_jugador (
 formacion_id int not null,
 jugador_id int not null,
 constraint formacion_formacion foreign key (formacion_id) references formacion (formacion_id),
 constraint formacion_jugador foreign key (jugador_id) references jugadores (jugador_id)
);

create table partidos (
 formacion_local_id int not null,
 formacion_visitante_id int not null,
 primary key (formacion_local_id, formacion_visitante_id),
 constraint formacion_local foreign key (formacion_local_id) references formacion (formacion_id),
 constraint formacion_visitante foreign key (formacion_visitante_id) references formacion (formacion_id)
);