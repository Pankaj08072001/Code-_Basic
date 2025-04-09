package ConnectionCreationDemoWithMySql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDemoCon {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","12345");
			if(con != null)
				System.out.println("Connection Creation ");
			else 
				System.out.println("Failed to Create");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
