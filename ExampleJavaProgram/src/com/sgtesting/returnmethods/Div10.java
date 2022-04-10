package com.sgtesting.returnmethods;
class Division
{
	int [] divisible ()
	{
		int count=0;
		for(int i=1;i<=100; i++)
		{
			if(i%10==0)
			{
				count=count+1;
			}
		}
		int a[] = new int [count];
		int j=0;
		for (int k=1; k<=100; k++)
		{
			if (k%10==0)
			{
				a[j]=k;
				j++;
			}
		}
		return a;
	}
}
	public class Div10 {
		public static void main (String args[])
		{
			Division obj = new Division();
			int a[] = obj.divisible();
			for (int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
	}



