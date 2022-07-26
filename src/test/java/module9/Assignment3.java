package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class Assignment3 {
	WebDriver driver;
	/*Assignment-3
	Write a TestScript to Automate https://www.saucedemo.com/index.html Login  in TestNG
	-Pass parameters from .xml file */

	@BeforeTest(alwaysRun=true)
	@Parameters({"browser"})
	public void setup(String browser) {
	
	System.out.println("My Setup Methods");
    if(browser.equalsIgnoreCase("chrome"))
    {
    	//TC1:Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
   }
    else if(browser.equalsIgnoreCase("ff"))
    {
    	//TC1:Launch FF Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 driver=new FirefoxDriver();
    }
    else if(browser.equalsIgnoreCase("edge"))
    {
    	//TC1:Launch Edge Browser
		System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
		 driver=new EdgeDriver();
    }

}



	@Parameters({"username","password"})
	@Test
	public void verifySeleniumpage(String username,String password) throws InterruptedException
{
	
	// TC2: Goto TestURL https://www.saucedemo.com/
				driver.get("https://www.saucedemo.com/");
		//TC3:Specify some wait time
				Thread.sleep(5000);

		//TC4:Maximize the Browser Window
				driver.manage().window().maximize();
				Thread.sleep(5000);
		//TC5: Fill Username Textbox with input
				driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(username);
				Thread.sleep(5000);
				//Fill Password Textbox with input
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
				Thread.sleep(5000);
				
				//Click on Login Button
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(5000);
				
				String ExpectedURL="https://www.saucedemo.com/inventory.html";		
				String ActURL=driver.getCurrentUrl();
				Assert.assertEquals(ExpectedURL, ActURL);
				Thread.sleep(5000);
		
}

	@AfterMethod
	public void teardown()
	{
	driver.close();
	}



}
