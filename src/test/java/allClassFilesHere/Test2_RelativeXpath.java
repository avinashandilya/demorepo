package allClassFilesHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go-to test URL
		driver.get("https://www.facebook.com");
		
		//Direct Syntax
		
		//Fill username text box
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("avinashandilya@gmail.com");
		Thread.sleep(3000);
		//Fill password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Avin@sh8293");
		Thread.sleep(3000);
		//Click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		
		
	}

}
