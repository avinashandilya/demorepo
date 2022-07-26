package allClassFilesHere;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9_OpenNewTab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//TC1 - Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.selenium.dev/");
			
		//TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);
				
		//TC-5 Maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
		//TC-6 Get the Title of Page into Console
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(3000);
				
		//TC-7 Get the Current URL of Page into Console
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		Thread.sleep(3000);
				
		//USing JAVA Robot
		Robot r = new Robot();
		
		//Scroll to down
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		//Scroll Up
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		
		//Open a tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		//Open a tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
				
		//TC-8 Close the Browser
		driver.quit();
		

	}

}
