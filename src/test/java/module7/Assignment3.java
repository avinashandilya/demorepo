package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment3 {
	public WebDriver driver;
	
	/*
	Test Scenario I:
	Test Scenario IV:---File Download
	1. Launch https://launchpad.net/sikuli  in Firefox Browser
	2. Click  on sikulixsetup-1.1.2.jar  to Download
	3. Go to Window Alert and Select  Save 
	4. Specify Wait  
	5. Close Site
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
  public void goToURL() throws InterruptedException 
  {
	  driver.get("https://launchpad.net/sikuli");
	  Thread.sleep(3000);
  }
  
  @Test(priority=3)
  public void clickAllDownloads() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[text()='All downloads']")).click();
	  Thread.sleep(3000);
  }
  
  @Test(priority=4)
  public void scrollDown() throws InterruptedException
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(3000);
  }
  
  @Test(priority=5)
  public void downloadSikuliXapi() throws InterruptedException
  {
	  driver.findElement(By.xpath("(//a[text()='Release information'])[7]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//p[text()='fixed are bugs marked fix committed/critical']/following::*[12]")).click();
	  Thread.sleep(3000);
  }
  
  @Test(priority=6)
  public void save() throws InterruptedException, AWTException
  {
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(5000);
	  driver.close();
  }
}
