package practice2;
class Dubai
{
	String name;
	String color;
	Dubai(String name,String color)
	{
		System.out.println("name:"+name);
		System.out.println("color:"+color);
	}
}
class Mobile
{
	String name;
	int no;
	Mobile(String name,int no)
	{
		System.out.println("mobile name is :"+name);
		System.out.println("model no:"+no);
	}
}

public class Pramaterizedconst {

	public static void main(String[] args) {
		Dubai r1=new Dubai("Abudabhi","Black");
		Mobile r2=new Mobile("vivo",2);
		Mobile r3=new Mobile ("samsung",5);
		Mobile r4=new Mobile ("redmi",78);

	}

}
