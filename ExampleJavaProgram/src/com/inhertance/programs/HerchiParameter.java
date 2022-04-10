package com.inhertance.programs;
class Stud1
{
	String FirstName;
	String LastName;
	int age;
	Stud1(String FirstName,String LastName)
	{
		System.out.println("Super FirstName Of Student:"+FirstName);
		System.out.println("Super LastName Of Student:"+LastName);
	}
	Stud1(int age)
	{
		System.out.println("Age Of the student:"+age);
	}
}
class Stud2 extends Stud1
{
	Stud2(String FirstName,String LastName)
	{
		super(FirstName,LastName);
	}
	Stud2(int age)
	{
		super(age);
	}
}
class Stud3 extends Stud1
{
	Stud3(String FirstName,String LastName)
	{
		super(FirstName,LastName);
	}
	Stud3(int age)
	{
		super(age);
	}
}
public class HerchiParameter {
	public static void main(String[] args) {
		Stud2 obj=new Stud2("sunil","kashi");
		Stud2 obj1=new Stud2(20);
		System.out.println("**************************");
		Stud3 obj3=new Stud3("rahul","anu");
		Stud3 obj4=new Stud3(30);
	}
}
