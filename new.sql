CREATE SCHEMA IF NOT EXISTS `my_bnb` ;
USE `my_bnb` ;

-- -----------------------------------------------------
-- Table `my_bnb`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`users` (
  `u_id` INT NOT NULL AUTO_INCREMENT,
  `password` VARCHAR(16) NOT NULL,
  `address` VARCHAR(45) NULL,
  `occupation` VARCHAR(45) NULL,
  `sin_num` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `dob` DATE NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  UNIQUE INDEX `sin_num_UNIQUE` (`sin_num` ASC));


-- -----------------------------------------------------
-- Table `my_bnb`.`renter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`renter` (
  `u_id` INT NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  FOREIGN KEY (`u_id`) REFERENCES `my_bnb`.`users` (`u_id`)
);



-- -----------------------------------------------------
-- Table `my_bnb`.`hosts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`hosts` (
  `u_id` INT NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  FOREIGN KEY (`u_id`) REFERENCES `my_bnb`.`users` (`u_id`)
 );


-- -----------------------------------------------------
-- Table `my_bnb`.`listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`listings` (
  `list_id` INT NOT NULL AUTO_INCREMENT,
  `list_name` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `postal_code` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `description` VARCHAR(100) NOT NULL,
  `longitude` DECIMAL(10,4) NULL,
  `latitude` DECIMAL(10,4) NULL,
  `amenities` VARCHAR(100) NULL,
  `rent_amount` DECIMAL(12,2) NULL,
  PRIMARY KEY (`list_id`),
  UNIQUE INDEX `list_id_UNIQUE` (`list_id` ASC)
  );


-- -----------------------------------------------------
-- Table `my_bnb`.`listing_dates`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`listing_dates` (
  `dates` DATE NULL,
  `listings_list_id` INT NOT NULL,
  FOREIGN KEY (`listings_list_id`) REFERENCES `my_bnb`.`listings` (`list_id`)
);


-- -----------------------------------------------------
-- Table `my_bnb`.`renter_has_listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`renter_has_listings` (
  `renter_u_id` INT NOT NULL,
  `listings_list_id` INT NOT NULL,
  `comment` VARCHAR(45) NULL,
  `rating` INT NULL,
  PRIMARY KEY (`renter_u_id`, `listings_list_id`),
  FOREIGN KEY (`renter_u_id`) REFERENCES `my_bnb`.`renter` (`u_id`),
  FOREIGN KEY (`listings_list_id`) REFERENCES `my_bnb`.`listings` (`list_id`)
);


-- -----------------------------------------------------
-- Table `my_bnb`.`hosts_has_listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`hosts_has_listings` (
  `hosts_u_id` INT NOT NULL,
  `listings_list_id` INT NOT NULL,
  PRIMARY KEY (`hosts_u_id`, `listings_list_id`),
  FOREIGN KEY (`hosts_u_id`) REFERENCES `my_bnb`.`hosts` (`u_id`) ,
  FOREIGN KEY (`listings_list_id`) REFERENCES `my_bnb`.`listings` (`list_id`)
);


-- -----------------------------------------------------
-- Table `my_bnb`.`bookings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`bookings` (
  `u_id` INT NOT NULL,
  `booking_date` DATE NULL,
  `listings_list_id` INT NOT NULL,
  `cancelled` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`u_id`, `listings_list_id`),
  FOREIGN KEY (`u_id`) REFERENCES `my_bnb`.`renter` (`u_id`),
  FOREIGN KEY (`listings_list_id`) REFERENCES `my_bnb`.`listings` (`list_id`)
  );


-- -----------------------------------------------------
-- Table `my_bnb`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`comments` (
  `comment` VARCHAR(45) NULL,
  `listings_list_id` INT NULL)
  ;
