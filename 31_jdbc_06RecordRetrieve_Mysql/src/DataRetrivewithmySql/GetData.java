package DataRetrivewithmySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql:///sql_invoicing";
	private static final String userName = "root";
	private static final String password = "12345";
	private static final String SELECT = "SELECT * FROM clients";

	public static void main(String[] args) {
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(SELECT);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "   " + rs.getString(2) +"    "+ rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
