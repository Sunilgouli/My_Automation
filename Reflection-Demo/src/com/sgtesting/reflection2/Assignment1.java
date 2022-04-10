package com.sgtesting.reflection2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static WebDriver oBrowser=null;
			 public static void launchBrowser()
			{
				try
				{
					String path=System.getProperty("user.dir");
					System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
					oBrowser=new ChromeDriver();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public static void navigate()
			{
				try
				{
					oBrowser.navigate().to("http://localhost:81/login.do");
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public static void login()
			{
				try
				{
					oBrowser.findElement(By.id("username")).sendKeys("admin");
					oBrowser.findElement(By.name("pwd")).sendKeys("manager");
					oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public static void minimizeFlyOutWindow()
			{
				try
				{
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public static void createUser()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.name("firstName")).sendKeys("demo");
					Thread.sleep(1000);
                     oBrowser.findElement(By.name("lastName")).sendKeys("User1");
 					Thread.sleep(1000);
 					oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
					Thread.sleep(1000);
					oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
					oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
					oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
					oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
					Thread.sleep(3000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public void deleteUser()
			{
				try
				{
					oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
					Thread.sleep(3000);
					oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
					Thread.sleep(3000);
					Alert oAlert=oBrowser.switchTo().alert();
					String strContent=oAlert.getText();
					System.out.println(strContent);
					oAlert.accept();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			public static void closeApplication()
			{
				try
				{
					oBrowser.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			public static void logout()
			{
				try
				{
					oBrowser.findElement(By.linkText("Logout")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

		}


