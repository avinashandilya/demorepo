package allClassFilesHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_HandlingFrame_Index {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go-to test URL
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(3000);
		
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*To perform operation on an element which is inside a Frame
		First we have to switch into that frame */
		
		//Switch to 0th frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(3000);
		
		//Switch to default frame
		driver.switchTo().defaultContent();
		
		//Switch to 1st frame
		driver.switchTo().frame(1);
		//Click on the link
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		Thread.sleep(3000);
		
		//Switch to default frame 
		driver.switchTo().defaultContent();
		
		//Switch to 2st frame
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//a[text()='Tree'])[1]")).click();
		
		
		driver.close();
		
		
	}

}
