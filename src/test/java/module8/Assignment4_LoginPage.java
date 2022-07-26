package module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment4_LoginPage {
	WebDriver driver;
	
	//Write a Test Script to Automate Way2sms Login using Page Object Model 
	
	//Specify the object locator
	By mobile = By.xpath("//input[@name='mobileNo']");
	By password = By.xpath("//input[@name='password']");
	By button = By.xpath("(//button[@class='btn-theme-sm btn-ls text-uppercase'])[1]");
	
	public Assignment4_LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Create methods for every webelement
	
	public void type_MobileNo(String usrmobile) throws InterruptedException 
	{
		driver.findElement(mobile).sendKeys(usrmobile);
		Thread.sleep(3000);
	}
	
	public void type_Password(String pwd) throws InterruptedException
	{
		driver.findElement(password).sendKeys(pwd);
		Thread.sleep(3000);
	}
	
	public void click_Button()
	{
		driver.findElement(button).click();
	}
	
}
