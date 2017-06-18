package Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public static void main(String[] args) throws IOException {
		String url = System.getProperty("user.home")+"//Desktop//";
		File file = new File(url+"//xyz.txt");
	
		try {
			FileReader fileReader = new FileReader(file);
			
			while (fileReader.ready()) {

				
System.out.print((char)fileReader.read());				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
