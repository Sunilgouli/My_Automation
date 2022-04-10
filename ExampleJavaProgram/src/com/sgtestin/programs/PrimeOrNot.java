package com.sgtestin.programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		int a=3;
		int count=0;
		for (int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
			if(count>2)
			{
				System.out.println("Num is not prime");
			}
			else
			{
				System.out.println("Num is prime");
			}
		}
	}


