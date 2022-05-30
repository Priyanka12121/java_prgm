import java.util.*;
class bubble
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,s,n,l,u,m,f=0;
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
		l=0;
		u=s-1;
		while(l<u)
		{
			m=(u+l)/2;
			if(a[m]==n)
			{
				System.out.println("found");
				f=1;
				break;
			}
			else if(n>a[m])
			l=m+1;
			else
			u=m-1;
		}
		if(f==0)
		System.out.println("not found");
	}
}