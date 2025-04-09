package TableCreationOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RecordInsertion {

	private static final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String userName = "c##pankaj";
	private static final String password = "857085";
	private static final String INSERT = "INSERT INTO BATCH11AM VALUES (104,'KHUSBHU','MERN FULL STACK')";
	private static final String INSERT1 = "INSERT INTO BATCH11AM VALUES (105,'DEEPAK','MERN FULL STACK')";
	private static final String INSERT2 = "INSERT INTO BATCH11AM VALUES (106,'HEEMA','MERN FULL STACK')";
	private static final String INSERT3 = "INSERT INTO BATCH11AM VALUES (107,'RAMAN','MERN FULL STACK')";
	private static final String INSERT4 = "INSERT INTO BATCH11AM VALUES (102,'MUSKAN','JAVA FULL STACK')";

	public static void main(String[] args) throws Exception {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);

		Statement stm = con.createStatement();
		int k = stm.executeUpdate(INSERT);
		int k1 = stm.executeUpdate(INSERT1);
		int k2 = stm.executeUpdate(INSERT2);
		int k3 = stm.executeUpdate(INSERT3);
		int k4 = stm.executeUpdate(INSERT4);

		if (k > 0) {
			System.out.println("Record inserted ");
		} else {
			System.out.println("not inserted");
		}

	}

}
