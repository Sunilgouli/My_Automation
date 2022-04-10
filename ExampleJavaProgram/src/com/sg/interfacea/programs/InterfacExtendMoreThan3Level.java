package com.sg.interfacea.programs;
interface Finance
{
	void showfinancename(String name);
}
interface Employee extends Finance
{
	void shownoofemployees(int noofemployees);
}
interface Sallary extends Employee
{
	void showsalary(int salary);
}
interface Branch extends Sallary
{
	void showbranchname(String name);
}
class Sample41 implements Branch
{
	public void showfinancename(String name)
	{
		System.out.println("the finance name is :"+name);
	}
	public 	void shownoofemployees(int noofemployees)
	{
		System.out.println("no of employees are :"+noofemployees);
	}
	public void showsalary(int salary)
	{
		System.out.println("the sallary of employee is :"+salary);
	}
	public void showbranchname(String name)
	{
		System.out.println("the branch name is :"+name);
	}
	 void displayname(String name)
	{
		System.out.println("place name is :"+name);
	}
}
public class InterfacExtendMoreThan3Level {
	public static void main(String[] args) {
		Sample41 t = new Sample41();
		t.showfinancename("sriram");
		t.shownoofemployees(21);
		t.showsalary(25000);
		t.showbranchname("Acounatant");
		t.displayname("bidar");


	}

}
