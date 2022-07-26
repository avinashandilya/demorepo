package topic_ITest_ContextResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testresultcontext {
WebDriver driver;
@BeforeTest(alwaysRun=true)
  public void setup(ITestContext testcontext ) {
	
	System.out.println("My Setup Methods");
	String browser=testcontext.getCurrentXmlTest().getParameter("browser");
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
		System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");
		 driver=new EdgeDriver();
    }

}

@Test
public void verifySeleniumpage() throws InterruptedException
{
	
	driver.get("https://www.selenium.dev/");
//TC3:Specify some wait time
		Thread.sleep(5000);

//TC4:Maximize the Browser Window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//TC5: Verify Page Title
		String ExpTitle="Selenium";
		String ActTitle=driver.getTitle();
	Assert.assertEquals(ExpTitle, ActTitle);
		
}

@AfterMethod
public void teardown()
{
	driver.close();
}



}
