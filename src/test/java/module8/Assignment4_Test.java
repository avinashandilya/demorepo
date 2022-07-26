package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4_Test {
	static WebDriver driver;
	static Assignment4_LoginPage Login;
	
	
  @Test
  public void way2smsLogin() throws InterruptedException 
  {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.get("http://www.way2sms.com/");
	
	Thread.sleep(3000);
	
	
	Login = new Assignment4_LoginPage(driver);
	
	//Fill mobile no. textbox with input
	Login.type_MobileNo("8149769573");
	
	//Fill password
	Login.type_Password("AGJkck@$8453");
	
	//Click on login button
	Login.click_Button();
  }
  
  
}
