CREATE TABLE IF NOT EXISTS useraccount(
    id INT(11) NOT NULL AUTO_INCREMENT,
    mobilenumber  VARCHAR(32) NOT NULL,
    email  VARCHAR(32) NOT NULL,
    password VARCHAR(32) NOT NULL,
    PRIMARY KEY (id));
    
    
     useraccount-service:
      image: accountservice:1.0.0
      depends_on:
        - db-mysql
      ports:
        - "8080:8090"
      environment:
        - DATABASE_HOST=demo-mysql
        - DATABASE_USER=root
        - DATABASE_PASSWORD=pat169
        - DATABASE_NAME=rapport
        - DATABASE_PORT=3306  
          