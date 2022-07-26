package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1	Launch Chrome Browser
		//TC-2	Go to Test URL https://demoqa.com/browser-windows
		//TC-3	Maximize the Browser Window
		//TC-4	Get the Title of Page
		//TC-5	Click on knowmore Link Text 
		//TC-6	Switch from 0th   Window to 1st   Window
		//TC-7	After Switching Get the Title of Page 
		//TC-8  Close 1st Window 
		//TC-9	Switch from 1st   Window to 0th  Window
		//TC-10 After Switching Get the Title of Page 
		//TC-11	Close 0th Window  

		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe"); //TC-1
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows"); //TC-2
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //TC-3
		Thread.sleep(3000);
		
		String getTitle1 = driver.getTitle();
		System.out.println("Title 1 : "+getTitle1); //TC-4
		Thread.sleep(3000);
		
		driver.findElement(By.id("tabButton")).click(); //TC-5
		Thread.sleep(3000);
		
		//Handle Tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		
		//Switch from 0th Tab to 1st Tab
		driver.switchTo().window(tabs.get(1)); //TC-6
		String getTitle2 = driver.getTitle();
		System.out.println("Title 2 : "+getTitle2);//TC-7
		driver.close(); //TC-8
		
		//Switch from 1st Tab to 0th Tab
		driver.switchTo().window(tabs.get(0)); //TC-9
		
		String getTitle3 = driver.getTitle();
		System.out.println("Title 3 : "+getTitle3); //TC-10
		Thread.sleep(3000);
		driver.close(); //TC-11

	}

}
