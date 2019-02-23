1. Create table EMPLOYEES
   <br>`CREATE TABLE EMPLOYEES (EmployeeNumber int(11) NOT NULL, FirstName varchar(255) NOT NULL, LastName varchar(255) DEFAULT NULL, Email varchar(255) DEFAULT NULL, JobTitle varchar(255) DEFAULT NULL, OfficeCode int(11) NOT NULL, PRIMARY KEY (EmployeeNumber,OfficeCode), CONSTRAINT employees_ibfk_1 FOREIGN KEY (OfficeCode) REFERENCES OFFICES (OfficeCode));`
2. Add [multiple_records](multiple_records.xml) into the DSS configuration
3. Evoke the service with
```
<p:addEmployeeOp_batch_req xmlns:p="http://ws.wso2.org/dataservice">
      <!--1 or more occurrences-->
      <addEmployeeOp xmlns="http://ws.wso2.org/dataservice">
         <!--Exactly 1 occurrence-->
         <xs:EmployeeNumber xmlns:xs="http://ws.wso2.org/dataservice">1002</xs:EmployeeNumber>
         <!--Exactly 1 occurrence-->
         <xs:FirstName xmlns:xs="http://ws.wso2.org/dataservice">John</xs:FirstName>
         <!--Exactly 1 occurrence-->
         <xs:LastName xmlns:xs="http://ws.wso2.org/dataservice">Doe</xs:LastName>
         <!--Exactly 1 occurrence-->
         <xs:Email xmlns:xs="http://ws.wso2.org/dataservice">johnd@wso2.com</xs:Email>
         <!--Exactly 1 occurrence-->
         <xs:JobTitle xmlns:xs="http://ws.wso2.org/dataservice">Consultant</xs:JobTitle>
         <!--Exactly 1 occurrence-->
         <xs:Officecode xmlns:xs="http://ws.wso2.org/dataservice">01</xs:Officecode>
      </addEmployeeOp>
      <addEmployeeOp xmlns="http://ws.wso2.org/dataservice">
         <!--Exactly 1 occurrence-->
         <xs:EmployeeNumber xmlns:xs="http://ws.wso2.org/dataservice">1004</xs:EmployeeNumber>
         <!--Exactly 1 occurrence-->
         <xs:FirstName xmlns:xs="http://ws.wso2.org/dataservice">Peter</xs:FirstName>
         <!--Exactly 1 occurrence-->
         <xs:LastName xmlns:xs="http://ws.wso2.org/dataservice">Parker</xs:LastName>
         <!--Exactly 1 occurrence-->
         <xs:Email xmlns:xs="http://ws.wso2.org/dataservice">peterp@wso2.com</xs:Email>
         <!--Exactly 1 occurrence-->
         <xs:JobTitle xmlns:xs="http://ws.wso2.org/dataservice">Consultant</xs:JobTitle>
         <!--Exactly 1 occurrence-->
         <xs:Officecode xmlns:xs="http://ws.wso2.org/dataservice">01</xs:Officecode>
      </addEmployeeOp>
   </p:addEmployeeOp_batch_req>
```