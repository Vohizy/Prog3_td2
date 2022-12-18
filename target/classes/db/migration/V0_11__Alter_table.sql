
ALTER TABLE users ADD CONSTRAINT reservation_id
FOREIGN KEY(reservation_id) REFERENCES reservation(id);


ALTER TABLE reservation ADD CONSTRAINT cost_id
FOREIGN KEY(cost_id) REFERENCES cost(id);

UPDATE users SET reservation_id=1;
UPDATE reservation SET cost_id=1;