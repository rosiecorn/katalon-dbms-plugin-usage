import java.sql.Connection
import java.sql.ResultSet

Connection globalConnection = null;
ResultSet actorData;

globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

'Example: Insert statement record on database'

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate'(globalConnection,
	"INSERT INTO  tblActor (ActorID,ActorName,ActorDOB,ActorGender) "
	+ " VALUES (5,'Tom Cruise2','1962-07-03','Male')"
	+ ", (6,'Sam Neill2','1947-09-14','Male')"
	+ ", (7,'Laura Dern2','1967-02-10','Female')"
	+ ", (8,'Jeff Goldblum2','1952-10-22','Male')"
)

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(globalConnection, "SELECT * FROM tblActor")

println CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(actorData, "actorName")

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(globalConnection)


