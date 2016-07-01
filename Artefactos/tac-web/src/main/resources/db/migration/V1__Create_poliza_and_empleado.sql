
CREATE TABLE poliza (
  idpoliza number(11) NOT NULL,
  nombre varchar(45) DEFAULT NULL,
  descripcion varchar(45) DEFAULT NULL,
  PRIMARY KEY (idpoliza)
);

CREATE TABLE empleado (
  idempleado number(11) NOT NULL,
  nombre varchar(45) DEFAULT NULL,
  edad number(11) DEFAULT NULL,
  poliza_idpoliza number(11) NOT NULL,
  PRIMARY KEY (idempleado)
  );

INSERT INTO poliza (idpoliza,nombre,descripcion) VALUES (1,'SOAT','Seguro');
INSERT INTO poliza (idpoliza,nombre,descripcion) VALUES (2,'BASICA','Poliza basica');
INSERT INTO empleado (idempleado,nombre,edad,poliza_idpoliza) VALUES (1234,'Juan',80,1);
INSERT INTO empleado (idempleado,nombre,edad,poliza_idpoliza) VALUES (2345,'Jhon',79,2);