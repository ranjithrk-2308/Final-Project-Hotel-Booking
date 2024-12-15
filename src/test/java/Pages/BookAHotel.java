package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Base.SpecificationHotelBooking;

public class BookAHotel extends SpecificationHotelBooking {
	
	public BookAHotel selectinghotelFromList () {
		driver.findElement(By.xpath("//input[@name='radiobutton_1']")).click();
		
		//Clicking the Continue option :
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		return this;
	}
	public BookAHotel  bookahotelverification ( ) {
	String actual=	driver.findElement(By.xpath("//td[text()='Book A Hotel ']")).getText();
	String expected = "Book A Hotel";
	if (expected.equals(actual)) {
		System.out.println("The Browser is navigated to Book a hotel screen ");
	}else {
		System.out.println("The Browser is not navigated to Book a hotel screen ");
	}
		return this;
	}
	public BookAHotel firstname (String bfname ) {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(bfname);
		return this;
	}
	
	public BookAHotel lastname (String blname) {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(blname);
		return this;
	}
	public BookAHotel billingaddress (String bbillingaddress) {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(bbillingaddress);
		return this;
	}
	public BookAHotel credit (String bcredit) {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys(bcredit);
		return this;
	}
	public BookAHotel creditcardtype () {
		
	Select dropdown=new Select(driver.findElement(By.id("cc_type")));
	dropdown.selectByIndex(1);
	return this;
	} 
	public BookAHotel expmonth () {
		
		Select dropdown=new Select(driver.findElement(By.id("cc_exp_month")));
		dropdown.selectByIndex(1);
		return this;
		} 
	public BookAHotel expyear () {
		
		Select dropdown=new Select(driver.findElement(By.id("cc_exp_year")));
		dropdown.selectByIndex(20);
		return this;
		} 
	public BookAHotel cvv (String bcvv) {
		
		driver.findElement(By.id("cc_cvv")).sendKeys(bcvv);
		return this;
	}
	public BookAHotel booknowclick () throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(3000);
		return this;
	}
	public BookAHotel bookingconfirmation () throws InterruptedException {
		Thread.sleep(3000);
		String expected = "Booking Confirmation";
		String actual =	driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		if (expected.equals(actual)) {
			System.out.println("The Booking is Confirmed : ");
		}
		else {
			System.out.println("The booking is not confirmed : ");
		}
		return this;
	}
}