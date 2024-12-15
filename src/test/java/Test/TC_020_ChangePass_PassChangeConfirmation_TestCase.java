package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_020_ChangePass_PassChangeConfirmation_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing the chage password screen with wrong conrfirm password  and confirming the text : ";
		testDescription = "Testing change password functionality   :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void WrongconfirmpassVerificationTestCase() throws InterruptedException {
		HomeScreen changedetails = new HomeScreen();
		changedetails.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.changepass()
		.currentpass(prop.getProperty("lpassword"))
		.newpass(prop.getProperty("newpass"))
		.wrongconfirmpass(prop.getProperty("wrongconfirmpass"))
		.changepassSubmitbutton()
		.passwordchangeConfirmtationText();
	}
}