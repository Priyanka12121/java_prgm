import java.util.*;
class matrix
{
	int r,c,i,j;
	int a[][];
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows n columns");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		System.out.println("enter the elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void show()
	{
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}
	void add(matrix m1,matrix m2)
	{
		if(m1.c==m2.c && m2.r==m1.r)
		{
			r=m1.r;
			c=m1.c;
			a=new int[r][c];
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]=m1.a[i][j]+m2.a[i][j];
				}
			}
		}
		else
			System.out.println("addition isnt possible");
	}
	public static void main(String args[])
	{
		matrix x=new matrix();
		matrix y=new matrix();
		matrix z=new matrix();
		x.input();
		y.input();
		z.add(x,y);
		System.out.println("matrix after addition");
		z.show();
	}
}

	 	
		
