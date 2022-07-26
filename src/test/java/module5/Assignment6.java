package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		
		/*  TC-1 Launch ChromeBrowser
			TC-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
			TC-3 Switch into 0th  Frame 
			TC-4 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.
			TC-5 Switch into 1st  Frame
			TC-6 Clear text from Browser and versions: Text box 
			TC-7 Send text into Browser and versions: Text box 
			TC-8 Get given input into Console from Browser and versions: Text Box 
        	TC-9 Switch into 2nd  Frame
        	TC-10 Get plain text into Console A Tag in HTML denotes certain.............
        	TC-11 Close Browser */
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //TC-1
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm"); //TC-2
		driver.switchTo().frame(0); //TC-3
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//p[@class='examp3']"));
		System.out.println(text); //TC-4
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame(1); //TC-5
		driver.findElement(By.xpath("//textarea[@name='browser']")).clear(); //TC-6
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@name='browser']")).sendKeys("Avinash Shandilya"); //TC-7
		Thread.sleep(3000);
		
		String text2 = driver.findElement(By.xpath("//textarea[@name='browser']")).getText();
		System.out.println(text2); //TC-8
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame(2); //TC-9
		String text3 = driver.findElement(By.xpath("//font[contains(text(),'A Tag in HTML')]")).getText();
		System.out.println(text3);
		Thread.sleep(3000);
		
		driver.close();
		
		


	}

}
