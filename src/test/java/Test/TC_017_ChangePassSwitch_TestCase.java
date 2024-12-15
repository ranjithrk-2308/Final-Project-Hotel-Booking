package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_017_ChangePassSwitch_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing the chnge password link is working   : ";
		testDescription = "Testing switch to change password page is working  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public void changepasswordswitchTestCase() throws InterruptedException {
		HomeScreen change = new HomeScreen();
		change.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.changepass()
		.changeswitchverification();
	}
}