package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
public WebDriver driver;
public Actions action;

  @BeforeClass
  public void setup() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://jqueryui.com/");
	  Thread.sleep(5000);
  }
  
  @AfterClass
  public void teardown()
  {
	  //driver.close();
  }
  
  
  public void openflipkart() throws InterruptedException
  {
	 driver.get("https://flipkart.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Login']//following::*[7]")).sendKeys("avinashandilya@gmail.com");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Login']//following::*[12]")).sendKeys("9631022520");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	 Thread.sleep(3000);
  }
  
  @Test(priority=1)
  public void openJqueryui() throws InterruptedException
  {
	  
	  //Pick date
	  driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	  Thread.sleep(5000);
	  
	  driver.switchTo().frame(0);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  Thread.sleep(5000);
	  for(int i=0; i<5; i++)
	  {
		  driver.findElement(By.xpath("//span[text()='Prev']")).click();
	  }
	  driver.findElement(By.xpath("//a[text()='8']")).click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().defaultContent();
	  
  }
  
  @Test(priority=2)
  public void jqueryTabs() throws InterruptedException
  {
	//Tabs
	  driver.findElement(By.xpath("//a[text()='Tabs']")).click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().frame(0);
	  
	  String text = driver.findElement(By.xpath("//p[contains(text(),'Morbi tincidunt')]")).getText();
	  System.out.println(text);
	  driver.switchTo().defaultContent();
  }
  
  @Test(priority=3)
  public void jqueryDarggable() throws InterruptedException
  {
	//Draggable
	  driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	  Thread.sleep(5000);
	  driver.switchTo().frame(0);
	  
	  WebElement draggBox = driver.findElement(By.xpath("//div[@id='draggable']"));
	  int x = draggBox.getLocation().getX();
	  System.out.println(x);
	  int y = draggBox.getLocation().getY();
	  System.out.println(y);
	  
	  action = new Actions(driver);
	  action.dragAndDropBy(draggBox, 20, 12).build().perform();
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
  }
  
  @Test(priority=4)
  public void jqueryResizable() throws InterruptedException
  {
	//resizable
	  driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  
	  WebElement resizeBox = driver.findElement(By.xpath("//h3[text()='Resizable']//following::*[3]"));
	  int a = resizeBox.getLocation().getX();
	  System.out.println(a);
	  int b = resizeBox.getLocation().getY();
	  System.out.println(b);
	  action.clickAndHold(resizeBox).moveByOffset(20, 20).build().perform();
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
  }
  
  @Test(priority=5)
  public void jquerySelectable() throws InterruptedException
  {
	//Selectable
	  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=6)
  public void fbRegistration() throws InterruptedException
  {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(" Kumar");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("avinashandily@gmail.com");
	  Thread.sleep(3000);
	  
  }
}
