CREATE DATABASE bdconcesionaria;
DROP DATABASE bdconcesionaria;
USE bdconcesionaria;

CREATE TABLE Vehiculo (
    idvehiculo INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);
drop table Vehiculo;

CREATE TABLE Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(15),
    direccion VARCHAR(100)
);

CREATE TABLE Venta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente INT,
    id_vehiculo INT,
    fecha_venta DATE NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    metodo_pago VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id),
    FOREIGN KEY (id_vehiculo) REFERENCES Vehiculo(idvehiculo)
);

CREATE TABLE Empleado (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario DECIMAL(10,2) NOT NULL
);

CREATE TABLE Servicio (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_servicio VARCHAR(50) NOT NULL,
    costo DECIMAL(10,2) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    duracion VARCHAR(20) NOT NULL
);

-- Insertar registros en la tabla Vehículo
INSERT INTO Vehiculo (marca, modelo, anio, precio) VALUES
('Toyota', 'Corolla', 2020, 20000),
('Honda', 'Civic', 2019, 18000),
('Ford', 'Focus', 2021, 22000),
('Chevrolet', 'Spark', 2018, 15000),
('Mazda', '3', 2022, 25000),
('BMW', 'X3', 2021, 35000),
('Audi', 'A4', 2020, 30000),
('Nissan', 'Sentra', 2019, 19000);

-- Insertar registros en la tabla Cliente
INSERT INTO Cliente (nombre, apellido, email, telefono, direccion) VALUES
('Juan', 'Perez', 'juan.perez@gmail.com', '987654321', 'Av. Siempre Viva 123'),
('Maria', 'Lopez', 'maria.lopez@gmail.com', '912345678', 'Calle Falsa 456'),
('Carlos', 'Garcia', 'carlos.garcia@gmail.com', '923456789', 'Av. Las Flores 789'),
('Ana', 'Torres', 'ana.torres@gmail.com', '934567890', 'Calle Los Sauces 321'),
('Pedro', 'Martinez', 'pedro.martinez@gmail.com', '945678901', 'Av. Los Pinos 654'),
('Lucia', 'Ramirez', 'lucia.ramirez@gmail.com', '956789012', 'Calle Los Olivos 987'),
('Miguel', 'Sanchez', 'miguel.sanchez@gmail.com', '967890123', 'Av. Las Palmas 246'),
('Laura', 'Diaz', 'laura.diaz@gmail.com', '978901234', 'Calle Las Acacias 135');

-- Insertar registros en la tabla Venta
INSERT INTO Venta (id_cliente, id_vehiculo, fecha_venta, total, metodo_pago) VALUES
(1, 1, '2023-09-01', 20000, 'Tarjeta'),
(2, 2, '2023-09-05', 18000, 'Efectivo'),
(3, 3, '2023-09-10', 22000, 'Transferencia'),
(4, 4, '2023-09-15', 15000, 'Tarjeta'),
(5, 5, '2023-09-20', 25000, 'Efectivo'),
(6, 6, '2023-09-25', 35000, 'Transferencia'),
(7, 7, '2023-09-30', 30000, 'Tarjeta'),
(8, 8, '2023-10-05', 19000, 'Efectivo');

-- Insertar registros en la tabla Empleado
INSERT INTO Empleado (nombre, apellido, cargo, salario) VALUES
('Luis', 'Fernandez', 'Vendedor', 1200),
('Sofia', 'Gomez', 'Gerente', 2500),
('Diego', 'Castro', 'Mecánico', 1300),
('Carla', 'Mendoza', 'Administradora', 2000),
('Javier', 'Suarez', 'Vendedor', 1200),
('Camila', 'Paz', 'Asistente', 1000),
('Pablo', 'Jimenez', 'Jefe de Taller', 1500),
('Daniela', 'Ortega', 'Vendedora', 1250);

-- Insertar registros en la tabla Servicio
INSERT INTO Servicio (nombre_servicio, costo, descripcion, duracion) VALUES
('Mantenimiento Básico', 100, 'Revisión y cambio de aceite', '1 hora'),
('Revisión de Frenos', 50, 'Revisión del sistema de frenos', '30 minutos'),
('Cambio de Neumáticos', 200, 'Cambio de los 4 neumáticos', '2 horas'),
('Alineación y Balanceo', 80, 'Alineación y balanceo de ruedas', '1 hora'),
('Revisión General', 150, 'Revisión general del vehículo', '2 horas'),
('Reparación de Motor', 500, 'Reparación completa del motor', '5 horas'),
('Revisión de Suspensión', 70, 'Revisión del sistema de suspensión', '1.5 horas'),
('Instalación de Accesorios', 120, 'Instalación de accesorios adicionales', '1 hora');
