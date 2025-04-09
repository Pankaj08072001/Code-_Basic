package OutPara;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableOutPara {
	private static final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:Oracle:thin:@localhost:1521:orcl";
	private static final String userName = "c##pankaj";
	private static final String password = "857085";
	private static final String CALL = "{call Retrieve1(?,?,?,?,?,?,?,?,?,?,?,?)}";

	public static void main(String args[]) throws Exception {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);

		CallableStatement cs = con.prepareCall(CALL);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		long accNo = sc.nextLong();
		cs.setLong(1, accNo);
		
		cs.registerOutParameter(2,  Types.INTEGER);
		cs.registerOutParameter(3,  Types.VARCHAR);
		cs.registerOutParameter(4,  Types.FLOAT);
		cs.registerOutParameter(5,  Types.VARCHAR);
		cs.registerOutParameter(6,  Types.VARCHAR);
		cs.registerOutParameter(7,  Types.VARCHAR);
		cs.registerOutParameter(8,  Types.VARCHAR);
		cs.registerOutParameter(9,  Types.VARCHAR);
		cs.registerOutParameter(10, Types.INTEGER);
		cs.registerOutParameter(11, Types.VARCHAR);
		cs.registerOutParameter(12, Types.BIGINT);
		
		cs.execute();
		
		System.out.println("Account no : " +accNo);
		System.out.println("Coustomer ID : " +cs.getInt(2));
		System.out.println("Coustomer Name : " +cs.getString(3));
		System.out.println("Balance is : " +cs.getFloat(4));
		System.out.println("Account type : " +cs.getString(5));
		System.out.println("House Number : " +cs.getString(6));
		System.out.println("Street Number : " +cs.getString(7));
		System.out.println("City Name : " +cs.getString(8));
		System.out.println("State Name : " +cs.getString(9));
		System.out.println("PinCode No : " +cs.getInt(10));
		System.out.println("MID NO  : " +cs.getString(11));
		System.out.println("Phone No : " +cs.getLong(12));
	}
}
