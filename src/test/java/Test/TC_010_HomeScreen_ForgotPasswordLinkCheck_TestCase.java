package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_010_HomeScreen_ForgotPasswordLinkCheck_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "In Home Page Checking the forgot password link is visible : ";
		testDescription = "Testing forget password link Visibility :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void forgotpasswordcheckTestCase() {
		HomeScreen forgot = new HomeScreen();
		forgot.returnsforgotpassword().forgotpasslinckcheck();
	}
}