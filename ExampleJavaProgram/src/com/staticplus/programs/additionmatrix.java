package com.staticplus.programs;
class AdditionDemo
{
	static int[][] result (int a[][],int b[][])
	{
		int c[][] = new int [a.length][a[0].length];
		for(int i=0; i<a.length; i++)
		{
			for ( int j=0; j<a[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
public class additionmatrix {
public static void main(String[] args) {
	int a[][]= {{1,2,},{5,6}};
	int b[][]= {{4,5,},{2,3}};
	int res[][] = AdditionDemo.result(a, b);
	for(int i=0; i<res.length; i++)
	{
		for (int k=0; k<res[i].length; k++)
		{
			System.out.print(res[i][k]+"  ");
		
		}
		System.out.println(
				
				);
	}
	
}

}
