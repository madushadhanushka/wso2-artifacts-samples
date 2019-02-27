1. Create table EMPLOYEES
   <br>`CREATE TABLE EMPLOYEES (EmployeeNumber int(11) NOT NULL, FirstName varchar(255) NOT NULL, LastName varchar(255) DEFAULT NULL, Email varchar(255) DEFAULT NULL, JobTitle varchar(255) DEFAULT NULL, OfficeCode int(11) NOT NULL, PRIMARY KEY (EmployeeNumber,OfficeCode), CONSTRAINT employees_ibfk_1 FOREIGN KEY (OfficeCode) REFERENCES OFFICES (OfficeCode));`
2. Add [request_box](request_box.xml) configuration into the DSS.
3. Evoke the request with following payload using "try it".
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