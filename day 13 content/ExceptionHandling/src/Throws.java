import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("before exception");
		FileReader fileReader = new FileReader("v");
		System.out.println("after exception");
		
		
	}

}
