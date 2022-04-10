package com.test2question.programs;
class ReverseDemo
{
	static int getreverse()
	{
		int count=0;
		for (int i=10; i>=1; i--)
		{
			count=count+1;
		}
		return count;
	}
}
public class Reverse {
public static void main(String[] args) {
	int val = ReverseDemo.getreverse();
	System.out.println(val);

	}

}
