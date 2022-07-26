package topic_AdvAnnotations;

import org.testng.annotations.Test;

public class TestSecurity {
	
  @Test(groups="security")
  public void test_AccessHomePage() {
	  System.out.println("test_AccessHomePage()");
  } 
  
  @Test(groups="security")
  public void test_AccessAdminPage() {
	  System.out.println("test_AccessAdminPage()");
  }
  
  @Test(groups="security")
  public void test_AccessCampaignsPage() {
	  System.out.println("test_AccessCampaignsPage()");
  }
}
