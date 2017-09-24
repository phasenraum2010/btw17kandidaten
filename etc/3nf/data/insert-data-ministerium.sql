--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.5
-- Dumped by pg_dump version 9.6.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

--
-- Data for Name: ministerium; Type: TABLE DATA; Schema: public; Owner: kandidaten
--

INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (14, '94', 'Deutschland', 'Berlin', '10963', 'Stresemannstraße', 'Gerd Müller', NULL, 'https://pbs.twimg.com/profile_images/553544845340311554/4WJwvjGd_400x400.png', NULL, '52.5055509', '13.3791886', '15', '@52.5055509,13.3791886,17z', 'BMZ', 'Bundesministerium für wirtschaftliche Zusammenarbeit und Entwicklung', NULL, NULL, 'https://www.facebook.com/BMZ.Bund', NULL, NULL, 'https://plus.google.com/+BMZ', NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_wirtschaftliche_Zusammenarbeit_und_Entwicklung', NULL, NULL, 'https://twitter.com/BMZ_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_wirtschaftliche_Zusammenarbeit_und_Entwicklung', NULL, 'https://www.youtube.com/bmz', 'http://www.bmz.de/', 7, 1500, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (15, '1', 'Deutschland', 'Berlin', '10557', 'Willy-Brandt-Straße', 'Angela Merkel', NULL, 'https://www.bundesregierung.de/SiteGlobals/StyleBundles/Bilder/logo_bundesregierung.svg;jsessionid=8AC84F7179C2579E6234F786D21AA9D6.s39t1?__blob=normal&v=10', NULL, '52.5202065', '13.3669474', '15', '@52.5202065,13.3669474,17z', 'Bundesregierung', 'Bundeskanzleramt', NULL, NULL, 'https://www.facebook.com/Bundesregierung/', NULL, NULL, NULL, 'https://www.instagram.com/bundeskanzlerin/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundeskanzleramt', NULL, NULL, 'https://twitter.com/RegSprecher', NULL, 'https://de.wikipedia.org/wiki/Bundeskanzleramt_(Deutschland)', NULL, NULL, 'https://www.bundesregierung.de', 7, 1414, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (6, '49', 'Deutschland', 'Berlin', '10117', 'Wilhelmstraße', 'Andrea Nahles', NULL, 'http://www.bmas.de/SiteGlobals/StyleBundles/Bilder/Farbschema/logo.svg;jsessionid=F16D56711429CCFEDB1AEE2748235F52?__blob=normal&v=5', NULL, '52.51256', '13.3820313', '15', '@52.51256,13.3820313,17z', 'BMAS', 'Bundesministerium für Arbeit und Soziales', NULL, NULL, 'https://www.facebook.com/BMAS.Bund', NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Arbeit_und_Soziales', NULL, NULL, 'https://twitter.com/BMAS_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Arbeit_und_Soziales', NULL, 'https://www.youtube.com/user/bmasyout', 'http://www.bmas.de/', 7, 1514, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (13, '1', 'Deutschland', 'Berlin', '10117', 'Kapelle-Ufer', 'Johanna Wanka', NULL, 'https://pbs.twimg.com/profile_images/553544845340311554/4WJwvjGd_400x400.png', NULL, '52.52296', '13.3740913', '15', '@52.52296,13.3740913,17z', 'BMBF', 'Bundesministerium für Bildung und Forschung', NULL, NULL, 'https://www.facebook.com/bmbf.de', NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Bildung_und_Forschung', NULL, NULL, 'https://twitter.com/BMBF_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Bildung_und_Forschung', NULL, NULL, 'https://www.bmbf.de/', 7, NULL, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (5, '97', 'Deutschland', 'Berlin', '10117', 'Wilhelmstraße', 'Wolfgang Schäuble', NULL, 'http://www.bundesfinanzministerium.de/SiteGlobals/StyleBundles/Bilder/Farbschema/logo.svg?__blob=normal&v=7', NULL, '52.5084199', '13.3819845', '15', '@52.5084199,13.3819845,17z', 'BMF', 'Bundesministerium der Finanzen', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_der_Finanzen', NULL, NULL, 'https://twitter.com/BMF_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_der_Finanzen', NULL, 'https://www.youtube.com/user/finanzministeriumTV', 'http://www.bundesfinanzministerium.de/', 7, 2028, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (1, '140', 'Deutschland', 'Berlin', '10557', 'Alt-Moabit', 'Thomas de Maizière', NULL, 'http://www.bmi.bund.de/SiteGlobals/StyleBundles/Bilder/logo-a.png?__blob=normal&v=3', NULL, '52.52263', '13.3612313', '15', '@52.52263,13.3612313,17z', 'BMI', 'Bundesministerium des Innern', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_des_Innern', NULL, NULL, 'https://twitter.com/BMI_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_des_Innern', NULL, 'https://www.youtube.com/channel/UCEj9_d1bBphisn1KSv96TZA', 'http://www.bmi.bund.de/', 7, 2522, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (4, '37', 'Deutschland', 'Berlin', '10117', 'Mohrenstraße', 'Heiko Maas', NULL, 'http://www.bmjv.de/SiteGlobals/Frontend/Images/logo.gif?__blob=normal&v=5', NULL, '52.5151797', '13.396869', '15', '@52.5151797,13.396869,17z', 'BMJV', 'Bundesministerium der Justiz und für Verbraucherschutz', NULL, NULL, 'https://www.facebook.com/bmjv.bund', NULL, NULL, 'https://plus.google.com/u/0/108479659074204181747', NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_der_Justiz', NULL, NULL, 'https://twitter.com/bmjv_bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_der_Justiz_und_f%C3%BCr_Verbraucherschutz', NULL, 'https://www.youtube.com/user/BMJustiz', 'http://www.bmjv.de/', 7, 1330, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (3, '1', 'Deutschland', 'Berlin', '10117', 'Werderscher Markt', 'Sigmar Gabriel', NULL, 'http://www.auswaertiges-amt.de/cae/servlet/contentblob/684456/normal/229443/logo.png', NULL, '52.5151797', '13.396869', '15', '@52.5151797,13.396869,17z', 'AA', 'Auswärtiges Amt', NULL, NULL, 'https://www.facebook.com/AuswaertigesAmt', NULL, NULL, '', 'https://www.instagram.com/auswaertigesamt/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten#_im#_Ausw#%C3#%A4rtigen#_Amt', NULL, NULL, 'https://twitter.com/AuswaertigesAmt', NULL, 'https://de.wikipedia.org/wiki/Ausw%C3%A4rtiges_Amt', NULL, 'https://www.youtube.com/user/AuswaertigesAmtDE', 'http://www.auswaertiges-amt.de/', 7, 553, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (12, '128 - 130 ', 'Deutschland', 'Berlin', '10117', 'Stresemannstraße', 'Barbara Hendricks', NULL, 'https://pbs.twimg.com/profile_images/553544845340311554/4WJwvjGd_400x400.png', NULL, '52.50812', '13.3760313', '15', '@52.50812,13.3760313,17z', 'BMUB', 'Bundesministerium für Umwelt, Naturschutz, Bau und Reaktorsicherheit', NULL, NULL, 'https://www.facebook.com/bmub.bund', NULL, NULL, NULL, 'https://www.instagram.com/bmub/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Umwelt,_Naturschutz_und_Reaktorsicherheit', NULL, NULL, 'https://twitter.com/bmub', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Umwelt,_Naturschutz,_Bau_und_Reaktorsicherheit', NULL, 'https://www.youtube.com/user/Umweltministerium', 'http://www.bmub.bund.de/', 7, 772, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (8, '18', 'Deutschland', 'Berlin', '10785', 'Stauffenbergstr.', 'Ursula von der Leyen', NULL, 'https://www.bmvg.de/resource/blob/13370/716db66273ec9ecc3be9e00ac3fe95ac/logo-big-svg-data.svg', NULL, '52.5073911', '13.3590507', '15', '@52.5073911,13.3590507,17z', 'BMVG', 'Bundesministerium der Verteidigung', NULL, NULL, 'https://www.facebook.com/Bundeswehr/', NULL, NULL, NULL, 'https://www.instagram.com/bundeswehr/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Verteidigung', NULL, NULL, 'https://twitter.com/bundeswehrinfo', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_der_Verteidigung', NULL, 'https://www.youtube.com/user/Bundeswehr', 'https://www.bmvg.de', 7, 2548, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (2, '34-37', 'Deutschland', 'Berlin', '10115', 'Scharnhorststr.', 'Brigitte Zypries', NULL, 'http://www.bmwi.de/SiteGlobals/BMWI/StyleBundles/Bilder/bmwi_logo_de.null?__blob=normal&v=9', NULL, '52.5307067', '13.3707296', '15', '@52.5307067,13.3707296,17z', 'BMWI', 'Bundesministerium für Wirtschaft und Energie', NULL, NULL, 'https://www.facebook.com/bundeswirtschaftsministerium', NULL, NULL, 'https://plus.google.com/+bundeswirtschaftsministerium', NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Wirtschaft_und_Technologie', 'https://soundcloud.com/bmwi_bund', NULL, 'https://twitter.com/BMWi_Bund/', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Wirtschaft_und_Energie', NULL, 'https://www.youtube.com/user/wirtschaftspolitik', 'http://www.bmwi.de/', 7, NULL, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (7, '54', 'Deutschland', 'Berlin', '10117', 'Wilhelmstraße', 'Christian Schmidt', NULL, 'http://www.bmel.de/SiteGlobals/Frontend/Images/logo.svg?__blob=normal&v=2', NULL, '52.5137697', '13.38023', '15', '@52.5137697,13.38023,17z', 'BMEL', 'Bundesministerium für Ernährung und Landwirtschaft', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Politikfeld_Agrar_und_Ern%C3%A4hrung', NULL, NULL, 'https://twitter.com/bmel', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Ern%C3%A4hrung_und_Landwirtschaft', NULL, 'https://www.youtube.com/user/bmelv', 'http://www.bmel.de/', 7, 1915, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (10, '108', 'Deutschland', 'Berlin', '10117', 'Friedrichstraße', 'Hermann Gröhe', NULL, 'http://www.bundesgesundheitsministerium.de/typo3conf/ext/bmgconfig/Resources/Public/Images/Branding/logo.svg', NULL, '52.5246037', '13.3856594', '15', '@52.5246037,13.3856594,17z', 'BMG', 'Bundesministerium für Gesundheit', NULL, NULL, 'https://www.facebook.com/bmg.bund', NULL, NULL, NULL, NULL, NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Gesundheit', NULL, NULL, 'https://twitter.com/BMG_Bund', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Gesundheit_(Deutschland)', NULL, 'https://www.youtube.com/user/BMGesundheit', 'http://www.bundesgesundheitsministerium.de/', 7, 653, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (9, '24', 'Deutschland', 'Berlin', '10117', 'Glinkastraße', 'Katarina Barley', NULL, 'https://www.bmfsfj.de/blob/107422/b58a2dae46ef37e177621910be50a2c0/logo-data.png', NULL, '52.5132754', '13.3846688', '15', '@52.5132754,13.3846688,17z', 'BMFSFJ', 'Bundesministerium für Familie, Senioren, Frauen und Jugend', NULL, NULL, 'https://www.facebook.com/bmfsfj', NULL, NULL, NULL, 'https://www.instagram.com/bmfsfj/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Familie,_Senioren,_Frauen_und_Jugend', NULL, NULL, 'https://twitter.com/bmfsfj', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Familie,_Senioren,_Frauen_und_Jugend', NULL, 'https://www.youtube.com/user/familienministerium', 'https://www.bmfsfj.de', 7, 87, NULL);
INSERT INTO ministerium (id, hausnummer, nation, ort, plz, strasse, bundesminister, beschreibungs_text, logo_url, symbol_bild, geo_lattitude, geo_longitude, geo_zoom, google_maps_url, ministerium, ministerium_lang, abgeordnetenwatch, bundestag, facebook, flickr, github, google_plus, instagram, linked_in, lobbypedia_url, soundcloud, stackoverflow, twitter, vimeo, wikipedia_article, xing, youtube, webseite, fk_bundesland, fk_bundesminister, fk_webseite_cms) VALUES (11, '44', 'Deutschland', 'Berlin', '10115', 'Invalidenstraße', 'Alexander Dobrindt', NULL, 'http://www.bmvi.de/SiteGlobals/Frontend/Images/logo.svg?__blob=normal', NULL, '52.529473', '13.3763013', '15', '@52.529473,13.3763013,17z', 'BMVI', 'Bundesministerium für Verkehr und digitale Infrastruktur', NULL, NULL, 'https://www.facebook.com/Bundesverkehrsministerium/', NULL, NULL, NULL, 'https://www.instagram.com/bmvi_de/', NULL, 'https://lobbypedia.de/wiki/Lobbyisten_im_Bundesministerium_f%C3%BCr_Verkehr,_Bau_und_Stadtentwicklung', 'https://soundcloud.com/bmvi', NULL, 'https://twitter.com/BMVI', NULL, 'https://de.wikipedia.org/wiki/Bundesministerium_f%C3%BCr_Verkehr_und_digitale_Infrastruktur', NULL, 'https://www.youtube.com/user/bmvbs', 'http://www.bmvi.de/', 7, 361, NULL);


--
-- PostgreSQL database dump complete
--

