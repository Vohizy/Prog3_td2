CREATE TABLE have(
    id SERIAL,
    id_sponsor INT,
    id_team INT,
    FOREIGN KEY id_sponsor REFERENCES sponsor(id),
    FOREIGN KEY id_team REFERENCES team(id)
)
