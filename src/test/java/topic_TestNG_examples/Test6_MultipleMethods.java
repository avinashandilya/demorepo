package topic_TestNG_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6_MultipleMethods {
	
	public WebDriver driver;
	
  @Test
  public void asetup() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
  }
  
  @Test
  public void bgotoURL() throws InterruptedException {
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.selenium.dev");
			Thread.sleep(3000);
  }
  
  @Test
  public void cmaximize() throws InterruptedException {
			//TC-3 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
  }
  
  @Test
  public void dverifySeleniumPage() throws InterruptedException {
	  		//TC-5 Verify page Title
			String ExpTitle = "Selenium";
			String ActTitle = driver.getTitle();
			
			if(ExpTitle.equals(ActTitle)) {
				System.out.println("Launced selenium page - Test passed");
			}else {
				System.out.println("Launced selenium page - Test Failed");
			}
			Thread.sleep(3000);
  }
  
	@Test	
  public void eteardown() {
	  		//Close the browser
	  		driver.close();
  }
}
