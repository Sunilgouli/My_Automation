package com.staticplus.programs;
class Demo4
{
	static int getsum()
	{
		int sum=0;
		for(int i=1; i<10; i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class DemoTest3 {
public static void main(String[] args) {
		Demo4.getsum();
		System.out.println(Demo4.getsum());
	}

}
