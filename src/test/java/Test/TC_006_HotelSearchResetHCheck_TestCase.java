package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_006_HotelSearchResetHCheck_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "After login checking the reset button in hotel search is working : ";
		testDescription= "Testing reset button on hotel search : ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public void resetbuttoncheckTestCase () throws InterruptedException {
		HomeScreen reset = new HomeScreen();
		reset.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.switchtoSearchhotelscreen()
		.numberofroomsselect()
		.adultsperRoom()
		.childperroom()
		.searchclick()
		.resettestStoresValue();
	}
}