-- MySQL Script generated by MySQL Workbench
-- Fri Jul 26 21:09:11 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema my_bnb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema my_bnb
-- -----------------------------------------------------
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
  `dob` DATETIME NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  UNIQUE INDEX `sin_num_UNIQUE` (`sin_num` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`renter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`renter` (
  `u_id` INT NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  CONSTRAINT `fk_renter_users1`
    FOREIGN KEY (`u_id`)
    REFERENCES `my_bnb`.`users` (`u_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`hosts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`hosts` (
  `u_id` INT NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `u_id_UNIQUE` (`u_id` ASC),
  CONSTRAINT `fk_hosts_users1`
    FOREIGN KEY (`u_id`)
    REFERENCES `my_bnb`.`users` (`u_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`listings` (
  `list_id` INT NOT NULL AUTO_INCREMENT,
  `list_name` VARCHAR(45) NOT NULL,
  `list_address` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `longitude` DECIMAL(10,4) NULL,
  `latitude` DECIMAL(10,4) NULL,
  `amenities` VARCHAR(45) NULL,
  PRIMARY KEY (`list_id`),
  UNIQUE INDEX `list_id_UNIQUE` (`list_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`listing_dates`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`listing_dates` (
  `listing_dates` DATE NULL,
  `listings_list_id` INT NOT NULL,
  `rent_amount` DECIMAL(12,2) NOT NULL,
  PRIMARY KEY (`listings_list_id`),
  UNIQUE INDEX `listings_list_id_UNIQUE` (`listings_list_id` ASC),
  CONSTRAINT `fk_listing_dates_listings1`
    FOREIGN KEY (`listings_list_id`)
    REFERENCES `my_bnb`.`listings` (`list_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`renter_has_listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`renter_has_listings` (
  `renter_u_id` INT NOT NULL,
  `listings_list_id` INT NOT NULL,
  `comment` VARCHAR(45) NULL,
  `rating` INT NULL,
  PRIMARY KEY (`renter_u_id`, `listings_list_id`),
  INDEX `fk_renter_has_listings_listings1_idx` (`listings_list_id` ASC),
  INDEX `fk_renter_has_listings_renter1_idx` (`renter_u_id` ASC),
  CONSTRAINT `fk_renter_has_listings_renter1`
    FOREIGN KEY (`renter_u_id`)
    REFERENCES `my_bnb`.`renter` (`u_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_renter_has_listings_listings1`
    FOREIGN KEY (`listings_list_id`)
    REFERENCES `my_bnb`.`listings` (`list_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`hosts_has_listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`hosts_has_listings` (
  `hosts_u_id` INT NOT NULL,
  `listings_list_id` INT NOT NULL,
  PRIMARY KEY (`hosts_u_id`, `listings_list_id`),
  INDEX `fk_hosts_has_listings_listings1_idx` (`listings_list_id` ASC),
  INDEX `fk_hosts_has_listings_hosts1_idx` (`hosts_u_id` ASC),
  CONSTRAINT `fk_hosts_has_listings_hosts1`
    FOREIGN KEY (`hosts_u_id`)
    REFERENCES `my_bnb`.`hosts` (`u_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hosts_has_listings_listings1`
    FOREIGN KEY (`listings_list_id`)
    REFERENCES `my_bnb`.`listings` (`list_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`bookings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`bookings` (
  `u_id` INT NOT NULL,
  `booking_date` DATE NULL,
  `booking_time` TIME NULL,
  `listings_list_id` INT NOT NULL,
  PRIMARY KEY (`u_id`, `listings_list_id`),
  INDEX `fk_bookings_listings1_idx` (`listings_list_id` ASC),
  CONSTRAINT `fk_bookings_renter1`
    FOREIGN KEY (`u_id`)
    REFERENCES `my_bnb`.`renter` (`u_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bookings_listings1`
    FOREIGN KEY (`listings_list_id`)
    REFERENCES `my_bnb`.`listings` (`list_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_bnb`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_bnb`.`comments` (
  `comment` VARCHAR(45) NULL,
  `listings_list_id` INT NULL)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
