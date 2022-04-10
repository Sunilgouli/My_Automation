package com.testquestions;
class Tabu
{
	int[] tablefour()
	{
	int a[]=new int[10];
	 int temp=0;
	 int k=0;
		for(int i=1;i<=10;i++)
		{
			temp=i*4;
			a[k]=temp;
			k++;
		}
		
		return a;
	}
}

public class Table4 {

	public static void main(String[] args) {
      
	Tabu o=new Tabu();
	int a[]=o.tablefour();
	for(int k:a)
	{
		System.out.println(k);
	}
	
	
	}

}



