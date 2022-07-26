package allClassFilesHere;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test8_FileUpload_Firefox_JavaRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
				
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
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
		Thread.sleep(12000);
		
		//Click on download
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(5000);
		
		//Click on Save to device
		driver.findElement(By.xpath("//span[text()='Save to device']")).click();
		Thread.sleep(5000);
		
		//Click down
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		//Click Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
				
	}

}
