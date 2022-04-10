package com.staticplus.programs;
class Demo3
{
	void addition(int x, int y)
	{
		int res = (x+y);
		System.out.println("addition result:"+res);
	}
	static void substraction (int a , int b)
	{
		int res = (a-b);
		System.out.println("result:"+ res);
	}
}
public class DemoTest2 {
public static void main(String[] args) {
		
Demo3 obj = new Demo3();
obj.addition(50, 40);
Demo3.substraction(100, 50);
	}

}
