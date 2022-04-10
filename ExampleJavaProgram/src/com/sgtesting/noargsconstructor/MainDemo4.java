package com.sgtesting.noargsconstructor;
class Fruit
{
	String name;
	String color;
	int quantity;
	String quality;
	Fruit()
	{
		color="greay";
		name="apple";
		quantity=2;
		quality="good";
		System.out.println("color:"+color);
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("++++++++++++");
	}
}
class flower
{
	String name;
	int quantity;
	String color;
	String quality;
	flower()
	{
		name="sunflower";
		color="yellow";
		quantity=2;
		quality="good";
		System.out.println("name:"+name);
		System.out.println("color:"+color);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("+++++++++++");


	}
}
class Vegetable
{
	String color;
	String name;
	String quality;
	int quantity;
	Vegetable()
	{
		name="Tomato";
		color="red";
		quantity=2;
		quality="good";
		System.out.println("name:"+name);
		System.out.println("color:"+color);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
	}
}
public class MainDemo4 {

	public static void main(String[] args) {
		Fruit fr=new Fruit();

		flower obj1=new flower();
		Vegetable obj2= new Vegetable ();

	}

}
