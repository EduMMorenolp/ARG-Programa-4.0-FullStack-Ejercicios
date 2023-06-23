DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
-- ACTIVIDAD 5
-- a) Primero insertar en la tabla “creador” los siguientes datos

INSERT INTO creador (nombre) VALUES ('Marvel');
INSERT INTO creador (nombre) VALUES ('DC Comics');

-- b) Ahora, continuaremos insertando registros en la tabla personaje

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
values ('Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Fisico Nuclear',1);	

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Tony Stark', 'Iron Man', 170, '200mil', 70, 123, 1963, 'Inventor Industrial', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Thor Odinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Wanda Maximoff', 'Bruja Escarlata', 170, '100mil', 90, 345, 1964, 'Bruja', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Carol Danvers', 'CapitanaMarvel', 157, '250mil', 85, 128, 1968, 'Oficial de inteligencia', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Peter Parker', 'Spiderman', 165, '25mil', 80, 74, 1962, 'Fotografo', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Steve Rogers', 'Capitan America', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Bobby Drake', 'Ice Man', 140, '2mil', 64, 122, 1963, 'Contador', 1);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Barry Allen', 'Flash', 160, '10mil', 120, 168, 1956, 'Cientifico Forense', 2);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2);

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ('Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);

-- a) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.

UPDATE personajes SET aparicion = 1938 WHERE personaje = 'Superman'  ORDER BY id_personaje LIMIT 1 ;

-- b) Eliminar el registro que contiene al personaje Flash. 

DELETE FROM personajes WHERE personaje = 'Flash' ORDER BY id_personaje LIMIT 1;

-- PARA VER LA TABLA LLENADA

select * from personajes