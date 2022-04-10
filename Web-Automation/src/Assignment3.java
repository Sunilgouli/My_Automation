import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimize();

	}
	private static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Login")).click();
			Thread.sleep(2000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try
		{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
