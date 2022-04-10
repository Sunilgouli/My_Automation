package com.testquestions;
class Division
{
	int [] divisible ()
	{
		int count=0;
		for(int i=100;i<=200; i++)
		{
			if(i%7==0)
			{
				count=count+1;
			}
		}
		int a[] = new int [count];
		int j=0;
		for (int k=100; k<=200; k++)
		{
			if (k%7==0)
			{
				a[j]=k;
				j++;
			}
		}
		return a;
	}
}
	public class Count100To20Div7{
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



