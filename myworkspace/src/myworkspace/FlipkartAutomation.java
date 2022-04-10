package myworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys("Flipkart");
Thread.sleep(500);
driver.findElement(By.name("btnK")).click();
Thread.sleep(500);

driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > div > input")).sendKeys("VIVO V20 MOBILE");
driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg")).click();
	}

}
