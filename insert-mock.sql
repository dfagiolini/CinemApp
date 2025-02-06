-- Inserimenti per la tabella cinema
INSERT INTO public.cinema (indirizzo, nome, telefono) VALUES 
('Via Roma 1', 'Cinema Paradiso', '0123456789'),
('Via Milano 5', 'Cinema Stella', '0987654321'),
('Via Napoli 10', 'Cinema Aurora', '0123456788'),
('Via Torino 15', 'Cinema Luna', '0123456787'),
('Via Firenze 20', 'Cinema Sole', '0123456786'),
('Via Venezia 25', 'Cinema Mare', '0123456785'),
('Via Bologna 30', 'Cinema Stella Marina', '0123456784'),
('Via Genova 35', 'Cinema Alba', '0123456783'),
('Via Verona 40', 'Cinema Tramonto', '0123456782'),
('Via Pisa 45', 'Cinema Notte', '0123456781');

-- Inserimenti per la tabella sala
INSERT INTO public.sala (capacita, numero) VALUES 
(100, 'Sala 1'),
(150, 'Sala 2'),
(200, 'Sala 3'),
(120, 'Sala 4'),
(180, 'Sala 5'),
(110, 'Sala 6'),
(130, 'Sala 7'),
(160, 'Sala 8'),
(140, 'Sala 9'),
(170, 'Sala 10');

-- Inserimenti per la tabella cinema_sale
INSERT INTO public.cinema_sale (cinema_id, sale_id) VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

-- Inserimenti per la tabella film
INSERT INTO public.film (durata, copertina, descrizione, genere, regia, titolo) VALUES 
(120, 'cover1.jpg', 'Una storia epica', 'Avventura', 'Mario Rossi', 'LAvventura Epica'),
(90, 'cover2.jpg', 'Una commedia divertente', 'Commedia', 'Luigi Bianchi', 'Risate Assicurate'),
(110, 'cover3.jpg', 'Un thriller emozionante', 'Thriller', 'Giulia Verdi', 'Suspense Infinita'),
(95, 'cover4.jpg', 'Un dramma toccante', 'Dramma', 'Carlo Neri', 'Lacrime e Sorrisi'),
(105, 'cover5.jpg', 'Un film romantico', 'Romantico', 'Anna Blu', 'Amore Senza Tempo'),
(115, 'cover6.jpg', 'Un documentario affascinante', 'Documentario', 'Paolo Rossi', 'Il Pianeta Terra'),
(125, 'cover7.jpg', 'Un film di fantascienza', 'Fantascienza', 'Luca Bianchi', 'Odissea Galattica'),
(100, 'cover8.jpg', 'Un film dazione', 'Azione', 'Sara Gialli', 'Adrenalina Pura'),
(85, 'cover9.jpg', 'Un film di animazione', 'Animazione', 'Marco Rossi', 'Sogno Animato'),
(130, 'cover10.jpg', 'Un film horror', 'Horror', 'Giovanni Bianchi', 'Notte di Paura');

-- Inserimenti per la tabella proiezione
INSERT INTO public.proiezione (data_ora_inizio, data_ora_fine, prezzo, film_id, sala_id) VALUES 
('2025-02-07 15:00:00', '2025-02-07 17:00:00', 10.50, 1, 1),
('2025-02-07 18:00:00', '2025-02-07 19:30:00', 8.00, 2, 2),
('2025-02-08 15:30:00', '2025-02-08 17:20:00', 11.00, 3, 3),
('2025-02-08 18:00:00', '2025-02-08 19:35:00', 9.00, 4, 4),
('2025-02-09 16:00:00', '2025-02-09 17:45:00', 12.50, 5, 5),
('2025-02-09 18:30:00', '2025-02-09 20:25:00', 10.00, 6, 6),
('2025-02-10 16:15:00', '2025-02-10 18:20:00', 13.00, 7, 7),
('2025-02-10 18:45:00', '2025-02-10 20:35:00', 8.50, 8, 8),
('2025-02-11 15:45:00', '2025-02-11 17:20:00', 11.50, 9, 9),
('2025-02-11 18:15:00', '2025-02-11 20:25:00', 12.00, 10, 10);

-- Inserimenti per la tabella utente
INSERT INTO public.utente (ruolo, email, nome, "password") VALUES 
(0, 'utente1@example.com', 'Mario', 'password1'),
(1, 'utente2@example.com', 'Luigi', 'password2'),
(0, 'utente3@example.com', 'Anna', 'password3'),
(1, 'utente4@example.com', 'Paolo', 'password4'),
(0, 'utente5@example.com', 'Giulia', 'password5'),
(1, 'utente6@example.com', 'Marco', 'password6'),
(0, 'utente7@example.com', 'Sara', 'password7'),
(1, 'utente8@example.com', 'Luca', 'password8'),
(0, 'utente9@example.com', 'Claudia', 'password9'),
(1, 'utente10@example.com', 'Giorgio', 'password10');

-- Inserimenti per la tabella prenotazione
INSERT INTO public.prenotazione (data_prenotazione, numero_biglietti, proiezione_id, utente_id) VALUES 
('2025-02-06', 2, 1, 1),
('2025-02-06', 4, 2, 2),
('2025-02-07', 1, 3, 3),
('2025-02-07', 3, 4, 4),
('2025-02-08', 2, 5, 5),
('2025-02-08', 5, 6, 6),
('2025-02-09', 2, 7, 7),
('2025-02-09', 3, 8, 8),
('2025-02-10', 1, 9, 9),
('2025-02-10', 4, 10, 10);
