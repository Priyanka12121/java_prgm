import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int y;
		System.out.println("enter the year");
		y=sc.nextInt();
		if(y%100==00)
		{
 			if(y%400==00)
				{
 					System.out.println("leap year");
 				}
 			else 
 				{
 					System.out.println(" not leap year");
 				}
                }
   		else
                 {
                   if(y%4==0)
                     {
                      System.out.println("leap year");
                     }
                   else 
                    {
                     System.out.println(" not leap year");
                    }
                 }
      }
}


