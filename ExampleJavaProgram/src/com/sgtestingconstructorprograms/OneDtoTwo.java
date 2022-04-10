package com.sgtestingconstructorprograms;
class Array1
{
	Array1(int a[],int row, int column)
	{
		int p=0;
		int b[][] = new int [row][column];
		for (int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				b[i][j] = a[p];
				p++;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}


public class OneDtoTwo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		Array1 obj = new Array1 (a,2,3);


	}

}
