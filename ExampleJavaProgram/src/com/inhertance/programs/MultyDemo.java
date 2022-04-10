package com.inhertance.programs;
class Mechanical1
{
	void quality (String testing)
	{
		System.out.println("quality name is:" + testing);
	}
}
class Mechanical2 extends Mechanical1
{
	void manufacturing(int employes)
	{

		System.out.println("no of employes is:"+employes);
	}
}
class Mechanical3 extends Mechanical2
{
	void wearhouse(String department)
	{

		System.out.println("department name is:" +department);
	}
}



public class MultyDemo {
	public static void main(String[] args) {
		Mechanical3 o1 = new Mechanical3();
		o1.quality("utm maching");
		o1.manufacturing(2500);
		o1.wearhouse("ps1 wire drawing");
	}
}



