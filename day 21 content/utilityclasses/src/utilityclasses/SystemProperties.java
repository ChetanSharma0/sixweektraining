package utilityclasses;

import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class SystemProperties {
	
	public static void main(String[] args) {
		

		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		
		Date date = new Date();
		
		System.out.println(date);
		
		
		Random random = new Random();
		System.out.println(random.nextInt());
		
		
		
		int a=10;
		float b=99;
		String s;
		
		s=String.valueOf(a);
		System.out.println(s);
		s=String.valueOf(b);
		
		System.out.println(s);
		
		String w="990";
		
		
		//int d=Integer.parseInt(s);
		//System.out.println(d);
		
		String g= "100.0";
		
		double e =Double.parseDouble(g);
		
		
		System.out.println(e);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
