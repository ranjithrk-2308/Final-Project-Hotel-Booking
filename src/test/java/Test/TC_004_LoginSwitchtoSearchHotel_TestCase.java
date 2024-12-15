package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_004_LoginSwitchtoSearchHotel_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "Login success to search hotel : ";
		testDescription= "Testing the successfull login to switch to Search hotel ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public void switchtosearchhotelTestCase () throws InterruptedException {
		
		HomeScreen switchto = new HomeScreen();
		switchto.login(prop.getProperty("lusername"), prop.getProperty("lpassword"));
		switchto.switchtoSearchhotelscreen()
		.searchhotelvisible();
	}
}