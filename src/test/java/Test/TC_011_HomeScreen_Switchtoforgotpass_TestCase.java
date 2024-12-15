package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_011_HomeScreen_Switchtoforgotpass_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "In Home Page Checking the forgot password link is navigating to forgot password screen : ";
		testDescription = "Testing forget password link is switching successfully :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void forgotpassSwitchTestCase() throws InterruptedException {
		HomeScreen forgotpass = new HomeScreen();
		forgotpass.returnsforgotpassword().switchtoforgotpasswordscreencheck();
	}
}