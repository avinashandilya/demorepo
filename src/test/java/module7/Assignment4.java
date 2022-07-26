package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment4 {
	public WebDriver driver;
	/*
	Test Scenario I:---File Download  
	Step-1 Launch Firefox Browser
	Step-2 Open Test URL https://www.selenium.dev/downloads/
	Step-3 In table Selenium Client & WebDriver Language Bindings, automate the plain text   
	Step-4 Get the plain text Java , Python  into Console   
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
  public void plainText() throws InterruptedException
  {
	  String text = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium Clients and WebDriver')])/following::*[1]")).getText();
	  System.out.println(text);
	  Thread.sleep(3000);
	  driver.close();
  }
}
