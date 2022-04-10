package com.sgtesting.parameterizedconstructor;
class capital
{
	String name;
	int population;
	String color;
	String cm ;
	capital(String name,int population,String color,String cm)
	{
		System.out.println("name:"+name);
		System.out.println("population:"+population);
		System.out.println("color:"+population);
		System.out.println("cm:"+cm);
		
	}
}
class district
{
	String name;
	String temple;
	int population;
	String area;
	district(String name,String temple,int population,String area)
	{
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
	village(String name,int population,String leader,int area)
	{
		System.out.println("area:"+area);
		System.out.println("leader:"+leader);
		System.out.println("name:"+name);
		System.out.println("population:"+population);
	}
}
public class MainDemo6 {

	public static void main(String[] args) {
		capital obj1 = new capital("banglore",68,"yellow","baswarajbommai");
		

		district obj2 = new district("bidrar","veerbhadra",89,"kalyan");
		

		village obj3 = new village("kanakatta",78,"raju",89);
		
	}

}
