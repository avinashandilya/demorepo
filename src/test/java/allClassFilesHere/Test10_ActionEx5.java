package allClassFilesHere;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_ActionEx5 {


	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click on cross icon
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::*[15]")).click();
		Thread.sleep(3000);
		
		//Search box
		WebElement e = driver.findElement(By.xpath("//*[@name='q']"));				
		Actions a = new Actions(driver);
		
		//Send text into the text box
		a.click(e).sendKeys("smartphone").build().perform();
		Thread.sleep(3000);
		
		//Step down
		a.click(e).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		
		//Step down
		a.click(e).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		
		//Click on enter
		a.click(e).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
