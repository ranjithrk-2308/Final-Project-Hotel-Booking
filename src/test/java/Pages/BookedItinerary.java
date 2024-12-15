package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.SpecificationHotelBooking;

public class BookedItinerary extends SpecificationHotelBooking {
	public String before;
	public String after;

	public BookedItinerary selectone() {
		driver.findElement(By.xpath("//input[@name='ids[]']")).click();
		return this;
	}

	public BookedItinerary beforecancel() {
		before = driver.findElement(By.xpath("(//input[@class='select_text'])[1]")).getText();
		System.out.println(before);
		return this;
	}

	public BookedItinerary cancelselected() {

		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
		return this;
	}

	public BookedItinerary alertaccept() {
		driver.switchTo().alert().accept();
		return this;
	}
	public BookedItinerary aftercancel() {
		after = driver.findElement(By.xpath("((//input[@class='select_text'])[1]")).getText();
		System.out.println(after);
		return this;
	}
	
	public BookedItinerary cancelcheck () {
		if (before.equals(after)) {
			System.out.println("The Cancellation is not successfull :");
		}else {
			System.out.println("The Cancellation is  successfull :");

		}
		return this;
	}
	public BookedItinerary switchtosearchhotelscreen () {
		driver.findElement(By.id("search_hotel")).click();
		return this;
	}
	public void switchverification () {
		String actual = driver.findElement(By.xpath("//td[@class='login_title']")).getText();		
		String expected = "Search Hotel (Fields marked with Red asterix (*) are mandatory)";
		if (expected.equals(actual)) {
			System.out.println("The switchto Search hotel is successfull :");
		}else {
			System.out.println("The switchto Search hotel is not successfull :");
		}
	}
	public BookedItinerary cancellallradiobutton () {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		return this;
	}
}
