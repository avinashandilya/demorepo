package topic_AdvAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUI {
	
  @Test(groups="ui")
  public void test_Dashboard() {
	  System.out.println("test_Dashboard()");
  }
  
  @Test(groups="ui")
  public void test_Admin() {
	  System.out.println("test_Admin()");
  }
  
  @Test(groups="ui")
  public void test_ContactUs() {
	  System.out.println("test_ContactUs()");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest ----Login_UI");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest ----Logout_UI");
  }
}
