package practice2;
interface university
{
	void showuniversityname(String name);
	void shownmaeis(String name);
}
interface college extends university
{
	void showcollegename(String name);
}
class school implements college
{
	public 	void showuniversityname(String name)
	{
		System.out.println("university name is:"+name);
	}
	public 	void showcollegename(String name)
	{
		System.out.println("college name:"+name);
	}
	public 	void shownmaeis(String name)
	{
		System.out.println("my name is :"+name);
	}
	void showschoolname(String name)
	{
		System.out.println("school name is:"+name );
	}


}
public class InterfaceDemo3 {

	public static void main(String[] args) {
school s1=new school();
s1.showuniversityname("vtu");
s1.showcollegename("BKIT");
s1.showschoolname("veerbhadreshwar cshool");
s1.shownmaeis("sunil");
	}

}
