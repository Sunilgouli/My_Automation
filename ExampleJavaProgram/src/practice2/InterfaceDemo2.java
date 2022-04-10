package practice2;
interface table
{
	void showtablename(String name);
	
	}
interface  chair
{
	void showchairname(String name);
}
class Box implements table,chair
{
	public 	void showtablename(String name)
	{
		System.out.println("table name is:"+name);
		System.out.println("+++++++++++");
	}
	public 	void showchairname(String name)
	{
		System.out.println("the chair name is:"+name);
		System.out.println("+++++++++++");
	}
	void showmyname(String name)
	{
		System.out.println("my name is :"+name);
		System.out.println("++++++++++++++");
	}


}

public class InterfaceDemo2 {

	public static void main(String[] args) {
Box b1=new Box();
b1.showtablename("Amazon Brand");
b1.showchairname("ajanta");
b1.showmyname("sunil");
	}

}
