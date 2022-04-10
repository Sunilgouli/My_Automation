package com.sg.interfacea.programs;
interface country
{
	void showcountryname(String name);
}
interface state
{
	abstract void showstatename(String name);
}
interface dist
{
	abstract void showdistname(String name);
}
interface taluka
{
	abstract void showtalukaname(String name);
}
class Sample implements country,state,dist,taluka
{
	public void showcountryname(String name)
	{
		System.out.println("country name is :"+name);
	}
	public void showstatename(String name)
	{
		System.out.println("state name is :"+name);
	}
	public void showdistname(String name)
	{
		System.out.println("dist name is :"+name);
	}
	public void showtalukaname(String name)
	{
		System.out.println("taluka name is :"+name);
	}
	void displayactor(String name)
	{
		System.out.println("the famous actor name is :"+name);
	}
}

public class MultipleInheratanceMore3Interface {
	public static void main(String[] args) {
		Sample o = new Sample();
		o.showcountryname("India");
		o.showstatename("Karnataka");
		o.showdistname("bidar");
		o.showtalukaname("Humnabad");
		o.displayactor("Kichaa Sudeep");
	}
}






