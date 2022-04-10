
package com.sgtesting.programs2;
class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
}
class Department
{
	String Dname;
	int numofworkers;
	String workplace;
	int sallary;
}
class Insurance
{
	String cname;
	int years;
	int amount;
	String typeofinsurance;
}

public class MainDemo1 {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.name="suni";
		obj1.idnumber=93;
		obj1.age=26;
		obj1.shift="ashift";
		System.out.println("name:"+obj1.name);
		System.out.println("idnumber:"+obj1.idnumber);
		System.out.println("age:"+obj1.age);
		System.out.println("shift:"+obj1.shift);
		Department bwr=new Department();
		bwr.Dname="quality";
		bwr.numofworkers=200;
		bwr.workplace="stock";
		bwr.sallary=25000;
		System.out.println("Dname:"+bwr.Dname);
		System.out.println("numofworkers:"+bwr.numofworkers);
		System.out.println("workplace:"+bwr.workplace);
		System.out.println("sallary:"+bwr.sallary);
		Insurance lic=new Insurance();
		lic.cname="sriram";
		lic.years=50;
		lic.amount=100000;
		lic.typeofinsurance="healthinsurance";
		System.out.println("cname:"+lic.cname);
		System.out.println("years:"+lic.years);
		System.out.println("amount:"+lic.amount);
		System.out.println("typeofinsurance:"+lic.typeofinsurance);
	}

}



