package Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.SpecificationHotelBooking;
import Pages.HomeScreen;

public class TC_007_HotelSelectandBook_TestCase extends SpecificationHotelBooking {
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "After the hotel list is listed selecting a hotel : ";
		testDescription= "Testing the selection hotel is working fine :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	
	@Test
	public void selectinghotelTestCase () throws InterruptedException {
		HomeScreen select = new HomeScreen();
		select.login(prop.getProperty("lusername"), prop.getProperty("lpassword"))
		.switchtoSearchhotelscreen()
		.Locationselect()
		.searchclick()
		.book()
		.selectinghotelFromList()
		.bookahotelverification();
	
	}
}