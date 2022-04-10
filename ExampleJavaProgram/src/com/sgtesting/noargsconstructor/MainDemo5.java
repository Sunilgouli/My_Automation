package com.sgtesting.noargsconstructor;
class cricket
{
	String name;
	int players;
	String captain;
	String vcaptain;
	cricket()
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
	footbal()
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
	hockey()
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
		
		footbal obj2= new footbal ();
		

		hockey obj3 = new hockey();
		

	}

}
