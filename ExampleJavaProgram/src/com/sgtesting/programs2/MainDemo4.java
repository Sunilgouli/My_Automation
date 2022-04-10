package com.sgtesting.programs2;
class Fruit
{
	String name;
	String color;
	int quantity;
	String quality;
}
class flower
{
	String name;
	int quantity;
	String color;
	String quality;
}
class Vegetable
{
	String color;
	String name;
	String quality;
	int quantity;
}
public class MainDemo4 {

	public static void main(String[] args) {
		Fruit fr=new Fruit();
		fr.color="greay";
		fr.name="apple";
		fr.quantity=2;
		fr.quality="good";
		System.out.println("color:"+fr.color);
		System.out.println("name:"+fr.name);
		System.out.println("quantity:"+fr.quantity);
		System.out.println("quality:"+fr.quality);
		System.out.println("++++++++++++");

		flower obj1=new flower();
		obj1.name="sunflower";
		obj1.color="yellow";
		obj1.quantity=2;
		obj1.quality="good";
		System.out.println("name:"+obj1.name);
		System.out.println("color:"+obj1.color);
		System.out.println("quantity:"+obj1.quantity);
		System.out.println("quality:"+obj1.quality);
		System.out.println("+++++++++++");

		Vegetable obj2= new Vegetable ();
		obj2.name="Tomato";
		obj2.color="red";
		obj2.quantity=2;
		obj2.quality="good";
		System.out.println("name:"+obj2.name);
		System.out.println("color:"+obj2.color);
		System.out.println("quantity:"+obj2.quantity);
		System.out.println("quality:"+obj2.quality);
	}

}
