package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
		public void addUser(Registerpojo registerpojo) throws ClassNotFoundException, SQLException
		{
			String firstname=registerpojo.getFirstname();
			String lastname=registerpojo.getLastname();
			String username=registerpojo.getUsername();
			String password=registerpojo.getPassword();
			String email=registerpojo.getEmail();
			
			ConnectionManager cm=new ConnectionManager();
			String sql="insert into USERDETAILS(firstname,lastname,username,password,email)  values (?,?,?,?,?)";
			
			PreparedStatement stat=cm.getConnection().prepareStatement(sql);	
			
			stat.setString(1, firstname);
			stat.setString(2, lastname);
			stat.setString(3,username);
			stat.setString(4,password);
			stat.setString(5,email);
			
			stat.executeUpdate();
			cm.getConnection().close();
			
		}
}
