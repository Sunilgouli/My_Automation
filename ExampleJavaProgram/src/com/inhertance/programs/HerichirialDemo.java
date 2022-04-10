package com.inhertance.programs;
class Kannada
{
	void Actor (String name)
	{
		System.out.println("actor name is :"+name);
	}
}
class cricket extends Kannada
{
	void player(String batname)
	{
		System.out.println("batname is :"+batname);
	}
}
class cricket1 extends Kannada
{
	void noofplayers(int a)
	{

		System.out.println("no of players are :"+ a);
	}
}
class india extends Kannada
{
	void pm (String name)
	{
		System.out.println("pm name is :"+name);
	}
}

public class HerichirialDemo {
	public static void main(String[] args) {
		cricket o1 = new cricket();
		o1.Actor("kichaa sudeeep");
		o1.player("virat kohli");

		cricket1 o2 = new cricket1();
		o2.Actor("Darshan");
		o2.noofplayers(11);

		india o3 = new india ();
		o3.Actor("sunil");
		o3.pm("Narendra modi");



	}

}
