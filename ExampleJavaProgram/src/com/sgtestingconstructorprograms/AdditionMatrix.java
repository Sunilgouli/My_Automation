package com.sgtestingconstructorprograms;
class Addition1
{
	Addition1(int a[] [], int b[] [] )
	{
		for(int i=0;i<a.length; i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int res= a[i][j]+b[i][j];
				System.out.print(res+" " );
			}
			System.out.println();
		}

	}
}

	public class AdditionMatrix {

		public static void main(String[] args) {
			int i[] []= {{10,20,30,},{10,20,30}};
			int h[] []= {{10,20,30},{10,40,50}};
			Addition1 o = new Addition1(i,h);
		}

	}
