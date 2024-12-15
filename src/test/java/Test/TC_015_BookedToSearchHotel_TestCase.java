package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_015_BookedToSearchHotel_TestCase extends SpecificationHotelBooking {

	@BeforeTest
	public void readfile() throws IOException {
		readfilefrom();
		testname = "Trying to switch from Booked itinerary to search hotel screen   : ";
		testDescription = "Testing switch to Search hotel is working fine  :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void switchtoSearchHotelTestCase() throws InterruptedException {
		HomeScreen search = new HomeScreen();
		search.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.returntobookitinerary()
		.switchtosearchhotelscreen();
	}
}
