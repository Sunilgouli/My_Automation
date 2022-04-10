package com.sgtesting.parameterizedconstructor;
class cricket
{
	String name;
	int players;
	String captain;
	String vcaptain;
	cricket(String name,int players,String captain,String vcaptain)
	{
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
	footbal(String name,int players,String bestp,String captain)
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
	hockey(String country,String win,int players,String worldcup)
	{
		System.out.println("win:"+win);
		System.out.println("country:"+country);
		System.out.println("worldcup:"+worldcup);
		System.out.println("players:"+players);
	}
}
public class MainDemo5 {

	public static void main(String[] args) {
		cricket obj1= new cricket("india",11,"virat","rohit");
		
		footbal obj2= new footbal ("india",11,"sunil","rahul");
		

		hockey obj3 = new hockey("india","india",11,"america");
		

	}

}
