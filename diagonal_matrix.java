import java.util.*;
class matrix4
{
	int a[][];
	int r,c,i,j;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows n columns:");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		System.out.println("enter the elements of matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(" matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void check()
	{
		int f=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if((i+j!=3)&&(i!=j))
				{
					if(a[i][j]!=0)
					f=1;
				}		
			}
		}
		if(f==1)
		System.out.println("it is not a diagonal matrix");
		else 
		System.out.println("it is a diagonal matrix");
	}
	public static void main(String args[])
	{
		matrix4 ob=new matrix4();
		ob.input();
		ob.check();
	}
}
		
		
