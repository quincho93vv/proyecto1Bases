-----------------------------------------------------------
-- Base de Datos	: Proyecto 1
-- Modelo Version	: 1
-- Fecha			: 10/04/2015
-- DBA's			:	*Alonso Navarro Camareno
--						  *Jose Joaquin Vasquez Chaves
--						  *Mario Romero Sandoval
-- Servidor   : Oracle 11g Express Edition
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

--  Procedimientos y Funciones para Clientes

-- INSERT
CREATE OR REPLACE PROCEDURE  SP_001(XCodigo INT, XNombre VARCHAR, XVendedor INT)
IS 
BEGIN 
      INSERT INTO Clientes VALUES (XCodigo, XNombre, XVendedor);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Cliente.');
END;
/

-- UPDATE
CREATE OR REPLACE PROCEDURE  SP_002(XCodigo INT, XNombre VARCHAR, XVendedor INT)
IS 
BEGIN 
      UPDATE Clientes SET Nombre = XNombre, Vendedor = XVendedor WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Cliente.');
END;
/

-- DELETE
CREATE OR REPLACE PROCEDURE  SP_003(XCodigo INT)
IS 
BEGIN 
      DELETE FROM Clientes WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Cliente.');
END;
/

-- SELECT
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

--SELECT *
CREATE OR REPLACE FUNCTION FS_006
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, Vendedor FROM Clientes;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Cliente.');
END;
/



--  Procedimientos y Funciones para Vendedor

-- INSERT
CREATE OR REPLACE PROCEDURE  SP_004(XCodigo INT, XNombre VARCHAR, XTotalVendido FLOAT)
IS 
BEGIN 
      INSERT INTO Vendedores VALUES (XCodigo, XNombre, XTotalVendido);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Vendedor.');
END;
/

-- UPDATE
CREATE OR REPLACE PROCEDURE  SP_005(XCodigo INT, XNombre VARCHAR, XTotalVendido FLOAT)
IS 
BEGIN 
      UPDATE Vendedores SET Nombre = XNombre, totalVendido = XTotalVendido WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Vendedor.');
END;
/

-- DELETE
CREATE OR REPLACE PROCEDURE  SP_006(XCodigo INT)
IS 
BEGIN 
      DELETE FROM Vendedores WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Vendedor.');
END;
/

-- SELECT
CREATE OR REPLACE FUNCTION FS_002(XCodigo INT)
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, TotalVendido FROM Vendedores  WHERE Codigo = XCodigo;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Vendedor.');
END;
/

--SELECT *
CREATE OR REPLACE FUNCTION FS_007
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, TotalVendido FROM Vendedores;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Vendedor.');
END;
/



--  Procedimientos y Funciones para Factura

-- INSERT
CREATE OR REPLACE PROCEDURE  SP_007(XNumero INT, XTipo VARCHAR, XFecha Date, XTotal float, XCliente int)
IS 
BEGIN 
      INSERT INTO Facturas VALUES (XNumero, XTipo, XFecha, XTotal, XCliente);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Facturas.');
END;
/

-- UPDATE
CREATE OR REPLACE PROCEDURE  SP_008(XNumero INT, XTipo VARCHAR, XFecha Date, XTotal float, XCliente int)
IS 
BEGIN 
      UPDATE Facturas SET Tipo = XTipo, Fecha= XFecha, Total = XTotal, Cliente = XCliente WHERE Numero = XNumero;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Facturas.');
END;
/

-- DELETE
CREATE OR REPLACE PROCEDURE  SP_009(XNumero INT)
IS 
BEGIN 
      DELETE FROM Facturas WHERE Numero = XNumero;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Facturas.');
END;
/

-- SELECT
CREATE OR REPLACE FUNCTION FS_003(XNumero INT)
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Numero, Tipo, Fecha, Total, Cliente FROM Facturas  WHERE Numero = XNumero;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Facturas.');
END;
/

--SELECT *
CREATE OR REPLACE FUNCTION FS_008
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Numero, Tipo, Fecha, Total, Cliente FROM Facturas;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Facturas.');
END;
/



--  Procedimientos y Funciones para Detalle

-- INSERT
CREATE OR REPLACE PROCEDURE  SP_010(XProducto INT, XFactura INT, XCantidad INT, XTotal FLOAT)
IS 
BEGIN 
      INSERT INTO Detalles VALUES (XProducto, XFactura, XCantidad , XTotal);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Detalles.');
END;
/

-- UPDATE
CREATE OR REPLACE PROCEDURE  SP_011(XProducto INT, XFactura INT, XCantidad INT, XTotal FLOAT)
IS 
BEGIN 
      UPDATE Detalles SET Cantidad = XCantidad , Total = XTotal WHERE Producto = XProducto AND Factura = XFactura;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Detalles.');
END;
/

-- DELETE
CREATE OR REPLACE PROCEDURE  SP_012(XProducto INT, XFactura INT)
IS 
BEGIN 
      DELETE FROM Detalles WHERE Producto = XProducto AND Factura = XFactura;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Detalles.');
END;
/

-- SELECT
CREATE OR REPLACE FUNCTION FS_004(XProducto INT, XFactura INT)
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Producto, Factura, Cantidad, Total FROM Detalles  WHERE Producto = XProducto AND Factura = XFactura;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Detalles.');
END;
/

-- SELECT *
CREATE OR REPLACE FUNCTION FS_009
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Producto, Factura, Cantidad, Total FROM Detalles;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Detalles.');
END;
/


--  Procedimientos y Funciones para Producto

-- INSERT
CREATE OR REPLACE PROCEDURE  SP_013(XCodigo INT, XNombre VARCHAR, XPrecio FLOAT)
IS 
BEGIN 
      INSERT INTO Productos VALUES (XCodigo, XNombre, XPrecio);
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Insertar Productos.');
END;
/
 
-- UPDATE
CREATE OR REPLACE PROCEDURE  SP_014(XCodigo INT, XNombre VARCHAR, XPrecio FLOAT)
IS 
BEGIN 
      UPDATE Productos SET Nombre = XNombre, Precio = XPrecio WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Actualizar Productos.');
END;
/

-- DELETE
CREATE OR REPLACE PROCEDURE  SP_015(XCodigo INT)
IS 
BEGIN 
      DELETE FROM Productos WHERE Codigo = XCodigo;
      COMMIT;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Eliminar Productos.');
END;
/

-- SELECT
CREATE OR REPLACE FUNCTION FS_005(XCodigo INT)
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, Precio FROM Productos  WHERE Codigo = XCodigo;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Productos.');
END;
/

-- SELECT *
CREATE OR REPLACE FUNCTION FS_010
RETURN SYS_REFCURSOR
AS
      R SYS_REFCURSOR;
BEGIN 
      OPEN R FOR SELECT Codigo, Nombre, Precio FROM Productos;
      RETURN R;
EXCEPTION
   WHEN OTHERS THEN
      raise_application_error (-20002,'DB: Error al Consultar Productos.');
END;
/


