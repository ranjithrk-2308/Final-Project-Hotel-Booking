package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_012_HomeScreen_ForgotPassSendEmail_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Checking the forgot email functionality is working fine  : ";
		testDescription = "Testing email password button is working fine  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void emailpasswordTestCase() throws InterruptedException {
		HomeScreen emailpass = new HomeScreen();
		emailpass.returnsforgotpassword().enteremailforgotpass(prop.getProperty("cemail")).emailpassword().emailcheckpass();
	}
}