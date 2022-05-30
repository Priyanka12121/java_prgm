import java.util.*;
class maths
	{
		int a,b,c;
		maths()
			{
				
				Scanner sc= new Scanner(System.in);
				System.out.println("enter the value of a,b and c");
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
			}
		void calculate()
			{
				double d,e,f,s1,s2;
				d=b*b-4*a*c;
				if(d==0)
					{
						e= -b/(2*a);
						System.out.println("roots are real and equal"+e);
					}
				else if(d>0)
					{
						e=(-b+Math.sqrt(d))/(2*a);
						f=(-b-Math.sqrt(d))/(2*a);
						System.out.println("roots are real and district"+e+"or"+f);
					}
				else
					{
						s1=-b/(2.0*a);
						s2=(Math.sqrt(-d))/(2.0*a);
						System.out.println("roots are imaginary and district"+s1+"+"+s2+"i"+"or"+s1+"-"+s2+"i");
					}


			}
		public static void main(String args[])
			{
				maths ob =new maths();
				
				ob.calculate();
			}
	}         