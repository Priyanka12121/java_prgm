import java.util.*;
class two_sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,t,j,in1=0,in2=0,f=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the target");
		t=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(t==a[i]+a[j])
				{
					in1=i;
					in2=j;
					f=1;
					break;
					
				}
			}
			if(f==1)
				break;
		}
		System.out.println(in1+","+in2);
	}
}
		

		
			
		
		