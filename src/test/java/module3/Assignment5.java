package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1	Launch Chrome  Browser
		//TC-2	Go to Test URL  https://www.google.com
		//TC-3	Maximize the Browser Window
		//TC-4	Get the URL of Page
		//TC-5	Navigate to Test URL  https://www.selenium.dev/
		//TC-6	Get the URL of Page
		//TC-7	Navigate back to Test URL  https://www.google.com
		//TC-8    Get the URL of Page 
		//TC-9	Navigate one step forward to Test URL  https://www.selenium.dev/ 
		//TC-10    Get the URL of Page 
		//TC-11	Refresh the Current Page 
		//TC-12	Get the URL of Page 
		//TC-13   Close the Browser 
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //TC-1
		
		driver.get("https://www.google.com"); //TC-2
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //TC-3
		Thread.sleep(3000);
		
		String pageURL1 = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL1); //TC-4
		
		driver.navigate().to("https://www.selenium.dev"); //TC-5
		Thread.sleep(3000);
		
		String pageURL2 = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL2); //TC-6
		Thread.sleep(3000);
		
		driver.navigate().back(); //TC-7
		String pageURL3 = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL3); //TC-8
		Thread.sleep(3000);
		
		driver.navigate().forward(); //TC-9
		String pageURL4 = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL4); //TC-10
		Thread.sleep(3000);
		
		driver.navigate().refresh(); //TC-11
		String pageURL5 = driver.getCurrentUrl();
		System.out.println("The URL of this page is : "+pageURL5); //TC-12
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
