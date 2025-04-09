package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = 
		DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj","root", "12345");
		
		if(con != null)
			System.out.println("Connection created");
		else
			System.out.println("Failed to create!");
	}
}
