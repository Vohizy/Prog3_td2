CREATE TABLE player(
    id SERIAL,
    names VARCHAR,
    numbers INT,
    id primary key,
    id_team INT,
    FOREIGN KEY id_team REFERENCES team(id)

)