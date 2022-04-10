package com.sgtesting.methodsprograms;
class Multi
{
	 void square ()
	{
		int res;
		for (int i=0; i<=10; i++)
		{
			res=i*i;
			System.out.println(res);
		}
	}
}

public class Practice2 {

	public static void main(String[] args) {
		Multi obj = new Multi();
		obj.square();

	}

}
