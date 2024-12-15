package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_002_LoginSuccessfullCheck_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "Login Successfull  Check Test : ";
		testDescription= "Testing the Login function is working properly ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	@Test
	public void loginconfirmation () throws InterruptedException {
		
		HomeScreen confirm = new HomeScreen();
		confirm.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.loginconfirmation();
	}
}
