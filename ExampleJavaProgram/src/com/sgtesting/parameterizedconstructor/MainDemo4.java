package com.sgtesting.parameterizedconstructor;
class Fruit
{
	String name;
	String color;
	int quantity;
	String quality;
	Fruit(String name,String color,int quantity,String quality)
	{
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
	flower(String name,int quantity,String color,String quality)
	{
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
	Vegetable(String color,String name,String quality,int quantity)
	{
		System.out.println("name:"+name);
		System.out.println("color:"+color);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
	}
}
public class MainDemo4 {

	public static void main(String[] args) {
		Fruit fr=new Fruit("greay","apple",2,"good");
        flower obj1= new flower("sunflower",2,"yellow","good");
		Vegetable obj2 = new Vegetable ("red","tomato","good",2);

	}

}
