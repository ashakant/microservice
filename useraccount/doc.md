CREATE TABLE IF NOT EXISTS useraccount(
    id INT(11) NOT NULL AUTO_INCREMENT,
    mobilenumber  VARCHAR(32) NOT NULL,
    email  VARCHAR(32) NOT NULL,
    password VARCHAR(32) NOT NULL,
    PRIMARY KEY (id));
    