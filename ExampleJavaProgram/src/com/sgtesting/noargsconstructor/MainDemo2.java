package com.sgtesting.noargsconstructor;
class TwoWheeler
{
	String name;
	int speed;
	int noofwheels;
	int millage;
	int price;
	String brand;
	String color;
	TwoWheeler()
	{
		name="activa";
		speed=45;
		noofwheels=2;
		millage=45;
		price=85000;
		brand="honda";
		color="white";
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
	Fourwheeler()
	{
		name="alto";
		speed=180;
		millage=12;
		price=450000;
		color="red";
		cname="maruti";
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
		TwoWheeler bike= new TwoWheeler();
		

		Fourwheeler car= new Fourwheeler();
		
	}

}
