
public class Throw {
	
	
	public static void main(String[] args) {
		
		System.out.println("befor throw");
		
		int a=10;
		
		if (a==10)
		{
			try
			{
		throw new ArithmeticException();	
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			}else
		{
			System.out.println("else ");
		}
		
		System.out.println("after throw 1 line");
		
		System.out.println("after throw 2 line");
		
	
	
	
	
	}

}
