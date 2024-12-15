package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_014_BookedScreen_Removeone_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Trying to cancel a Booked Itinerary   : ";
		testDescription = "Testing Cancel selected is working  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void cancelselectedTestCase() throws InterruptedException {
		HomeScreen cancel = new HomeScreen();
		cancel.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.returntobookitinerary()
		.selectone()
		.cancelselected()
		.alertaccept();
	}
}
