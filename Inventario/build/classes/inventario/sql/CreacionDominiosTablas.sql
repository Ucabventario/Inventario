DROP DOMAIN IF EXISTS t_decision CASCADE ;

CREATE DOMAIN t_decision AS VARCHAR(2)
CHECK(
	VALUE = 'SI'OR
	VALUE = 'NO'
);

DROP DOMAIN IF EXISTS t_sede CASCADE ;

CREATE DOMAIN t_sede AS TEXT
CHECK(
	VALUE = 'Los Teques'OR
	VALUE = 'Montalban'OR
	VALUE = 'Guayana'
);

DROP DOMAIN IF EXISTS status_activo_t CASCADE;

CREATE DOMAIN status_activo_t AS TEXT
CHECK(
	VALUE = 'En Proceso de Registro'OR
	VALUE = 'Activo'OR
	VALUE = 'Dañado'OR
	VALUE = 'Obsoleto'OR
	VALUE = 'En Reparacion'OR
	VALUE = 'Desincorporado'
);

DROP DOMAIN IF EXISTS status_activo_int CASCADE;

CREATE DOMAIN status_activo_int AS TEXT
CHECK(
	VALUE	= 'En Proceso de Registro'OR
	VALUE = 'Vigente'OR
	VALUE = 'Vencidas'OR
	VALUE = 'Desincorporadas'
);

DROP DOMAIN IF EXISTS status_activo_inm CASCADE;

CREATE DOMAIN status_activo_inm AS TEXT
CHECK(
	VALUE = 'En Proceso de Registro'OR
	VALUE = 'En Construccion'OR
	VALUE = 'Habitada'OR
	VALUE = 'Deshabitadas'OR
	VALUE = 'Desincorporadas'
);

DROP DOMAIN IF EXISTS t_propiedad CASCADE ;

CREATE DOMAIN t_propiedad AS TEXT
CHECK(
	VALUE = 'Propia'OR
	VALUE = 'Comodato'
);

DROP DOMAIN IF EXISTS status_activo_nat CASCADE;

CREATE DOMAIN status_activo_nat AS TEXT
CHECK(
	VALUE = 'En Proceso de Registro'OR
	VALUE = 'Plantado'OR
	VALUE = 'Enfermo'OR
	VALUE = 'Extinto'
);

DROP DOMAIN IF EXISTS status_inventario  CASCADE;

CREATE DOMAIN status_inventario AS TEXT
CHECK(
	VALUE = 'En Ejecucion'OR
	VALUE = 'En Conciliacion'OR
	VALUE = 'Cerrado'
);

--------- FINAL DE LA DEFICION DE DOMINIOS ------------

DROP TABLE IF EXISTS responsablep CASCADE;

	CREATE TABLE responsablep (
		id_responsablep 		VARCHAR(5) NOT NULL,
		nombre					VARCHAR(30) NOT NULL,
		
		PRIMARY KEY (id_responsablep)
	);
	
DROP TABLE IF EXISTS responsableu CASCADE;

	CREATE TABLE responsableu (
		id_responsableu 		VARCHAR(5) NOT NULL,
		nombre							VARCHAR(30) NOT NULL,
		
		PRIMARY KEY (id_responsableu)
	);

DROP TABLE IF EXISTS sede CASCADE;
	
	CREATE TABLE sede (
		id_sede 		VARCHAR(5) NOT NULL,
		descripcion VARCHAR(30) NOT NULL,
		ubicacion		VARCHAR(30) NOT NULL,
		
		PRIMARY KEY(id_sede) 
	);
		
DROP TABLE IF EXISTS unidad_operativa CASCADE;

	CREATE TABLE unidad_operativa (
		id_unidad				VARCHAR(5) NOT NULL,
		id_sede					VARCHAR(5) NOT NULL,
		
		id_responsablep	VARCHAR(5) NOT NULL,
		
		fecha_ini				VARCHAR(10) NOT NULL,
		
		FOREIGN KEY (id_sede) REFERENCES sede (id_sede) ON UPDATE CASCADE ON DELETE CASCADE,
		FOREIGN KEY (id_responsablep) REFERENCES responsablep (id_responsablep) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_unidad)
	);

DROP TABLE IF EXISTS activo CASCADE;

	CREATE TABLE activo (
		id_activo					VARCHAR(5) NOT NULL,
		id_responsableu		VARCHAR(5) NOT NULL,
		descripcion				VARCHAR(30) NOT NULL,
		
		FOREIGN KEY (id_responsableu) REFERENCES responsableu (id_responsableu) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo)
	);
	
DROP TABLE IF EXISTS activo_tangible CASCADE;

	CREATE TABLE activo_tangible(
		id_activo				VARCHAR(5) NOT NULL,
		proveedor 			VARCHAR(30) NOT NULL,
		num_orden				VARCHAR(10) UNIQUE NOT NULL,
		num_factura			VARCHAR(10) UNIQUE NOT NULL,
		plazo_garantia	VARCHAR(200) NOT NULL,
		status 					status_activo_t NOT NULL,
		
		FOREIGN KEY  (id_activo	) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo)
		
	);
	
