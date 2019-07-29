-- user data
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('password','123 main street','Doctor',1124,'John Doe','1990-02-01');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('newpassword','77 Queen street','Dentist',1127,'Mike Mah','1992-05-10');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('qwerty123','88 North Park street','Surgeon',1244,'Dell demps','1982-07-22');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('newpassword','55 Broadview lane','Basketball player',1789,'LeBron James','1990-05-11');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('123seratoni','67 Hollwood Bolevord','Actor',1456,'Tom Hardy','1990-11-22');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('penne123','47 Highview Lane','Doctor',1444,'Tom Hanks','2000-02-01');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('noodles456','11111 Honor street','Healthcare',1445,'Maira Hanna','1997-02-01');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('pizza789','5250 Kipling Ave','Business owner',1544,'Debra Munch','1995-11-11');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('rockband123','5555 Rockwood lane','Dental assistent',1566,'Mary Poppins','1966-02-01');
INSERT INTO `my_bnb`.`users` (`password`,`address`,`occupation`,`sin_num`,`name`,`dob`) VALUES ('mypassword78','4566 Underwood cresent','Doctor',1274,'Kendra Grey','1992-05-04');

-- renter data
INSERT INTO `my_bnb`.`renter`(`u_id`,`payment`) VALUES(1,"Credit Card: 1234");
INSERT INTO `my_bnb`.`renter`(`u_id`) VALUES(5);
INSERT INTO `my_bnb`.`renter`(`u_id`) VALUES(6);
INSERT INTO `my_bnb`.`renter`(`u_id`) VALUES(7);
INSERT INTO `my_bnb`.`renter`(`u_id`) VALUES(9);

-- hosts data
INSERT INTO  `my_bnb`.`hosts` (`u_id`) VALUES (2);
INSERT INTO  `my_bnb`.`hosts` (`u_id`) VALUES (3);
INSERT INTO  `my_bnb`.`hosts` (`u_id`) VALUES (4);
INSERT INTO  `my_bnb`.`hosts` (`u_id`) VALUES (8);
INSERT INTO  `my_bnb`.`hosts` (`u_id`) VALUES (10);

-- listings data
INSERT INTO `my_bnb`.`listings`(`list_name`,`city`,`postal_code`,`country`,`description`,`longitude`,`latitude`,`amenities`,`rent_amount`) VALUES ('Downtown toronto condo for rent per day','Toronto','M2G4V2','Canada','Very nice and clean apartment',22.123,44.111,'Free Wi-fi, Stocked kitchen with stove, 3-bedrooms, 2-washrooms',149.99);
INSERT INTO `my_bnb`.`listings`(`list_name`,`city`,`postal_code`,`country`,`description`,`longitude`,`latitude`,`amenities`,`rent_amount`) VALUES ('Midtown north york','Toronto','M2A4T2','Canada','Nice and clean house',20.144,15.111,'Free Wi-fi, 5-bedrooms, 4-washrooms, Stove, Fridge',200.00);
INSERT INTO `my_bnb`.`listings`(`list_name`,`city`,`postal_code`,`country`,`description`,`longitude`,`latitude`,`amenities`,`rent_amount`) VALUES ('Downtown Chicago apartment for rent','Chicago','T2A4V6','USA','New condo, everything is new',11.111,22.111,'Free Wi-fi, kitchen with stove, fridge, 2-bedrooms, 1-washrooms',249.99);
INSERT INTO `my_bnb`.`listings`(`list_name`,`city`,`postal_code`,`country`,`description`,`longitude`,`latitude`,`amenities`,`rent_amount`) VALUES ('Uptown New york house','New York','O2U4V2','USA','Newly renovated house',24.123,33.111,'Wi-fi, kitchen with stove, 5-bedrooms, 2-washrooms',449.99);
INSERT INTO `my_bnb`.`listings`(`list_name`,`city`,`postal_code`,`country`,`description`,`longitude`,`latitude`,`amenities`,`rent_amount`) VALUES ('Lakeview cottage California','California','M4ARV2','USA','Beachhouse with an amazing view',14.111,33.111,'Wi-fi included, Stocked kitchen with stove, beer fridge, 5-bedrooms, 3-washrooms',749.99);

-- listings dates
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-11-22',1);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-12-22',1);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-10-20',1);

INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-09-22',2);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-11-22',2);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-10-11',2);

INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-09-22',3);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-11-22',3);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-02-04',3);

INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-02-01',4);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-02-04',4);
INSERT INTO `my_bnb`.`listing_dates`(`dates`,`listings_list_id`)VALUES('2019-03-22',4);

-- hosts has listings


INSERT INTO `my_bnb`.`hosts_has_listings` (`hosts_u_id`,`listings_list_id`) VALUES (2,1);
INSERT INTO `my_bnb`.`hosts_has_listings` (`hosts_u_id`,`listings_list_id`) VALUES (3,2);
INSERT INTO `my_bnb`.`hosts_has_listings` (`hosts_u_id`,`listings_list_id`) VALUES (4,3);
INSERT INTO `my_bnb`.`hosts_has_listings` (`hosts_u_id`,`listings_list_id`) VALUES (8,4);
INSERT INTO `my_bnb`.`hosts_has_listings` (`hosts_u_id`,`listings_list_id`) VALUES (10,5);


-- booking dates
INSERT INTO `my_bnb`.`bookings`(`u_id`,`booking_date`,`listings_list_id`,`cancelled`) VALUES(1,'2019-04-11',5,'No');
INSERT INTO `my_bnb`.`bookings`(`u_id`,`booking_date`,`listings_list_id`,`cancelled`) VALUES(5,'2019-04-11',3,'No');
INSERT INTO `my_bnb`.`bookings`(`u_id`,`booking_date`,`listings_list_id`,`cancelled`) VALUES(6,'2019-11-11',1,'No');
INSERT INTO `my_bnb`.`bookings`(`u_id`,`booking_date`,`listings_list_id`,`cancelled`) VALUES(7,'2019-02-11',2,'Yes');


-- renter has listings
INSERT INTO `my_bnb`.`renter_has_listings`(`renter_u_id`,`listings_list_id`,`comment`,`rating`) VALUES(1,1,"Clean space",5);
INSERT INTO `my_bnb`.`renter_has_listings`(`renter_u_id`,`listings_list_id`,`comment`,`rating`) VALUES(5,2,"Dirty space",2);


-- hosts comments
INSERT INTO `my_bnb`.`host_comments`(`comment`,`listings_list_id`,`commenter_id`,`commentee_id`)VALUES("Very nice user",2,2,1);

-- renter comments
INSERT INTO `my_bnb`.`renter_comments`(`comment`,`listings_list_id`,`commenter_id`,`commentee_id`)VALUES("Friendly host",2,1,2);
















