import java.util.*;
class Fact
{
	int f=1;
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,result;
		System.out.println("enter the number:");
		n=sc.nextInt();
		Fact ob =new Fact();
		result=ob.fact(n);
		System.out.println("factorial of n:"+result);
	}
	int fact(int n)
	{
		if( n >0)
			return n*fact(n-1);
		else 
			return 1;
	}
}
	