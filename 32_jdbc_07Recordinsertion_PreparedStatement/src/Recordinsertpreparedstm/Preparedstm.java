package Recordinsertpreparedstm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedstm {
	private static final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String userName = "c##pankaj";
	private static final String password = "857085";
	private static final String QUERY = "INSERT INTO BATCH11AM VALUES(?,?,?)";

	public static void main(String[] args) {
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement ps = con.prepareStatement(QUERY);

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter your ID :");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter your Name :");
			String name = br.readLine();

			System.out.println("Enter your Cousre :");
			String course = br.readLine();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, course);

			int k = ps.executeUpdate();

			if (k > 0) {
				System.out.println("Record Inserted ");
			} else {
				System.out.println("Failed to Insert ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
