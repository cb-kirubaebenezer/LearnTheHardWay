USE TRAINING_SAMPLE;

 DROP TABLE IF EXISTS TRAIN_COACH;
 DROP TABLE IF EXISTS BOOKING;
 DROP TABLE IF EXISTS TRAIN_ROUTE_MAP;
 DROP TABLE IF EXISTS TRAIN;
 DROP TABLE IF EXISTS ROUTE;
 DROP TABLE IF EXISTS STATION;
 DROP TABLE IF EXISTS COACH;
 DROP TABLE IF EXISTS USER;

CREATE TABLE IF NOT EXISTS TRAIN (
    train_no BIGINT(19) NOT NULL AUTO_INCREMENT,
    train_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (train_no)
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS COACH (
    coach_code BIGINT(19) NOT NULL AUTO_INCREMENT,
    cost_per_km BIGINT(19) NOT NULL,
    PRIMARY KEY (coach_code)
)  ENGINE=INNODB;
 

CREATE TABLE IF NOT EXISTS STATION (
    station_id BIGINT(19) NOT NULL AUTO_INCREMENT,
    station_code BIGINT(19) NOT NULL,
    PRIMARY KEY (station_id)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS TRAIN_COACH (
    train_no BIGINT(19) NOT NULL,
    coach_code BIGINT(19) NOT NULL,
    no_of_seats BIGINT(19) NOT NULL,
    FOREIGN KEY (train_no)
        REFERENCES TRAIN (train_no),
    FOREIGN KEY (coach_code)
        REFERENCES COACH (coach_code)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS ROUTE (
    route_id BIGINT(19) NOT NULL AUTO_INCREMENT,
    orgin_station_id BIGINT(19) NOT NULL,
    destination_station_id BIGINT(19) NOT NULL,
    distance_int_kms INT(4) NOT NULL,
    PRIMARY KEY (route_id),
    FOREIGN KEY (orgin_station_id)
        REFERENCES STATION (station_id),
    FOREIGN KEY (destination_station_id)
        REFERENCES STATION (station_id)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS TRAIN_ROUTE_MAP (
    route_id BIGINT(19) NOT NULL,
    train_no BIGINT(19) NOT NULL,
    arrival_time DATETIME NOT NULL,
    departure_time DATETIME NOT NULL,
    duration_in_mins TIME NOT NULL,
    PRIMARY KEY (route_id , train_no),
    FOREIGN KEY (route_id)
        REFERENCES Route (route_id),
    FOREIGN KEY (train_no)
        REFERENCES Train (train_no)
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS BOOKING (
    booking_ref_no BIGINT(19) NOT NULL AUTO_INCREMENT,
    route_id BIGINT(19) NOT NULL,
    train_no BIGINT(19) NOT NULL,
    coach_code BIGINT(19) NOT NULL,
    date_of_journey DATETIME NOT NULL,
    date_of_booking DATETIME NOT NULL,
    no_of_tickets INT(2) NOT NULL,
    PRIMARY KEY (booking_ref_no),
    FOREIGN KEY (route_id)
        REFERENCES TRAIN_ROUTE_MAP (route_id),
    FOREIGN KEY (train_no)
        REFERENCES TRAIN_ROUTE_MAP (train_no),
    FOREIGN KEY (coach_code)
        REFERENCES COACH (coach_code)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS USER (
    user_id BIGINT(19) AUTO_INCREMENT NOT NULL,
    login_id BIGINT(19) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (user_id)
)  ENGINE=INNODB;

SELECT * FROM TRAIN_COACH; 
SELECT * FROM TRAIN;
SELECT * FROM STATION;
SELECT * FROM COACH;
SELECT * FROM BOOKING;
SELECT * FROM TRAIN_ROUTE_MAP;
SELECT * FROM  ROUTE;
SELECT * FROM USER;
    
INSERT INTO TRAIN(train_name) values('ROCKFORT EXPRESS'),('PALLAVAN EXPRESS'),('MANGALORE EXPRESS'),('MYSORE EXPRESS'),('CHENNAI EXPRESS'),('RAJTHANI EXPRESS');

INSERT INTO COACH(cost_per_km) values(10),(20),(30),(40),(50);

INSERT INTO TRAIN_COACH(train_no,coach_code,no_of_seats) values(1,1,72),(1,2,60),(1,3,50),(1,4,30),(1,5,10);
INSERT INTO TRAIN_COACH(train_no,coach_code,no_of_seats) values(2,1,72),(2,2,60),(2,3,50),(2,4,30),(2,5,10);
INSERT INTO TRAIN_COACH(train_no,coach_code,no_of_seats) values(3,1,50),(3,2,30),(3,3,20),(3,4,10);
INSERT INTO TRAIN_COACH(train_no,coach_code,no_of_seats) values(4,1,50),(4,2,30),(4,3,20),(4,4,10);
INSERT INTO TRAIN_COACH(train_no,coach_code,no_of_seats) values(5,1,72),(5,2,60),(5,3,50),(5,4,30),(5,5,10);

INSERT INTO STATION(station_code) values (100),(101),(102),(103),(104);

INSERT INTO ROUTE(orgin_station_id,destination_station_id,distance_int_kms) values(1,2,100),(1,3,200),(1,4,300),(1,5,400);
INSERT INTO ROUTE(orgin_station_id,destination_station_id,distance_int_kms) values(2,1,100),(2,3,100),(2,4,200),(2,5,300);
INSERT INTO ROUTE(orgin_station_id,destination_station_id,distance_int_kms) values(3,1,200),(3,2,100),(3,4,100),(3,5,200);
INSERT INTO ROUTE(orgin_station_id,destination_station_id,distance_int_kms) values(4,1,300),(4,2,200),(4,3,100),(4,5,100);
INSERT INTO ROUTE(orgin_station_id,destination_station_id,distance_int_kms) values(5,1,400),(5,2,300),(5,3,200),(5,4,100);

INSERT INTO TRAIN_ROUTE_MAP(route_id,train_no,arrival_time,departure_time, duration_in_mins) values (1,1,'2018-07-19 01:30:00','2018-07-19 02:30:00','01:00:00'),(2,1,'2018-07-19 01:30:00','2018-07-19 03:30:00','02:00:00'),(3,1,'2018-07-19 01:30:00','2018-07-19 04:30:00','03:00:00'),(4,1,'2018-07-19 01:30:00','2018-07-19 05:30:00','04:00:00'),(6,1,'2018-07-19 02:30:00','2018-07-19 03:30:00','01:00:00'),(7,1,'2018-07-19 02:30:00','2018-07-19 04:30:00','02:00:00'),(8,1,'2018-07-19 02:30:00','2018-07-19 05:30:00','03:00:00'),(11,1,'2018-07-19 03:30:00','2018-07-19 04:30:00','01:00:00'),(12,1,'2018-07-19 03:30:00','2018-07-19 05:30:00','02:00:00'),(16,1,'2018-07-19 04:30:00','2018-07-19 05:30:00','01:00:00');
INSERT INTO TRAIN_ROUTE_MAP(route_id,train_no,arrival_time,departure_time, duration_in_mins) values (1,2,'2018-07-19 01:30:00','2018-07-19 02:30:00','01:00:00'),(2,2,'2018-07-19 01:30:00','2018-07-19 03:30:00','02:00:00'),(3,2,'2018-07-19 01:30:00','2018-07-19 04:30:00','03:00:00'),(4,2,'2018-07-19 01:30:00','2018-07-19 05:30:00','04:00:00'),(6,2,'2018-07-19 02:30:00','2018-07-19 03:30:00','01:00:00'),(7,2,'2018-07-19 02:30:00','2018-07-19 04:30:00','02:00:00'),(8,2,'2018-07-19 02:30:00','2018-07-19 05:30:00','03:00:00'),(11,2,'2018-07-19 03:30:00','2018-07-19 04:30:00','01:00:00'),(12,2,'2018-07-19 03:30:00','2018-07-19 05:30:00','02:00:00'),(16,2,'2018-07-19 04:30:00','2018-07-19 05:30:00','01:00:00');
INSERT INTO TRAIN_ROUTE_MAP(route_id,train_no,arrival_time,departure_time, duration_in_mins) values (20,3,'2018-07-19 01:30:00','2018-07-19 02:30:00','01:00:00'),(19,3,'2018-07-19 01:30:00','2018-07-19 03:30:00','02:00:00'),(18,3,'2018-07-19 01:30:00','2018-07-19 04:30:00','03:00:00'),(17,3,'2018-07-19 01:30:00','2018-07-19 05:30:00','04:00:00'),(15,3,'2018-07-19 02:30:00','2018-07-19 03:30:00','01:00:00'),(14,3,'2018-07-19 02:30:00','2018-07-19 04:30:00','02:00:00'),(13,3,'2018-07-19 02:30:00','2018-07-19 05:30:00','03:00:00'),(10,3,'2018-07-19 03:30:00','2018-07-19 04:30:00','01:00:00'),(9,3,'2018-07-19 03:30:00','2018-07-19 05:30:00','02:00:00'),(5,3,'2018-07-19 04:30:00','2018-07-19 05:30:00','01:00:00');
INSERT INTO TRAIN_ROUTE_MAP(route_id,train_no,arrival_time,departure_time, duration_in_mins) values (20,4,'2018-07-19 01:30:00','2018-07-19 02:30:00','01:00:00'),(19,4,'2018-07-19 01:30:00','2018-07-19 03:30:00','02:00:00'),(18,4,'2018-07-19 01:30:00','2018-07-19 04:30:00','03:00:00'),(17,4,'2018-07-19 01:30:00','2018-07-19 05:30:00','04:00:00'),(15,4,'2018-07-19 02:30:00','2018-07-19 03:30:00','01:00:00'),(14,4,'2018-07-19 02:30:00','2018-07-19 04:30:00','02:00:00'),(13,4,'2018-07-19 02:30:00','2018-07-19 05:30:00','03:00:00'),(10,4,'2018-07-19 03:30:00','2018-07-19 04:30:00','01:00:00'),(9,4,'2018-07-19 03:30:00','2018-07-19 05:30:00','02:00:00'),(5,4,'2018-07-19 04:30:00','2018-07-19 05:30:00','01:00:00');
INSERT INTO TRAIN_ROUTE_MAP(route_id,train_no,arrival_time,departure_time, duration_in_mins) values (6,5,'2018-07-19 05:00:00','2018-07-19 06:00:00','01:00:00'),(7,5,'2018-07-19 05:00:00','2018-07-19 07:00:00','02:00:00');

INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,1,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',1);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,1,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',2);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,1,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',3);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',4);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,1,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',5);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,1,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',6);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,1,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',7);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',8);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,1,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',9);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,1,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',10);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,1,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',11);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',12);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,1,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',13);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,1,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',14);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,1,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',15);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',16);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',17);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',18);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',19);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,1,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',20);

INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,2,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',1);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,2,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',2);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,2,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',3);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,2,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',4);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,2,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',5);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,2,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',6);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,2,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',7);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,2,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',8);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,2,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',9);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,2,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',10);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,2,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',11);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,2,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',12);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,2,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',13);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,2,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',14);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,2,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',15);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,2,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',16);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(1,2,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',17);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(2,2,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',18);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(3,2,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',19);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(4,2,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',20);

INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,3,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',1);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,3,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',2);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,3,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',3);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,3,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',4);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,3,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',5);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,3,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',6);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,3,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',7);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,3,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',8);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,3,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',9);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,3,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',10);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,3,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',11);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,3,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',12);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,3,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',13);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,3,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',14);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,3,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',15);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,3,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',16);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,3,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',17);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,3,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',18);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,3,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',19);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,3,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',20);

INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,4,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',1);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,4,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',2);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,4,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',3);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,4,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',4);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,4,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',5);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,4,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',6);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,4,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',7);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,4,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',8);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,4,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',9);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,4,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',10);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,4,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',11);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,4,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',12);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,4,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',13);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,4,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',14);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,4,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',15);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,4,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',16);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(20,4,1,'2018-07-19 01:30:00','2018-06-20 05:30:00',17);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(19,4,2,'2018-07-19 01:30:00','2018-06-20 05:30:00',18);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(18,4,3,'2018-07-19 01:30:00','2018-06-20 05:30:00',19);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(17,4,4,'2018-07-19 01:30:00','2018-06-20 05:30:00',20);


INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(6,5,4,'2018-07-19 05:00:00','2018-06-20 05:30:00',50);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(7,5,3,'2018-07-19 05:00:00','2018-06-20 05:30:00',200);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(6,5,4,'2018-07-19 05:00:00','2018-06-20 05:30:00',30);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(7,5,3,'2018-07-19 05:00:00','2018-06-20 05:30:00',70);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(6,5,4,'2018-07-19 05:00:00','2018-06-20 05:30:00',180);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(7,5,3,'2018-07-19 05:00:00','2018-06-20 05:30:00',1);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(6,5,4,'2018-07-19 05:00:00','2018-06-20 05:30:00',2);
INSERT INTO BOOKING(route_id,train_no,coach_code,date_of_journey,date_of_booking,no_of_tickets) values(7,5,3,'2018-07-19 05:00:00','2018-06-20 05:30:00',3);



INSERT INTO USER(login_id,password) values(117015065,'bornawesome'),(117015066,'bornawesome');

SELECT * FROM TRAIN_COACH; 
SELECT * FROM TRAIN;
SELECT * FROM STATION;
SELECT * FROM COACH;
SELECT * FROM BOOKING;
SELECT * FROM TRAIN_ROUTE_MAP;
SELECT * FROM  ROUTE;
SELECT * FROM USER;

