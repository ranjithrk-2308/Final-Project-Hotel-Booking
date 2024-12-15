package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_003_LoginWrongIDpassCheck_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "Login with Wrong IDpass  Check Test : ";
		testDescription= "Testing the Login functionality with the wrong IDpass";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	@Test
	public void wrongidpasscheckTestCase () throws InterruptedException {
		
		HomeScreen wrong = new HomeScreen();
		wrong.wrongidpass(prop.getProperty("wusername"), prop.getProperty("wpassword"))
		.checkwrongidpass();
	}
}