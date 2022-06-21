import java.util.*;
class insertion_sort
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
			j=i+1;
			while(j>0 && a[j-1]<a[j])
			{
				n=a[j];
				a[j]=a[j-1];
				a[j-1]=n;
				j--;
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}
}

