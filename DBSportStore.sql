Drop database if exists DBSportStore;
Create database DBSportStore;
use DBSportStore;

Drop database if exists DBSportStore;
Create database DBSportStore;
use DBSportStore;

Create table Marca(
	codigoMarca int not null auto_increment,
	nombreMarca varchar (255) not null,
	numeroContacto varchar(8) not null,
    primary key PK_codigoMarca (codigoMarca)
);

Create table Talla(
	codigoTalla int not null auto_increment,
	noTalla varchar(10) not null,
	primary key PK_codigoTalla (codigoTalla)
);

Create table FormaDePago(
	codigoFormaDePago int not null auto_increment,
	formaDePago varchar(100) not null,
    primary key PK_codigoFormaDePago (codigoFormaDePago)
);

Create table TipoProducto(
	codigoTProducto int not null auto_increment,
	descripcion varchar (255)  not null,
	codigoMarca int not null,
    primary key PK_codigoTProducto (codigoTProducto),
    constraint FK_TipoProducto_Marca foreign key (codigoMarca)
		references Marca(codigoMarca)
);

Create table Producto(
	codigoProducto int not null auto_increment,
	nombreProducto varchar(255) not null,
	stock int not null,
	precio double not null,
	codigoTProducto int not null,
	codigoTalla int,
	primary key PK_codigoProducto (codigoProducto),
    constraint FK_Producto_TipoProducto foreign key (codigoTProducto)
		references TipoProducto(codigoTProducto),
	constraint FK_Producto_Talla foreign key (codigoTalla)
		references Talla(codigoTalla)
);

Create table TipoUsuario(
	codigoTUsuario int not null auto_increment,
	tipoUsuario varchar (255) not null,
    primary key PK_TipoUsuario (codigoTUsuario)
);

Create table Usuario(
	codigoUsuario int not null auto_increment,
	nombreUsuario varchar(255) not null,
	apellidoUsuario varchar(255) not null,
	NIT varchar (10) not null,
	telefonoContacto varchar(8) not null,
	usuario varchar (50) not null,
	passwordU varchar(50) not null,
    correoElectronico varchar(100) not null,
	codigoTUsuario int not null,
    primary key PK_codigoUsuario (codigoUsuario),
    constraint FK_Usuario_TipoUsuario foreign key (codigoTUsuario)
		references TipoUsuario (codigoTUsuario)
);

Create table Departamento(
    codigoDepartamento int not null auto_increment,
    departamento varchar (255) not null,
	municipio varchar (255),
    codigoUsuario int not null,
    primary key PK_Departamento (codigoDepartamento),
	constraint FK_Departamento_Usuario foreign key (codigoUsuario)
		references Usuario(codigoUsuario)
);

Create table Factura(
	codigoFactura int not null auto_increment,
	fechaFactura date not null,
	estado int not null,
	codigoUsuario int not null,
    codigoFormaDePago int not null,
    primary key PK_codigoFactura (codigoFactura),
    constraint FK_Factura_FormaDePago foreign key (codigoFormaDePago)
		references FormaDePago (codigoFormaDePago)
);

Create table DetalleFactura(
	codigoDFactura int not null auto_increment,
	codigoProducto int not null,
	codigoFactura int not null,
    primary key PK_codigoDFactura (codigoDFactura),
    constraint FK_DetalleFactura_Factura foreign key (codigoFactura)
		references Factura (codigoFactura),
	constraint FK_DetalleFactura_Producto foreign key (codigoProducto)
		references Producto (codigoProducto)
);

Insert into Marca (nombreMarca, numeroContacto) values ('Nike', '52634125');
Insert into Marca (nombreMarca, numeroContacto) values ('Adidas', '52364125');
Insert into Marca (nombreMarca, numeroContacto) values ('Skechers', '25361425');
Insert into Marca (nombreMarca, numeroContacto) values ('Reebok', '11225656');
Insert into Marca (nombreMarca, numeroContacto) values ('Fila', '96142563');

Insert into Talla (noTalla) values ('S');
Insert into Talla (noTalla) values ('M');
Insert into Talla (noTalla) values ('L');
Insert into Talla (noTalla) values ('Xl');
Insert into Talla (noTalla) values ('XXL');

Insert into FormaDePago (formaDePago) values ('Paypal');
Insert into FormaDePago (formaDePago) values ('ContraEntrega');
Insert into FormaDePago (formaDePago) values ('MasterCard');
Insert into FormaDePago (formaDePago) values ('Visa');
Insert into FormaDePago (formaDePago) values ('MasterCard');

