package com.sgtesting.programs2;
class Desktop
{
	String name;
	int price;
	int ram;
	String brand;
	String proces;
}
class Laptop
{
	String version;
	String model;
	int ram;
	String brand;
}
class Mobile
{
	String name;
	int price;
	int ram;
	String camera;
	}
public class MainDemo3 {

	public static void main(String[] args) {
		Desktop led=new Desktop();
		led.name="desk";
		led.price= 45000;
		led.ram=4;
		led.brand="samsung";
		led.proces="intel";
		System.out.println("name:"+led.name);
		System.out.println("price:"+led.price);
		System.out.println("ram:"+led.ram);
		System.out.println("brand:"+led.brand);
		System.out.println("###########");
		
		Laptop lcd= new Laptop();
		lcd.version="intel";
		lcd.model="i5";
		lcd.ram=8;
		lcd.brand="lenovo";
		System.out.println("version:"+lcd.version);
		System.out.println("model:"+lcd.model);
		System.out.println("ram:"+lcd.ram);
		System.out.println("brand:"+lcd.brand);
		System.out.println("##########");
		
		Mobile mob=new Mobile();
		mob.name="vivo";
		mob.price=25000;
		mob.ram=8;
		mob.camera="mega32";
		System.out.println("name:"+mob.name);
		System.out.println("price:"+mob.price);
		System.out.println("ram:"+mob.price);
		System.out.println("camera:"+mob.camera);
		
		
		
		
	}

}
