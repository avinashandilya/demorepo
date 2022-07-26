package topic_TestNG_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test10_BM_AM 
{
	
	public WebDriver driver;
	
  @BeforeMethod
  public void setup() throws InterruptedException 
  {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
  }
  
  @AfterMethod
  public void teardown() 
  {
	  	//TC5 Close the browser
		driver.close();
  }
  
	@Test(priority=1)		
  public void verifyGooglePage() throws InterruptedException 
	{
	  
			//TC2 Goto Test URL https://www.google.com
			driver.get("https://www.google.com/");
			
			//TC3 Specify Wait Time for 5 Sec
			Thread.sleep(3000);
			
			//TC4 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			String ExpTitle = "Google";
			String ActTitle = driver.getCurrentUrl();	
			Assert.assertEquals(ExpTitle, ActTitle);
  }
	
	@Test(priority=2)
	public void verifyBSPage() throws InterruptedException 
	{
		  
		//TC2 Goto Test URL https://www.google.com
		driver.get("https://bhanusaii.wordpress.com/");
		
		//TC3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);
		
		//TC4 Maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String ExpTitle = "Learning gives creativity Creativity leads to thinking Thinking provides knowledge Knowledge makes you great.";
		String ActTitle = driver.getCurrentUrl();	
		Assert.assertEquals(ExpTitle, ActTitle);
	}
	
	@Test(priority=3)
	public void verifySeliniumPage() throws InterruptedException 
	{
		  
		//TC2 Goto Test URL https://www.google.com
		driver.get("https://selenium.dev");
		
		//TC3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);
		
		//TC4 Maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String ExpTitle = "Selenium";
		String ActTitle = driver.getCurrentUrl();	
		Assert.assertEquals(ExpTitle, ActTitle);
			
	}		
  }

