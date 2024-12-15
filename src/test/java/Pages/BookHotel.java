package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Base.SpecificationHotelBooking;

public class BookHotel extends SpecificationHotelBooking {
	
	public BookHotel searchhotelvisible () {
		String expected = "Search Hotel (Fields marked with Red asterix (*) are mandatory)";
		String actual=	driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("Switching to Search hotel screen is passed :");
		}else {
			System.out.println("Switching to search hotel is failed");
		}
		return this;
	}
	
	public BookHotel Locationselect () {
		
		// Working on the Location drop down :
		
		driver.findElement(By.xpath("//select[@id='location']")).click();
		
		driver.findElement(By.xpath("//option[@value='Sydney']")).click();
		return this;
	}
	public BookHotel numberofroomsselect () {
		// Selecting the number of room:
		driver.findElement(By.xpath("//select[@id='room_nos']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
		dropdown.selectByIndex(2);
		return this;
	}
	public BookHotel adultsperRoom () {
		
		driver.findElement(By.id("adult_room")).click();
		Select dropdown = new Select(driver.findElement(By.id("adult_room")));
		dropdown.selectByIndex(2);
		return this;
	}
	public BookHotel childperroom () {
		
		driver.findElement(By.id("child_room")).click();
		Select dropdown = new Select(driver.findElement(By.id("child_room")));
		dropdown.selectByIndex(2);
		return this;
	}
	public BookHotel searchclick () {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		return this;
	}
	public BookAHotel book () {
		return new BookAHotel();
	}
	
	public BookHotel checkingthelistisvisible () {
		String expected = "Select Hotel";
		String actual =	driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		System.out.println(actual);
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("The list is visible in the screen :");
		}else {
			System.out.println("The list is not visible : ");
		}
		return this;
	}
	
	public BookHotel resettestStoresValue () {
		driver.findElement(By.xpath("//input[@name='Reset']")).click();
		String expected = "Please Select a Location";
		String location = driver.findElement(By.xpath("//span[@id='location_span']")).getText();
		if (expected.equals(location)) {
			System.out.println("The reset Button is working fine :");
		}else {
			System.out.println("The reset Button is not working : ");
		}
		return this;
	}
}