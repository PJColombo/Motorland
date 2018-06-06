
#----------------------CLIENTES-----------------------------------

INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Paulo Colombo', 'Y3129411E', 'Collado Villalba, Las Mayas, 14', 4532872749255288, true);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Ernest Hemingway', '84362329P', 'Madrid, Los generales, 15-C', 4539238891417097, true);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Tony Soprano', '40265502T', 'Berlin, La belga, 12-F', 5280957152461720, true);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Luciano Pavarotti', '60075415J', 'La pequeña venecia, 233 -FF', 6011483018763070, true);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Aldous Huxley', '68986289C', 'Las puertas de la percepcion', 378055777311125, false);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Lucky Lucciano', '73992676C', 'St. John street boulevard, 16', 348429345971768, true);
INSERT INTO cliente (nombre, dni, domicilio, tarjeta, activo) VALUES ('Rory Gallagher', '01532053T', 'Goblin street, Dublin, 16B', 6011940716657441, false);



#DELETE FROM cliente WHERE idcliente > 0;

#----------------------VEHICULOS-----------------------------------

INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Capital', '9581ZGW', 'Azul', 6, 6660, true);
INSERT INTO coche (idvehiculo, puertas, gps) VALUES (LAST_INSERT_ID(), 4, true);


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Titan', '0542VPC', 'Rojo', 9, 1567, true);
INSERT INTO coche (idvehiculo, puertas, gps) VALUES (LAST_INSERT_ID(), 4, true);


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Eos', '5432AAW', 'Gris oscuro', 15, 2450, true);
INSERT INTO moto (idvehiculo, baul) VALUES (last_insert_id(), true); 

INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Bliss', '1237WER', 'Azul oscuro', 30,  3320, true);
INSERT INTO coche (idvehiculo, puertas, gps) VALUES (LAST_INSERT_ID(), 2, true);


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Catalyst', '4562FTT', 'Negro', 5, 2000,  true);
INSERT INTO moto (idvehiculo, baul) VALUES (last_insert_id(), false); 


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Majesty', '5542CCC', 'Granate', 22, 1350, true);
INSERT INTO coche (idvehiculo, puertas, gps) VALUES (LAST_INSERT_ID(), 2, true);


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Titan', '5627TTY', 'Blanco', 10, 3465, true);
INSERT INTO moto (idvehiculo, baul) VALUES (last_insert_id(), true); 


INSERT INTO vehiculo (modelo, matricula, color, numBaterias, coste, activo) VALUES ('Motion', '4257GHG', 'Amarillo', 9, 8500,  true);
INSERT INTO moto (idvehiculo, baul) VALUES (last_insert_id(), false); 


#DELETE FROM vehiculo WHERE idvehiculo > 0
#DELETE FROM coche WHERE idvehiculo > 0
#DELETE FROM moto WHERE idvehiculo > 0

#----------------------ALQUILERES-----------------------------------
/*
INSERT INTO alquiler (idCliente, fechaIni, fechaFin, costeTotal, pago, activo) VALUES (57, , , '', '', , '',true); 
INSERT INTO alquiler (idCliente, fechaIni, fechaFin, costeTotal, pago, activo) VALUES (58, , '', '', , '',true);
INSERT INTO alquiler (idCliente, fechaIni, fechaFin, costeTotal, pago, activo) VALUES (, , '', '', , '',true);
INSERT INTO alquiler (idCliente, fechaIni, fechaFin, costeTotal, pago, activo) VALUES ( , , '', '', , '',true);*/

#DELETE FROM alquiler where idAlquiler > 0
#DELETE FROM lineaalquiler where idAlquiler > 0
