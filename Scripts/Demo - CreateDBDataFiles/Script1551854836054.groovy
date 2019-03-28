import com.katalon.plugin.keyword.connection.DBType
import com.kms.katalon.core.testdata.TestDataFactory

'Example: Create DataFile with using global connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection'('Global_Actor_Data','SELECT * FROM tblactor')
testData = TestDataFactory.findTestData('Global_Actor_Data')

println 'Actor Name is ' + testData.getValue(2,1)

'Example: Create Data File with PL/pgSQL'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection'('Func Select Data','SELECT * FROM selecttblactor(1)')
'Example:Postgres - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection'('Postgres_Films_Data', 'SELECT * FROM tblfilm','postgres','a21zQDIwMTk=',DBType.postgresql,'localhost','5432','Movies')
testData = TestDataFactory.findTestData('Postgres_Films_Data')

println 'Film Name is ' + testData.getValue(2,2)

'Example:MySql - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection'('MYSQL_Actor_Data', 'SELECT * FROM tblactor','katalon','a2F0YWxvbg==',DBType.mysql,'localhost','3306','movies')
testData = TestDataFactory.findTestData('MYSQL_Actor_Data')

println 'Actor Name is ' + testData.getValue(2,2)

'Example:SQL Server - Create DataFile using internal connection and get value from data file'
CustomKeywords.'com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection'('MSSQL_Actor_Data', 'SELECT * FROM tblactor','teamcity','dGVhbWNpdHk=',DBType.sqlserver,'localhost\\SQL2014EXPRESS','1433','Movies')
testData = TestDataFactory.findTestData('MSSQL_Actor_Data')
println 'Actor Name is ' + testData.getValue(2,2)

