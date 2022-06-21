class first
{
	void display()
	{
		System.out.println("class first");
	}
	
}
class second extends first
{
	void display()
	{
		System.out.println("class second");
	}
}

class third extends second
{
	void display()
	{
		System.out.println("class third");
	}
}
class question8
{
	public static void main(String args[])
	{
		first f;
		second s=new second();
		third t=new third();
		f=s;
		f.display();
		f=t;
		f.display();
		f=new first();
		f.display();
	}
}