Insert into TipoProducto (descripcion, codigoMarca) values ('Camisa blanca de algodón', 1);
Insert into TipoProducto (descripcion, codigoMarca) values ('Camisa Negra de algodón', 1);
Insert into TipoProducto (descripcion, codigoMarca) values ('Pans de lana', 2);
Insert into TipoProducto (descripcion, codigoMarca) values ('Sudadera de color azul', 4);
Insert into TipoProducto (descripcion, codigoMarca) values ('Pelota de Fútbol', 2);

Insert into Producto (nombreProducto, stock, precio, codigoTProducto, codigoTalla) values ('Camisa', 20, 150.00, 1, 2);
Insert into Producto (nombreProducto, stock, precio, codigoTProducto, codigoTalla) values ('Camisa', 30, 160.00, 1, 2);
Insert into Producto (nombreProducto, stock, precio, codigoTProducto, codigoTalla) values ('Pans', 40, 120.00, 3, 3);
Insert into Producto (nombreProducto, stock, precio, codigoTProducto, codigoTalla) values ('Sudadera', 30.00, 160, 1, 2);
Insert into Producto (nombreProducto, stock, precio, codigoTProducto) values ('Pelota', 30, 160.00, 1);

Insert into TipoUsuario (tipoUsuario) values ('Master');
Insert into TipoUsuario (tipoUsuario) values ('Trabajador');
Insert into TipoUsuario (tipoUsuario) values ('Cliente');

Insert into Usuario (nombreUsuario, apellidoUsuario, NIT, telefonoContacto, usuario, passwordU, correoElectronico, codigoTUsuario)
	values ('Carlos', 'lopez', '1234567890', '12345678', 'clopez', '123', 'carloslop@gmail.com', '3');
Insert into Usuario (nombreUsuario, apellidoUsuario, NIT, telefonoContacto, usuario, passwordU, correoElectronico, codigoTUsuario)
	values ('Juan', 'Castillo', '1234567890', '12345678', 'jcastillo', '123', 'juancastillo@gmail.com','3');   
Insert into Usuario (nombreUsuario, apellidoUsuario, NIT, telefonoContacto, usuario, passwordU, correoElectronico, codigoTUsuario)
	values ('Adilson', 'Cucul', '1452369887', '25366352', 'ecucul', '54321','adilsoncucul@gmail.com', '3');  
Insert into Usuario (nombreUsuario, apellidoUsuario, NIT, telefonoContacto, usuario, passwordU, correoElectronico, codigoTUsuario)
	values ('Gabriela', 'Pinzon', '25361425', '98785465', 'gpinzon', '987654', 'gabrielapinzon@gmail.com', '2');     
Insert into Usuario (nombreUsuario, apellidoUsuario, NIT, telefonoContacto, usuario, passwordU, correoElectronico, codigoTUsuario)
	values ('Stuart', 'Pinzon', '8754219632', '36251425', 'spinzon', '12345', 'stuartpinzon@gmail.com', '1');  

Insert into Departamento ( departamento, municipio, codigoUsuario) values ('Guatemala', 'Mixco', 1);
Insert into Departamento ( departamento, municipio, codigoUsuario) values ('Petén', 'Flores Petén', 2);
Insert into Departamento ( departamento, municipio, codigoUsuario) values ('Guatemala', 'Villa Nueva', 3);
Insert into Departamento ( departamento, municipio, codigoUsuario) values ('Chimaltenango', 'Patzun', 4);
Insert into Departamento ( departamento, municipio, codigoUsuario) values ('Zacapa', 'Gualan', 5);

Insert into Factura(fechaFactura, estado, codigoUsuario, codigoFormaDePago)
	values ('2022-03-13', 1, 1, 1);
Insert into Factura(fechaFactura, estado, codigoUsuario, codigoFormaDePago)
	values ('2022-04-15', 1, 2, 2);
Insert into Factura(fechaFactura, estado, codigoUsuario, codigoFormaDePago)
	values ('2022-09-20', 1, 4, 1);
Insert into Factura(fechaFactura, estado, codigoUsuario , codigoFormaDePago)
	values ('2022-09-20', 1, 3, 1);
Insert into Factura(fechaFactura, estado, codigoUsuario, codigoFormaDePago)
	values ('2022-09-20', 1, 5, 3);
    
Insert into DetalleFactura (codigoProducto, codigoFactura) values (1,1);
Insert into DetalleFactura (codigoProducto, codigoFactura) values (2,2);
Insert into DetalleFactura (codigoProducto, codigoFactura) values (3,3);
Insert into DetalleFactura (codigoProducto, codigoFactura) values (4,4);
Insert into DetalleFactura (codigoProducto, codigoFactura) values (5,5);




