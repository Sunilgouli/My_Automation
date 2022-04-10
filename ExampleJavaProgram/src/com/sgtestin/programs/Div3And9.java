package com.sgtestin.programs;

public class Div3And9 {

	public static void main(String[] args) {
		int i=50;
		do
		{
			if((i%3==0) && (i%9==0))
			{
				System.out.println(i);

			}
			i--;
		}while(i>=1);
	}

}


