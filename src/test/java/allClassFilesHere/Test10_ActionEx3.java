package allClassFilesHere;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_ActionEx3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Double click on Button
		WebElement e = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));				
		Actions a = new Actions(driver);
		//a.moveToElement(e).build().perform();
		//a.doubleClick(e).build().perform();
		
		//Perform right click
		a.contextClick(e).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
