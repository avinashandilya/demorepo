package allClassFilesHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_Table {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go-to test URL
		driver.get("https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html");
		Thread.sleep(3000);
		
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Fill username text box
		String text = driver.findElement(By.xpath("//div[@id='supported-platforms']/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
