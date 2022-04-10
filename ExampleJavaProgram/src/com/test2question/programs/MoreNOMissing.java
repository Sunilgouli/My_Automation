package com.test2question.programs;

public class MoreNOMissing {
	public static void main(String[] args) 
	{ 
		int[] arry = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		int[] size = new int[arry.length];
		for (int i : arry)
		{
			 size[i] = 1;
		}
         System.out.println("missing numbers in given array");
		for (int i = 1; i < size.length; i++)
		{
			if (size[i] == 0)
			{
				System.out.println(i);

			}

		}

	}	

}
