import java.util.Scanner*:
public class Biggest _number
{
	public static void main(String[ ]args)
	{
		int x, y, z;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the 1st digit :");
		x=s.nextInt( );
		System.out.print("Enter the 2nd digit:");
		y=s.nextInt( );
		System.out.print("Enter the 3rd digit:");
		z=s.nextInt( );
		if (x > y && x > z )
		{
			System.out.print(" Largest Number is : " +x);
		}
		else if (y > z )
		{
			System.out.print(" Largest Number is : "+y);
		}
		else
		{
			System.out.print(" Largest Number is : "+z);
		}
	}
}			
