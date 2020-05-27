package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public Connection getConnection() throws ClassNotFoundException, SQLException
{
		//Register the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		//Connection
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Varsha080694");
		
		if(con!=null)
			System.out.println("Connection established");
		return con;
	}
}
