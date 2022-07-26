package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartObjectRepo {
	public WebDriver driver;
	
	By emailId = By.xpath("//span[text()='Login']//following::*[7]");
	By password = By.xpath("//span[text()='Login']//following::*[12]");
	By loginButton = By.xpath("(//span[text()='Login'])[2]");
	
	public FlipkartObjectRepo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void type_emailId() throws InterruptedException 
	{
		driver.findElement(emailId).sendKeys("avinashandilya@gmail.com");
		Thread.sleep(3000);
	}
	
	public void type_password() throws InterruptedException
	{
		driver.findElement(password).sendKeys("9631022520");
		Thread.sleep(3000);
	}
	
	public void clicl_loginButton() throws InterruptedException
	{
		driver.findElement(loginButton).click();
		Thread.sleep(5000);
	}
	
}
