INSERT INTO category (description) VALUES ('American');
INSERT INTO category (description) VALUES ('Italian');
INSERT INTO category (description) VALUES ('Mexican');
INSERT INTO category (description) VALUES ('Fast Food');
INSERT INTO unit_of_measure (description) VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description) VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description) VALUES ('Cup');
INSERT INTO unit_of_measure (description) VALUES ('Pinch');
INSERT INTO unit_of_measure (description) VALUES ('Ounce');
INSERT INTO unit_of_measure (description, uom) VALUES ('Piece(s)','Pc(s)');
-- recipe
--INSERT INTO recipe (cook_time,description, directions) VALUES (20, 'Mexican Gsuacamole','Guacamole is best eaten right after it&apos;s made. Like apples, avocados start to oxidize and turn brown once they&apos;ve been cut. That said, the acid in the lime juice you add to guacamole can help slow down that process. And if you store the guacamole properly, you can easily make it a few hours ahead if you are preparing for a party. The trick to keeping guacamole green is to make sure air doesn&apos;t touch it! Transfer it to a container, cover with plastic wrap, and press down on the plastic wrap to squeeze out any air pockets. Make sure any exposed surface of the guacamole is touching the plastic wrap, not air. This will keep the amount of browning to a minimum. You can store the guacamole in the fridge this way for up to three days. If the guacamole develops discoloration, you can either scrape off the brown parts and discard, or stir into the rest of the guacamole before serving.');
--INSERT INTO recipe (cook_time,description, directions) VALUES (20, 'Tortillas','Tortillas is a different food and is best eaten right after it&apos;s made. Like apples, avocados start to oxidize and turn brown once they&apos;ve been cut. That said, the acid in the lime juice you add to guacamole can help slow down that process. Make sure any exposed surface of the guacamole is touching the plastic wrap, not air. This will keep the amount of browning to a minimum. You can store the guacamole in the fridge this way for up to three days. If the guacamole develops discoloration, you can either scrape off the brown parts and discard, or stir into the rest of the guacamole before serving.');
---- recipe_category
--INSERT INTO recipe_categories (recipe_id, category_id) VALUES (1,3);
---- ingredient
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (.5,'Kosher salt',1,1);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'fresh lime juice or lime juice',1,2);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2 ,'to 1 cup of minced red onion or thinly spiced green onion',1,2);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2,'serrano chiles, stems and seeds removed, minced',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2,'Avocado',1,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (.5,'Kosher salt',2,1);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'fresh lime juice or lime juice',2,2);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2 ,'to 1 cup of minced red onion or thinly spiced green onion',2,2);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (2,'serrano chiles, stems and seeds removed, minced',2,6);
--INSERT INTO ingredient (amount, description, recipe_id,uom_id) VALUES (1,'Avocado',2,6);