CREATE TABLE reservation(
    id  INT,
    date_depart DATE,
    ville_depart VARCHAR,
    ville_destination VARCHAR,
    PRIMARY KEY(id)

);
ALTER TABLE reservation ADD COLUMN cost_id INT;