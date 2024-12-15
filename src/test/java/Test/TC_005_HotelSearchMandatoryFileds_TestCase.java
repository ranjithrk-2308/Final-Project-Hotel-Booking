package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_005_HotelSearchMandatoryFileds_TestCase extends SpecificationHotelBooking {
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "After login just select mandatory and search a hotel : ";
		testDescription= "Testing mandatory fields : ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public void mandatoryfields () throws InterruptedException {
		HomeScreen man = new HomeScreen();
		man.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.switchtoSearchhotelscreen()
		.Locationselect()
		.numberofroomsselect()
		.adultsperRoom()
		.childperroom()
		.searchclick()
		.checkingthelistisvisible();
	}
}