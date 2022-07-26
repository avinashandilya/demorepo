package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		/*  Step-1 Launch Firefox Browser
		    Step-2 Open Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt  in Chrome Browser
			Step-3 Switch into Frame 
			Step-4 Click on  Try it  Button 
			Step-5 Send the text into Alert 
			Step-6 Accept  the Web Alert 
			Step-7 Get the text displayed on page into Console 
			Step-8 Close Browser */
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //TC-1
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); //TC-2
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult"); //TC-3
		driver.findElement(By.xpath("//button[text()='Try it']")).click(); //TC-4	
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Avinash Shandilya"); //TC-5
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept(); //TC-6
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("//button[.='Try it']/following::p[1]")); //TC-7
		Thread.sleep(3000);
		
		driver.close();


	}

}
