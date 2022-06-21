import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,temp,j,t;
		int a[]=new int[10];
		System.out.println("enter the elements:");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		t=a.length-1;
		j=a.length/2;
		
		for(i=0;i<j;i++)
		{
			temp=a[i];
			a[i]=a[t];
			a[t]=temp;
			t--;
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);	
		}
	}
}

		