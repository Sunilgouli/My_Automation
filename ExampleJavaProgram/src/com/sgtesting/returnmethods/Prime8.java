package com.sgtesting.returnmethods;

class Prime
{
	boolean prime(int num)
	{
		
		
			if((num%2!=0)&&(num%3!=0))
			{
				
				     return true;
			}
			
		
		else
		{
			return false;
		}
	}
}

public class Prime8{

	public static void main(String[] args) {
		
		Prime ob=new Prime();
		boolean a=ob.prime(7);
		
		System.out.println(a);
	}

}

