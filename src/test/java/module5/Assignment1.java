package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		/* Automate Facebook Registration Page  using Relative X-path  in 2 different  Browsers
	     https://www.facebook.com */
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //TC-1
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		//Click on the Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
				
		//Access firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
		Thread.sleep(3000);
				
		//Access lastname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		Thread.sleep(3000);
				
		//Enter email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
				
		//Re-enter email
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
				
		//Access password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("a)Dsu@#8456");
		Thread.sleep(3000);
				
		//Select dob
		Select dob = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		dob.selectByValue("8");
		Thread.sleep(3000);
				
		//Select month
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Feb");
		Thread.sleep(3000);
				
		//Select year
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("1993");
		Thread.sleep(3000);
		
		//Male radio button
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(3000);
		
		//Sign Up
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		//Mozilla Firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver(); //TC-1
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		driver2.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		//Click on the Create New Account button
		driver2.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
				
		//Access firstname
		driver2.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
		Thread.sleep(3000);
				
		//Access lastname
		driver2.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		Thread.sleep(3000);
				
		//Enter email
		driver2.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
				
		//Re-enter email
		driver2.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
				
		//Access password
		driver2.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("a)Dsu@#8456");
		Thread.sleep(3000);
				
		//Select dob
		Select dob2 = new Select(driver2.findElement(By.xpath("//select[@name='birthday_day']")));
		dob2.selectByValue("8");
		Thread.sleep(3000);
				
		//Select month
		Select month2 = new Select(driver2.findElement(By.xpath("//select[@name='birthday_month']")));
		month2.selectByVisibleText("Feb");
		Thread.sleep(3000);
				
		//Select year
		Select year2 = new Select(driver2.findElement(By.xpath("//select[@name='birthday_year']")));
		year2.selectByVisibleText("1993");
		Thread.sleep(3000);
		
		//Male radio button
		driver2.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(3000);
		
		//Sign Up
		driver2.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(3000);
		
		driver2.close();
		
	}

}
