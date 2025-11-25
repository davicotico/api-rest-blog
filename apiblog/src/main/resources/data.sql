
INSERT INTO pais (codigo, nombre) VALUES ('AR', 'Argentina');
INSERT INTO pais (codigo, nombre) VALUES ('BO', 'Bolivia');
INSERT INTO pais (codigo, nombre) VALUES ('BR', 'Brasil');
INSERT INTO pais (codigo, nombre) VALUES ('CL', 'Chile');
INSERT INTO pais (codigo, nombre) VALUES ('CO', 'Colombia');
INSERT INTO pais (codigo, nombre) VALUES ('EC', 'Ecuador');
INSERT INTO pais (codigo, nombre) VALUES ('GY', 'Guyana');
INSERT INTO pais (codigo, nombre) VALUES ('PY', 'Paraguay');
INSERT INTO pais (codigo, nombre) VALUES ('PE', 'Perú');
INSERT INTO pais (codigo, nombre) VALUES ('SR', 'Surinam');
INSERT INTO pais (codigo, nombre) VALUES ('UY', 'Uruguay');
INSERT INTO pais (codigo, nombre) VALUES ('VE', 'Venezuela');
INSERT INTO pais (codigo, nombre) VALUES ('BZ', 'Belice');
INSERT INTO pais (codigo, nombre) VALUES ('CR', 'Costa Rica');
INSERT INTO pais (codigo, nombre) VALUES ('SV', 'El Salvador');
INSERT INTO pais (codigo, nombre) VALUES ('GT', 'Guatemala');
INSERT INTO pais (codigo, nombre) VALUES ('HN', 'Honduras');
INSERT INTO pais (codigo, nombre) VALUES ('NI', 'Nicaragua');
INSERT INTO pais (codigo, nombre) VALUES ('PA', 'Panamá');
INSERT INTO pais (codigo, nombre) VALUES ('CA', 'Canadá');
INSERT INTO pais (codigo, nombre) VALUES ('US', 'Estados Unidos');
INSERT INTO pais (codigo, nombre) VALUES ('MX', 'México');

INSERT INTO tema (tema) VALUES ('Desarrollo de Aplicaciones Móviles');
INSERT INTO tema (tema) VALUES ('Inteligencia Artificial');
INSERT INTO tema (tema) VALUES ('Desarrollo Web con Vue');
INSERT INTO tema (tema) VALUES ('Programación en Java');
INSERT INTO tema (tema) VALUES ('Bases de Datos NoSQL');
INSERT INTO tema (tema) VALUES ('Machine Learning');
INSERT INTO tema (tema) VALUES ('Desarrollo de APIs RESTful');
INSERT INTO tema (tema) VALUES ('DevOps y CI/CD');
INSERT INTO tema (tema) VALUES ('Blockchain y Criptomonedas');
INSERT INTO tema (tema) VALUES ('Internet de las Cosas (IoT)');

INSERT INTO autor (id_pais, nombres, paterno, materno, nacimiento, correo_electronico) VALUES (1, 'Juan Carlos', 'Pérez', 'Gómez', '1985-03-15', 'juan.perez@example.com');
INSERT INTO autor (id_pais, nombres, paterno, materno, nacimiento, correo_electronico) VALUES (5, 'María Fernanda', 'Rodríguez', 'López', '1990-07-22', 'maria.rodriguez@example.com');
INSERT INTO autor (id_pais, nombres, paterno, materno, nacimiento, correo_electronico) VALUES (10, 'Luis Alberto', 'Martínez', 'Sánchez', '1978-11-30', 'luis.martinez@example.com');


INSERT INTO blog (id_autor, id_tema, titulo, contenido, periodicidad, permite_comentarios) VALUES
(1, 1, 'Introducción al Desarrollo de Aplicaciones Móviles', 'El desarrollo de aplicaciones móviles se ha convertido en una habilidad esencial en la era digital. En este artículo, exploramos las herramientas y frameworks más utilizados para crear aplicaciones móviles eficientes y atractivas.', 'SEMANAL', TRUE);
INSERT INTO blog (id_autor, id_tema, titulo, contenido, periodicidad, permite_comentarios) VALUES
(2, 2, 'Inteligencia Artificial: Transformando el Futuro', 'La inteligencia artificial está revolucionando múltiples industrias. Desde la medicina hasta el transporte, sus aplicaciones son infinitas. En este blog, discutimos cómo la IA está dando forma al futuro y los avances más recientes en este campo.', 'MENSUAL', TRUE);
INSERT INTO blog (id_autor, id_tema, titulo, contenido, periodicidad, permite_comentarios) VALUES
(3, 4, 'Programación en Java para Principiantes', 'Java es uno de los lenguajes de programación más populares y versátiles. En esta entrada, cubrimos los conceptos básicos de la programación en Java, desde la sintaxis hasta la estructura de un programa simple.', 'DIARIA', TRUE);

INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(1, 1, 'Ana Gómez', 'ana.gomez@example.com', 'Excelente artículo sobre desarrollo de aplicaciones móviles, muy informativo.', 9);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(2, 5, 'Carlos Martínez', 'carlos.martinez@example.com', 'Interesante análisis sobre inteligencia artificial, aprendí mucho.', 8);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(3, 10, 'Lucía Fernández', 'lucia.fernandez@example.com', 'Guía muy útil sobre programación en Java, bien explicada.', 10);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(1, 3, 'Pedro Ramírez', 'pedro.ramirez@example.com', 'Información valiosa sobre desarrollo móvil, gracias por compartir.', 7);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(2, 12, 'Gabriela Torres', 'gabriela.torres@example.com', 'El artículo sobre IA es fascinante, espero leer más sobre este tema.', 9);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(3, 4, 'Miguel Hernández', 'miguel.hernandez@example.com', 'Las explicaciones sobre Java son claras y útiles para principiantes.', 8);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(1, 6, 'Elena Moreno', 'elena.moreno@example.com', 'Gran introducción al desarrollo de apps, me ha ayudado mucho.', 10);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(2, 14, 'Ricardo Pérez', 'ricardo.perez@example.com', 'Muy interesante el contenido sobre inteligencia artificial, bien escrito.', 7);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(3, 9, 'Laura Castillo', 'laura.castillo@example.com', 'Buen artículo sobre programación en Java, muy útil.', 9);
INSERT INTO comentario (id_blog, id_pais, nombre_completo, correo_electronico, comentario, puntuacion) VALUES
(1, 11, 'José Rojas', 'jose.rojas@example.com', 'El contenido sobre desarrollo móvil es excelente, gracias por compartir.', 8);
