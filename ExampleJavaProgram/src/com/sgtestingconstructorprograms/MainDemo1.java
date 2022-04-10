package com.sgtestingconstructorprograms;
class Fact
{
	Fact(int a)
	{
		int fact=1;
		for(int i=a;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);

	}

}
public class MainDemo1 {

	public static void main(String[] args) {
		Fact o = new Fact(5);


	}

}
