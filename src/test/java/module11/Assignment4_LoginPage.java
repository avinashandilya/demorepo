package module11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4_LoginPage {
	public WebDriver driver;
	public Properties prop;
	
	
	/* Assignment-3
 
 Write a Test Script to Automate https://www.saucedemo.com/index.html Login & Logout  using Page Object Model 
  -Create Maven Project
  -Use TestNG 
  -USe properties files to store Data and Objects */
	
	
	public Assignment4_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void printProperties() throws IOException
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\Selenium Training\\seleniumProject\\src\\test\\java\\module11\\Assignment4.properties");
		prop.load(ip);
		
		String Name = prop.getProperty("name");
		System.out.println(Name);
		
		String Age = prop.getProperty("age");
		System.out.println(Age);
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		String Browser = prop.getProperty("browser");
		System.out.println(Browser);
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("ff"))
	    {
	    System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	  		driver=new FirefoxDriver();
	    }
	    else if(Browser.equalsIgnoreCase("edge"))
	    {
	    	System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");
	    	driver=new EdgeDriver();
	    }
	}
	
	public void openURL() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public void type_UserName() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("UsernameField"))).sendKeys(prop.getProperty("username"));
		Thread.sleep(3000);
	}
	
	public void type_Password() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
	}
	
	public void click_Login() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		Thread.sleep(5000);
	}
	
	public void click_addtocart() throws InterruptedException
	{
		driver.findElement(By.xpath(prop.getProperty("addToCart"))).click();
		  Thread.sleep(5000);
	}
	  
	public void click_cart() throws InterruptedException
	{
		  driver.findElement(By.xpath(prop.getProperty("cart"))).click();
		  Thread.sleep(5000);
	}
	  
	public String capturePlaintxt() 
	{
		  return driver.findElement(By.xpath(prop.getProperty("cartplaintext"))).getText();	 
	}
	
	public void click_OpenMenu() throws InterruptedException
	{
		driver.findElement(By.xpath(prop.getProperty("OpenMenu"))).click();
		Thread.sleep(3000);
	}
	
	public void click_Logout() throws InterruptedException 
	{
		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
