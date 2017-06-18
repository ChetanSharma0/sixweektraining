package FileClas;

import java.io.File;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) throws IOException {
	String url = System.getProperty("user.home")+"//Desktop//";
		File file = new File(url+"//abc.txt");
		
		//System.out.println(file.createNewFile());
		//System.out.println(file.mkdir());
		
//	String[] filelist = file.list();
//	
//	for (String name : filelist) {
//		System.out.println(name);
//	}
System.out.println(file.exists());
		
	System.out.println(file.isDirectory());
	System.out.println(file.isFile());
	
	
	
		
		
		
	
	
	
	
	
		
	}

}
