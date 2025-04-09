package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RecordDeletion {
	private static final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String userName = "c##pankaj";
	private static final String password = "857085";
	//private static final String delete = "DELETE FROM BATCH11AM WHERE ID = 103 OR ID = 105 OR ID=107";
	private static final String UPDATE = "UPDATE BATCH11AM SET COURSE ='MEAN' WHERE ID = 104";
	public static void main(String[] args) throws Exception {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement s = con.createStatement();
		int val = s.executeUpdate(UPDATE);

		if (val != 0)
			System.out.println("Delete record sucessfully");
		else
			System.out.println("Fail to delete");
	}
}
