-- Insertar empleados
INSERT INTO empleado (ci, nombre, apellido, telefono, email) VALUES
                                                                 ('12345678', 'Juan', 'Pérez', '555-1234', 'juan.perez@example.com'),
                                                                 ('87654321', 'Ana', 'García', '555-5678', 'ana.garcia@example.com'),
                                                                 ('11223344', 'Luis', 'Martínez', '555-9101', 'luis.martinez@example.com');

-- Insertar clientes
INSERT INTO cliente (nit, apellido) VALUES
                                        ('001', 'González'),
                                        ('002', 'Ramírez'),
                                        ('003', 'Hernández');

-- Insertar productos
INSERT INTO producto (codigo, nombre, precio) VALUES
                                                  ('A001', 'Producto A', 10.0),
                                                  ('B002', 'Producto B', 20.0),
                                                  ('C003', 'Producto C', 30.0);

-- Insertar ventas
INSERT INTO venta (id, emp, clien, prod, cantidad) VALUES
                                                       (1, '12345678', '001', 'A001', 2),
                                                       (2, '87654321', '002', 'B002', 1),
                                                       (3, '11223344', '003', 'C003', 5);
