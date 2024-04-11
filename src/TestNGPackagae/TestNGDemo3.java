package TestNGPackagae;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGDemo3 {

	@Test(groups = { "Smoke" })
	public void WebLoginCar() {
		System.out.println("WebLoginCar");
	}

	@Test
	public void MobileLoginCar() {
		System.out.println("MobileLoginCar");
	}

	@Test
	public void MobileBrowseCar() {
		System.out.println("MobileBrowseCar");
	}

	@Test(groups = { "Smoke" }, enabled = false, timeOut = 4000)
	public void MobileStartCar() {
		System.out.println("MobileStartCar");
	}

	@Test(groups = { "Smoke" }, dependsOnMethods = { "WebLoginCar" })
	public void APILoginCar() {
		System.out.println("APILoginCar");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("This is After Test method from TestNGDemo3");
	}
}
