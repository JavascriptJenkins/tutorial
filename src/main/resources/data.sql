DROP TABLE IF EXISTS real_estate;

CREATE TABLE real_estate (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  address1 VARCHAR(250) NOT NULL,
  address2 VARCHAR(250) DEFAULT NULL,
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  title_owner VARCHAR(250) NOT NULL
);

INSERT INTO real_estate (address1, address2, city, state, title_owner) VALUES
  ('3032 Portland Ave', '', 'Minneapolis','MN','Dave Evans'),
  ('178 Rose St', 'Apt 2', 'Portland','OR','Margaret McDonald'),
  ('333 Rush Ave', 'Unit 7', 'New York','NY','Abdi Mallad');