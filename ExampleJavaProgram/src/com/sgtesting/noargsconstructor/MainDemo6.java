package com.sgtesting.noargsconstructor;
class capital
{
	String name;
	int population;
	String color;
	String cm ;
	String state;
	capital()
	{
		name="banguluru";
		population=68;
		color="yelloered";
		cm="baswarajboomai";
		state="karnataka";
		System.out.println("name:"+name);
		System.out.println("population:"+population);
		System.out.println("color:"+population);
		System.out.println("cm:"+cm);
		System.out.println("state:"+state);
	}
}
class district
{
	String name;
	String temple;
	int population;
	String area;
	district()
	{
		name="bidar";
		area="kalyank";
		population=89;
		temple="veerbhadra";
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("population:"+population);
		System.out.println("temple:"+temple);
		System.out.println("+++++++++");
	}
}

class village
{
	String name;
	int population ;
	String leader ;
	int area;
	village()
	{
		area=87;
		leader="raju";
		name="kankatta";
		population=47;
		System.out.println("area:"+area);
		System.out.println("leader:"+leader);
		System.out.println("name:"+name);
		System.out.println("population:"+population);
	}
}
public class MainDemo6 {

	public static void main(String[] args) {
		capital obj1 = new capital();
		

		district obj2 = new district();
		

		village obj3 = new village();
		
	}

}
