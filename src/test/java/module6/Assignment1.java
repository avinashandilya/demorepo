package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Assignment1 {
	
	public WebDriver driver;
	
	/*
	Test Scenario I:   Actions 
	Step-1 Launch Chrome Browser
	Step-2 Open Test URL https://www.flipkart.com/ 
	Step-3 If found any screen hiding actual page Close the Screen
	Step-4  Move mouse Pointer  towards Women
	Step-5  Click on Shoes
	Step-6 Close Browser 
	*/
  @Test(priority=1)
  public void setup() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  
  }
    
  @Test(priority=2)
  public void openURL() throws InterruptedException
  {
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  
  @Test(priority=3)
  public void closeLoginPopup() throws InterruptedException
  {
	driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::*[15]")).click();
	Thread.sleep(3000);
  }
  
  @Test(priority=4)
  public void moveTowardsFashion() throws InterruptedException
  {
	  WebElement e1 = driver.findElement(By.xpath("//*[text()='Fashion']"));
	  Actions a = new Actions(driver);
	  a.moveToElement(e1).build().perform();
	  Thread.sleep(3000);
  }
  
  @Test(priority=5)
  public void moveTowardsWomenFootwear() throws InterruptedException
  {
	  WebElement e2 = driver.findElement(By.xpath("//*[text()='Women Footwear']"));
	  Actions a = new Actions(driver);
	  a.moveToElement(e2).build().perform();
	  Thread.sleep(3000);
  }
  
  @Test(priority=6)
  public void clickAll() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[text()='All']")).click();
	  Thread.sleep(5000);
  }
  
  @Test(priority=7)
  public void teardown()
  {
	  driver.close();
  }

}
