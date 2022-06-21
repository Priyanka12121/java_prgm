interface sum1
{
	void sum(int a,int b);
}
interface sum2
{
	void sum();
}
class A1 implements sum1,sum2
{
	public void sum(int a,int b)
	{
		int s ;
		s=a+b;
		System.out.println("sum1"+s);
	}
	public void sum()
	{
		int s;
		s=10+5;
		System.out.println("sum2"+s);
	}
	public static void main(String args[])
	{
		A1 ob=new A1();
		ob.sum(2,3);
		ob.sum();
	}

}


 