package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {
	public WebDriver driver;
	
	/*Assignment-1
	Write a TestScript to Automate https://www.saucedemo.com/index.html  Login in TestNG
		-Use Hard Coded Values  */
	
  @Test(priority=1)
  public void launchBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  
  @Test(priority=2)
  public void openURL() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(3000);
  }
  
  @Test(priority=3)
  public void typeUserName() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
	  Thread.sleep(3000);
  }
  
  @Test(priority=4)
  public void typePassword() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
  }
  
  @Test(priority=5)
  public void clickLoginButton() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='login-button']")).click();
	  Thread.sleep(3000);
  }
  
  @Test(priority=6)
  public void verifyPage() throws InterruptedException {
	  String actualURL = "https://www.saucedemo.com/inventory.html";
	  System.out.println(actualURL);
	  String expectedURL = driver.getCurrentUrl();
	  System.out.println(expectedURL);
	  Assert.assertEquals(actualURL, expectedURL);
	  Thread.sleep(3000);
  }
  
  @Test(priority=7)
  public void tearDown() {
	  driver.close();
  }
}
