import java.util.*;
class armstrong1
	{
		int n;
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no");
			n=sc.nextInt();
		}
		void armcheck()
		{
			int r,s=0,c=0,t;
			t=n;
			while(t!=0)
			{
				c++;
				t=t/10;
			}
			t=n;
			while(t!=0)
			{
				r=t%10;
				s=s+(int)Math.pow(r,c);
				t=t/10;
			}
			if(s==n)
			System.out.println("armstrong no");
			else
			System.out.println("not armstrong no");
		}
		public static void main(String args[])
		{
			armstrong1 in=new armstrong1();
			in.input();
			in.armcheck();
		}
	}
				
				
			

