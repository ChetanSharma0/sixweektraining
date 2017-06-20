package package1;

public class En {

	private int a=10;
	
	public static void main(String[] args) {
		
		int x=20;
		En e=new En();
		e.fn();
	}
	
	void fn()
	{
		int z=30;
		System.out.println(z);
		System.out.println(a);
	}
	
}
