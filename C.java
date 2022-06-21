abstract class A
{
	abstract void display();
	
}
class B extends A
{
	void display()
	{
		System.out.println("call me from B");
		
	}
}

class C
{
	public static void main(String args[])
	{
		B ob =new B();
		ob.display();
	}


}