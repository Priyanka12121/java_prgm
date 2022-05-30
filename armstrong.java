import java.util.*;
class armstrong
	{
		int x,y;
		int input()
		{
			Scanner sc=new Scanner(System.in);
			int r,i;
			System.out.println("enter the values of x and y");
			x=sc.nextInt();
			y=sc.nextInt();
			for(i=x;i<=y;i++)
				{
					r=arms(i);
					if (r==1)
						{
							System.out.println(i+"armstrong no");
						}
					
					if (r==0)
						{
							System.out.println(i+"is not armstrong no");
						}
				}
			return 0;
		}
	int arms(int a)
		{
			int p,s,r,q,d,sum=0;
			p=a;
			s=power(p);
			r=a;
			while(r!=0)
				{
					d=r%10;
					q=(int)Math.pow(d,s);
					sum=sum+q;
					r=r/10;
				}
				if(sum==a)
				 return 1;
				else
				return 0;
		}
	int power(int b)
	{
		int c=0;
		while (b!=0)
			{
				c++;
				b=b/10;
			}
		return c;
	}
	public static void main(String args[])
	{
		armstrong ob=new armstrong();
		ob.input();
	}

}	
					
			
 

		
					
			