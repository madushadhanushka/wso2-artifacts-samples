1. Create table OFFICES
<br>`CREATE TABLE OFFICES (OfficeCode int(11) NOT NULL, AddressLine1 varchar(255) NOT NULL, AddressLine2 varchar(255) DEFAULT NULL, City varchar(255) DEFAULT NULL, State varchar(255) DEFAULT NULL, Country varchar(255) DEFAULT NULL, Phone varchar(255) DEFAULT NULL, PRIMARY KEY (OfficeCode));`
2. Create table EMPLOYEES
<br>`CREATE TABLE EMPLOYEES (EmployeeNumber int(11) NOT NULL, FirstName varchar(255) NOT NULL, LastName varchar(255) DEFAULT NULL, Email varchar(255) DEFAULT NULL, JobTitle varchar(255) DEFAULT NULL, OfficeCode int(11) NOT NULL, PRIMARY KEY (EmployeeNumber,OfficeCode), CONSTRAINT employees_ibfk_1 FOREIGN KEY (OfficeCode) REFERENCES OFFICES (OfficeCode));`
3. Add sample values to table OFFICES
<br>`INSERT INTO OFFICES VALUES (1,"51","Glen Street","Norwich","London","United Kingdom","+441523624");`
<br>`INSERT INTO OFFICES VALUES (2,"72","Rose Street","Pasadena","California","United States","+152346343");`
4. Add sample values to table EMPLOYEES
<br>`INSERT INTO EMPLOYEES VALUES (1,"John","Gardiner","john@office1.com","Manager",1);`
<br>`INSERT INTO EMPLOYEES VALUES (2,"Jane","Stewart","jane@office2.com","Head of Sales",2);`
<br>`INSERT INTO EMPLOYEES VALUES (3,"David","Green","david@office1.com","Manager",1);`
5. 
- For XML output Add [nested_query_xml](nested_query_xml.xml) into the DSS services.
<br> Evoke the XML service with
```
<body>
      <p:listOfficeSQLOP xmlns:p="http://ws.wso2.org/dataservice">
         <!--Exactly 1 occurrence-->
         <xs:OfficeCode xmlns:xs="http://ws.wso2.org/dataservice">1</xs:OfficeCode>
      </p:listOfficeSQLOP>
</body>
   ```
   
- For JSON output Add [nested_query_json](nested_query_json.xml) into the DSS service
<br>Evoke JSON service with 
<br>`curl -H 'Accept: application/json' -X GET http://localhost:8280/services/nested_query_json.SOAP12Endpoint/offices/1`