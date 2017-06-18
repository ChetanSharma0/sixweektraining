package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String url = System.getProperty("user.home")+"//Desktop//";
		File file = new File(url+"//xyz.txt");
	
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			
			
			fileWriter.write("first line");
			fileWriter.write("\n second line");
			fileWriter.flush();
			fileWriter.close();
			
			System.out.println("File created");
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
