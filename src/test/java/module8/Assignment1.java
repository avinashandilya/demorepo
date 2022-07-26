package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assignment1 {
	
	public WebDriver driver;
	
	/*
	Test Scenario I:  File Upload
	Step-1 Launch Chrome Browser
	Step-2 Open Test URL https://smallpdf.com/word-to-pdf
	Step-3 Click on ChooseFile Button
	Step-4 Automate Window Alert by Uploading File  
	Step-5 Specify Java Wait to Complete file Conversion and Download button get's displayed 
	Step-6 Click on Download Button
	Step-7 Close Browser
	*/
  
	@Test(priority=1)
	 public void launchBrowser() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	 }
	
	@Test(priority=2)
	public void openURL() throws InterruptedException
	{
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Got it']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void chooseFile() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Choose Files']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void uploadDownloadFile() throws InterruptedException, AWTException
	{
		//Put data in the clipboard
		StringSelection s = new StringSelection("E:\\Selenium Training\\Class notes\\12 - 24th June\\xPath.docx");
		
		//Send data from clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Perform paste operation
		//Using JAVA Robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		//Click enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Implicit wait time
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		

	}
	
	@Test(priority=5)
	public void clickDownload() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(6000);
	}
	
	@Test(priority=6)
	public void saveFile() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Save to device']")).click();
		Thread.sleep(6000);
	}
	
	@Test(priority=7)
	public void closeBrowser()
	{
		driver.close();
	}

}
