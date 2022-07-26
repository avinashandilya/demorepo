package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1 Launch chrome browser
		//TC-2 Goto Test URL https://www.goggle.com
		//TC-3 Specify wait time for 5 sec.
		//TC-4 Get the title of page into console.
		//TC-5 Close the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //TC1
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); //TC2
		
		Thread.sleep(5000); //TC3
		
		String title = driver.getTitle();
		System.out.println(title); //TC4
		
		driver.close(); //TC5
	}

}
