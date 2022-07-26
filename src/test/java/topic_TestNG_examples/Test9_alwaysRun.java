package topic_TestNG_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test9_alwaysRun {
	
	public WebDriver driver;
	
  @Test(priority=1) 
  public void setup() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
  }
  
  @Test(dependsOnMethods="setup")
  public void gotoURL() throws InterruptedException {
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.selenium.dev");
			Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods="gotoURL")
  public void maxWindow() throws InterruptedException {
			//TC-3 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods="maxWindow")
  public void verifySeleniumPage() throws InterruptedException {
	  		//TC-4 Verify page Title
			String ExpTitle = "Seleniumavi";
			String ActTitle = driver.getTitle();
			
			if(ExpTitle.equals(ActTitle)) {
				System.out.println("Launced selenium page - Test passed");
			}else {
				System.out.println("Launced selenium page - Test Failed");
			}
			Thread.sleep(3000);
		Assert.assertEquals(ExpTitle, ActTitle);
  }
  
	@Test(dependsOnMethods="verifySeleniumPage", alwaysRun = true)	
  public void teardown() {
	  		//Close the browser
	  		driver.close();
  }
}
