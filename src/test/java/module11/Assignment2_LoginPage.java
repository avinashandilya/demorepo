package module11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment2_LoginPage {
	public WebDriver driver;
	
	/* Assignment-2
 
 Write a Test Script to Automate https://www.saucedemo.com/index.html Login   & Logout   using Page Object Model 
  -Create Maven Project
  -Use TestNG
  -Create Repository in Class File   */
	
	By UserName 		= By.xpath("//input[@id='user-name']");
	By PwdField 		= By.xpath("//input[@id='password']");
	By LoginBttn 		= By.xpath("//input[@id='login-button']");
	By addToCart 		= By.xpath("(//button[text()='Add to cart'])[1]");
	By cart 			= By.xpath("//div[@id='shopping_cart_container']");
	By cartplaintext 	= By.xpath("//div[contains(text(),'carry.allTheThings')]");
	By OpenMenu			= By.xpath("//button[text()='Open Menu']");
	By Logout			= By.xpath("//a[text()='Logout']");
	
	public Assignment2_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void type_UserName(String uname) throws InterruptedException {
		driver.findElement(UserName).sendKeys(uname);
		Thread.sleep(3000);
	}
	
	public void type_Password(String pwd) throws InterruptedException {
		driver.findElement(PwdField).sendKeys(pwd);
		Thread.sleep(3000);
	}
	
	public void click_Login() throws InterruptedException {
		driver.findElement(LoginBttn).click();
		Thread.sleep(5000);
	}
	
	public void click_addtocart() throws InterruptedException
	{
		  driver.findElement(addToCart).click();
		  Thread.sleep(5000);
	}
	  
	public void click_cart() throws InterruptedException
	{
		  driver.findElement(cart).click();
		  Thread.sleep(5000);
	}
	  
	public String capturePlaintxt() 
	{
		  return driver.findElement(cartplaintext).getText();
		 
	}
	
	public void click_OpenMenu() throws InterruptedException
	{
		driver.findElement(OpenMenu).click();
		Thread.sleep(3000);
	}
	
	public void click_Logout() throws InterruptedException 
	{
		driver.findElement(Logout).click();
		Thread.sleep(3000);
	}
	
}
