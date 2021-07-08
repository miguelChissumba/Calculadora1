DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS usuario;
CREATE TABLE role (
  role_id int(11) NOT NULL AUTO_INCREMENT,
  role_name varchar(255) DEFAULT NULL,
  role_desc varchar(255) DEFAULT NULL,
  PRIMARY KEY (role_id)
);
INSERT INTO role VALUES (1,'SUPER_USER','Este e' um super usuario');
INSERT INTO role VALUES (2,'ADMIN_USER','Este a' um usuario/administrador');
INSERT INTO role VALUES (3,'SITE_USER','Este usuario tem acesso ao Site');

CREATE TABLE usuario (
  usuario_id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(255) NOT NULL,
  last_name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  status varchar(255),
  PRIMARY KEY (usuario_id)
);

CREATE TABLE user_role (
  usuario_id int(11) NOT NULL,
  role_id int(11) NOT NULL,
  PRIMARY KEY (usuario_id,role_id),
  KEY FK_user_role (role_id),
  CONSTRAINT FK_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (usuario_id),
  CONSTRAINT FK_user_role FOREIGN KEY (role_id) REFERENCES role (role_id)
) ;

insert into usuario (usuario_id,first_name,last_name,email,password,status) values (1,'Miguel','Chissumba','miguelchissumba@gmail.com','Qwerty','VERIFIED');
insert into user_role (usuario_id, role_id) values ('1','1');
insert into user_role (usuario_id, role_id) values ('1','2');
insert into user_role (usuario_id, role_id) values ('1','3');