package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstCon {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##pankaj", "857085");

			if (con != null) {
				System.out.println("Connection Created !");
			}
			else {
				System.out.println("Connection Failed !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
