TRUNCATE kandidat_ministerium, kandidat_ausschuss, ministerium, kandidat, landesliste,beruf,berufsgruppe,bundesland,geburtsort,listepartei,partei,wahlkreis,wohnort,fraktion,ausschuss,ministerium,kandidat_agentur,bundesland_agentur,listepartei_agentur,partei_agentur,wohnort_agentur,fraktion_agentur,ministerium_agentur,agentur,cms, wahlperiode RESTART IDENTITY CASCADE;
TRUNCATE btw17_ergebnis,btw17_kandidat_flat,btw17_strukturdaten,btw17_wahlbewerber,btw17_wahlkreis,btw17_mdb_wahlperiode,btw17_mdb_stammdaten RESTART IDENTITY CASCADE;
-- TRUNCATE spring_session_attributes,spring_session RESTART IDENTITY CASCADE;
-- ALTER SEQUENCE IF EXISTS hibernate_sequence RESTART;
