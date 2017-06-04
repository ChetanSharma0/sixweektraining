class VarArg
{

public static void main(String args[])
{

VarArg g = new VarArg();

System.out.println(g.add(1,3));
System.out.println(g.add(2,3,4));
System.out.println(g.add(2,4,5,7));
System.out.println(g.add(2,4,5,7,7,5,5));


}
/*
int add(int one,int two)
{

return one+two;
}

int add(int one,int two,int three)
{

return one+two+three;
}
*/

int add(int ...num)
{
int res=0;

//for (int a : num)
//{
//res = res + a;

//}
return res;
}


}