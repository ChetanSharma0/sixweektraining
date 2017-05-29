import java.util.Scanner;

class InputUser
{

public static void main(String[] args)
{
int a;
float f;
long l;
double d;
short s;
Scanner inputscan = new Scanner(System.in);

System.out.println("Enter a");
a=inputscan.nextInt();


System.out.println("Enter f");
f=inputscan.nextFloat();


System.out.println("Enter l");
l=inputscan.nextLong();


System.out.println("Enter d");
d=inputscan.nextDouble();


System.out.println(a);

System.out.println(f);
System.out.println(l);
System.out.println(d);
}


}