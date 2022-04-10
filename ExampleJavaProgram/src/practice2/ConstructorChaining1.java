package practice2;
class Sachin
{
	String name;
	int age;
	String city;
	Sachin(int age,String city)
	{
		
		System.out.println("age"+age);
	}
	Sachin(String name,int age,String city)
	{
		
		this.name=name;
		this.city=city;
		System.out.println("name:"+name);
		System.out.println("city:"+city);
		
	}


}

public class ConstructorChaining1 {

	public static void main(String[] args) {
		Sachin v1=new Sachin("rahul",87,"kankatta");

	}

}
