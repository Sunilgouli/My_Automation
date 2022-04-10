package com.sg.polymer.progrmas;
abstract class MathsDemo
{
	abstract void maths();
}
		class addition extends MathsDemo
		{
			void maths()
			{
				int a,b;
				a=20;b=10;
				System.out.println("the addition result is :"+(a+b));
			}
		}
		class substraction extends MathsDemo
		{
			void maths()
			{
				int a,b;
				a=30;b=20;
				System.out.println("substraction result:"+(a-b));
			}
		}
		class Division extends MathsDemo
		{
			void maths()
				{
					int a,b;
					a=40;b=4;
					System.out.println("division result :"+(a/b));
					
				}
			}
		
public class PolymerPackageDemo1 {
public static void main(String[] args) {
MathsDemo o =null;


	}

}
