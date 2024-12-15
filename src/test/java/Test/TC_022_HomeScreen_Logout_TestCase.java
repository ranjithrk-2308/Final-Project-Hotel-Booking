package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_022_HomeScreen_Logout_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing after login logout is working : ";
		testDescription = "Testing logout functionality   :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void afterloginlogoutcheckTestCase() throws InterruptedException {
		HomeScreen changedetails = new HomeScreen();
		changedetails.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.logoutclick()
		.logoutcheck();

	}
}