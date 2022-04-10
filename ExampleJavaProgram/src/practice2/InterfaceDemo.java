package practice2;
interface Dist
{
	void showDistname(String name);
	void showmylaptopname(String name);
}
class Taluka implements Dist
{
	public void showDistname(String name)
	{
		System.out.println("the district name is :"+name);
	}
	public void showmylaptopname(String name)
	{
		System.out.println("the laptop name is:"+name);
	}
	void showstatename(String name)
	{
		System.out.println("the state name is :"+name);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Taluka t1=new Taluka();
		t1.showDistname("BIDAR,BHALKI,YADGIRI");
		t1.showDistname("HAMPI");
		t1.showstatename("Karnataka");
		t1.showmylaptopname("LENOVO,DELL");
		
	}

}
