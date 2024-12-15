package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_021_ChangePass_AfterChangelogin_TestCase extends SpecificationHotelBooking {

	public void afterchangepassLoginTestCase() {
	}

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing after the password change the login is working : ";
		testDescription = "Testing change password functionality   :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void afterchangepassloginTestCase() throws InterruptedException {
		HomeScreen changedetails = new HomeScreen();
		changedetails.login(prop.getProperty("lusername"), prop.getProperty("wrongconfirmpass")).loginconfirmation();

	}
}