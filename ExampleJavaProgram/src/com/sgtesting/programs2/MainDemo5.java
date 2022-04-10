package com.sgtesting.programs2;
class cricket
{
	String name;
	int players;
	String captain;
	String vcaptain;
	{
		captain="virat";
		name="india";
		players=11;
		vcaptain="rohit";
		System.out.println("capatain:"+captain);
		System.out.println("name:"+name);
		System.out.println("players:"+players);
		System.out.println("vcaptain:"+vcaptain);
		System.out.println("++++++++++");
	}
}
class footbal
{
	String name;
	int players;
	String bestp;
	String captain;
	{
		name="india";
		players=15;
		bestp="sunil";
		captain="rahul";
		System.out.println("name:"+name);
		System.out.println("players:"+players);
		System.out.println("bestp:"+bestp);
		System.out.println("captain:"+captain);
		System.out.println("+++++++");


	}
}
class hockey
{
	String country;
	String win;
	int players;
	String worldcup;
	{
		win="india";
		country="america";
		worldcup="india";
		players=11;
		System.out.println("win:"+win);
		System.out.println("country:"+country);
		System.out.println("worldcup:"+worldcup);
		System.out.println("players:"+players);
	}
}
public class MainDemo5 {

	public static void main(String[] args) {
		cricket obj1= new cricket();
		obj1.captain="virat";
		obj1.name="india";
		obj1.players=11;
		obj1.vcaptain="rohit";
		System.out.println("capatain:"+obj1.captain);
		System.out.println("name:"+obj1.name);
		System.out.println("players:"+obj1.players);
		System.out.println("vcaptain:"+obj1.vcaptain);
		System.out.println("++++++++++");

		footbal obj2= new footbal ();
		obj2.name="india";
		obj2.players=15;
		obj2.bestp="sunil";
		obj2.captain="rahul";
		System.out.println("name:"+obj2.name);
		System.out.println("players:"+obj2.players);
		System.out.println("bestp:"+obj2.bestp);
		System.out.println("captain:"+obj2.captain);
		System.out.println("+++++++");



		hockey obj3 = new hockey();
		obj3.win="india";
		obj3.country="america";
		obj3.worldcup="india";
		obj3.players=11;
		System.out.println("win:"+obj3.win);
		System.out.println("country:"+obj3.country);
		System.out.println("worldcup:"+obj3.worldcup);
		System.out.println("players:"+obj3.players);



	}

}
