package DataDaynmicInsertionwithmySql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DyanmicInsertion {
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql:/// Students";
	private static final String userName = "root";
	private static final String password = "12345";
	private static final String getAllDetails = "SELECT * FROM ADVJAVA";
	private static final String getByid = "SELECT * FROM ADVJAVA WHERE ID =?";
	private static final String insert = "INSERT INTO ADVJAVA VALUES(?,?,?)";
	private static final String update = "UPDATE ADVJAVA SET NAME = ? , COURSE= ? WHERE ID = ? ";
	private static final String delete = "DELETE FROM ADVJAVA WHERE ID =?";

	public static void main(String args[]) throws Exception {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		PreparedStatement ps1 = con.prepareStatement(getAllDetails);
		PreparedStatement ps2 = con.prepareStatement(getByid);
		PreparedStatement ps3 = con.prepareStatement(insert);
		PreparedStatement ps4 = con.prepareStatement(update);
		PreparedStatement ps5 = con.prepareStatement(delete);

		loop: while (true) {
			System.out.println("*************Please select an Options************");
			System.out.println("1. See All Student Record ");
			System.out.println("2. See Specific Students Record");
			System.out.println("3. Add New Record ");
			System.out.println("4. UPADATE Students Record ");
			System.out.println("5. Delete Students Record ");
			System.out.println("6. Exit \n\n ");

			System.out.println("Enter you Choice :: ");
			String choice = br.readLine();
			switch (choice) {
			case "1": {
				ResultSet rs = ps1.executeQuery(getAllDetails);
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				}
			}
				break;

			case "2": {
				System.out.println("Enter your id :: ");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				}
			}
				break;
			case "3": {
				System.out.println("Enter your Id :");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter your name :");
				String name = br.readLine();

				System.out.println("Enter your course :");
				String course = br.readLine();

				ps3.setInt(1, id);
				ps3.setString(2, name);
				ps3.setString(3, course);

				int k = ps3.executeUpdate();

				if (k > 0) {
					System.out.println("Record Inserted ");
				} else {
					System.out.println("Failed to Insert ");
				}
			}
				break;
			case "4": {
				System.out.println("Enter your id :: ");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					System.out.println("Old Name :: " + rs.getString(2));

					System.out.println("New Name :: ");
					String name = br.readLine();

					System.out.println("Old course :: " + rs.getString(3));
					System.out.println("Enter your New course");
					String course = br.readLine();

					ps4.setString(1, name);
					ps4.setString(2, course);
					ps4.setInt(3, id);

					int k = ps4.executeUpdate();

					if (k > 0) {
						System.out.println("Record Update");
					} else {
						System.out.println("Failed to Update ");
					}

				} else {
					System.out.println("Record Not Found ");
				}

			}
				break;
			case "5": {
				System.out.println("Enter your id :: ");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					ps5.setInt(1, id);

					int k = ps5.executeUpdate();
					if (k > 0) {
						System.out.println("Record deleted");
					} else {
						System.out.println("Failed to deleted");
					}

				} else {
					System.out.println("Record not Found ");
				}

			}
				break;
			case "6": {
				System.out.println("\n\n Good Bye............");
				break loop;
			}
			default: {
				System.out.println("Invalid Option Select range is 0 to  6 !!");
			}
			}

		}
	}
}
