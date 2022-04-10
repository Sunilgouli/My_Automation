
package com.sgtesting.parameterizedconstructor;
class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
	Employee(String name,int idnumber,int age,String shift)
	{
		System.out.println("name:"+name);
		System.out.println("idnumber:"+idnumber);
		System.out.println("age:"+age);
		System.out.println("shift:"+shift);
	}
}
class Department
{
	String Dname;
	int numofworkers;
	String workplace;
	int sallary;
	Department(String Dname,int numofworkers,String workplace,int sallary)
	{
		System.out.println("Dname:"+Dname);
		System.out.println("numofworkers:"+numofworkers);
		System.out.println("workplace:"+workplace);
		System.out.println("sallary:"+sallary);
	}
}
class Insurance
{
	String cname;
	int years;
	int amount;
	String typeofinsurance;
	Insurance(String cname,int years,int amount,String typeofinsurance)
	{
		System.out.println("cname:"+cname);
		System.out.println("years:"+years);
		System.out.println("amount:"+amount);
		System.out.println("typeofinsurance:"+typeofinsurance);
	}

	public class MainDemo1 {
		public static void main(String[] args) {
			Employee obj1 = new Employee("sunil",89013,24,"ashift");

			Department bwr=new Department("quality",200,"stock",10000);

			Insurance lic=new Insurance("sriram",50,100000,"healthinsurance");


		}
	}
}





