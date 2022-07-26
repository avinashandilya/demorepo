package topic_Before_AfterGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroups {
	//Config for Security 
	@BeforeGroups("security")
	public void setupSecurity()
	{
		System.out.println("setupSecurity");
	}

	@AfterGroups("security")
	public void teardownSecurity()
	{
		System.out.println("teardownSecurity");
	}
	//Config for UI
	@BeforeGroups("ui")
	public void setupUI()
	{
		System.out.println("setupUI");
	}

	@AfterGroups("ui")
	public void teardownUI()
	{
		System.out.println("teardownUI");
	}
	//Config for DB
	@BeforeGroups("db")
	public void setupDB()
	{
		System.out.println("setupDB");
	}

	@AfterGroups("db")
	public void teardownDB()
	{
		System.out.println("teardownDB");
	}
	//----------------------------------------------

	//UI related Real TC
	@Test(groups="ui")
	public void test_Dashboard() 
	{
	  System.out.println("test_Dashboard()");
	}
	@Test(groups="ui")
	public void test_Admin() 
	{
	  System.out.println("test_Admin()");
	}
	@Test(groups="ui")
	public void test_CotatcUs() {
	  System.out.println("test_CotatcUs()");
	}

	//Security related TC's
	@Test(groups="security")
	public void test_AccessHomePage() 
	{
	  System.out.println("test_AccessHomePage()");
	}
	@Test(groups="security")
	public void test_AccessAdminPage() 
	{
	  System.out.println("test_AccessAdminPage()");
	}
	@Test(groups="security")
	public void test_AccesCampaignsPage() 
	{
	  System.out.println("test_AccesCampaignsPage()");
	}

	//DB related TC's
	@Test(groups="db")
	public void testInsert() 
	{
	  System.out.println("testInsert()");
	}
	@Test(groups="db")
	public void testDelete() 
	{
	  System.out.println("testDelete()");
	}
	@Test(groups="db")
	public void testUpdate() 
	{
	  System.out.println("testUpdate()");
	}






}

