package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment2 {
	public WebDriver driver;
	
	/*
	Test Scenario I:---File Download  
	Step-1 Launch Firefox Browser
	Step-2 Open Test URL https://www.selenium.dev/downloads/
	Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
	Step-4 Automate File Download    
	Step-5 Close Browser

	*/
	
	@Test(priority=1)
	 public void launchBrowser() throws InterruptedException
	 {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
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
	public void uploadFile() throws InterruptedException, AWTException
	{
		//Put data in the clipboard
		StringSelection ss = new StringSelection("E:\\Selenium Training\\Class notes\\12 - 24th June\\xPath.docx");
		
		//Send data from clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
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
		Thread.sleep(12000);
	}
	
	@Test(priority=5)
	public void downloadFile() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Save to device']")).click();
		Thread.sleep(6000);
	}
	
	@Test(priority=6)
	public void closeBrowser()
	{
		driver.close();
	} 
}
