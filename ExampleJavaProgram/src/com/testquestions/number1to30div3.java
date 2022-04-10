package com.testquestions;
class poornu
{
	int [] divisible()
	{
		int count=0;
		for (int i=1; i<=30; i++)
		{
			if(i%3==0)
			{
				count++;
			}
		}
		int a[] = new int [count];
		int k=0;
		for(int j=1; j<=30; j++)
		{
			if(j%3==0)
			{
				a[k]=j;
				k++;
			}
		}
		return a;
	}
}
public class number1to30div3 {

	public static void main(String[] args) {
		poornu obj = new poornu();
		int a [] = obj.divisible();
		for (int i=0; i<a.length; i++)
		{
		System.out.println(a[i]);

		}

	}

}
