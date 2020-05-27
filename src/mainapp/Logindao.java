package mainapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Logindao {

	public boolean validate(Loginpojo logpo) throws ClassNotFoundException, SQLException {
		String username=logpo.getUsername();
		String password=logpo.getPassword();
		//System.out.println("username"+username);
		//System.out.println("password"+password);
		
		
		ConnectionManager  con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		
		ResultSet rs=st.executeQuery(" Select * from USERDETAILS");
		
		while(rs.next())
		{
			String temUser = rs.getString("USERNAME");
			String tempPass = rs.getString("PASSWORD");
			System.out.println("temUser"+temUser);
			System.out.println("tempPass"+tempPass);
			if(temUser.equals(username) && (tempPass.equals( password))) 
				{
					//System.out.println("inside if");
					con.getConnection().close();
					return true;
				}
			}
			return false; 
		
		}
		
	}