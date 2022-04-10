package practice2;
class Hospital
{
	String name;
	Hospital(String name)
	{
		System.out.println("Hospital name is "+name);
	}
	int id;
	Hospital(int id)
	{
		System.out.println("Hospital id is :"+id);
	}
	String firstname;
	int page;
	Hospital(int patientage,String  firstname)
	{
		System.out.println("patient name is:"+firstname);
		System.out.println("patient age is:"+page);
	}
	
}
 
public class ConstructorOverRiding {

	public static void main(String[] args) {
		Hospital v1= new Hospital(25,"sunil");
		Hospital v2=new Hospital(16);
		Hospital v3=new Hospital("kashinath");

	}

}
