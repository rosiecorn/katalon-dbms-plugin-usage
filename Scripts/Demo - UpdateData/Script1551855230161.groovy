import java.sql.Connection
import java.sql.ResultSet

Connection globalConnection = null;
ResultSet actorData;

globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

'Example:Multiple Update statement record on database'
CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.execute'(globalConnection, 
	"UPDATE tblActor SET actorName='update name1' WHERE ActorId=1; " 
  + "UPDATE tblActor SET actorName='update name2' WHERE ActorId=2")

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(globalConnection, "SELECT * FROM tblActor WHERE actorId in (1,2)")

println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(actorData, "actorName")

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(globalConnection)


