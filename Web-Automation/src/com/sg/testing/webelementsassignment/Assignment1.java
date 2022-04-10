package com.sg.testing.webelementsassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		createuser();
		deleteuser();
		logout();
		closeApplication();
		
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
	private static void minimizeFlyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Darshan");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("koddu");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("darshan@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("santosh");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123789");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
			private static void  closeApplication()
			{
				try
				{
					oBrowser.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
}

