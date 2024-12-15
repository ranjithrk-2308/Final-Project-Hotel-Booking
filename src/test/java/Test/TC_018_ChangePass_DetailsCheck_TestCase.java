package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_018_ChangePass_DetailsCheck_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Trying to change the password and the details entred are correct  : ";
		testDescription = "Testing change password functionality  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void changepassdetailsCheckTestCase() throws InterruptedException {
		HomeScreen changedetails = new HomeScreen();
		changedetails.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.changepass()
		.currentpass(prop.getProperty("lpassword"))
		.newpass(prop.getProperty("newpass"))
		.confirmpass(prop.getProperty("confirmpass"));
	}
}
