
public class FinallyBlock {
public static void main(String[] args) {
	
	
//	System.out.println("before exception");
//	try
//	{
//		System.out.println(10/0);
//	}catch (ArithmeticException e) {
//
//	System.out.println("catch block");
//	
//	}finally {
//		System.out.println("finally block");
//	}
//	
//	System.out.println("after exception");
//	


try
{
	System.out.println(10/0);
}finally {
	System.out.println("finally block");
}
System.out.println("after");











}
}
