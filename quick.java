import java.util.*;
class quick
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,s,n,j;
		System.out.println("enter the size of array:");
		s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("enter the elements of array:");
		for(i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<s-1;i++)
		{
			for(j=i+1;j<s;j++)
			{
				if(a[j]<a[i])
				{
					n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}
}
