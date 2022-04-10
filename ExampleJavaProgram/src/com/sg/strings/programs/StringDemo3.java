package com.sg.strings.programs;
class Sample
{
	String firstname;
	int age;
	
	public Sample(String fn,int age)
	{
		firstname=fn;
		this.age=age;
	}
	
	public String toString()
	{
		return "First Name of the Student is "+firstname+" and his age is "+age;
	}
}
public class StringDemo3 {
	public static void main(String[] args) {
		Sample obj=new Sample("Santosh",19);
		System.out.println(obj);

	}

}

	