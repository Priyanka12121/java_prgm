import java.util.*;
class bubblesort
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
			for(j=0;j<s-i-1;j++)
			{
				if(a[j+1]<a[j])
				{
					n=a[j];
					a[j]=a[j+1];
					a[j+1]=n;
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
