package com.sgtesting.returnmethods;
class Multy
{
	int count()
	{
		int count=1;
		for (int i=1; i<=10; i++)
		{
		   count=count*i;
		}
		return count;
	}
}
public class Multiplication {

	public static void main(String[] args) {
		Multy obj = new Multy();
		int a = obj.count();
		System.out.println(a);

	}

}
