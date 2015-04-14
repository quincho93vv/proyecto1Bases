-----------------------------------------------------------
-- Base de Datos	: Proyecto 1
-- Modelo Version	: 1
-- Fecha			: 10/04/2015
-- DBA's			:	*Alonso Navarro Camareno
--						  *Jose Joaquin Vasquez Chaves
--						  *Mario Romero Sandoval
-- Servidor   : Oracle 11g Express Edition
-----------------------------------------------------------

insert into vendedores values (1,'Fernando',209000);
insert into vendedores values (2,'Maria',195000);
insert into vendedores values (3,'Raul',205000);
insert into vendedores values (4,'Laura',213000);

insert into clientes values (1,'Beto',1);
insert into clientes values (2,'Sandra',1);
insert into clientes values (3,'Yendry',2);
insert into clientes values (4,'Mario',2);
insert into clientes values (5,'Estela',3);
insert into clientes values (6,'Jose',3);
insert into clientes values (7,'Mariela',4);
insert into clientes values (8,'Marco',4);

insert into productos values (1,'Cerrucho',5000);
insert into productos values (2,'Martillo',2000);
insert into productos values (3,'Desatornillador',2000);
insert into productos values (4,'Cemento',28000);
insert into productos values (5,'Alicate',3000);
insert into productos values (6,'Cinta Metrica',8000);
insert into productos values (7,'LLave alen',7000);
insert into productos values (8,'Llave Francesa',5000);
insert into productos values (9,'Pintura',25000);
insert into productos values (10,'Lija',1000);
insert into productos values (11,'aspirina',100);

insert into Facturas values (1,'0',CURRENT_DATE,37000,1);
insert into Facturas values (2,'1',CURRENT_DATE,23000,1);
insert into Facturas values (3,'0',CURRENT_DATE,33000,1);
insert into Facturas values (4,'1',CURRENT_DATE,41000,2);
insert into Facturas values (5,'0',CURRENT_DATE,38000,2);
insert into Facturas values (6,'1',CURRENT_DATE,37000,2);
--209
insert into Facturas values (7,'0',CURRENT_DATE,23000,3);
insert into Facturas values (8,'1',CURRENT_DATE,33000,3);
insert into Facturas values (9,'0',CURRENT_DATE,41000,3);
insert into Facturas values (10,'1',CURRENT_DATE,38000,4);
insert into Facturas values (11,'0',CURRENT_DATE,37000,4);
insert into Facturas values (12,'1',CURRENT_DATE,23000,4);
--195
insert into Facturas values (13,'0',CURRENT_DATE,33000,5);
insert into Facturas values (14,'1',CURRENT_DATE,41000,5);
insert into Facturas values (15,'0',CURRENT_DATE,38000,5);
insert into Facturas values (16,'1',CURRENT_DATE,37000,6);
insert into Facturas values (17,'0',CURRENT_DATE,23000,6);
insert into Facturas values (18,'1',CURRENT_DATE,33000,6);
--205
insert into Facturas values (19,'0',CURRENT_DATE,41000,7);
insert into Facturas values (20,'1',CURRENT_DATE,38000,7);
insert into Facturas values (21,'0',CURRENT_DATE,37000,7);
insert into Facturas values (22,'1',CURRENT_DATE,23000,8);
insert into Facturas values (23,'0',CURRENT_DATE,33000,8);
insert into Facturas values (24,'1',CURRENT_DATE,41000,8);
--213

