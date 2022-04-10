package com.sgtesting.returnmethods;
class Table
{
	int[] tablefive()
	{
	int a[]=new int[10];
	 int temp=0;
	 int k=0;
		for(int i=1;i<=10;i++)
		{
			temp=i*5;
			a[k]=temp;
			k++;
		}
		
		return a;
	}
}

public class Table8 {

	public static void main(String[] args) {
      
	Table o=new Table();
	int a[]=o.tablefive();
	for(int k:a)
	{
		System.out.println(k);
	}
	
	
	}

}


	

