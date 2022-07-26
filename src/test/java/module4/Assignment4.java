package module4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Write a Test Script to get no of links available on Facebook Page 
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		
		//Forgotten password
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Create a page
		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000); 
		
		
		//Create new account
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		//learn more
		driver.findElement(By.id("non-users-notice-link")).click();
		ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles()); //Handle Tabs
		System.out.println(tab1);
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tab1.get(0));
		
		//terms link
		driver.findElement(By.id("terms-link")).click();
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles()); //Handle Tabs
		System.out.println(tab2);
		driver.switchTo().window(tab2.get(1));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tab2.get(0));
		
		//privacy link
		driver.findElement(By.id("privacy-link")).click();
		ArrayList<String> tab3 = new ArrayList<String>(driver.getWindowHandles()); //Handle Tabs
		System.out.println(tab3);
		driver.switchTo().window(tab3.get(1));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tab3.get(0));
		
		//privacy link
		driver.findElement(By.id("cookie-use-link")).click();
		ArrayList<String> tab4 = new ArrayList<String>(driver.getWindowHandles()); //Handle Tabs
		System.out.println(tab4);
		driver.switchTo().window(tab4.get(1));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tab4.get(0));
		
		driver.close(); 
		
		
	}

}