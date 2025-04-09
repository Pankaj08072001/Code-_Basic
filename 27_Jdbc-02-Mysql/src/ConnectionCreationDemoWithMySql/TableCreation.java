package ConnectionCreationDemoWithMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql:/// Students";
	private static final String userName = "root";
	private static final String password = "12345";
	private static final String CREATE = "CREATE TABLE ADVJAVA (ID INT , NAME VARCHAR(50), COURSE VARCHAR(50))";

	public static void main(String[] args) throws Exception {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);

		Statement stm = con.createStatement();

		int k = stm.executeUpdate(CREATE);
		if(k > 0) {
			System.out.println("Table Created ");
		}
		else {
			System.out.println("Table Not Created ");
		}
		

	}

}
