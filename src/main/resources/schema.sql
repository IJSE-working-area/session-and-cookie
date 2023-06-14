CREATE TABLE  user(
                      username VARCHAR(50) NOT NULL PRIMARY KEY ,
                      password VARCHAR(50) NOT NULL ,
                      full_name VARCHAR(50)NOT NULL
);

CREATE TABLE  customer(
                      id int  PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(50) NOT NULL ,
                      address VARCHAR(50)NOT NULL
);