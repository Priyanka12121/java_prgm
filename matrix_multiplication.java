import java.util.*;
class matrix_multiplication
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
	void multi(matrix1 m1,matrix1 m2)
	{
		int k,p,sum=0;
		if(m1.c==m2.r)
		{
			r=m1.r;
			c=m2.c;
			p=m1.c;
			a=new int[r][c];
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					for(k=0;k<p;k++)
					{
						sum=sum+m1.a[i][k]*m2.a[k][j];
					}
				        a[i][j]=sum;
					sum=0;
				}
			}
		}
		else
			System.out.println("multiplication isnt possible");
	}
	public static void main(String args[])
	{
		matrix1 x=new matrix1();
		matrix1 y=new matrix1();
		matrix1 z=new matrix1();
		x.input();
		y.input();
		z.multi(x,y);
		System.out.println("matrix after multiplication");
		z.show();
	}
}

	 	
		
