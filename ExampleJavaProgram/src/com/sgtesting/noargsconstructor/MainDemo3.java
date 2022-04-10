package com.sgtesting.noargsconstructor;
class Desktop
{
	String name;
	int price;
	int ram;
	String brand;
	String proces;
	Desktop()
	{
		name="desk";
		price= 45000;
		ram=4;
		brand="samsung";
		proces="intel";
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("ram:"+ram);
		System.out.println("brand:"+brand);
		System.out.println("###########");
	}
}
class Laptop
{
	String version;
	String model;
	int ram;
	String brand;
	Laptop()
	{
		version="intel";
		model="i5";
		ram=8;
		brand="lenovo";
		System.out.println("version:"+version);
		System.out.println("model:"+model);
		System.out.println("ram:"+ram);
		System.out.println("brand:"+brand);
		System.out.println("##########");
	}
}
class Mobile
{
	String name;
	int price;
	int ram;
	String camera;
	Mobile()
	{
		name="vivo";
		price=25000;
		ram=8;
		camera="mega32";
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("ram:"+price);
		System.out.println("camera:"+camera);
	}
	}
public class MainDemo3 {

	public static void main(String[] args) {
		Desktop led=new Desktop();
		
		
		Laptop lcd= new Laptop();
		
		
		Mobile mob=new Mobile();
		
		
		
		
		
	}

}
