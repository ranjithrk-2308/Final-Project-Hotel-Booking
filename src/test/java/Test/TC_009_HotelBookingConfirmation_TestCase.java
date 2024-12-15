package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_009_HotelBookingConfirmation_TestCase extends SpecificationHotelBooking {
	
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "After the hotel is booked confirming the booking : ";
		testDescription= "Testing heading after booking the hotel :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}

@Test	
	public void bookingconfirmationTestCase () throws InterruptedException {
		HomeScreen details = new HomeScreen();
		details.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.switchtoSearchhotelscreen()
		.Locationselect()
		.searchclick()
		.book()
		.selectinghotelFromList()
		.firstname(prop.getProperty("bfname"))
		.lastname(prop.getProperty("blname"))
		.billingaddress(prop.getProperty("bbillingaddress"))
		.credit(prop.getProperty("bcredit"))
		.creditcardtype()
		.expmonth()
		.expyear()
		.cvv(prop.getProperty("bcvv"))
		.booknowclick()
		.bookingconfirmation();
	}
}