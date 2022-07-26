package module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment2 {
	public WebDriver driver;
	
	/*
	Test Scenario I:---File Download  
	Step-1 Launch Firefox Browser
	Step-2 Open Test URL https://www.selenium.dev/downloads/
	Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
	Step-4 Automate File Download    
	Step-5 Close Browser

	*/
	
	@Test(priority=1)
	  public void launchBrowser() throws InterruptedException 
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=2)
	  public void openURL() throws InterruptedException
	  {
		  driver.get("https://www.selenium.dev/downloads");
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=3)
	  public void downloadSeleniumJava() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//p[text()='The Internet Explorer Driver Server']/following::*[53]")).click();
		  Thread.sleep(12000);
		  driver.close();
	  }
}
