package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1 Launch edge browser
		//TC-2 Goto Test URL https://www.goggle.com
		//TC-3 Specify wait time for 5 sec.
		//TC-4 Get the title of page into console.
		//TC-5 Close the browser

		System.setProperty("webdriver.edge.driver", "C:\\edgedriver.exe"); //TC1
				
		WebDriver driver = new EdgeDriver();
				
		driver.get("https://www.google.com"); //TC2
				
		Thread.sleep(5000); //TC3
				
		String title = driver.getTitle();
		System.out.println(title); //TC4
				
		driver.close(); //TC5

	}

}
