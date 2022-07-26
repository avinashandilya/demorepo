package topic_TestNG_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3_VP3 {
	
  @Test
  public void verifySeleniumPage() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.ally.com/");
			
			//TC-3 Specify Wait Time for 5 Sec
			Thread.sleep(5000);
			
			//TC-4 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			boolean textpresent = driver.findElement(By.xpath("//a[text()=' About Us ']/following::*[28]")).isDisplayed();
			System.out.println(textpresent);
			
			if(textpresent==true){
				System.out.println("Launced Ally page - Test passed");
			}else {
				System.out.println("Launced Ally page - Test Failed");
			}
			Thread.sleep(3000);
			
			//TC - 6 Close the browser
			driver.close();
  }
}
