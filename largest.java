import java.util.*;
class big
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("enter the value of  n1,n2,n3");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		num ob=new num();
		ob.largest(n1,n2,n3);
		}
}
class num
{
	void largest(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+"is biggest");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+"is biggest");
		}
		else
		{
			System.out.println(n3+"is biggest");
		}
	}
}
			
		
		
