package com.staticplus.programs;
class Missing
{
	static int getMissed()
	{
		int []arr = {1,3,4,2,6};
		int n=arr.length+1;

		int sum = (n*(n+1))/2;

		for (int i=0; i<arr.length; i++)
		{
			sum = sum-arr[i];
		}
		return sum;
	}

}

public class Test1Missing {
	public static void main(String[] args) {
		int val= Missing.getMissed();
		System.out.println(val);

	}

}
