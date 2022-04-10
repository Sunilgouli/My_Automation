package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PomScript{


	public PomScript (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//userWebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//password webelement

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	public WebElement getpasword()
	{
		return pwd;
	}
	//login
	@FindBy(xpath="//div[contains(text(),'Login')]")
	private WebElement log;
	public WebElement getlogin()
	{
		return log;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminimize()
	{
		return gettingStartedShortcutsPanelId;
	}
	//task
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement task;
	public WebElement Gettasks()
	{
		return task;
	}
	//addnewtask
	@FindBy(xpath="//div[contains(text(),'Add New Task')]")
	private WebElement newtask;
	public WebElement getnewtask()
	{
		return newtask;
	}
	// createnewtask
	@FindBy(xpath="//div[contains(@class,'item createNewTask ellipsis')]")
	private WebElement creatnewtask;
	public WebElement getnewcustumer()
	{
		return creatnewtask;
	}
	
}

