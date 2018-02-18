CREATE TABLE IF NOT EXISTS useraccount(
    id INT(11) NOT NULL AUTO_INCREMENT,
    mobilenumber  VARCHAR(32) NOT NULL,
    email  VARCHAR(32) NOT NULL,
    password VARCHAR(32) NOT NULL,
    PRIMARY KEY (id));
    
    
    
    CREATE TABLE IF NOT EXISTS useragents(
    id INT(11) NOT NULL AUTO_INCREMENT,
    devicetype  VARCHAR(32) NOT NULL,
    platform  VARCHAR(32) NOT NULL,
    version VARCHAR(32) NOT NULL,
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
          
          
#spring.jpa.hibernate.ddl-auto=none
#spring.datasource.url = jdbc:mysql://localhost:3306/rapport?useSSL=false
#spring.datasource.username=root
#spring.datasource.password=pat169
#spring.datasource.name=rapport
#server.port=8090

#spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.DefaultNamingStrategy
          