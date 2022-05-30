import java.util.*;
class string2
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
			if(Character.isUpperCase(w))
			{
				st=st+Character.toLowerCase(w);
			}
			else if(Character.isLowerCase(w))
			{
				st=st+Character.toUpperCase(w);
			}
			else
			st=st+w;
		}
		System.out.println("original string "+s);
		System.out.println("string after manipulation "+st);
	}
}
