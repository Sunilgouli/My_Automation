package com.abstrat.programs;
abstract class Sample
{
	abstract void cityname(String name);
	abstract void clgname(String clgname);
}
abstract class ColName extends Sample
{
	void cityname(String name)
	{
		System.out.println("Cityname : "+ name);
	}
}
class ColAddress extends ColName
{
	void clgname(String clgname)
	{
		System.out.println("College name : "+ clgname);
	}
}
public class MultyLevelInher {

	public static void main(String[] args) {
		ColAddress c=new ColAddress();
		c.cityname("Bangalore");
		c.clgname("BKIT");

	}

}

