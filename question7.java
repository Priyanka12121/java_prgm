class cons
{
	cons()
	{
		int m;
		m=10*5;
		System.out.println("multiplication:"+m);
	}
	cons(int a,int b)
	{
		int s;
		s=a+b;
		System.out.println("sum:"+s);
	}
	cons(int a)
	{
		int d;
		d=a/a;
		System.out.println("Divide:"+d);
	}
	void substract()
	{
		int s;
		s=10-5;
		System.out.println("subtract method 1 "+s);
	}
	void substract(int a,int b)
	{
		int s1;
		s1=a-b;
		System.out.println("substract method 2 "+s1);
	}
}
class question7
{
	public static void main(String args[])
	{
		cons o1=new cons();
		cons o2=new cons(2,3);
		cons o3=new cons(5);
		o1.substract();
		o1.substract(8,4);
	}
}

