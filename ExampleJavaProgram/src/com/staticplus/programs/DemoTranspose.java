package com.staticplus.programs;
class Transpose
{
	static int [][]getmatrix(int a[][])
	{
    int c[][] = new int [a.length][a[0].length];
	for ( int i=0; i<a.length; i++)
		{
		for( int j=0; j<a[i].length; j++)
		{
			c[j][i]=a[i][j];
		}
	}
	return a;
}
}
public class DemoTranspose {
public static void main(String[] args) {
	int a[][] = {{1,3},{5,6}};	
	int  res[][] = Transpose.getmatrix(a);
	for(int i=0; i<res.length; i++)
	{
		for (int k=0; k<res[i].length; k++)
         {
			System.out.print(res[i][k]+"     ");
	}
		System.out.println();

       }
     }
}
