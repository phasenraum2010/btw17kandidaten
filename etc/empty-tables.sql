DELETE FROM kandidat;
DELETE FROM kandidat_flat;
DELETE FROM landesliste;
DELETE FROM beruf;
DELETE FROM berufsgruppe;
DELETE FROM bundesland;
DELETE FROM geburtsort;
DELETE FROM liste_partei;
DELETE FROM partei;
DELETE FROM wahlkreis;
DELETE FROM wohnort;
DELETE FROM fraktion;
DELETE FROM ministerium;
ALTER SEQUENCE hibernate_sequence RESTART WITH 1;
