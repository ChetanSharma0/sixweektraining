import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class NestedCatchBlock {
	
	
	public static void main(String[] args) {

	
//		try {
//			System.out.println(10/0);
//			System.out.println("after exception");
//			
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		

		try
		{
			
		try
		{
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
FileReader fileReader = new FileReader("a.txt");
System.out.println(10/0);


} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
catch (ArithmeticException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
System.out.println("after catch");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