-- To get the list of all train routes in the database
SELECT 
    orgin_station_id, destination_station_id, train_name
FROM
    TRAIN_ROUTE_MAP AS TM
        INNER JOIN
    ROUTE AS R ON TM.ROUTE_ID = R.ROUTE_ID
        INNER JOIN
    TRAIN AS T ON TM.TRAIN_NO = T.TRAIN_NO;

 -- List of all routes goes to Bangalore
SELECT DISTINCT
    (train_name)
FROM
    TRAIN_ROUTE_MAP AS TM
        INNER JOIN
    ROUTE AS R ON TM.ROUTE_ID = R.ROUTE_ID
        INNER JOIN
    TRAIN AS T ON TM.TRAIN_NO = T.TRAIN_NO
WHERE
    R.DESTINATION_STATION_ID = 5;

-- Total number of seats in the each train.
SELECT 
    train_name, SUM(no_of_seats) AS number_of_seats
FROM
    TRAIN AS T
        INNER JOIN
    TRAIN_COACH AS TC ON T.TRAIN_NO = TC.TRAIN_NO
GROUP BY (T.TRAIN_NO);

-- List of all routes starting from bangalore, calcutta and chennai
SELECT DISTINCT
    (train_name)
FROM
    TRAIN_ROUTE_MAP AS TM
        INNER JOIN
    ROUTE AS R ON TM.ROUTE_ID = R.ROUTE_ID
        INNER JOIN
    TRAIN AS T ON TM.TRAIN_NO = T.TRAIN_NO
WHERE
    R.ORGIN_STATION_ID IN (1 , 2, 3);
    
-- List of all the bookings booked between 1st Jan 2005 and 31st Dec 2005
SELECT 
    *
