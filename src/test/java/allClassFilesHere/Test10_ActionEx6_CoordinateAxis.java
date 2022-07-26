package allClassFilesHere;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_ActionEx6_CoordinateAxis {


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
		int x = e.getLocation().getX();
		System.out.println("The location of the x axis is "+x);
		int y = e.getLocation().getY();
		System.out.println("The location of the y axis is "+y);
		
		Actions a = new Actions(driver);
		//a.moveToElement(e).build().perform();
		a.moveByOffset(x, y).build().perform();
		a.moveToElement(e).build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
