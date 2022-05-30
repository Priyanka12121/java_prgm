import java.util.*;
class select
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,s,n,j,l;
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
			l=i;
			for(j=i+1;j<s;j++)
			{
				if(a[j]>a[l])
				l=j;
			}
			if(l!=i)
			{
				n=a[i];
				a[i]=a[l];
				a[l]=n;
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}
}



			












