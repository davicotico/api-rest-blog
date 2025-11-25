
CREATE TABLE pais (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
	codigo VARCHAR(3),
    nombre VARCHAR(255)
);

CREATE TABLE tema (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    tema VARCHAR(255)
);

CREATE TABLE autor (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
   id_pais INTEGER,
   nombres VARCHAR(255),
   paterno VARCHAR(255),
   materno VARCHAR(255),
   nacimiento DATE,
   correo_electronico VARCHAR(255),
   FOREIGN KEY (id_pais) REFERENCES pais(id) ON DELETE RESTRICT ON UPDATE RESTRICT
);

CREATE TABLE blog (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
   id_autor INTEGER,
   id_tema INTEGER,
   titulo VARCHAR(255),
   contenido TEXT,
   periodicidad VARCHAR(255),
   permite_comentarios BOOLEAN,
   FOREIGN KEY (id_autor) REFERENCES autor(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
   FOREIGN KEY (id_tema) REFERENCES tema(id) ON DELETE RESTRICT ON UPDATE RESTRICT
);

CREATE TABLE comentario (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
   id_blog INTEGER,
   id_pais INTEGER,
   nombre_completo VARCHAR(255),
   correo_electronico VARCHAR(255),
   comentario TEXT,
   puntuacion INTEGER,
   FOREIGN KEY (id_blog) REFERENCES blog(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
   FOREIGN KEY (id_pais) REFERENCES pais(id) ON DELETE RESTRICT ON UPDATE RESTRICT
);

CREATE TABLE historial (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
   id_blog INTEGER,
   id_tema INTEGER,
   titulo VARCHAR(255),
   contenido TEXT,
   periodicidad VARCHAR(255),
   permite_comentarios BOOLEAN,
   fecha_actualizacion TIMESTAMP,
   FOREIGN KEY (id_blog) REFERENCES blog(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
   FOREIGN KEY (id_tema) REFERENCES tema(id) ON DELETE RESTRICT ON UPDATE RESTRICT
);
