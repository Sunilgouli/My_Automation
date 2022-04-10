package com.sg.polymer.progrmas;
abstract class Animal
{
	abstract void eat();
}
class Cow extends Animal
{
	void eat()
	{
		System.out.println("cow eats gross");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog eats biscuits");
	}
}
class Tiger extends Animal
{
	void eat ()
	{
		System.out.println("tiger eats deer");
	}
}
public class Demo5 {
public static void main(String[] args) {
	Animal a =null;
	
	Cow c = new Cow();
	Dog d = new Dog();
	Tiger t= new Tiger();
	a=c;
	a.eat();
	a=d;
	a.eat();
	a=t;
	a.eat();
	


	}

}
