package com.sgtesting.parameterizedconstructor;
class Desktop
{
	String name;
	int price;
	int ram;
	String brand;
	String proces;
	Desktop(String name,int price,int ram,String brand,String proces)
	{

		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("ram:"+ram);
		System.out.println("brand:"+brand);
		System.out.println("###########");
	}
}
class Laptop
{
	String version;
	String model;
	int ram;
	String brand;
	Laptop(String version,String model,int ram,String brand)
	{

		System.out.println("version:"+version);
		System.out.println("model:"+model);
		System.out.println("ram:"+ram);
		System.out.println("brand:"+brand);
		System.out.println("##########");
	}
}
class Mobile
{
	String name;
	int price;
	int ram;
	String camera;
	Mobile(String name,int price,int ram,String camera)
	{

		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("ram:"+price);
		System.out.println("camera:"+camera);
	}
}
public class MainDemo3 {

	public static void main(String[] args) {
		Desktop led=new Desktop("desk",45000,4,"samsung","intel");


		Laptop lcd= new Laptop("intel","15",8,"lenovo");


		Mobile mob=new Mobile("vivo",25000,8,"mega32");





	}

}
