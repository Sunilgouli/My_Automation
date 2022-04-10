package com.inhertance.programs;
class SuperStudent
{
	String Firstname;
	String Lastname;
	int Age;
	SuperStudent(String Firstname,String Lastname)
	{
		System.out.println("Name of the student in Super Class:"+Firstname);
		System.out.println("Branch of the student in SUper Class:"+Lastname);
		
	}
	SuperStudent(int Age)
	{
		System.out.println("Age of the student:"+Age);
	}
}
class SubBranch extends SuperStudent
{
	SubBranch(String Firstname,String Lastname)
	{
		super(Firstname,Lastname);
	}
	SubBranch(int Age)
	{
		super(Age);
	}
}
class SubCollegeName extends SubBranch
{
	SubCollegeName(String Firstname,String Lastname)
	{
		super(Firstname,Lastname);
	}
	SubCollegeName(int Age)
	{
		super(Age);
	}
}

class SubPassoutYear extends SuperStudent
{
	SubPassoutYear(String Firstname,String Lastname)
	{
		super(Firstname,Lastname);
	}
	SubPassoutYear(int Age)
	{
		super(Age);
	}	
}

public class HybridOverload{
	public static void main(String[] args) {
		SubCollegeName obj=new SubCollegeName("sunil","gouli");
		SubCollegeName obj1=new SubCollegeName(123);
		System.out.println("**************************");
		SubPassoutYear o=new SubPassoutYear("Arun","Patil");
		SubPassoutYear o1=new SubPassoutYear(111);
	}
}
