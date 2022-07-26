package allClassFilesHere;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_ActionEx4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Drag and drop
		WebElement e = driver.findElement(By.xpath("//div[@id='slider']"));				
		Actions a = new Actions(driver);
		a.dragAndDropBy(e, 50, 0).build().perform();
		Thread.sleep(6000);
		
		driver.close();
		
	}

}
