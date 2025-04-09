package Inparameter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CalleableInpara {
		private static final String driverClassName = "oracle.jdbc.driver.OracleDriver";
		private static final String url = "jdbc:Oracle:thin:@localhost:1521:orcl";
		private static final String userName = "c##pankaj";
		private static final String password = "857085";
		private static final String CALL ="{call Register(?,?,?,?,?,?,?,?,?,?,?,?)}";
		
		public static void main(String args[]) throws Exception {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, userName, password);
			
			CallableStatement cs = con.prepareCall(CALL);
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter your Acc. No : ");
			cs.setLong(1, Long.parseLong(br.readLine()));
			
			System.out.println("Enter your Customer Id : ");
			cs.setLong(2, Long.parseLong(br.readLine()));
			
			System.out.println("Enter your Customer Name : ");
			cs.setString(3, (br.readLine()));
			
			System.out.println("Enter your Balance : ");
			cs.setLong(4, Long.parseLong(br.readLine()));
			
			System.out.println("Enter your Account Type : ");
			cs.setString(5, (br.readLine()));
			
			System.out.println("Enter your House No : ");
			cs.setString(6, (br.readLine()));
			
			System.out.println("Enter your Street Number/Name : ");
			cs.setString(7, (br.readLine()));
			
			System.out.println("Enter your City Name : ");
			cs.setString(8, (br.readLine()));
			
			System.out.println("Enter your State Name : ");
			cs.setString(9, (br.readLine()));
			
			System.out.println("Enter your PIN code : ");
			cs.setLong(10, Long.parseLong(br.readLine()));
			
			System.out.println("Enter your Mail Id : ");
			cs.setString(11, (br.readLine()));
			
			System.out.println("Enter your Phone No : ");
			cs.setLong(12, Long.parseLong(br.readLine()));
			
			cs.execute();
			
			System.out.println("Record Inserted ");

	}
}
