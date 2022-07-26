package allClassFilesHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_HandlingWebAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go-to test URL
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(3000);
		
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click on click here button
		driver.findElement(By.xpath("//button[text()='Click here to show confirm alert']")).click();
		Thread.sleep(3000);
		
		//Switch into the Alert
		String text_alert1 = driver.switchTo().alert().getText();
		System.out.println(text_alert1);
		Thread.sleep(3000);
		
		//Accept the alert
		driver.switchTo().alert().accept();
		
		//Switch into the Alert
		String text_alert2 = driver.switchTo().alert().getText();
		System.out.println(text_alert2);
		Thread.sleep(3000);
		
		//Accept the Alert
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}

}
