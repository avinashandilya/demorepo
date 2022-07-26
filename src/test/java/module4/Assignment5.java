package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
	      Write a TestScript for  following

		  TC-1 Launch Chrome Browser 
		  TC-2 Goto Facebook Registration Page 
		  TC-3 Fill FirstName TextBox with Input
		  TC-4 Clear the input from  FirstName TextBox
		  TC-5 Again Fill the  FirstName TextBox with Input
		  TC-6 Get the Input from TextBox  and display it in Console 
		  TC-6 Close Browser 
		  
		  */
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //TC-1
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		//Facebook Registration Page
		driver.findElement(By.linkText("Create New Account")).click(); //TC-2
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("Avinash"); //TC-3
		Thread.sleep(3000);
		
		firstname.clear(); //TC-4
		Thread.sleep(3000);
		
		firstname.sendKeys("Shandilya"); //TC-5
		String inputvalue = firstname.getAttribute("value");
		System.out.println(inputvalue); //TC-5
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
