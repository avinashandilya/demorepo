package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1_Test {
	static WebDriver driver;
	static Assignment1_LoginPage Login;
	
	/* Assignment-1
 
 Write a Test Script to Automate https://www.saucedemo.com/index.html Login   using Page Object Model 
  -Create Maven Project
  -Use TestNG
  -Create Repository in Class File  */
	
  @Test
  public void sauceDemoLogin() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  driver.get("https://www.saucedemo.com");
	  Thread.sleep(3000);
	  
	  Login = new Assignment1_LoginPage(driver);
	  
	  Login.type_UserName("standard_user");
	  Login.type_Password("secret_sauce");
	  Login.click_Login();
	  Login.click_addtocart();
	  Login.click_cart();
	  
	  String ExpPlainText="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
	  String ActPlaintext=Login.capturePlaintxt(); 
	  Assert.assertEquals(ExpPlainText,ActPlaintext);
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
