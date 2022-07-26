package allClassFilesHere;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Test11_Synchronization {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
				
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//Accept cookies
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		Thread.sleep(3000);
				
		//Choose file button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(3000);
				
		//Put the data into the clipboard
		StringSelection s = new StringSelection("E:\\Selenium Training\\Class notes\\12 - 24th June\\xPath.docx");
		
		//Send data from clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null); 
		
		//Perform paste operation
		//Using JAVA Robot
		
		Robot r = new Robot();
		
		//Paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		//Click enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Java wait
		//Thread.sleep(12000); 
		
		//Implicit wait 
		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		//Explicit wait or //WebDriverWait or //Dynamic wait
		WebElement w1 = new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
		w1.click();
		
		//Click on download button
		//driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Save to device']")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
				
				
	}

}
