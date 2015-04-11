-----------------------------------------------------------
-- Base de Datos	: Proyecto 1
-- Modelo Version	: 1
-- Fecha			: 10/04/2015
-- DBA's			:	*Alonso Navarro Camareno
--						*Jose Joaquin Vasquez Chaves
--						*Mario Romero Sandoval
-- Servidor		    : Oracle 11g Express Edition
-----------------------------------------------------------

CREATE TABLE Vendedores(
	codigo int,
	nombre varchar(30),
	totalVendido float,
	CONSTRAINT PKVendedores PRIMARY KEY(codigo)
);

CREATE TABLE Clientes(
	codigo int,
	nombre varchar(30),
	vendedor int,
	CONSTRAINT PKClientes PRIMARY KEY(codigo),
	CONSTRAINT FKClientes FOREIGN KEY(vendedor) REFERENCES Vendedores
);

CREATE TABLE Facturas(
	numero int,
	tipo varchar(2),
	fecha date,
	total float,
	cliente int,
	CONSTRAINT PKFacturas PRIMARY KEY(numero),
	CONSTRAINT FKFacturas FOREIGN KEY(cliente) REFERENCES Clientes
);

CREATE TABLE Productos(
	codigo int,
	nombre varchar(30),
	precio float,
	CONSTRAINT PKProductos PRIMARY KEY(codigo)
);

CREATE TABLE Detalles(
	producto int,
	factura int, 
	cantidad int,
	total float,
	CONSTRAINT PKDetalles PRIMARY KEY(producto, factura),
	CONSTRAINT FKDetalles1 FOREIGN KEY(producto) REFERENCES Productos,
	CONSTRAINT FKDetalles2 FOREIGN KEY(factura) REFERENCES Facturas
);

-- Procedimientos y Funciones para Clientes

CREATE OR REPLACE PROCEDURE  SP_001(XCodigo INT, XNombre VARCHAR, XVendedor INT)
IS 
BEGIN 
      INSERT INTO Clientes VALUES (XCodigo, XNombre, XVendedor);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Cliente.');
END;

CREATE OR REPLACE PROCEDURE  SP_002(XCodigo INT, XNombre VARCHAR, XVendedor INT)
IS 
BEGIN 
      UPDATE Clientes SET Nombre = XNombre, Vendedor = XVendedor WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Cliente.');
END;

CREATE OR REPLACE PROCEDURE  SP_003(XCodigo INT)
IS 
BEGIN 
      DELETE FROM Clientes WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Cliente.');
END;

CREATE OR REPLACE FUNCTION FS_001(XCodigo INT)
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, Vendedor FROM Clientes  WHERE Codigo = XCodigo;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Cliente.');
END;
/

select * from clientes;




