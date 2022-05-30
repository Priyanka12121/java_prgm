import java.util.*;
class linear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,s,f=0;
		System.out.println("enter the size of array:");
		s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("enter the elements of array:");
		for(i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the no to be searched:");
		n=sc.nextInt();
		for(i=0;i<s;i++)
		{
			if(n==a[i])
			{
				System.out.println("found");
				f=1;
				break;
			}
		}
		if(f==0)
		System.out.println("not found");
	}
}