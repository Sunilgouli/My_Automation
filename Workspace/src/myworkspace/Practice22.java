package myworkspace;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice22 {

	public static void main(String[] args)
			
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "library\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate 
		driver.navigate().to("http://localhost:81/login.do");
		Thread.sleep(500);
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//login
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(500);
		driver.findElement(By.linkText("Login")).click();
	
		driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
		Thread.sleep(500);
		

		//create user
		driver.findElement(By.linkText("USERS")).click();
		Thread.sleep(500);
		driver.findElement(By.className("buttonText")).click();
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("DEEPAKKUMAR");
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Dandge");
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("deepakumar@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("deepak");
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("ss123456");
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("ss123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Create User']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='userNameSpan']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Delete User')]")).click();
		Thread.sleep(500);
		
		//popup handle window
		Alert oAlert=driver.switchTo().alert();
		String strContent=oAlert.getText();
		System.out.println(strContent);
		oAlert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		Thread.sleep(500);
	
		driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("GANGA KAVERI");
		Thread.sleep(500);
		
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("ganga kaveri is the best  project");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(500);
		}

}
