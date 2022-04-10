package com.inhertance.programs;
class Computer1
{
	void product (String name)
	{
		System.out.println("product name is :"+name);
	}
}
class Computer2 extends Computer1
{
	void brand (String name)
	{
		System.out.println("brand name is :"+name);
	}
}
class Computer3 extends Computer2
{
	void producuts (int number )
	{
		System.out.println("no of products are :"+number);
	}
}
class Computer4 extends Computer1
{
	void display(String name)
	{
		System.out.println("the display name is :"+name);
	}
}
public class HybridDemo {
public static void main(String[] args) {
	Computer3 o1 = new Computer3();
	o1.product("Lenovo");
	o1.brand("Dell");
	o1.producuts(800);
	
	Computer4 o2 = new Computer4();
	o2.display("o led");
	

		
	}

}
