package allClassFilesHere;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_ActionEx1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click on cross icon
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		//Move mouse towards fashion
		WebElement e = driver.findElement(By.xpath("//*[text()='Fashion']"));				
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(3000);
		
		//Move mouse towards Women ethnic
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		a.moveToElement(e1).build().perform();
		Thread.sleep(3000);
		
		//Move to sarees
		driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
