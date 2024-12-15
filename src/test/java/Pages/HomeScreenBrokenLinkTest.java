package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.SpecificationHotelBooking;

public class HomeScreenBrokenLinkTest extends SpecificationHotelBooking {
	@BeforeTest
	public void readfile () throws IOException {
		readfilefrom();
		testname = "After the hotel is booked confirming the booking : ";
		testDescription= "Testing heading after booking the hotel :  ";
		testCategory = "Functional testing ";
		testAuthor = "Ranjithkumar A";
	}
	
	@Test
	public  void brokenlink ()  {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links: "+links.size());
		for (WebElement ele : links) {
			
			String url = ele.getAttribute("href");

			try {
				URL link = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) link.openConnection();
				connection.connect();
				
				if(connection.getResponseCode() == 200) {
					System.out.println("Valid link");
				}else {
					System.out.println( "Broken Link");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Connection failed :");
			}
			
		}
	}
}	