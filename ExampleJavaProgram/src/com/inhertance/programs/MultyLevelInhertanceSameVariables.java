package com.inhertance.programs;
class SameVar
{
	int num;
	void show()
  {
		System.out.println("super class:"+num);
	}
}
class SameVar2 extends SameVar
{
	int num;
	SameVar2(int n1, int n2)
	{
		super.num=n1;
		num=n2;
	}
 void display()
 { 
	 System.out.println("1st sub class :"+num);
 }
}
class SameVar3 extends SameVar2
{
	int sum;
	SameVar3(int n3, int n4, int n5)
	
	{
		super(n3,n4);
		num=n5;
	}
	void display1()
	{
		System.out.println("2nd sub class :"+num);
		
	}
}
public class MultyLevelInhertanceSameVariables {
public static void main(String[] args) {
	
	SameVar3 obj = new SameVar3(47,85,98);
	obj.show();
	obj.display();
	obj.display1();
   }

}
