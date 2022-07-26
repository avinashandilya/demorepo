package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		/* Automate Facebook Login Page  using Relative X-path Axis   in 2 different  Browsers
     https://www.facebook.com */  
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Enter email ID
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[12]")).sendKeys("abcd@gmail.com");
		Thread.sleep(3000);
		
		//Enter password
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[9]")).sendKeys("Shandilya@1993");
		Thread.sleep(3000);
		
		//Click on the Login button
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[1]")).click();
		Thread.sleep(6000);
		
		driver.close();
		
		//For Edge browser
		System.setProperty("webdriver.edge.driver", "C://edgedriver.exe");
				
		WebDriver driver2 = new EdgeDriver();
				
		driver2.get("https://www.facebook.com");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
				
		//Enter email ID
		driver2.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[12]")).sendKeys("abcd@gmail.com");
		Thread.sleep(3000);
				
		//Enter password
		driver2.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[9]")).sendKeys("Shandily@1993");
		Thread.sleep(3000);
				
		//Click on the Login button
		driver2.findElement(By.xpath("//a[text()='Forgotten password?']/preceding::*[1]")).click();
		Thread.sleep(6000);
				
		driver2.close();


	}

}
