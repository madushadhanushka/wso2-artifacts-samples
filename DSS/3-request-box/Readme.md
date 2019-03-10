1. Create table Offices
   <br>`CREATE TABLE Offices (OfficeCode int(11) NOT NULL, AddressLine1 varchar(255) NOT NULL, AddressLine2 varchar(255) DEFAULT NULL, City varchar(255) DEFAULT NULL, State varchar(255) DEFAULT NULL, Country varchar(255) DEFAULT NULL, Phone varchar(255) DEFAULT NULL, PRIMARY KEY (OfficeCode));`
2. Create table EMPLOYEES
   <br>`CREATE TABLE Employees (EmployeeNumber int(11) NOT NULL, FirstName varchar(255) NOT NULL, LastName varchar(255) DEFAULT NULL, Email varchar(255) DEFAULT NULL, JobTitle varchar(255) DEFAULT NULL, OfficeCode int(11) NOT NULL, PRIMARY KEY (EmployeeNumber,OfficeCode));`
3. Add sample values into the tables.
   ```
    INSERT INTO Offices VALUES (1,"51","Glen Street","Norwich","London","United Kingdom","+441523624");
    INSERT INTO Offices VALUES (2,"72","Rose Street","Pasadena","California","United States","+152346343"); 
    ```
4. Add [request_box](request_box.xml) configuration into the DSS.
5. Evoke the request with following payload using "try it".
```
<body>
   <p:request_box xmlns:p="http://ws.wso2.org/dataservice">
      <!--Exactly 1 occurrence-->
      <addEmployeeOp xmlns="http://ws.wso2.org/dataservice">
         <!--Exactly 1 occurrence-->
         <xs:EmployeeNumber xmlns:xs="http://ws.wso2.org/dataservice">1003</xs:EmployeeNumber>
         <!--Exactly 1 occurrence-->
         <xs:FirstName xmlns:xs="http://ws.wso2.org/dataservice">Chris</xs:FirstName>
         <!--Exactly 1 occurrence-->
         <xs:LastName xmlns:xs="http://ws.wso2.org/dataservice">Sam</xs:LastName>
         <!--Exactly 1 occurrence-->
         <xs:Email xmlns:xs="http://ws.wso2.org/dataservice">chris@sam.com</xs:Email>
         <!--Exactly 1 occurrence-->
         <xs:OfficeCode xmlns:xs="http://ws.wso2.org/dataservice">1</xs:OfficeCode>
      </addEmployeeOp>
      <!--Exactly 1 occurrence-->
      <selectEmployeeOp xmlns="http://ws.wso2.org/dataservice">
         <!--Exactly 1 occurrence-->
         <xs:EmployeeNumber xmlns:xs="http://ws.wso2.org/dataservice">1003</xs:EmployeeNumber>
      </selectEmployeeOp>
   </p:request_box>
</body>
```