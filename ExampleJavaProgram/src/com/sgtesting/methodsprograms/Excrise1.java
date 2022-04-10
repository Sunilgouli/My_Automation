package com.sgtesting.methodsprograms;
class Addition
{
	void Addition(int a[][] ,int b[][])
	{
		int res;
		for ( int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				res=a[i][j]+b[i][j];
				System.out.print(res+" ");
				
			}
			System.out.println();

		}
	}
}



public class Excrise1 {

	public static void main(String[] args) {
		Addition obj = new Addition ();
		int m[][] = {{1,2,3,},{1,2,3}};
		int n[][] = {{4,5,6},{1,2,3}};
		obj.Addition(m, n);


	}

}
