package com.sgtesting.methodsprograms;
class Sub
{
	void sub (int a[][],int b[][])
	{
		int res;
		for (int i=0; i<a.length; i++) 
		{
			for (int j=0; j<a[i].length; j++)
			{
				res=a[i][j]-b[i][j];
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}

}
public class Excrise2 {

	public static void main(String[] args) {
		int m[][] = {{9,8,7},{7,8,6}};
		int n[][] = {{4,5,6},{1,2,3}};
		Sub obj = new Sub ();
		obj.sub(m,n);
	}

}
