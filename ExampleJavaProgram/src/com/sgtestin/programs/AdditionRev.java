package com.sgtestin.programs;

public class AdditionRev {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,},{4,5,6}};
		int b[][] = {{7,8,9,},{5,5,6}};
		int c[][] = new int [3][3];
		for (int i=a.length-1; i>=0; i--)
		{
			for (int j=a[i].length-1; j>=0; j-- )
			{
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