insert into Detalles values (1,1,1,5000);
insert into Detalles values (2,1,1,2000);
insert into Detalles values (3,1,1,2000);
insert into Detalles values (4,1,1,28000);
insert into Detalles values (11,1,1,100);
--37
insert into Detalles values (5,2,1,3000);
insert into Detalles values (6,2,1,8000);
insert into Detalles values (7,2,1,7000);
insert into Detalles values (8,2,1,5000);
--23
insert into Detalles values (9,3,1,25000);
insert into Detalles values (10,3,1,1000);
insert into Detalles values (1,3,1,5000);
insert into Detalles values (2,3,1,2000);
insert into Detalles values (11,3,2,200);
--33
insert into Detalles values (3,4,1,2000);
insert into Detalles values (4,4,1,28000);
insert into Detalles values (5,4,1,3000);
insert into Detalles values (6,4,1,8000);
--41
insert into Detalles values (7,5,1,7000);
insert into Detalles values (8,5,1,5000);
insert into Detalles values (9,5,1,25000);
insert into Detalles values (10,5,1,1000);
--38
insert into Detalles values (1,6,1,5000);
insert into Detalles values (2,6,1,2000);
insert into Detalles values (3,6,1,2000);
insert into Detalles values (4,6,1,28000);
insert into Detalles values (11,6,3,300);
--37
insert into Detalles values (5,7,1,3000);
insert into Detalles values (6,7,1,8000);
insert into Detalles values (7,7,1,7000);
insert into Detalles values (8,7,1,5000);
--23
insert into Detalles values (9,8,1,25000);
insert into Detalles values (10,8,1,1000);
insert into Detalles values (1,8,1,5000);
insert into Detalles values (2,8,1,2000);
--33
insert into Detalles values (3,9,1,2000);
insert into Detalles values (4,9,1,28000);
insert into Detalles values (5,9,1,3000);
insert into Detalles values (6,9,1,8000);
--41
insert into Detalles values (7,10,1,7000);
insert into Detalles values (8,10,1,5000);
insert into Detalles values (9,10,1,25000);
insert into Detalles values (10,10,1,1000);
--38
insert into Detalles values (1,11,1,5000);
insert into Detalles values (2,11,1,2000);
insert into Detalles values (3,11,1,2000);
insert into Detalles values (4,11,1,28000);
--37
insert into Detalles values (5,12,1,3000);
insert into Detalles values (6,12,1,8000);
insert into Detalles values (7,12,1,7000);
insert into Detalles values (8,12,1,5000);
--23
insert into Detalles values (9,13,1,25000);
insert into Detalles values (10,13,1,1000);
insert into Detalles values (1,13,1,5000);
insert into Detalles values (2,13,1,2000);
insert into Detalles values (11,13,1,100);
--33
insert into Detalles values (3,14,1,2000);
insert into Detalles values (4,14,1,28000);
insert into Detalles values (5,14,1,3000);
insert into Detalles values (6,14,1,8000);
insert into Detalles values (11,14,1,100);
--41
insert into Detalles values (7,15,1,7000);
insert into Detalles values (8,15,1,5000);
insert into Detalles values (9,15,1,25000);
insert into Detalles values (10,15,1,1000);
--38
insert into Detalles values (1,16,1,5000);
insert into Detalles values (2,16,1,2000);
insert into Detalles values (3,16,1,2000);
insert into Detalles values (4,16,1,28000);
--37
insert into Detalles values (5,17,1,3000);
insert into Detalles values (6,17,1,8000);
insert into Detalles values (7,17,1,7000);
insert into Detalles values (8,17,1,5000);
--23
insert into Detalles values (9,18,1,25000);
insert into Detalles values (10,18,1,1000);
insert into Detalles values (1,18,1,5000);
insert into Detalles values (2,18,1,2000);
--33
insert into Detalles values (3,19,1,2000);
insert into Detalles values (4,19,1,28000);
insert into Detalles values (5,19,1,3000);
insert into Detalles values (6,19,1,8000);
--41
insert into Detalles values (7,20,1,7000);
insert into Detalles values (8,20,1,5000);
insert into Detalles values (9,20,1,25000);
insert into Detalles values (10,20,1,1000);
--38
insert into Detalles values (1,21,1,5000);
insert into Detalles values (2,21,1,2000);
insert into Detalles values (3,21,1,2000);
insert into Detalles values (4,21,1,28000);
--37
insert into Detalles values (5,22,1,3000);
insert into Detalles values (6,22,1,8000);
insert into Detalles values (7,22,1,7000);
insert into Detalles values (8,22,1,5000);
--23
insert into Detalles values (9,23,1,25000);
insert into Detalles values (10,23,1,1000);
insert into Detalles values (1,23,1,5000);
insert into Detalles values (2,23,1,2000);
--33
insert into Detalles values (3,24,1,2000);
insert into Detalles values (4,24,1,28000);
insert into Detalles values (5,24,1,3000);
insert into Detalles values (6,24,1,8000);
--41