CREATE TABLE users(
    id  INT,
    first_name VARCHAR,
    last_name VARCHAR,
    phone_number VARCHAR,
    sexe CHARACTER,
    PRIMARY KEY(id)
    
);
ALTER TABLE users ADD COLUMN reservation_id INT;