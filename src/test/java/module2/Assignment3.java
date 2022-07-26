package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1 Launch firefox browser
		//TC-2 Goto Test URL https://www.goggle.com
		//TC-3 Specify wait time for 5 sec.
		//TC-4 Get the title of page into console.
		//TC-5 Close the browser

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe"); //TC1
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com"); //TC2
		
		Thread.sleep(5000); //TC3
		
		String title = driver.getTitle();
		System.out.println(title); //TC4
		
		driver.close(); //TC5

	}

}
