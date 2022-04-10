package com.abstrat.programs;
abstract class Student
{
	static String name="sunil";
	static
	{
		System.out.println("Student name is : "+ name);
	}

}
class Stud extends Student
{
	
}
public class SingleStatica {

	public static void main(String[] args) {
		Stud s=new Stud();


	}

}

