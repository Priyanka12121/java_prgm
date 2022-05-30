import java.util.*;
class evod
{
	public  static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int d,s=0,s2=0,t;
		t=sc.nextInt();
		while(t!=0)
		{
			d=t%10;
			if(d%2==0)
			{
				s=s+d;
			}
			else
			{
				s2=s2+d;
			}
			t=t/10;
		}
		System.out.println("sum of even digits:"+s);
		System.out.println("sum of odd digits:"+s2);
	}
}


