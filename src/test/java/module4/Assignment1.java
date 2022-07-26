package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Automate Facebook Registration Page  using Direct Locator's in Chrome Browser

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click on the Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		//Access firstname
		driver.findElement(By.name("firstname")).sendKeys("Avinash");
		Thread.sleep(3000);
		
		//Access lastname
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		Thread.sleep(3000);
		
		//Enter email
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Re-enter email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Access password
		driver.findElement(By.name("reg_passwd__")).sendKeys("a)Dsu@#8456");
		Thread.sleep(3000);
		
		//Select dob
		Select dob = new Select(driver.findElement(By.id("day")));
		dob.selectByValue("8");
		Thread.sleep(3000);
		
		//Select month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Feb");
		Thread.sleep(3000);
		
		//Select year
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1993");
		Thread.sleep(3000);
		
		//Enable male radio button
		//below
		WebElement monthDropDown = driver.findElement(By.name("birthday_month"));
		By maleRB = RelativeLocator.with(By.tagName("input")).below(monthDropDown);
		driver.findElement(maleRB).click();
		Thread.sleep(3000);
		
		//Click on signUp Button
		WebElement linkText = driver.findElement(By.className("_58mv"));
		By signUP = RelativeLocator.with(By.tagName("button")).below(linkText);
		driver.findElement(signUP).click();
		Thread.sleep(3000);
		driver.close();
		
		//Automate dropdowns part of Facebook Registration Page  using Direct Locator's in firefox Browser 
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.facebook.com");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click on the Create New Account button
		driver2.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		//Access firstname
		driver2.findElement(By.name("firstname")).sendKeys("Avinash");
		Thread.sleep(3000);
		
		//Access lastname
		driver2.findElement(By.name("lastname")).sendKeys("Kumar");
		Thread.sleep(3000);
		
		//Enter email
		driver2.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Re-enter email
		driver2.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Access password
		driver2.findElement(By.name("reg_passwd__")).sendKeys("a)Dsu@#8456");
		Thread.sleep(3000);
		
		//Select dob2
		Select dob2 = new Select(driver2.findElement(By.id("day")));
		dob2.selectByValue("8");
		Thread.sleep(3000);
		
		//Select month
		Select month2 = new Select(driver2.findElement(By.id("month")));
		month2.selectByVisibleText("Feb");
		Thread.sleep(3000);
		
		//Select year
		Select year2 = new Select(driver2.findElement(By.id("year")));
		year2.selectByVisibleText("1993");
		Thread.sleep(3000);
		
		//Enable male radio button
		//below
		WebElement monthDropDown2 = driver2.findElement(By.name("birthday_month"));
		By maleRB2 = RelativeLocator.with(By.tagName("input")).below(monthDropDown2);
		driver2.findElement(maleRB2).click();
		Thread.sleep(3000);
		
		//Click on signUp Button
		WebElement linkText2 = driver2.findElement(By.className("_58mv"));
		By signUP2 = RelativeLocator.with(By.tagName("button")).below(linkText2);
		driver2.findElement(signUP2).click();
		Thread.sleep(3000);
		driver2.close();
		
	}

}
