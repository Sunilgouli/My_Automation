package com.sgtestin.programs;

public class Divisble2And10 {

	public static void main(String[] args) {
		for( int i=1; i<=100; i++)
		{
			if (i%2==0)
			{
				if (i%10==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}
