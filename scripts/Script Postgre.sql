-----------------------------------------------------------
-- Base de Datos	: Proyecto 1
-- Modelo Version	: 1
-- Fecha			: 10/04/2015
-- DBA's			:	*Alonso Navarro Camareno
--						  *Jose Joaquin Vasquez Chaves
--						  *Mario Romero Sandoval
-- Servidor   : PostgreSQL 9.4
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


--                              PROCEDIMIENTOS CLIENTE
-- Insertar
CREATE OR REPLACE FUNCTION SP_001(xcodigo int,xnombre varchar(30),xvendedor int)
RETURNS void AS $$
    BEGIN
      INSERT INTO clientes (codigo,nombre ,vendedor) 
      VALUES (xcodigo,xnombre,xvendedor);
    END;
    $$ LANGUAGE plpgsql;
    
-- Editar
CREATE OR REPLACE FUNCTION SP_002(xcodigo int,xnombre varchar(30),xvendedor int)
RETURNS void AS $$
    BEGIN
      UPDATE clientes
      SET nombre = xnombre ,vendedor = xvendedor 
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
    
-- Eliminar
CREATE OR REPLACE FUNCTION SP_003(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM clientes
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
    
-- Selecccionar UNO
CREATE OR REPLACE FUNCTION FS_001(xcodigo int)
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM clientes
      WHERE clientes.codigo = xcodigo;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION seleccionarTODOSCliente()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM clientes;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

----                           PROCEDIMIENTO VENDEDOR
-- Insertar
CREATE OR REPLACE FUNCTION SP_004(xcodigo int,xnombre varchar(30),xtotalVendido float)
RETURNS void AS $$
    BEGIN
      INSERT INTO vendedores (codigo,nombre ,totalVendido) 
      VALUES (xcodigo,xnombre,xtotalVendido);
    END;
    $$ LANGUAGE plpgsql;
-- Editar
CREATE OR REPLACE FUNCTION SP_005(xcodigo int,xnombre varchar(30),xtotalVendido float)
RETURNS void AS $$
    BEGIN
      UPDATE vendedores
      SET nombre = xnombre ,totalVendido = xtotalvendido 
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
-- Eliminar
CREATE OR REPLACE FUNCTION SP_006(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM vendedores
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
-- Selecccionar UNO
CREATE OR REPLACE FUNCTION FS_002(xcodigo int)
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM vendedores
      WHERE vendedores.codigo = xcodigo;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION seleccionarTODOSVendedor()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM vendedores;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;


--                              PROCEDIMIENTOS FACTURA

-- Insertar
CREATE OR REPLACE FUNCTION SP_007(xnumero int,	xtipo varchar(2),xfecha date,xtotal float,xcliente int)
RETURNS void AS $$
    BEGIN
      INSERT INTO facturas (numero,tipo,fecha,total,cliente) 
      VALUES (xnumero,xtipo,xfecha,xtotal,xcliente);
    END;
    $$ LANGUAGE plpgsql;
-- Editar
CREATE OR REPLACE FUNCTION SP_008(xnumero int,xtipo varchar(2),xfecha date,xtotal float,xcliente int)
RETURNS void AS $$
    BEGIN
      UPDATE facturas
      SET tipo = xtipo ,fecha = xfecha, total = xtotal, cliente = xcliente 
      WHERE facturas.numero = xnumero;
    END;
    $$ LANGUAGE plpgsql;
-- Eliminar
CREATE OR REPLACE FUNCTION SP_009(xnumero int)
RETURNS void AS $$
    BEGIN
      DELETE FROM facturas
      WHERE facturas.numero = xnumero;
    END;
    $$ LANGUAGE plpgsql;
-- Selecccionar UNO
CREATE OR REPLACE FUNCTION FS_003(xnumero int)
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM facturas
      WHERE facturas.numero = xnumero;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION seleccionarTODOSFacturas()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM facturas;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

--                              PROCEDIMIENTOS DETALLE
-- Insertar
CREATE OR REPLACE FUNCTION SP_010(xproducto int,xfactura int,xcantidad int,xtotal float)
RETURNS void AS $$
    BEGIN
      INSERT INTO detalles (producto,factura,cantidad,total) 
      VALUES (xproducto,xfactura,xcantidad,xtotal);
    END;
    $$ LANGUAGE plpgsql;
-- Editar
CREATE OR REPLACE FUNCTION SP_011(xproducto int,xfactura int,xcantidad int,xtotal float)
RETURNS void AS $$
    BEGIN
      UPDATE detalles
      SET cantidad = xcantidad ,total = xtotal 
      WHERE producto = xproducto AND factura = xfactura;
    END;
    $$ LANGUAGE plpgsql;
-- Eliminar
CREATE OR REPLACE FUNCTION SP_012(xproducto int,xfactura int)
RETURNS void AS $$
    BEGIN
      DELETE FROM detalles
      WHERE producto = xproducto AND factura = xfactura;
    END;
    $$ LANGUAGE plpgsql;
-- Selecccionar UNO
CREATE OR REPLACE FUNCTION FS_004(xproducto int,xfactura int)
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM detalles
      WHERE producto = xproducto AND factura = xfactura;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION seleccionarTODOSDetalle()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM detalles;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;


--                              PROCEDIMIENTOS PRODUCTO
-- Insertar
CREATE OR REPLACE FUNCTION SP_013(xcodigo int,xnombre varchar(30),xprecio float)
RETURNS void AS $$
    BEGIN
      INSERT INTO productos (codigo,nombre ,precio) 
      VALUES (xcodigo,xnombre,xprecio);
    END;
    $$ LANGUAGE plpgsql;
-- Editar
CREATE OR REPLACE FUNCTION SP_014(xcodigo int,xnombre varchar(30),xprecio int)
RETURNS void AS $$
    BEGIN
      UPDATE productos
      SET nombre = xnombre ,precio = xprecio 
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
-- Eliminar
CREATE OR REPLACE FUNCTION SP_015(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM productos
      WHERE codigo = xcodigo;
    END;
    $$ LANGUAGE plpgsql;
-- Selecccionar UNO
CREATE OR REPLACE FUNCTION FS_005(xcodigo int)
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM productos
      WHERE clientes.codigo = xcodigo;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION seleccionarTODOSProducto()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM productos;
      RETURN ref;
    END;
    $$ LANGUAGE plpgsql;

    
