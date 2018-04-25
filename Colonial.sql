CREATE TABLE Guide
(GuideNum CHAR(4) PRIMARY KEY,
LastName CHAR(15),
FirstName CHAR(15),
Address CHAR(25),
City CHAR(25),
State CHAR(2),
PostalCode CHAR(5),
PhoneNum CHAR(12),
HireDate DATE );
CREATE TABLE Customer
(CustomerNum CHAR(4) PRIMARY KEY,
LastName CHAR(30) NOT NULL,
FirstName CHAR (30),
Address CHAR(35),
City CHAR(35),
State CHAR(2),
PostalCode CHAR(5),
Phone CHAR(12) );
CREATE TABLE Trip
(TripID DECIMAL(3,0) PRIMARY KEY,
TripName CHAR(75),
StartLocation CHAR(50),
State CHAR(2),
Distance DECIMAL(4,0),
MaxGrpSize DECIMAL(4,0),
Type CHAR(20),
Season CHAR(20) );
INSERT INTO Guide
VALUES
('AM01','Abrams','Miles','54 Quest Ave.','Williamsburg','MA','01096','617-555-6032','2012-6-3');
INSERT INTO Guide
VALUES
('SL01','Stevens','Lori','15 Riverton Rd.','Coventry','VT','05825','802-555-3339','2014-9-5');
INSERT INTO Guide
VALUES
('UG01','Unser','Glory','342 Pineview St.','Danbury','CT','06810','203-555-8534','2015-2-2');
INSERT INTO Customer
VALUES
('104','Goff','Ryan','164A South Bend Rd.','Lowell','MA','01854','781-555-8423');
INSERT INTO Customer
VALUES
('108','Rulf','Uschi','32 Sheep Stop St.','Edinboro','PA','16412','814-555-5521');
INSERT INTO Customer
VALUES
('109','Caron','Jean Luc','10 Greenfield St.','Rome','ME','04963','207-555-9643');
INSERT INTO Customer
VALUES
('110','Bers','Martha','65 Granite St.','York','NY','14592','585-555-0111');
INSERT INTO Customer
VALUES
('126','Brown','Brianne','154 Central St.','Vernon','CT','06066','860-555-3234');
INSERT INTO Trip
VALUES
(1,'Arethusa Falls ','Harts Location','NH',5,10,'Hiking','Summer');
INSERT INTO Trip
VALUES
(2,'Mt Ascutney - North Peak','Weathersfield','VT',5,6,'Hiking','Late Spring');
INSERT INTO Trip
VALUES
(3,'Mt Ascutney - West Peak','Weathersfield','VT',6,10,'Hiking','Early Fall');
INSERT INTO Trip
VALUES
(4,'Bradbury Mountain Ride','Lewiston-Auburn','ME',25,8,'Biking','Early Fall')