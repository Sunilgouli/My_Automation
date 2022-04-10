package com.sgtesting.programs2;
class TwoWheeler
{
	String name;
	int speed;
	int noofwheels;
	int millage;
	int price;
	String brand;
	String color;
}
class Fourwheeler
{
	String name;
	int speed;
	int millage;
	int price;
	String color;
	String cname;
}
public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheeler bike= new TwoWheeler();
		bike.name="activa";
		bike.speed=45;
		bike.noofwheels=2;
		bike.millage=45;
		bike.price=85000;
		bike.brand="honda";
		bike.color="white";
		System.out.println("name:"+bike.name);
		System.out.println("speed:"+bike.speed);
		System.out.println("noofwheels:"+bike.noofwheels);
		System.out.println("millage:"+bike.millage);
		System.out.println("price:"+bike.price);
		System.out.println("brand:"+bike.brand);
		System.out.println("color:"+bike.color);
		System.out.println("++++++++++++++");

		Fourwheeler car= new Fourwheeler();
		car.name="alto";
		car.speed=180;
		car.millage=12;
		car.price=450000;
		car.color="red";
		car.cname="maruti";
		System.out.println("name:"+car.name);
		System.out.println("speed:"+car.speed);
		System.out.println("millage:"+car.millage);
		System.out.println("price:"+car.price);
		System.out.println("color:"+car.color);
		System.out.println("cname:"+car.cname);
	}

}
