package com.sgtesting.noargsconstructor;

class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
	Employee()
	{
		name="sunil";
		idnumber=95;
		age=26;
		shift="ashift";
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
	Department()
	{
		Dname="quality";
		numofworkers=200;
		workplace="stock";
		sallary=25000;
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
	Insurance()
	{
		cname="sriram";
		years=50;
		amount=100000;
		typeofinsurance="healthinsurance";
		System.out.println("cname:"+cname);
		System.out.println("years:"+years);
		System.out.println("amount:"+amount);
		System.out.println("typeofinsurance:"+typeofinsurance);
	}

	public class MainDemo1 {
		public static void main(String[] args) {
			Employee obj1 = new Employee();

			Department bwr=new Department();

			Insurance lic=new Insurance();


		}
	}
}





