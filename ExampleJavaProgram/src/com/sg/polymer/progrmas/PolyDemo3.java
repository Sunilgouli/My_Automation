package com.sg.polymer.progrmas;
abstract class Mens
{
	abstract void swim();
}
class Sir extends Mens
{
	void swim()
	{
		System.out.println("prabhakar sir swimming in river");
	}
}
class Sunil extends Mens
{
	void swim()
	{
		System.out.println("sunil swimming in pool");
	}
}
class Kashinath extends Mens
{
	void swim()
	{
		System.out.println("kashinath swimming in ocean");
	}
}
public class PolyDemo3 {
	public static void main(String[] args) {
		Mens s = null;

		Sir m = new Sir();
		Sunil u = new Sunil();
		Kashinath k = new Kashinath();

		s=m;
		s.swim();
		s=u;
		s.swim();
		s=k;
		s.swim();





	}

}
