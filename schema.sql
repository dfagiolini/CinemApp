-- create database CINEMAPP;
-- \connect CINEMAPP;
create schema if not exists CINEMAPP;

create table CINEMAPP.CINEMA
(
    id        bigint generated by default as identity primary key,
    indirizzo varchar(255),
    nome      varchar(255) not null,
    telefono  varchar(255),
    unique (nome, indirizzo)
);

create table CINEMAPP.FILM
(
    id          bigint generated by default as identity primary key,
    durata      int,
    copertina   varchar(255),
    descrizione varchar(255),
    genere      varchar(255),
    regia       varchar(255) not null,
    titolo      varchar(255) not null,
    unique (titolo, regia)
);

create table CINEMAPP.SALA
(
    id        bigint generated by default as identity primary key,
    cinema_id bigint references cinemapp.cinema (id) on delete cascade on update cascade,
    capacita  integer not null ,
    numero    varchar(255) not null,
    unique (cinema_id, numero)
);

create table CINEMAPP.PROIEZIONE
(
    id              bigint generated by default as identity primary key,
    data_ora_fine   timestamp not null,
    data_ora_inizio timestamp not null,
    prezzo          double PRECISION,
    film_id         bigint    not null references cinemapp.FILM (id) on delete cascade on update cascade,
    sala_id         bigint    not null references cinemapp.SALA (id) on delete cascade on update cascade,
    unique (data_ora_inizio, data_ora_fine, sala_id)

);

create table CINEMAPP.UTENTE
(
    id       bigint generated by default as identity primary key,
    ruolo    smallint,
    email    varchar(255) unique,
    nome     varchar(255) unique,
    password varchar(255)
);

create table CINEMAPP.PRENOTAZIONE
(
    id                bigint generated by default as identity primary key,
    numero_biglietti  integer not null,
    data_prenotazione date,
    proiezione_id     bigint references cinemapp.PROIEZIONE (id) on delete cascade on update cascade,
    utente_id         bigint references cinemapp.UTENTE (id) on delete cascade on update cascade,
    unique (utente_id, proiezione_id)

);