package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_001_LoginButtonCheck_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		
		readfilefrom();
		testname = "Login Button Check Test : ";
		testDescription= "Testing the Login Button is accesible";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

	@Test
	public void loginbuttoncheck () {
		HomeScreen login = new HomeScreen();
		
		login.loginbuttoncheck();
	}
}