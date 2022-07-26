package allClassFilesHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //
		    WebDriver driver= new ChromeDriver();
		    
		    driver.navigate().to("http://www.way2sms.com/"); 
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("8149769573");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9631022520");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[@class='btn-theme-sm btn-ls text-uppercase'])[1]")).click();
		    Thread.sleep(5000);
		    
		    driver.close();
			}

		
		
		
	}


