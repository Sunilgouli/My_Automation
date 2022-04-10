package practice2;
class Student
{
	int rollno;
	String name;
	Student()
	{
		rollno=15;
		name="sunil";
		System.out.println("rolllno is :"+rollno);
		System.out.println("student name is :"+name);
	}
}
class India
{
	String laungages;
	int populaion;
	India()
	{
		laungages="english";
		populaion=1524589799;
		System.out.println("laungages:"+laungages);
		System.out.println("population:"+populaion);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student s2=new Student();
		India s=new India();

	}

}
