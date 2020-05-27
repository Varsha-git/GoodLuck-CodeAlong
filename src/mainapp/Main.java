package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		System.out.println("Write number to perform particular action- ");
		System.out.println("1.Register Here ");
		System.out.println("2.login here");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		Registerpojo registerpojo=new Registerpojo();
		RegisterDAO registerdao=new RegisterDAO();
		Loginpojo logpo= new Loginpojo();
		Logindao logdao=new Logindao();
		switch(x)
		{
		case 1:
				System.out.println("Enter your  first name :");
				String name=br.readLine();
				
				System.out.println("Enter your  last  name :");
				String lastname=br.readLine();
				
				System.out.println("Enter your  user name :");
				String username=br.readLine();
				
				System.out.println("Enter your password :");
				String pwd=br.readLine();
				
				System.out.println("Enter your email  :");
				String email=br.readLine();
				
				registerpojo.setFirstname(name);
				registerpojo.setLastname(lastname);
				registerpojo.setUsername(username);
				registerpojo.setPassword(pwd);
				registerpojo.setEmail(email);
				
				registerdao.addUser(registerpojo);
				break;
		case 2:
				System.out.println("Enter your  user name :");
				String uname=br.readLine();
			
				System.out.println("Enter your password :");
				String pass=br.readLine();
			
				logpo.setUsername(uname);
				logpo.setPassword(pass);
				
				if(logdao.validate(logpo)==true)
				{
					Luck luck=new Luck();
					luck.display();
				}
				else
				{
					System.out.println("Incorrect details");
				}
					break; 
				
		

	}

}
}
