

/************** DATOS PARA EJERCICIOS ONE-TO-ONE ***************/

INSERT INTO datos_usuarios(id,biografia,fecha_registro) VALUES(DEFAULT,'Usuario ficticio 1 creado para el curso', '2013-10-20');
INSERT INTO usuarios(id, datos_autor_id, nombre, email, password, rol, activo) VALUES(DEFAULT,1,'Juan Perez', 'juan@email.com','1234','ROLE_EDITOR',true);

INSERT INTO datos_usuarios(id,biografia,fecha_registro) VALUES(DEFAULT,'Usuario ficticio 2 creado para el curso', '2013-10-20');
INSERT INTO usuarios(id, datos_autor_id, nombre, email, password,rol,activo) VALUES(DEFAULT,2,'Pepe', 'pepe@email.com','1234','ROLE_ADMIN',true);

INSERT INTO datos_articulos(id,observaciones) VALUES(DEFAULT,'Observaciones adicionales para articulo 1');
INSERT INTO datos_articulos(id,observaciones) VALUES(DEFAULT,'Observaciones adicionales para articulo 2');
INSERT INTO datos_articulos(id,observaciones) VALUES(DEFAULT,'Observaciones adicionales para articulo 3');

/************** DATOS PARA EJERCICIO ONE-TO-MANY ***************/

INSERT INTO articulos VALUES(DEFAULT,1,1,'titulo articulo 1','contenido articulo 1','2013-10-24');
INSERT INTO articulos VALUES(DEFAULT,1,2,'titulo articulo 2','contenido articulo 2','2012-10-24');
INSERT INTO articulos VALUES(DEFAULT,1,3,'titulo articulo 3','contenido articulo 3','2020-11-24');

INSERT INTO comentarios VALUES(DEFAULT, 1, 'mi comentario 1','anonimo','2013-9-24');
INSERT INTO comentarios VALUES(DEFAULT, 1, 'mi comentario 2','anonimo','2013-11-24');

INSERT INTO comentarios VALUES(DEFAULT, 3, 'mi comentario en articulo 3','anonimo','2013-9-24');
INSERT INTO comentarios VALUES(DEFAULT, 3, 'otro comentario en articulo 3','anonimo','2013-11-24');

/************** DATOS PARA EJERCICIO MANY-TO-MANY ***************/

INSERT INTO categorias VALUES(DEFAULT, 'java');
INSERT INTO categorias VALUES(DEFAULT, 'linux');
INSERT INTO categorias VALUES(DEFAULT, 'jpa');

INSERT INTO categorias_articulos VALUES(1,1);
INSERT INTO categorias_articulos VALUES(2,1);
INSERT INTO categorias_articulos VALUES(3,1);

INSERT INTO categorias_articulos VALUES(1,2);
INSERT INTO categorias_articulos VALUES(2,2);


INSERT INTO departamentos VALUES(DEFAULT,'deportes');
INSERT INTO departamentos VALUES(DEFAULT,'tecnologia');
INSERT INTO departamentos VALUES(DEFAULT,'espectaculos');
INSERT INTO departamentos VALUES(DEFAULT,'ciencia');

INSERT INTO departamentos_usuarios(usuario_id,departamento_id) VALUES(1,1);
INSERT INTO departamentos_usuarios(usuario_id,departamento_id) VALUES(1,2);
INSERT INTO departamentos_usuarios(usuario_id,departamento_id) VALUES(1,3);

INSERT INTO departamentos_usuarios(usuario_id,departamento_id) VALUES(2,3);
INSERT INTO departamentos_usuarios(usuario_id,departamento_id) VALUES(2,4);


/************ DATOS PARA EJEMPLOS @Embedded y @ElementCollection *********/
INSERT INTO telefonos(id,usuario_id,telefono) VALUES(DEFAULT,1,'55 94182567');
INSERT INTO telefonos(id,usuario_id,telefono) VALUES(DEFAULT,1,'55 94182783');
INSERT INTO telefonos(id,usuario_id,telefono) VALUES(DEFAULT,2,'55 16186745');
  
INSERT INTO emails_adicionales(id,usuario_id,email) VALUES(DEFAULT,1,'juan2@hotmail.com');
INSERT INTO emails_adicionales(id,usuario_id,email) VALUES(DEFAULT,1,'juan3@yahoo.com');

/*********** DATOS PARA EJEMPLOS CON LLAVES COMPUESTAS *****************/

INSERT INTO ventas(orden,codigo_barras,nombre_producto,cantidad) VALUES(1,'001 2348', 'Papas',2);
INSERT INTO ventas(orden,codigo_barras,nombre_producto,cantidad) VALUES(1,'221 6734', 'Refresco 2Lt',1);
INSERT INTO ventas(orden,codigo_barras,nombre_producto,cantidad) VALUES(2,'981 6752', 'Pizza microondas',1);
INSERT INTO ventas(orden,codigo_barras,nombre_producto,cantidad) VALUES(2,'871 4167', 'Cerveza lata',3);

INSERT INTO inscripciones(matricula,curso,fecha_inscripcion) VALUES('24540IA762','Historia','2019-10-3');
INSERT INTO inscripciones(matricula,curso,fecha_inscripcion) VALUES('24540IA762','Antropologia','2019-10-4');
INSERT INTO inscripciones(matricula,curso,fecha_inscripcion) VALUES('51200BF187','JPA 2','2019-10-2');
INSERT INTO inscripciones(matricula,curso,fecha_inscripcion) VALUES('51200BF187','Sistemas Operativos','2019-10-3');
