package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_013_HomeScreen_ForgotpasswordEmailCheck_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Checking the forgot email send email or not  : ";
		testDescription = "Testing email password with wrong email  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void wrongemailinforgotpasswordTestCase() {
		HomeScreen wrong = new HomeScreen();
		wrong.returnsforgotpassword().enteremailforgotpass(prop.getProperty("wemail")).emailpassword().emailcheckfail();
	}
}