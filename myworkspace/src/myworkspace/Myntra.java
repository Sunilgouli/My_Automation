package myworkspace;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Thread.sleep(500);
		/*
		 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MYNTRA");
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("//input[@name='btnK']")).click();
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb qzEoUe']")).click()
		 * ;
		 */
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("apple iphone");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconSearch sprites-search')]"))
				.click();
		Thread.sleep(500);

	}

}
