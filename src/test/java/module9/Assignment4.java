package module9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class Assignment4 {
	static WebDriver driver;
	/* Assignment-4
	Write a TestScript to Automate https://www.saucedemo.com/index.html Login  in TestNG
		-Pass parameters from .properties file */	
	
	@Test
  	public void sd_LoginPage() throws IOException, InterruptedException {
	  Properties prop=new Properties();
	  FileInputStream ip=new FileInputStream("E:\\Selenium Training\\seleniumProject\\src\\test\\java\\module9\\config.properties");
      prop.load(ip);
      System.out.println("name");
     //Name
      String Name=prop.getProperty("name");
      System.out.println(Name);
     //Age
      String AGE=prop.getProperty("age");
      System.out.println(AGE);
     //URL
      String URL=prop.getProperty("url");
      System.out.println(URL); 
    //Browser
      String Browser=prop.getProperty("browser");
      System.out.println(Browser); 	  
     

      if(Browser.equalsIgnoreCase("chrome"))
      {
      	//TC1:Launch Chrome Browser
  		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  		driver=new ChromeDriver();
     }
      else if(Browser.equalsIgnoreCase("ff"))
      {
      	//TC1:Launch FF Browser
  		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
  		 driver=new FirefoxDriver();
      }
      else if(Browser.equalsIgnoreCase("edge"))
      {
      	//TC1:Launch Edge Browser
  		System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");
  		 driver=new EdgeDriver();
      }
      
      driver.get(URL);
      Thread.sleep(5000);
      //Enter Username into Textbox
      driver.findElement(By.xpath(prop.getProperty("UsernameField"))).sendKeys(prop.getProperty("username"));
      Thread.sleep(5000);
      //Enter Password into Textbox
      driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
      Thread.sleep(5000);
  
      //Click on Login Button
      driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
      Thread.sleep(5000);
      driver.close();
  }
}
