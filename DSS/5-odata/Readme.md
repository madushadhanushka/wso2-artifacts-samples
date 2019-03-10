1. Create a Account table as follows.
    ```
    CREATE TABLE ACCOUNT(AccountID int NOT NULL,Branch varchar(255) NOT NULL, AccountNumber varchar(255),AccountType ENUM('CURRENT', 'SAVINGS') NOT NULL,
    Balance FLOAT,ModifiedDate DATE,PRIMARY KEY (AccountID)); 
    ```
2. Add following data into the table
    ```
    INSERT INTO ACCOUNT VALUES (1,"AOB","A00012","CURRENT",231221,'2014-12-02');
    ```
3. Add [odata_service.xml](odata_service.xml) into the DSS configuration
4.
- List available services with
```
curl -X GET -H 'Accept: application/json' https://localhost:9443/odata/odata_service/mysql -k
```

- Get Account table data with
```
curl -X GET -H 'Accept: application/json' https://localhost:9443/odata/odata_service/mysql/ACCOUNT -k
```