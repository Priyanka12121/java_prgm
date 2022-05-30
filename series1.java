import java.util.*;
class series1
{
	public static void main(String args[])
	{
		int i,j,k,p=-1,l;
		for(i=4;i>=1;i--)
		{
			p++;
			for(k=i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			for(l=j;l<=j+p;j++)
			{
				if(i!=4)
					{
						System.out.print(l+" ");
					}
			}
			
			System.out.println();
		}
	}
}
