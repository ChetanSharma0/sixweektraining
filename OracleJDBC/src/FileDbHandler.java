import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileDbHandler {
	
	
	public static void main(String[] args) {
		
		
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chetan","sharma");  
//		  File file = new File("C:\\f.pdf");
//			byte b[]=Files.readAllBytes(file.toPath());
//			PreparedStatement preparedStatement = con.prepareStatement("insert into pic values(?)");
//			preparedStatement.setBytes(1, b);
//			preparedStatement.execute();
//		
		
		PreparedStatement preparedStatement = con.prepareStatement("select * from pic");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Integer i=1;
		while(resultSet.next())
		{
			byte b[] = resultSet.getBytes(1);
			FileOutputStream fileOutputStream = new  FileOutputStream(i+".pdf");
			fileOutputStream.write(b);
			System.out.println("file created");
			i++;
		}
		
		
			
			System.out.println("Data Inserted");
		}		
		
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}


		}
}