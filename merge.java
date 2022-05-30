import java.util.*;
class merge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,t,r,s,s1,s2;
		System.out.println("enter the size of first array ");
		s=sc.nextInt();                                                                                                                                                                        
		System.out.println("enter the size of second array ");
		s1=sc.nextInt();
		s2=s+s1;
		int a[]=new int[s];
		int b[]=new int[s1];
		int c[]=new int[s2];
		System.out.println("enter first array in ascending order:");
		for(i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter second array in ascending order:");
		for(i=0;i<s1;i++)
		{
			b[i]=sc.nextInt();
		}
		t=0;
		for(i=0;i<s2;i=i+2)
		{
			c[i]=a[t];
			c[i+1]=b[t];
			t++;
		}
		for(i=0;i<s2;i++)
		{
			for(j=i+1;j<s2-1;j++)
			{
				if(c[j]<c[i])
				{
					r=c[j];
					c[j]=c[i];
					c[i]=r;
				}
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<s2;i++)
		{
			System.out.println(c[i]);
		}
	}
}

		