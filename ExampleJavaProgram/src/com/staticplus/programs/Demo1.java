package com.staticplus.programs;
class Demo2
{
	static String firstname;
	static int age;
	static void addition(int a, int b)
	{
		int res=(a+b);
		System.out.println("addition result:"+res);
	}
	static void substraction(int x, int y)
	{
		int res = (x-y);
		System.out.println("substraction result:"+res);
	}
	
}
public class Demo1 {
public static void main(String[] args) {
	Demo2.firstname="sunilkumar";
	Demo2.age=24;
	System.out.println(Demo2.firstname+"   "+Demo2.age);
	Demo2.addition(20,40);
	Demo2.substraction(50, 40);
		
	}

}
