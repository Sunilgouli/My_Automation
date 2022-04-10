package com.sgtesting.returnmethods;
class Odd1
{
	int odd1()
	{
		int count=0;
		for(int i=500;i>=1;i--)
		{
			if(i%2!=0) 
			{
				count=count+1;
				
			}
		}
		return count;
		
	}
}

public class Odd {

	public static void main(String[] args) {
	  
	Odd1 obj=new Odd1();
	int a=obj.odd1();
	System.out.println(a);

	}

}


