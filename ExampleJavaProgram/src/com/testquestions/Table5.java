package com.testquestions;
class Table
{
	int[] tableeight()
	{
	int a[]=new int[10];
	 int temp=0;
	 int k=0;
		for(int i=1;i<=10;i++)
		{
			temp=i*8;
			a[k]=temp;
			k++;
		}
		
		return a;
	}
}

public class Table5 {

	public static void main(String[] args) {
      
	Table o=new Table();
	int a[]=o.tableeight();
	for(int k:a)
	{
		System.out.println(k);
	}
	
	
	}

}
