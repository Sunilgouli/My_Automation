package com.sgtesting.programs2;
class capital
{
	String name;
	int population;
	String color;
	String cm ;
	String state;
	{

	}
}
class district
{
	String name;
	String temple;
	int population;
	String area;
	{

	}
}

class village
{
	String name;
	int population ;
	String leader ;
	int area;
	{

	}
}
public class MainDemo6 {

	public static void main(String[] args) {
		capital obj1 = new capital();
		obj1.name="banguluru";
		obj1.population=68;
		obj1.color="yelloered";
		obj1.cm="baswarajboomai";
		obj1.state="karnataka";
		System.out.println("name:"+obj1.name);
		System.out.println("population:"+obj1.population);
		System.out.println("color:"+obj1.population);
		System.out.println("cm:"+obj1.cm);
		System.out.println("state:"+obj1.state);


		district obj2 = new district();
		obj2.name="bidar";
		obj2.area="kalyank";
		obj2.population=89;
		obj2.temple="veerbhadra";
		System.out.println("name:"+obj2.name);
		System.out.println("area:"+obj2.area);
		System.out.println("population:"+obj2.population);
		System.out.println("temple:"+obj2.temple);
		System.out.println("+++++++++");
		


		village obj3 = new village();
		obj3.area=87;
		obj3.leader="raju";
		obj3.name="kankatta";
		obj3.population=47;
		System.out.println("area:"+obj3.area);
		System.out.println("leader:"+obj3.leader);
		System.out.println("name:"+obj3.name);
		System.out.println("population:"+obj3.population);

	}

}
