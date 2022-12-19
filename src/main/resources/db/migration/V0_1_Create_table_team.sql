CREATE TABLE team {
    id SERIAL,
    name VARCHAR,
    id primary key,
    id_team INT,
    FOREIGN KEY id_team REFERENCES team(id)

}