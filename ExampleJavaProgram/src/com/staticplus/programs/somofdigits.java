package com.staticplus.programs;
class NoOfDigits
{
	static int getDigCount(int num)
	{
		int digcount=0;
		while(num>0)
		{
			digcount++;
			num=num/10;
			
		}
		return digcount;
	}
	
}
public class somofdigits {
public static void main(String[] args) {
		int num=7856;
		int digcnt= NoOfDigits.getDigCount(num);
		System.out.println("number of digit"+num+"is"+digcnt);
	}

}
