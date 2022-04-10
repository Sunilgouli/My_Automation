package com.testquestions;


class Student
{
	String grade(int a)
	{
		if((a>=0)&&(a<35))
		{
			return "fale";
		}
		if((a>=35)&&(a<60))

		{
			return "second class";
		}

		if((a>=60)&&(a<70))
		{
			return "first class";		

		}

		if((a>=70)&&(a<=100))
		{
			return "fcd";
		}


		return "invalid input";
	}
}

public class gradeass{

	public static void main(String[] args) {

		Student ob=new Student();
		String d=ob.grade(60);

		System.out.println("the grade of student is:"+d);

	}

}

