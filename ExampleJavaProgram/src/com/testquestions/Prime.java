package com.testquestions;
class Prm
{
	boolean prime (int num){
		{
			
			
			if ((num%2!=0)   && (num%3!=0))
			{
		          return true;
			}
			
			
		else
		{
		return false;
	}
  }

}
}
	
public class Prime {
public static void main(String[] args) {
		Prm obj = new Prm ();
		boolean a = obj.prime(7);
		
		System.out.println(a);
		}

}


