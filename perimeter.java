class perimeter
{
	int length;		//class variable
	int breadth;
	perimeter()            //default constructor
	{
		length=0;
		breadth=0;
	}
	perimeter(int x,int y)   //parameterized constructor
	{
		length=x;
		breadth=y;
	}
	void calculate()
	{
		int peri;	//local variable
		peri=2*(length+breadth);
		System.out.println("perimeter :"+peri);
	}
	public static void main(String args[])  //main method
	{
		perimeter p1=new perimeter();    //calling default constructor
		perimeter p2=new perimeter(10,15);   //calling parameterized constructor
		p1.calculate(); 			
		p2.calculate();           
	}
}
		