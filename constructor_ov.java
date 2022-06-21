import java.lang.*;
class student
{
	String name,regno;
	int marks1,marks2,marks3;
	student()
	{
		name="priyanka";
		regno="12345";
		marks1=50;
		marks2=60;
		marks3=70;
	}
	student(String n,String r,int m1,int m2,int m3)
	{
		name=n;
		regno=r;
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	student(student s)
	{
		name=s.name;
		regno=s.regno;
		marks1=s.marks1;
		marks2=s.marks2;
		marks3=s.marks3;
	}
		
	void display()
	{
		System.out.println("name: "+name+" registration no: "+regno+" marks1: "+marks1+" marks2: "+marks2+" marks3: "+marks3 );
	}
}
class constructor_ov
{
	public static void main(String args [])
	{
		student s1=new student();
		student s2=new student("priya","123456",80,90,100);
		student s3=new student(s1);
		s1.display();
		s2.display();
		s3.display();
	}
} 
