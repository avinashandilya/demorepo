package module11;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assignment4_Test {
	static WebDriver driver;
	static Properties prop;
	static Assignment4_LoginPage Login;
	
	/* Assignment-3
 
 Write a Test Script to Automate https://www.saucedemo.com/index.html Login & Logout   using Page Object Model 
  -Create Maven Project
  -Use TestNG 
  -USe properties files to store Data and Objects */
	
	@Test
	public void sauceDemoLogin() throws IOException, InterruptedException
	{
		
		Login = new Assignment4_LoginPage(driver);
		
		Login.printProperties();
		Login.openURL();
		Login.type_UserName();
		Login.type_Password();	
		Login.click_Login();
		Login.click_addtocart();
		Login.click_cart();
		Login.capturePlaintxt();
		Login.click_OpenMenu();
		Login.click_Logout();
		
	}
	
	
	
}
