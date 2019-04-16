# katalon-dbms-keywords

## Prerequisites
- Installed Katalon Studio
- Prepare Database by provided sql scripts from "/katalon-dbms-keywords/Sql Scripts"

## Database Keywords
### Keywords:
```
* createConnection
* getGlobalConnection
* closeConnection
* executeQuery
* executeUpdate
* excute
```
### Example for GlobalConnection
```
 Connection globalConnection = null;
 ResultSet actorData;

 globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.Database.getGlobalConnection'()
 actorData = CustomKeywords.'connection.Database.executeQuery'(globalConnection, "SELECT * FROM tblActor WITH(NOLOCK)")
 CustomKeywords.'connection.Database.closeConnection'(globalConnection)
 ```
### Example for InternalConnection
```
DBType values: 
- mysql
- sqlserver
- postgresql
- oracle
```
```
 Connection connection = null;
 ResultSet actorData;
 
 connection = CustomKeywords.'com.katalon.plugin.keyword.connection.Database.createConnection'(DBType.mysql, 'localhost', '3306', 'Movies', 'katalon', 'a2F0YWxvbg==')
 actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.Database.executeQuery'(connection, "SELECT * FROM `tblActor`")
 CustomKeywords.'connection.Database.closeConnection'(globalConnection)
```
## ResultSet Keywords
### Keywords:
```
* getListCellValue
* getSingleCellValue
* getRowCount
* getColumnCount
* isEmptyResult
* exportToCSV
```
### Examples for ResultSet keywords
```
'Example: check result set is empty'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.isEmptyResult'(actorData)
 
'Example: Export a result set to csv file'
 CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.exportToCSV'(actorData, RunConfiguration.getProjectDir() +"/OutPut Files/actor.csv")

'Example: Get total of rows from a result set'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getRowCount'(actorData)
 
'Example: Get total of coulmns from a result set'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getColumnCount'(actorData) 
 
'Example: Get single cell value using row and column index'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getSingleCellValue'(actorData, 2, 2)

'Example: Get single cell value using row and column index'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getSingleCellValue'(actorData, 2, 'ActorName')
 
'Example: Get list of cell value using row and column index'
 println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getListCellValue'(actorData, 3)
 
'Example: Get list of cell value using row and column label'
 println  CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSet.getListCellValue'(actorData, 'ActorDOB') 
```
## DataFile Keywords
### Keywords:
```
* createUsingGlobalConnection
* createUsingInternalConnection
```
### Examples for create GlobalConnection
```
'Example: Create DataFile with using global connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFile.createUsingGlobalConnection'('Actor Data','SELECT * FROM tblactor WHERE actorid=1')
testData = TestDataFactory.findTestData('Actor Data')
String name = testData.getValue(2, 1)
System.out.println('Actor name is : '+ name)

'Example: Create Data File with PL/pgSQL'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFile.createUsingGlobalConnection'('Func Select Data','SELECT * FROM selecttblactor(1)')
```
### Examples for create InternalConnection
```
'Example:Postgres - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFile.createUsingInternalConnection'('Films Data', 'SELECT * FROM tblfilm','postgres','a21zQDIwMTk=',DBType.postgresql,'localhost','5432','Movies')
testData = TestDataFactory.findTestData('Films Data')
String filmName= testData.getValue(2,2)
System.out.println('Film Name is ' + filmName)

'Example:MySql - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFile.createUsingInternalConnection'('Films Data', 'SELECT * FROM tblfilm','postgres','a21zQDIwMTk=',DBType.mysql,'localhost','5432','Movies')
testData = TestDataFactory.findTestData('Films Data')
String filmName= testData.getValue(2,2)
System.out.println('Film Name is ' + filmName)

'Example:SQL Server - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFile.createUsingInternalConnection'('Films Data', 'SELECT * FROM tblfilm','postgres','a21zQDIwMTk=',DBType.sqlserver,'localhost','5432','Movies')
testData = TestDataFactory.findTestData('Films Data')
String filmName= testData.getValue(2,2)
System.out.println('Film Name is ' + filmName)
```

