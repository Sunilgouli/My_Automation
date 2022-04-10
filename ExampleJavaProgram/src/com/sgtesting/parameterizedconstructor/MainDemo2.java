package com.sgtesting.parameterizedconstructor;
class TwoWheeler
{
	String name;
	int speed;
	int noofwheels;
	int millage;
	int price;
	String brand;
	String color;
	TwoWheeler(String name,int speed,int noofwheels,int millage,int price,String brand,String color)
	{

		System.out.println("name:"+name);
		System.out.println("speed:"+speed);
		System.out.println("noofwheels:"+noofwheels);
		System.out.println("millage:"+millage);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		System.out.println("++++++++++++++");
	}
}
class Fourwheeler
{
	String name;
	int speed;
	int millage;
	int price;
	String color;
	String cname;
	Fourwheeler(String name,int speed,int millage,int price,String color,String cname)
	{

		System.out.println("name:"+name);
		System.out.println("speed:"+speed);
		System.out.println("millage:"+millage);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("cname:"+cname);
	}
}
public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheeler bike= new TwoWheeler("activa",45,2,45,85000,"honda","white");


		Fourwheeler car= new Fourwheeler("alto",180,12,4500,"red","maruti");

	}

}
