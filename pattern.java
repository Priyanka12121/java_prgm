import java.util.*;
class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,k,j,l;
		for(i=4;i>=1;i++)
		{
			for(j=1;j<i;j++)		
			{
				System.out.print(" ");
			}
			for(k=i;k<=4;k++)
			{
				System.out.print(k);
			}
			for(l=4-i;l>0;l--)
			{
				k++;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

		
			