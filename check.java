import java.lang.Exception;
class myexcep extends Exception
{
	myexcep(String message)
	{
		super(message);
	}
}
class check
{
	public static void main(String args[])
	{
		int x,y,z,a;
		x=5;
		y=1000;
		try
		{
			z=x/y;
			if(z<0.1)
			{
				throw new myexcep(" x value is too small");
			}
		}
		catch(myexcep e)
		{
			System.out.println("exception caught");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("i m always there");
		}
	}
}
