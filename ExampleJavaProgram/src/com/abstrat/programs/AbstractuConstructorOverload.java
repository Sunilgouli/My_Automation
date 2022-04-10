package com.abstrat.programs;
abstract class Colleges
{
	Colleges(String gname)
	{
		System.out.println("Girl name : " +gname);
	}
	Colleges(int age)
	{
		System.out.println("Age : "+age);
	}
	abstract void bname(String bname1);
}
class Col extends Colleges
{
	Col(String gname1)
	{
		super(gname1);
	}
	Col(int age1)
	{
		super(age1);
	}
	void bname(String bname1)
	{
		System.out.println("Boy name : "+bname1);
	}
}
public class AbstractuConstructorOverload {

	public static void main(String[] args) {
		Col c=new Col("manjula");
		Col c1=new Col(23);
		c.bname("sunil");
		

	}

}


