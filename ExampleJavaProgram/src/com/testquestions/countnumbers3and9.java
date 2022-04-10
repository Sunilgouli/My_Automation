package com.testquestions;
class Sampl
{
	int [] divisible ()
	{
		int count=0;
		for(int i=1;i<=100; i++)
		{
			if((i%3==0) && (i%9==0))
			{
				count=count+1;
			}
		}
		int a[] = new int [count];
		int j=0;
		for (int k=1; k<=100; k++)
		{
			if ((k%3==0)  && (k%9==0))
			{
				a[j]=k;
				j++;
			}
		}
		return a;
	}
}
	public class countnumbers3and9 {
		public static void main (String args[])
		{
			Sampl obj = new Sampl();
			int a[] = obj.divisible();
			for (int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
	}

