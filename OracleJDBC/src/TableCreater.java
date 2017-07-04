import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TableCreater {
	
	
	public static void main(String[] args) {
		
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ram","1234");  
		PreparedStatement ps = con.prepareStatement("create table test(name varchar(?))");
	ps.execute();
		System.out.println("table created");
		
		
	}catch(Exception e)
		{
		
		}

}}
