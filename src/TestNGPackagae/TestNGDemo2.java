package TestNGPackagae;

import org.testng.annotations.*;

public class TestNGDemo2 {
	
	@Test(groups= {"Smoke"})
	public void Demo_Demo2()
	{
		System.out.println("Demo 1");
	}
	
	@BeforeTest(alwaysRun=true)
	//Staring Appium server, UI - deleting data from database, UI - clean up data, API - set rest assured base URL
	//scope of @BeforeTest is at <test></test> folder level- same for @AfterTest
	public void BeforeTest()
	{
		System.out.println("This is my before test method");
	}
	
	@BeforeSuite(alwaysRun=true)
	//environnment variables, API -set up keys,  
	//This will run for entire suite only once - same with AfterSuite also
	public void BeforeSuite()
	{
		System.out.println("This is my before suite method");
	}
	
	@BeforeMethod//This will before every @Test in the class where it is defined, Same for @AfterMethod also
	//This can be used for clearing cookies before every test
	//can be used for JIRA authentications to check if it is still connected
	public void BeforeMethod()
	{
		System.out.println("This is my before method in Demo2 file");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is my After method in Demo2 file");
	}

}
