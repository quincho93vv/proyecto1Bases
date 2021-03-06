﻿-----------------------------------------------------------
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Cliente.';
    END;
$$ LANGUAGE plpgsql;
    
-- Editar
CREATE OR REPLACE FUNCTION SP_002(xcodigo int,xnombre varchar(30),xvendedor int)
RETURNS void AS $$
    BEGIN
      UPDATE clientes
      SET nombre = xnombre ,vendedor = xvendedor 
      WHERE codigo = xcodigo;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Editar Cliente.';
    END;
$$ LANGUAGE plpgsql;
    
-- Eliminar
CREATE OR REPLACE FUNCTION SP_003(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM clientes
      WHERE codigo = xcodigo;
      IF SQL%ROWCOUNT = 0 THEN
          RAISE NO_DATA_FOUND;
      END IF;
	EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Cliente.';
	WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Cliente.';
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Cliente.';
    END;
$$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION FS_006()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM clientes;
      RETURN ref;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Clientes.';
    END;
$$ LANGUAGE plpgsql;

	
----                           PROCEDIMIENTO VENDEDOR
-- Insertar
CREATE OR REPLACE FUNCTION SP_004(xcodigo int,xnombre varchar(30),xtotalVendido float)
RETURNS void AS $$
    BEGIN
      INSERT INTO vendedores (codigo,nombre ,totalVendido) 
      VALUES (xcodigo,xnombre,xtotalVendido);
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Vendedor.';
    END;
$$ LANGUAGE plpgsql;
	
-- Editar
CREATE OR REPLACE FUNCTION SP_005(xcodigo int,xnombre varchar(30),xtotalVendido float)
RETURNS void AS $$
    BEGIN
      UPDATE vendedores
      SET nombre = xnombre ,totalVendido = xtotalvendido 
      WHERE codigo = xcodigo;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Editar Vendedor.';
    END;
$$ LANGUAGE plpgsql;

-- Eliminar
CREATE OR REPLACE FUNCTION SP_006(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM vendedores
      WHERE codigo = xcodigo;
	IF SQL%ROWCOUNT = 0 THEN
          RAISE NO_DATA_FOUND;
	END IF;
	EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Vendedor.';
	WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Vendedor.';
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Vendedor.';
    END;
$$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION FS_007()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM vendedores;
      RETURN ref;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Vendedores.';
    END;
    $$ LANGUAGE plpgsql;

	
	
--                              PROCEDIMIENTOS FACTURA

-- Insertar
CREATE OR REPLACE FUNCTION SP_007(xnumero int,	xtipo varchar(2),xfecha date,xtotal float,xcliente int)
RETURNS void AS $$
    BEGIN
      INSERT INTO facturas (numero,tipo,fecha,total,cliente) 
      VALUES (xnumero,xtipo,xfecha,xtotal,xcliente);
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Factura.';
    END;
$$ LANGUAGE plpgsql;

-- Editar
CREATE OR REPLACE FUNCTION SP_008(xnumero int,xtipo varchar(2),xfecha date,xtotal float,xcliente int)
RETURNS void AS $$
    BEGIN
      UPDATE facturas
      SET tipo = xtipo ,fecha = xfecha, total = xtotal, cliente = xcliente 
      WHERE facturas.numero = xnumero;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Editar Factura.';
    END;
$$ LANGUAGE plpgsql;
	
-- Eliminar
CREATE OR REPLACE FUNCTION SP_009(xnumero int)
RETURNS void AS $$
    BEGIN
      DELETE FROM facturas
      WHERE facturas.numero = xnumero;
      IF SQL%ROWCOUNT = 0 THEN
          RAISE NO_DATA_FOUND;
      END IF;
	EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Factura.';
	WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Factura.';
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Factura.';
    END;
$$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION FS_008()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM facturas;
      RETURN ref;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Selecionar Facturas.';
    END;
$$ LANGUAGE plpgsql;
	
	
	
--                              PROCEDIMIENTOS DETALLE
-- Insertar
CREATE OR REPLACE FUNCTION SP_010(xproducto int,xfactura int,xcantidad int,xtotal float)
RETURNS void AS $$
    BEGIN
      INSERT INTO detalles (producto,factura,cantidad,total) 
      VALUES (xproducto,xfactura,xcantidad,xtotal);
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Detalle.';
    END;
$$ LANGUAGE plpgsql;
	
-- Editar
CREATE OR REPLACE FUNCTION SP_011(xproducto int,xfactura int,xcantidad int,xtotal float)
RETURNS void AS $$
    BEGIN
      UPDATE detalles
      SET cantidad = xcantidad ,total = xtotal 
      WHERE producto = xproducto AND factura = xfactura;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Editar Detalle.';
    END;
$$ LANGUAGE plpgsql;

-- Eliminar
CREATE OR REPLACE FUNCTION SP_012(xproducto int,xfactura int)
RETURNS void AS $$
    BEGIN
      DELETE FROM detalles
      WHERE producto = xproducto AND factura = xfactura;
	IF SQL%ROWCOUNT = 0 THEN
          RAISE NO_DATA_FOUND;
      END IF;
	EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Detalle.';
	WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Detalle.';
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Detalle.';
    END;
$$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION FS_009()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM detalles;
      RETURN ref;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Detalles.';
    END;
$$ LANGUAGE plpgsql;


	
	
--                              PROCEDIMIENTOS PRODUCTO
-- Insertar
CREATE OR REPLACE FUNCTION SP_013(xcodigo int,xnombre varchar(30),xprecio float)
RETURNS void AS $$
    BEGIN
      INSERT INTO productos (codigo,nombre ,precio) 
      VALUES (xcodigo,xnombre,xprecio);
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Producto.';
    END;
$$ LANGUAGE plpgsql;

-- Editar
CREATE OR REPLACE FUNCTION SP_014(xcodigo int,xnombre varchar(30),xprecio int)
RETURNS void AS $$
    BEGIN
      UPDATE productos
      SET nombre = xnombre ,precio = xprecio 
      WHERE codigo = xcodigo;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Editar Producto.';
    END;
$$ LANGUAGE plpgsql;

-- Eliminar
CREATE OR REPLACE FUNCTION SP_015(xcodigo int)
RETURNS void AS $$
    BEGIN
      DELETE FROM productos
      WHERE codigo = xcodigo;
      IF SQL%ROWCOUNT = 0 THEN
          RAISE NO_DATA_FOUND;
      END IF;
	EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Producto.';
	WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Eliminar Porducto.';
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
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Seleccionar Producto.';
    END;
$$ LANGUAGE plpgsql;

-- Selecccionar TODOS
CREATE OR REPLACE FUNCTION FS_010()
RETURNS refcursor AS $$
    DECLARE
      ref refcursor;
    BEGIN
      OPEN ref FOR SELECT * FROM productos;
      RETURN ref;
	EXCEPTION WHEN OTHERS THEN
		RAISE EXCEPTION 'DB: Error al Insertar Productos.';
    END;
$$ LANGUAGE plpgsql;

