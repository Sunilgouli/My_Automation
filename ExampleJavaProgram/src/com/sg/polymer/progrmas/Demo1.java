package com.sg.polymer.progrmas;
abstract class Vehicle
{
	abstract void run();
}
class Car extends Vehicle
{
	void run()
	{
		int a,b;
		a=30;b=30;
		System.out.println("the speed limit of car is"+(a+b));
	}
}
class Maruti extends Vehicle
{
	void run()
	{
		int a,b;
		a=40;b=30;
		System.out.println("the speed limit of maruti"+(a+b));
	}
}
class Mahindra extends Vehicle
{
	void run()
	{
		int a,b;
		a=50;b=50;
		System.out.println("the speed limit of mahindra"+(a+b));
	}
}





public class Demo1 {
	public static void main(String[] args) {
		Vehicle vk = null;

		Car c = new Car();
		Maruti m = new Maruti ();
		Mahindra ma = new Mahindra();

		vk=c;
		vk.run();
		vk=m;
		vk.run();
		vk=ma;
		vk.run();
	}

}
