package com.staticplus.programs;
class SumDigits
{
	static int getSumDigs(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+(num%10);
			{
				num=num/10;
			}
		}
		return sum;
	}
}
public class sumdemo {
public static void main(String[] args) {
	int num = 12345678;
	int SumDigs=SumDigits.getSumDigs(num);
	System.out.println("sum of digits in"+num+" is "+SumDigs);
	}

}
