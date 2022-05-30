import java.util.*;
class tax
	{
		float tt,r,k,c,t,t1;
		void input()
			{
                          Scanner sc=new Scanner(System.in);
			 System.out.println("enter the nos hrs for which cab is booked");
                         r=sc.nextFloat();
                        }
                void cal()
			{
                          if(r<=3)
				{
					t=r*300;
				}
  		          else if((r>3)&&(r<=7))
				{
					c=r-3;
					t=3*300+c*500;
				}
			else if((r>7)&&(r<=12))
				{
					c=r-7;
					t=3*300+4*500+c*700;
				}
			else if(r>12)
			{
				c=r-12;
				t=3*300+4*500+5*700+c*800;
			}
			t1=t+150;
			k=(float)14.5*t1/100;
			tt=t1+k;
		  } 
		void display()
			{
                          System.out.println("total charges:"+tt);
			}
                public static void main(String args[])
                      {
                        tax ob=new tax();
                        ob.input();
                        ob.cal();  
                        ob.display();
                      }
     }
