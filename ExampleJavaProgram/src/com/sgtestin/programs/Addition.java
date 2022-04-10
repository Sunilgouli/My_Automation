package com.sgtestin.programs;

public class Addition {

	public static void main(String[] args) {
		int a[][] = {{2,4,5,},{8,5,9,}};
		int b[][] = {{3,5,0,},{4,5,8,}};
		int c[][] = new int[3][3];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
		     {
					System.out.println();
		}
	 }
   }
 }
}

