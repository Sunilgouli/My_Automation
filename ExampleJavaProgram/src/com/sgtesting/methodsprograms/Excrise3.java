package com.sgtesting.methodsprograms;
class Transpose
{
	void Transpose(int a[][])
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++ )
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}




public class Excrise3 {

	public static void main(String[] args) {
		int a[][] = {{1,4,},{8,5}};
		Transpose obj = new Transpose();
		obj.Transpose(a);
	}
}





