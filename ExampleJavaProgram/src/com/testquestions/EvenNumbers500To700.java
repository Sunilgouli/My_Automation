package com.testquestions;
class Even
{
	int count()
	{
		int count=0;
		for(int i=500; i<=700; i++)
		{
			count=count+i;
		}
		return count;
	}
}
public class EvenNumbers500To700 {
public static void main(String[] args) {
	Even obj = new Even ();
	int a = obj.count();
	{
		System.out.println(a);
	}
		
	}

}
