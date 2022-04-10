package practice2;
abstract class sgsoftware
{
	abstract void faculty(String name);
	abstract void humanresources(int no);
	
}
class institute extends sgsoftware
{
	 void faculty(String name)
	 {
		 System.out.println("faculty name is :"+name);
	 }
	 void humanresources(int no)
	 {
		 System.out.println("no of resources are:"+no);
	 }

}

public class AbstractDemo {

	public static void main(String[] args) {
		institute v1=new institute();
		v1.faculty("devika");
		v1.humanresources(5);

	}

}
