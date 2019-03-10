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
5. 
- Add new Person by
```
curl -X POST \
  https://localhost:8243/services/simple_data_service/addPerson \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/xml' \
  -H 'postman-token: 8f3fa5b3-7c6c-4e6e-356e-104c30cc3991' \
  -d '<body>
   <p:addPerson xmlns:p="http://ws.wso2.org/dataservice">
      <xs:LastName xmlns:xs="http://ws.wso2.org/dataservice">WSO2</xs:LastName>
      <xs:FirstName xmlns:xs="http://ws.wso2.org/dataservice">DSS</xs:FirstName>
      <xs:Address xmlns:xs="http://ws.wso2.org/dataservice">Lanka</xs:Address>
      <xs:City xmlns:xs="http://ws.wso2.org/dataservice">Colombo</xs:City>
   </p:addPerson>
</body>'
```
- List the person by

```
curl -X GET \
  https://localhost:8243/services/simple_data_service/getPerson \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/xml' \
  -H 'postman-token: 66f01c8f-a78d-1ebc-3497-1d3e66d1c097' \
  -d '<body>
   <p:addPerson xmlns:p="http://ws.wso2.org/dataservice">
      <xs:LastName xmlns:xs="http://ws.wso2.org/dataservice">WSO2</xs:LastName>
      <xs:FirstName xmlns:xs="http://ws.wso2.org/dataservice">DSS</xs:FirstName>
      <xs:Address xmlns:xs="http://ws.wso2.org/dataservice">Lanka</xs:Address>
      <xs:City xmlns:xs="http://ws.wso2.org/dataservice">Colombo</xs:City>
   </p:addPerson>
</body>'
```
<i>In case of SSL error while using curl, use -k option with curl command</i>