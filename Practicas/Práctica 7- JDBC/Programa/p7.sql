-- SANTOS MENDEZ ULISES JESUS
--   PRACTICA NUMERO 7
--   TEMA: JDBC
-- OPCION 1: INSERTAR PERROS EN UNA BASE DE DATOS
--   FECHA: 07/05/2021
-- GRUPO: 2CM3
--   MATERIA: PROGRAMACION ORIENTADA A OBJETOS
--   PROFESOR: TECLA PARRA ROBERTO

-- PROCEDIMIENTO
-- Hacer un programa que utilice la API JDBC y que tenga una GUI que permita insertar perros en una
-- base de datos que tiene una tabla Perro con el siguiente esquema Perro(nombre, raza, edad, genero). La
-- GUI consistirá en 4 etiquetas, 4 campos de entrada y 2 botones. Un botón para conectar a la base de
-- datos y otro para insertar los datos de un perro.

-- Base de datos: `p7`
--
--
-- Estructura de tabla para la tabla `perro`
--
create database p7;
use p7;
CREATE TABLE `perro` (
  `name` varchar(20) NOT NULL,
  `race` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gen` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `perro` (`name`, `race`, `age`, `gen`) VALUES
('Chispa', 'Poodle', 1, 'F'),
('Rocky', 'BullDog', 2, 'M'),
('Toby', 'Pastor Aleman', 4, 'M');


ALTER TABLE `perro`
  ADD PRIMARY KEY (`name`);
COMMIT;

