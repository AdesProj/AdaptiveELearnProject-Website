package adaptiveElearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author Adaptive E-Learning __
 * this is the adaptive E-Learning connection point
 * connection to my database 
 */

public class ConnectionPoint {
	Connection conn =null; // Create connection object
	String database = "arpalikh";
	// Name of database
	String driverClassName ="com.mysql.jdbc.Driver";
	String user = "arpalikh"; 
	//personal user name
	String password = "queonitH8";
	//connection password
	//String url = "jdbc:mysql://localhost:3306/" + database;   
	//Personal computer connection url
	String url = "jdbc:mysql://mudfoot.doc.stu.mmu.ac.uk/" + database; 
	//University computers connection url
	private static ConnectionPoint connectionPoint  = null;
	
private ConnectionPoint (){
	try{
		Class.forName(driverClassName);
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

public Connection getConnection() throws SQLException {
	Connection conn = null;
	conn = DriverManager.getConnection(url, user, password);
	return conn;
}

public static ConnectionPoint getInstance() {
	if (connectionPoint  == null) {
		connectionPoint  = new ConnectionPoint ();
	}
	return connectionPoint ;
}
}
