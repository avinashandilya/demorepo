package browser.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Chrome {
	
  @Test
  public void verifySeleniumPage() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.selenium.dev/");
	  		Thread.sleep(3000);
	  		System.out.println("this project is updated by gyan");
	  		System.out.println("this project is updated by Sonalika");
			
			//TC-3 Specify Wait Time for 5 Sec
			Thread.sleep(3000);
			
			//TC-4 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//TC-5 Verify page Title
			String ExpTitle = "Seleniumsai";
			String ActTitle = driver.getTitle();
			
			Assert.assertEquals(ExpTitle, ActTitle);
			
			//TC - 6 Close the browser
			driver.close();
  }
}
