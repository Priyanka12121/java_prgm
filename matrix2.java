import java.util.*;
class matrix2
{
	int a[][];
	int b[][];
	int r,c,i,j;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows n columns:");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[r][c];
		System.out.println("enter the elements of matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void transpose()
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[j][i]=a[i][j];
			}
		}
	}
	void show()
	{
		System.out.println("original matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("matrix after transpose:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		matrix2 ob=new matrix2();
		ob.input();
		ob.transpose();
		ob.show();
	}
}
	
	
	
		

		
