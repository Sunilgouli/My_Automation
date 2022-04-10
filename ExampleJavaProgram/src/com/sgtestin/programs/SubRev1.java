package com.sgtestin.programs;

public class SubRev1 {

	public static void main(String[] args) {
		int a[][]= {{9,8,7,},{4,5,6}};
		int b[][]= {{6,5,4,},{3,2,1}};
		int c[][]= new int [3][3];
		for (int i=a.length-1; i>=0; i--)
		{
			for (int j=a[i].length-1; j>=0; j--)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
