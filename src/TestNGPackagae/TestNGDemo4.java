package TestNGPackagae;

import org.testng.Assert;
import org.testng.annotations.*;

import com.beust.jcommander.Parameter;

public class TestNGDemo4 {

	@Test(dataProvider = "getData")
	public void WebLoginHome(String username, String password)
	{
		System.out.println("WebLoginHome");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHome()
	{
		System.out.println("MobileLoginHome");
		//Assert.assertTrue(false);
	}
	
	@Test
	@Parameters({"URL"})
	public void APILoginHome(String url)
	{
		System.out.println("APILoginHome");
		System.out.println(url);
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("This is my after suite method");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is my before method in Demo4 file");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is my before class in Demo4 file");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This is my after class in Demo4 file");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}

}
