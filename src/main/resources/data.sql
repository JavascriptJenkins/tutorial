DROP TABLE IF EXISTS real_estate;
DROP SEQUENCE IF EXISTS HIBERNATE_SEQUENCE;

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

CREATE TABLE real_estate (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fname VARCHAR(250) NOT NULL,
  lname VARCHAR(250) NOT NULL,
  yrblt VARCHAR(250) NOT NULL,
  isnew BOOLEAN NOT NULL,
  sqft INT NOT NULL,
  baths INT NOT NULL,
  beds INT NOT NULL,
  street VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  zip INT NOT NULL,
  listing VARCHAR(250) NOT NULL,
  imageurl VARCHAR(250) NOT NULL
);

-- INSERT INTO real_estate (fname,
--                          lname,
--                          yrblt,
--                          isnew,
--                          sqft,
--                          baths,
--                          beds,
--                          street,
--                          city,
--                          state,
--                          zip,
--                          listing) VALUES
--   ('Dave','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC'),
--   ('Steve','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC'),
--   ('Bill','Evans','2018-06-06T22:45:52.247Z',true,6200,7,4,'1484 Massa Ct','Collierville','TN',38027,'MIDSOUTH RESIDENTIAL LLC');