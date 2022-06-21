import java.util.*;
class string1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		String st="";
		int l,i;
		char w;
		System.out.println("enter a string:");
		s=sc.nextLine();
		l=s.length();
		for(i=0;i<l;i++)
		{
			w=s.charAt(i);
			st=w+st;
		}
		if(s.compareTo(st)==0)
		System.out.println("string is palindrome");
		else
		System.out.println("string is not palindrome");
	}
}
