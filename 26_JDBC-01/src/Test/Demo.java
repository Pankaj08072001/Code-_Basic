package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:orcl", "c##pankaj", "857085");
				if(con != null) {
					System.out.println("Connection create ");
				}
				else {
					System.out.println(" Failed loaded ");
				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
