package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment3 {
	public WebDriver driver;
	
	/*
	Test Scenario I:   Actions 
	Step-1 Launch Chrome Browser
	Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
	Step-3 Right  Click on Double-Click Me To See Alert Button  
	Step-4 Close Browser
	*/
	
	@Test(priority=1)
	  public void launchBrowser() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=2)
	  public void openURL() throws InterruptedException
	  {
		  driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=3)
	  public void rightClick() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
		  WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		  action.contextClick(button).build().perform();
		  Thread.sleep(3000);
	  }
	  
	  
	  @Test(priority=4)
	  public void acceptAlert() throws InterruptedException
	  {
		  driver.switchTo().alert().accept();
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=5)
	  public void closeBrowser()
	  {
		  driver.close();
	  } 
}
