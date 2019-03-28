import java.sql.Connection
import java.sql.ResultSet

import com.katalon.plugin.keyword.connection.DBType
import com.kms.katalon.core.configuration.RunConfiguration
import com.katalon.plugin.keyword.connection.ResultSetKeywords
import com.katalon.plugin.keyword.connection

Connection connection = null;

ResultSet actorData;

CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords'
connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(DBType.oracle, 'localhost', '1521', 'XE', 'system', 'YWRtaW4=')

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, "SELECT * FROM tblActor")


'Example: check result set is empty'
println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult'(actorData)

'Example: Export a result set to csv file'
CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV'(actorData, RunConfiguration.getProjectDir() +"/OutPut Files/oracle_actor.csv")


'Example: Get total of rows from a result set'
println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(actorData)

'Example: Get total of coulmns from a result set'
println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount'(actorData)


'Example: Get list of row value using row '
println  CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList'(actorData)

println  CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue'(actorData,2,3)


CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)
