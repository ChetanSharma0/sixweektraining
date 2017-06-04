class InternString
{


public static void main(String[] args)
{

String s = new String("ram");

String s1 = "ram";

System.out.println("Before Intern");
System.out.println(s==s1);

s=s.intern();

System.out.println("After Intern");
System.out.println(s==s1);



}

}