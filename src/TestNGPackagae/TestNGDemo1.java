package TestNGPackagae;

import org.testng.annotations.*;

import com.beust.jcommander.Parameter;

public class TestNGDemo1 {
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is After Test method from TestNGDemo1");
	}

	@Parameters({"URL","APIKey"})
	@Test
	public void Demo(String url, String apikey)
	{
		System.out.println("Demo 1");
		System.out.println(url);
		System.out.println(apikey);
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Demo 2");
	}
}
