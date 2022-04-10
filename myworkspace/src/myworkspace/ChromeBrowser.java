package myworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("amzon");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("womens saree");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);




		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span")).click();

		driver.quit();
	}

}
