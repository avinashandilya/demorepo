package topic_DataDrivenFW_DataProvider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestDataDriven_SwagDemo2 {
	public WebDriver driver;
	
	@Test(dataProvider="testData")
	public void loginSauceDemo(String uname, String pwd) throws InterruptedException
	{
		
		//TC1 - Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.saucedemo.com/");
		
		//TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);
		
		//TC-4 Maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Fill username test box
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(uname);
		Thread.sleep(3000);
		
		//Fill password test box
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(3000);
		
		//Click on login button
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(3000);
		
		String ExpectedURL ="https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void getTestResult(ITestResult testResult)
	{
		System.out.println("Testcase Name: "+testResult.getName()); //getName will return real test case
		System.out.println("TestCase Result: "+testResult.getStatus()); //Results integer value 1--passed, 2--failed
		int status = testResult.getStatus();
		if(status==1) {
			driver.close();
		}
		else 
		{
			//Take screenshot of whole page
			File outfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(outfile, new File("E:\\Selenium Training\\seleniumProject\\src\\test\\resources\\allResourceFilesHere\\"+testResult.getParameters()[0]+"Defect.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
		}
		
	}
	
	@DataProvider(name="testData")
	public Object[][] readExcel() throws BiffException, IOException
	{
		
		//Open the Excel file for read and write , which is available under same folder
		File f = new File("E:\\Selenium Training\\seleniumProject\\src\\test\\resources\\allResourceFilesHere\\TestData_SwagDemo.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		
		int numberOfRows = s.getRows();
		System.out.println("Number of Rows = "+numberOfRows);
		
		int numberOfColumns = s.getColumns();
		System.out.println("Number of Columns = "+numberOfColumns);
		
		//Creating a Array to store data of an excel sheet
		String inputData[][] = new String[numberOfRows-1][numberOfColumns];
		int count=0;
		for(int i=1; i<numberOfRows; i++) //rows
		{
			for(int j=0; j<numberOfColumns; j++) //Columns
			{
				Cell c = s.getCell(j,i);
				inputData[count][j] = c.getContents();
			}
			count++;
		}
		return inputData;
	}

}
