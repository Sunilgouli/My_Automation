package practice2;
abstract class vehicle
{
	abstract void start(String name);
	abstract void stop(String name);
	 void run(String name)
	 {
		 
	 }
	 
	 
	
}
class car extends vehicle
{
	void start(String name)
	{
		System.out.println("car starts with :"+name);
	}
	void stop(String name)
	{
		System.out.println("car stops with:"+name);
	}
	void run(String name)
	{
		System.out.println("car runs with:"+name);
	}
}

public class AbstractionDemo2 {

	public static void main(String[] args) {
		car c1=new car();
		c1.start("key");
		c1.stop("button");
		c1.run("gears");

	}
}
	


