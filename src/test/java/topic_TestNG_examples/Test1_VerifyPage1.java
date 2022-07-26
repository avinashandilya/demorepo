package topic_TestNG_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_VerifyPage1 {
	
  @Test
  public void verifySeleniumPage() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.selenium.dev/");
			
			//TC-3 Specify Wait Time for 5 Sec
			Thread.sleep(3000);
			
			//TC-4 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//TC-5 Verify page Title
			String ExpTitle = "Selenium";
			String ActTitle = driver.getTitle();
			
			if(ExpTitle.equals(ActTitle)) {
				System.out.println("Launced selenium page - Test passed");
			}else {
				System.out.println("Launced selenium page - Test Failed");
			}
			Thread.sleep(3000);
			
			//TC - 6 Close the browser
			driver.close();
  }
}
