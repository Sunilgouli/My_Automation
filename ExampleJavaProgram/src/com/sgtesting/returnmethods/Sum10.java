package com.sgtesting.returnmethods;
class Sum
{
	int count ()
	{
		int count=0;
		for ( int i=0; i<=10; i++)
		{
			count=count+i;
		}
		return count;



	}
}
public class Sum10 {

	public static void main(String[] args) {
		Sum obj = new Sum();
		 int a=obj.count();
		 System.out.println(a);

	}

}
