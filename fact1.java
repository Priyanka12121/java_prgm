import java.util.*;
class fact1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f=1,n;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}