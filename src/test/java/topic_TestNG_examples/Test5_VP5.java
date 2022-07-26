package topic_TestNG_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_VP5 {
	
  @Test
  public void verifySeleniumPage() throws InterruptedException {
	  
	  		//TC1 - Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//TC-2 Goto Test URL https://www.google.com
			driver.get("https://www.saucedemo.com/");
			
			//TC-3 Specify Wait Time for 5 Sec
			Thread.sleep(3000);
			
			//TC-4 Maximize Browser Window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//Fill username test box
			driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
			Thread.sleep(3000);
			
			//Fill password test box
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdvfbe");
			Thread.sleep(3000);
			
			//Click on login button
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(3000);
			
			String ExpectedErrorMsg ="Epic sadface: Username and password do not match any user in this service";
			String ActualErrorMsg = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface')]")).getText();
			Assert.assertEquals(ActualErrorMsg, ExpectedErrorMsg);
		
			Thread.sleep(3000);
			
			//TC - 6 Close the browser
			driver.close();
  }
}