FROM
    BOOKING
WHERE
    date_of_booking BETWEEN '2018-06-19 01:30:00' AND '2018-08-19 01:30:00';

-- List of all trains whose name begins with B
SELECT 
    *
FROM
    TRAIN
WHERE
    train_name LIKE '%B';

-- List of all bookings where DOB is not null
SELECT 
    *
FROM
    BOOKING
WHERE
    date_of_booking IS NOT NULL;

-- List of all bookings for the booked in 2006, DOJ in 2007

SELECT 
    *
FROM
    BOOKING
WHERE
    date_of_booking IN ('2018-06-19 01:30:00' , '2018-06-20 05:30:00');

-- Total number of coaches in the all the trains
SELECT 
    train_name, COUNT(coach_code) AS coach_count
FROM
    TRAIN AS T
        INNER JOIN
    TRAIN_COACH AS TC ON T.TRAIN_NO = TC.TRAIN_NO
GROUP BY (T.TRAIN_NO);
    
-- Total number of bookings in the database for the train no 16198
SELECT 
    COUNT(*) AS total_number_of_bookings
FROM
    BOOKING
WHERE
    TRAIN_NO = 1;

-- Minimum distance route
SELECT 
    route_id
FROM
    ROUTE
WHERE
    ROUTE_ID = (SELECT 
            MIN(ROUTE_ID)
        FROM
            ROUTE);

-- Total number of tickets booked for each train in the database
SELECT 
    train_no, COUNT(*) AS total_number_of_bookings
FROM
    BOOKING
GROUP BY train_no;

-- cost for 50 kms for each coach.
SELECT 
    (50 * cost_per_km)
FROM
    COACH;

-- List the train name and departure time for the trains starting from Bangalore 
SELECT 
    train_name, departure_time
FROM
    TRAIN_ROUTE_MAP AS TM
        INNER JOIN
    TRAIN AS T ON TM.TRAIN_NO = T.TRAIN_NO
WHERE
    ROUTE_ID IN (1 , 2, 3, 4);

-- List the trains for which the total no of tickets booked is greater than 500  
SELECT 
    train_name
FROM
    (SELECT 
        train_name, SUM(NO_OF_TICKETS) AS tickets_count
    FROM
        BOOKING AS B
    INNER JOIN TRAIN AS T ON B.TRAIN_NO = T.TRAIN_NO
    GROUP BY B.TRAIN_NO
    HAVING tickets_count > 100) AS booking_detail;

-- List the trains for which the total no of tickets booked is lesser than 50
SELECT 
    train_name
FROM
    (SELECT 
        train_name, SUM(NO_OF_TICKETS) AS tickets_count
    FROM
        BOOKING AS B
    INNER JOIN TRAIN AS T ON B.TRAIN_NO = T.TRAIN_NO
    GROUP BY B.TRAIN_NO
    HAVING tickets_count < 50) AS booking_detail;

-- List the bookings along with train name, origin station, destination station and coach code after the date of journey ’25th Feb 2015’
SELECT 
    train_name,
    orgin_station_id,
    destination_station_id,
    coach_code
FROM
    BOOKING AS B
        INNER JOIN
    TRAIN AS T ON B.TRAIN_NO = T.TRAIN_NO
        INNER JOIN
    ROUTE AS R ON B.ROUTE_ID = R.ROUTE_ID
WHERE
    B.DATE_OF_JOURNEY = '2018-07-19 01:30:00';
    
-- List the trains via the route Mysore - Chennai
SELECT 
    train_name
FROM
    TRAIN_ROUTE_MAP AS TM
        INNER JOIN
    TRAIN AS T ON TM.TRAIN_NO = T.TRAIN_NO
        INNER JOIN
    ROUTE AS R ON TM.ROUTE_ID = R.ROUTE_ID
WHERE
    R.DESTINATION_STATION_ID = 3
        AND R.ORGIN_STATION_ID = 1;
    