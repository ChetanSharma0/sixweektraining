import java.util.*;

class Operator
{

public static void main(String[] args)
{
int x=10;
//Incr Operator
System.out.println("X:"+x);
System.out.println("Pre x Same Line:"+(++x));

System.out.println("Post x Same Line:"+(x++));
System.out.println("X:"+x);


//Decr Operator

System.out.println(--x);
System.out.println(x--);
System.out.println(x--);


//Addition Operator
System.out.println(3+4);
System.out.println(3-4);
System.out.println(3/4);
System.out.println(3%4);


//Realtional Operator

System.out.println(3<4);
System.out.println(3>4);
System.out.println(4>=4);
System.out.println(3<=4);




//Bitwise Operator
System.out.println(3&4);

System.out.println(3|4);

System.out.println(3^4);

System.out.println(~3);

System.out.println((!true));

System.out.println(false&false);

//Short Circuit Operator 


System.out.println(3>4&&true);
System.out.println(3>4||true);


//equalty operator
System.out.println(3==4);
System.out.println(3!=4);

//assignment operator
int a,b,c,d,e,f;
//simple assignment
a=10;
//chained assignment
a=b=c=d=e=f=20;
//compound assignment
a +=10;

System.out.println(a);

//Conditional Operator

System.out.println((3>4)?5:6);

//instance of

Scanner sc = new Scanner(System.in);
Object o = new Object();
System.out.println(o instanceof Scanner); 





}



}