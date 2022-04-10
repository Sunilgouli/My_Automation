package com.sgtestingconstructorprograms;
class Substaction
{
	Substaction(int a[][],int b[][])
	{
	  for(int i=0; i<a.length;i++)
	  {
		  for(int j=0;j<a[i].length;j++)
		  {
			  int res=a[i][j]-b[i][j];
			  System.out.print(res+"  " );
		  }
		  
		  System.out.println();
	  }
	}
}

public class SubstractDemo {

	public static void main(String[] args) {
		int e[][] = {{56,65,89},{54,78,66}};
		int f[][] = {{40,50,60},{67,65,45}};
		Substaction sub=new Substaction(e,f);
		

	}

}
