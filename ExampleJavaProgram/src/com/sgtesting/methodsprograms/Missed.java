package com.sgtesting.methodsprograms;
class MissingElement
{
	void find (int a[])
	{
		int ene = a.length+1;
		int ts = ene*(ene+1)/2;
		int sum=0;
		for (int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(" missing no is:"+ (ts-sum));
	}
}


public class Missed {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,7,8,9,10};
		MissingElement obj = new MissingElement();
		obj.find(a);

	}

}
