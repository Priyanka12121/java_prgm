import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,c=0,j,n;
		for(i=100;i<=999;i++)
		{
			n=i;
			for(j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
			System.out.println(n);
			}
			c=0;
		}
	}
}
