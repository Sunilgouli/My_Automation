package com.abstrat.programs;
abstract class AA
{
	AA(int n1)
	{
		System.out.println("n1 : "+ n1);
	}
	AA(int n2,int n3)
	{
		System.out.println("n2 : "+ n2 + " n3: "+ n3);
	}
}
class BB extends AA
{
	BB(int n4)
	{
		super(n4);
		System.out.println("immediate sub class constructor 1 res : " );
	}
	BB(int n5,int n6)
	{
		super(n5,n6);
		System.out.println("immediate sub class constructor 2 res : ");
	}
	void add(int x, int y)
	{
		System.out.println("add : "+ (x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("sub : "+ (x-y));
	}
}
class CC extends AA
{
	CC(int a)
	{
		super(a);
		System.out.println("Sub class constructor1");
	}
	CC(int b,int c)
	{
		super(b,c);
		System.out.println("Sub class constructor2");
	}
	void add(int x, int y)
	{
		System.out.println("add : "+ (x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("sub : "+ (x-y));
	}
	void div(int x,int y)
	{
		System.out.println("div : "+ (x/y));
	}
	int res;
	static void add1(int a,int b)
	{
		int res=a+b;
		System.out.println("Static addition : "+res);
			
	}
}
public class HeirchInherAbstractOver {

	public static void main(String[] args) {
		CC c=new CC(3);
		CC c1=new CC(4,5);
		BB b=new BB(10,20);
		BB b1=new BB(100,200);
		c.sub(10, 5);
		c.add(2,3);
		c.div(25,5);
		c.add1(24,6);
	

	}

}
