package com.abstrat.programs;
abstract class College
{
	static void add(int a,int b)
	{
		int res=a+b;
		System.out.println("addition : "+res);

	}
	static void sub(int a,int b)
	{
		int res=a-b;
		System.out.println("subtraction : "+res);
	}
}

public class TwoStaticMethod {

	public static void main(String[] args) {
		College.add(2, 5);
		College.sub(56, 6);
	}

}

