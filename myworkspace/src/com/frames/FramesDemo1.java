package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesDemo1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
driver.navigate().to("https://www.irctc.co.in/nget/train-search");
Thread.sleep(500);
driver.manage().window().maximize();
Thread.sleep(500);
driver.switchTo().frame(0);
driver.switchTo().defaultContent();
Thread.sleep(2000);


}

}
