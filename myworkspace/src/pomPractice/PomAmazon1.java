package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class PomAmazon1 {
	public static void main(String[] args) 
			throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PomScript sunil = new PomScript(driver);
		driver.get("http://localhost:81/login.do");
		Thread.sleep(500);
        driver.manage().window().maximize();
		sunil.getUserName().sendKeys("admin");
		Thread.sleep(500);
		sunil.getpasword().sendKeys("manager");
		Thread.sleep(500);
		sunil.getlogin().click();
		Thread.sleep(500);
		sunil.getminimize().click();
		Thread.sleep(500);
		sunil.Gettasks().click();
		Thread.sleep(500);
		sunil.getnewtask().click();
		Thread.sleep(500);
		sunil.getnewcustumer().click(); 
		Thread.sleep(500);
	}

}
