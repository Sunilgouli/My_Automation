package com.sg.polymer.progrmas;
abstract class HillStations
{
	abstract void Location();
}
class Karnataka extends HillStations
{
	void Location()
	{
		String name;
		name="malenadu";
		System.out.println("the famous place in karnataka is :"+name);
	}
}
class Himachal extends HillStations
{
	void Location()
	{
		String name;
		name="manali";
		System.out.println("the popular place in himachal is : "+name);
	}
}
class Jammu extends HillStations
{
	void Location()
	{
		String name;
		name="Ladhak";
		System.out.println("the famous place in jammu:"+name);
	}
}
public class Demo4 {
	public static void main(String[] args) {
		HillStations S = null;

		Karnataka k = new Karnataka();
		Himachal h = new Himachal();
		Jammu j = new Jammu();

		S=k;
		S.Location();
		S=h;
		S.Location();
		S=j;
		S.Location();


	}

}
