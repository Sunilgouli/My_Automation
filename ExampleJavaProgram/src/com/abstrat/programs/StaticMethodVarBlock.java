package com.abstrat.programs;
abstract class CollegeDemo
{
	static int noofstudents=25;
	static String name;
	static String num;

	static void pname()
	{
		System.out.println("The name of the college principle : "+ name);
		System.out.println("no of students are:"+noofstudents );
	}
	static void showRollnum()
	{
		System.out.println("Roll number series : "+ num );
	}
	static
	{
		num="120930";
		showRollnum();
		name="sunil";
		CollegeDemo.pname();
	}

}
public class StaticMethodVarBlock {

	public static void main(String[] args) {
		CollegeDemo.name="prabhakar";
		System.out.println("in main method pname is : " + CollegeDemo.name);


	}

}
