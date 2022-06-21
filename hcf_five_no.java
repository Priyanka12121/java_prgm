import java.util.*;
class xyz
{
	int h;
	int hcf(int a,int b)
	{
		int i;
		for(i=(a<b)?a:b;i>=1;i--)
                  {
			if((a%i==0)&&(b%i==0))
				{
					return i;
				}
			}
            return 0;
          }
        void hcf5()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		System.out.println("enter 5 nos");
                a=sc.nextInt();
		b=sc.nextInt();
                c=sc.nextInt();
		d=sc.nextInt();
                e=sc.nextInt();
                h=hcf(hcf(hcf(a,b),hcf(c,d)),e);
		System.out.println( "hcf:"+h);
           }
       public static void main(String args[])
         {
		xyz ob=new xyz();
                 ob.hcf5();

         }
}