DROP TABLE IF EXISTS activo_intangible CASCADE;

	CREATE TABLE activo_intangible(
		id_activo				VARCHAR(5) NOT NULL,
		fecha_cad 			VARCHAR(10) NOT NULL,
		compartida			t_decision	NOT NULL,
		status					status_activo_int NOT NULL,
		
		FOREIGN KEY  (id_activo	) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo)
		);
	
DROP TABLE IF EXISTS activo_inmueble CASCADE;

	CREATE TABLE activo_inmueble(
		id_activo				VARCHAR(5) NOT NULL,
		ubicacion 			VARCHAR(30) NOT NULL,
		superficie 			VARCHAR(30) NOT NULL,
		propiedad				t_propiedad	NOT NULL,
		status					status_activo_inm NOT NULL,
		
		FOREIGN KEY  (id_activo	) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo)
	);
	
DROP TABLE IF EXISTS activo_natural CASCADE;

	CREATE TABLE activo_natural(
		id_activo				VARCHAR(5) NOT NULL,
		nombre_c	 			VARCHAR(30) NOT NULL,
		nombre_v				VARCHAR(30) NOT NULL,
		frutal		 			t_decision NOT NULL,
		floracion				VARCHAR(30) NOT NULL,
		f_plantacion		VARCHAR(10) NOT NULL,
		origen					VARCHAR(30) NOT NULL,
		status					status_activo_nat NOT NULL,
		ubicacion				VARCHAR(30) NOT NULL,
		
		FOREIGN KEY  (id_activo	) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo)
	);
		
DROP TABLE IF EXISTS componente CASCADE;

	CREATE TABLE componente (
		id_activo				VARCHAR(5) NOT NULL,
		nombre 					VARCHAR(30) NOT NULL,
		id_componente		VARCHAR(5),
		
		
		FOREIGN KEY  (id_activo) REFERENCES activo_tangible (id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY (id_activo , nombre)
		);
	
DROP TABLE IF EXISTS distribuido CASCADE;

	CREATE TABLE distribuido (
		id_sede					VARCHAR(5) NOT NULL,
		id_activo				VARCHAR(5) NOT NULL,
		f_incorp 				VARCHAR(10) NOT NULL,
		f_desincorp			VARCHAR(10) NOT NULL,
		
		
		FOREIGN KEY  (id_sede) REFERENCES sede (id_sede) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_activo) REFERENCES activo (id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY ( id_sede , id_activo)
		);
	
DROP TABLE IF EXISTS asignado CASCADE;

	CREATE TABLE asignado (
		id_unidad				VARCHAR(5) NOT NULL,
		id_activo				VARCHAR(5) NOT NULL,
		
		
		FOREIGN KEY  (id_unidad) REFERENCES unidad_operativa (id_unidad) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_activo) REFERENCES activo (id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		PRIMARY KEY ( id_unidad , id_activo)
		);
	
	
DROP TABLE IF EXISTS movilizacion CASCADE;

	CREATE TABLE movilizacion(
		id_unidadc						VARCHAR(5) NOT NULL,
		id_unidadr						VARCHAR(5) NOT NULL,
		id_responsableuc			VARCHAR(5) NOT NULL,
		id_responsableur			VARCHAR(5) NOT NULL,
		id_activo							VARCHAR(5) NOT NULL,
		f_movilizacion				VARCHAR(10) NOT NULL,
		aprobacionc						t_decision NOT NULL,
		aprobacionr 					t_decision NOT NULL,
		motivo 								VARCHAR(30) NOT NULL,
		
		FOREIGN KEY  (id_activo) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_unidadc) REFERENCES unidad_operativa(id_unidad) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_unidadr) REFERENCES unidad_operativa(id_unidad) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_responsableuc) REFERENCES responsableu(id_responsableu) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_responsableur) REFERENCES responsableu(id_responsableu) ON UPDATE CASCADE ON DELETE CASCADE,
	
		
		PRIMARY KEY (id_unidadc, id_unidadr, id_responsableuc, id_responsableur, id_activo	 )
	);
	
	DROP TABLE IF EXISTS iventario CASCADE;

	CREATE TABLE iventario (
		id_activo						VARCHAR(5) NOT NULL,
		id_unidad						VARCHAR(5) NOT NULL,
		id_responsableu			VARCHAR(5) NOT NULL,
		id_responsablep			VARCHAR(5) NOT NULL,
		f_inicio						VARCHAR(10) NOT NULL,
		f_fin								VARCHAR(10) NOT NULL,
		lapso								VARCHAR(10) NOT NULL,
		status 							status_inventario NOT NULL,
		cantidad						INTEGER NOT NULL,
		
		FOREIGN KEY  (id_activo) REFERENCES activo(id_activo) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_unidad) REFERENCES unidad_operativa(id_unidad) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_responsableu) REFERENCES responsableu(id_responsableu) ON UPDATE CASCADE ON DELETE CASCADE,
		
		FOREIGN KEY  (id_responsablep) REFERENCES responsablep(id_responsablep) ON UPDATE CASCADE ON DELETE CASCADE,
		
		
		PRIMARY KEY (id_activo, id_unidad, id_responsableu, id_responsablep )
	);
	
	
