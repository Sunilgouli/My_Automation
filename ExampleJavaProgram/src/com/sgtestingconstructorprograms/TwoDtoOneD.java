package com.sgtestingconstructorprograms;
class Array
{
	Array ( int a[][])
	{
		int p=0;
		int b[] = new int[a.length*a[0].length];
		for (int i=0; i<a.length; i++)
		{
				for(int j=0; j<a[i].length; j++)
				{
				b[p]=a[i][j];
				System.out.print(b[p]+" ");
				p++;
				}
				System.out.print("");
		}
	}
}
public class TwoDtoOneD {
	

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		Array o = new Array (a);

	}

}
