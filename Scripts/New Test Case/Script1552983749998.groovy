import java.sql.Connection
import java.sql.ResultSet
import com.kms.katalon.core.configuration.RunConfiguration
import com.katalon.plugin.keyword.connection.DBType

Connection connection = null;

ResultSet actorData;


connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(DBType.postgresql, 'clqapostgres01.cwyxcdln83pz.ap-southeast-1.rds.amazonaws.com', '5432', 'kms_intake', 'intake', 'bDBnaXN0aWNz')

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, "SELECT * FROM il_patient")

'Example: check result set is empty'
println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult'(actorData)

'Example: Export a result set to csv file'
CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV'(actorData, RunConfiguration.getProjectDir() +"/OutPut Files/huy_postgressql_actor.csv")


CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)








