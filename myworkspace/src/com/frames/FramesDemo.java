package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chromium')]")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[contains(text(),'ChromiumDriver')]")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		WebElement opage= driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(opage);
		Thread.sleep(500);
		String content=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div")).getText();
		System.out.println(content);
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
	}

}
