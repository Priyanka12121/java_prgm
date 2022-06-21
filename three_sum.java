import java.util.*;
class three_sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,j,k,in3=0,in1=0,in2=0,f=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n-2;k++)
				{
			
				if(a[i]+a[j]+a[k]==0 && a[i]!=a[j] && a[j]!=a[k] && a[i]!=a[k])
				{
					
					System.out.println(a[i]+","+a[j]+","+a[k]);
					
				}
				}
			}
			
		}
		
	}
}
		

		
			
		
		