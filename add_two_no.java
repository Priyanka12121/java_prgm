import java.util.*;
class abc2
{
int a,b,c;
void inp()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 nos");
a=sc.nextInt();
b=sc.nextInt();
}
void add()
{
c=a+b;
}
void disp()
{
System.out.println("the sum is="+c);
}
public static void main(String args[])
{
abc2 ob=new abc2();
ob.inp();
ob.add();
ob.disp();
}
}

