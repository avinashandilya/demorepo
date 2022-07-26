package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
	
	/*
	TC-1 Launch Firefox Browser
	TC-2 Open Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1  in Chrome Browser
	TC-3 Click on  Click here to show confirm alert Button 
	TC-4 Get the text displayed on Alert into Console
	TC-5 Accept  the Web Alert to Delete Account  
	TC-6 Get the text displayed on Alert into Console 
	TC-7 Accept the Alert 
	TC-8 Close Browser */
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //TC-1
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1"); //TC-2
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")); //TC-3
		Thread.sleep(3000);
		
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert); //TC-4
		
		driver.switchTo().alert().accept(); //TC-5
		Thread.sleep(3000);
		
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2); //TC-6
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.close();


	}

}
