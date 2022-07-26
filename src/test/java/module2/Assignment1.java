package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Write a Test script to open Test URL in chrome browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
		Thread.sleep(5000);
		
		
		//Write a Test script to open Test URL in Firefox browser.
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com");
		driver2.close();
		Thread.sleep(5000);
		
		//Write a Test script to open Test URL in Firefox browser.
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.google.com");
		driver3.close();
		

	}

}
