abstract class vehicle
{
	abstract void engine();
}
class car extends vehicle
{
	void engine()
	{
		System.out.println("Car has good engine");

	}
}
class truck extends vehicle
{
	void engine()
	{
		System.out.println("Truck has bad engine");
	}
}
class Abstractdemo
{
	public static void main(String args[])
	{
		car ob1=new car();
		truck ob2=new truck();
		ob1.engine();
		ob2.engine();
	}
}
