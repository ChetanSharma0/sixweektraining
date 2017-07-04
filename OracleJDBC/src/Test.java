import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ram","1234");  
		PreparedStatement ps = con.prepareStatement("insert into t values(?,?)");
		ps.setString(1, "Ram Sharma");
		ps.setInt(2, 13);
		ps.execute();
		System.out.println("Data Insetted");
	}catch(Exception e)
		{
		System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		

}
