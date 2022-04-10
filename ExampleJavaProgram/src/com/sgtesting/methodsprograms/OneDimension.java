package com.sgtesting.methodsprograms;
class Single
{
	void Array(int a[]) 
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}

	}
}
public class OneDimension {

	public static void main(String[] args) {
		int b[]= {1,2,3};
		Single o = new Single ();
		o.Array(b);

	}

}
