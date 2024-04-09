-- Estudiantes.alumnos definition

CREATE TABLE `alumnos` (
  `DNI` varchar(255) NOT NULL,
  `Nombres` varchar(255) DEFAULT NULL,
  `Apellidos` varchar(255) DEFAULT NULL,
  `Nacimiento` DATE DEFAULT NULL,
  `Correo` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  CONSTRAINT alumnos_pk PRIMARY KEY (DNI)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;