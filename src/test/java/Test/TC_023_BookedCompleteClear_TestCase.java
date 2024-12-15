package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_023_BookedCompleteClear_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Testing clear all in the booked : ";
		testDescription = "Testing clear all booked  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public void clearallBooked () throws InterruptedException {
		HomeScreen clearall = new HomeScreen();
		clearall.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.returntobookitinerary()
		.cancellallradiobutton()
		.cancelselected()
		.alertaccept();
	}
}