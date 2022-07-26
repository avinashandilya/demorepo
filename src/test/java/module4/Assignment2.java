package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Automate  Oracle  Registration Page in Chrome Browser   
	    https://profile.oracle.com/myprofile/account/create-account.jspx */
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String pageURL = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL);
		
		//Enter email
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Enter password
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Akues@#$9346");
		Thread.sleep(3000);
		
		//Re-Enter password
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Akues@#$9346");
		Thread.sleep(3000);
		
		//Enter first name
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Avinash");
		Thread.sleep(3000);
		
		//Enter last name
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Kumar");
		Thread.sleep(3000);
		
		//Enter job title
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("SDET");
		Thread.sleep(3000);
		
		//Enter phone number
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("9631081497");
		Thread.sleep(3000);
		
		//Enter company name
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		
		//Enter address
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Awadhpuram Apartment");
		Thread.sleep(3000);
		
		//Enter city
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Pune");
		Thread.sleep(3000);
		
		//Select province
		Select city = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
		city.selectByValue("20");
		Thread.sleep(3000);
		
		//Enter Zip code
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("411051");
		Thread.sleep(3000);
		
		WebElement formFotter = driver.findElement(By.className("form-footer-disclaimer-text"));
		By createAccount = RelativeLocator.with(By.tagName("span")).below(formFotter);
		driver.findElement(createAccount).click();
		Thread.sleep(10000);
		
		driver.close();
		
		/*Automate  dropdowns part of Oracle  Registration Page in Firefox Browser  
         https://profile.oracle.com/myprofile/account/create-account.jspx */
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		String pageURL2 = driver2.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL2);
		
		//Enter email
		driver2.findElement(By.id("sView1:r1:0:email::content")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
		//Enter password
		driver2.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Akues@#$9346");
		Thread.sleep(3000);
		
		//Re-Enter password
		driver2.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Akues@#$9346");
		Thread.sleep(3000);
		
		//Enter first name
		driver2.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Avinash");
		Thread.sleep(3000);
		
		//Enter last name
		driver2.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Kumar");
		Thread.sleep(3000);
		
		//Enter job title
		driver2.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("SDET");
		Thread.sleep(3000);
		
		//Enter phone number
		driver2.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("9631081497");
		Thread.sleep(3000);
		
		//Enter company name
		driver2.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		
		//Enter address
		driver2.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Awadhpuram Apartment");
		Thread.sleep(3000);
		
		//Enter city
		driver2.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Pune");
		Thread.sleep(3000);
		
		//Select province
		Select city2 = new Select(driver2.findElement(By.id("sView1:r1:0:state::content")));
		city2.selectByValue("20");
		Thread.sleep(3000);
		
		//Enter Zip code
		driver2.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("411051");
		Thread.sleep(3000);
		
		WebElement formFotter2 = driver2.findElement(By.className("form-footer-disclaimer-text"));
		By createAccount2 = RelativeLocator.with(By.tagName("span")).below(formFotter2);
		driver2.findElement(createAccount2).click();
		Thread.sleep(10000);
		
		driver2.close();

	}

}
