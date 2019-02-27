1. Create new database
<br>`CREATE DATABASE tutorials;`
<br>`USE tutorials;`
2. Create new table Persons
<br>`CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255) 
);`
3. Insert Sample values to Persons table
<br>`INSERT INTO Persons(LastName, FirstName, Address, City) values("LnameUser1","FnameUser1","Address1","City1");`
4. Add [dss1.xml](dss1.xml) into the DSS service.
5. Evoke the service with "try it" tool.