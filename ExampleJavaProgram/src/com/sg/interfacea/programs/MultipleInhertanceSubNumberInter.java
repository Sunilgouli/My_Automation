package com.sg.interfacea.programs;
interface laptop
{
	void showlaptopname(String name);
}
interface computer
{
	void showcomputername(String name);
}
interface mobile
{
	void showmobilename(String name);
}
abstract class Gadgets
{
	abstract void showgadjetsname(String name);
}
class Sample12 extends Gadgets implements laptop,computer,mobile
{
	public void showlaptopname(String name)
	{
		System.out.println("the best laptop name is :"+name);
	}
	public void showcomputername(String name)
	{
		System.out.println("the superb computer name is :"+name);
	}
	public void showmobilename(String name)
	{
		System.out.println("the popular mobile  name is :"+name);
	}
	public void showgadjetsname(String name)
	{
		System.out.println("the gadjets name is :"+name);
	}
	void displayaddress(String address)
	{
		System.out.println("Address:"+address);
	}
}

public class MultipleInhertanceSubNumberInter {
	public static void main(String[] args) {
		Sample12 s=new Sample12();
		s.showlaptopname("Lenovo");
		s.showcomputername("HP");
		s.showmobilename("Vivo");
		s.showgadjetsname("Electronics");
		s.displayaddress("S.G.Institute");
	}
}