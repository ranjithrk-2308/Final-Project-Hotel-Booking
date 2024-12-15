package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_019_Changepass_Wrongconfirmpass_TestCase extends SpecificationHotelBooking {
	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing the chage password screen with wrong conrfirm password  : ";
		testDescription = "Testing change password functionality   :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void WrongconfirmpassCheckTestCase() throws InterruptedException {
		HomeScreen changedetails = new HomeScreen();
		changedetails.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.changepass()
		.currentpass(prop.getProperty("lpassword"))
		.newpass(prop.getProperty("newpass"))
		.wrongconfirmpass(prop.getProperty("wrongconfirmpass"))
		.changepassSubmitbutton();
	}
}
