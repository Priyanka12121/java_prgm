import java.util.*;
class matrix3
{
	int a[][];
	int r,c,i,j,s=0,l=0;
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
	}
	void find()
	{
	int f=0;
	for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(f==0)
				{
					s=a[i][j];
					l=a[i][j];
					f=1;
				}
				if(a[i][j]<s)
				s=a[i][j];
				else if(a[i][j]>l)
				l=a[i][j];
			}
		}
	}
	void show()
	{
		System.out.println(" matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("smallest element:"+s);
		System.out.println("largest element:"+l);
	}
	public static void main(String args[])
	{
		matrix3 ob=new matrix3();
		ob.input();
		ob.find();
		ob.show();
	}
}
		
