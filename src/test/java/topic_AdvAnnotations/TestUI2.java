package topic_AdvAnnotations;

import org.testng.annotations.Test;

public class TestUI2 {
	
  @Test(groups="ui")
  public void test_Dashboard1() {
	  System.out.println("test_Dashboard1()");
  }
  
  @Test(groups="ui")
  public void test_Admin1() {
	  System.out.println("test_Admin1()");
  }
  
  @Test(groups="ui")
  public void test_ContactUs1() {
	  System.out.println("test_ContactUs1()");
  }
  
}
