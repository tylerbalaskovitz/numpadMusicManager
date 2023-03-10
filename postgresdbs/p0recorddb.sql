CREATE TABLE record_names (
record_id serial PRIMARY KEY, --The serial KEY FOR identifying the cord inserted INTO the table
artist_name TEXT,
album_name TEXT, 
genre_type1 TEXT,
genre_type2 TEXT,
genre_type3 TEXT,
record_speed TEXT --USING A TEXTtype for the record speed because I'm not doing math inside of it. 
--and not an int.
);

SELECT * FROM record_names;

DROP TABLE record_names;

TRUNCATE TABLE record_names;

CREATE TABLE record_sales (
record_sales_id serial PRIMARY KEY, --There IS NO MORE composite KEY EACH record will be identified BY a UNIQUE number
purchase_location TEXT,
purchase_price TEXT,
sale_location TEXT,
sale_price TEXT, 
record_name_id_fk int REFERENCES record_names(record_id) ---FK used TO JOIN the two TABLES together BY the PK in the record_names 
--Just some basic text fields for the database one for sales and the other for deleting / 'selling' the record
);

INSERT INTO record_sales (purchase_location, purchase_price, sale_location, sale_price, record_name_id_fk)
VALUES ('null', 'null', 'null', 'null', 5);

SELECT * FROM record_sales;

DROP TABLE record_sales;

TRUNCATE TABLE record_sales;

CREATE TABLE login_table (
login_id serial UNIQUE PRIMARY KEY, --PRIMARY KEY so EACH USER can login TO the DATABASE.
username TEXT UNIQUE,
pword TEXT
);
SELECT * FROM login_table;



DROP TABLE login_table;
