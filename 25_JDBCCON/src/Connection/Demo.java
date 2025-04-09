package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	private static String ClassName = "orcale.jdbc.driver.OracleDriver";
	private static String Url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String UserName = "c##pankaj";
	private static String Password = "857085";
	private static String Create = "Create table ";
	
	public static void main(String[] args) throws Exception  {
		Class.forName(ClassName);
		Connection con = DriverManager.getConnection(Url, UserName, Password);
		
		Statement stm = con.prepareStatement(Create);
		stm.executeQuery(Create);
		}  
}
