package Pages;

import org.openqa.selenium.By;
import Base.SpecificationHotelBooking;

public class HomeScreen extends SpecificationHotelBooking {

	public HomeScreen loginbuttoncheck() {
		String expected = "Forgot Password?";
		String actual = driver.findElement(By.xpath("//a[text()='Forgot Password?']")).getText();
		System.out.println(actual);

		if (expected.equals(actual)) {
			System.out.println("Login Screen is visible : ");
		} else {
			System.out.println("Login Screen is not visible : ");
		}
		return this;
	}

	public HomeScreen logoutclick() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		return this;
	}

	public HomeScreen logoutcheck() throws InterruptedException {

		Thread.sleep(2000);
		String expected = "You have successfully logged out. Click here to login again";
		String actual = driver.findElement(By.xpath("//td[@class='reg_success']")).getText();

		if (expected.equals(actual)) {
			System.out.println("The Log out is successfull : ");
		} else {
			System.out.println("The Log out is not successfull : ");
		}
		return this;
	}

	public HomeScreen login(String lusername, String lpassword) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(lusername);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(lpassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		return this;
	}

	public HomeScreen loginconfirmation() throws InterruptedException {
		Thread.sleep(2000);
		String expected = "Welcome to Adactin Group of Hotels";
		String actual = driver.findElement(By.xpath("//td[@class='welcome_menu']")).getText();
		System.out.println(actual);

		if (expected.equals(actual)) {
			System.out.println("The login is successfull : ");
		} else {
			System.out.println("The login is not successfull : ");
		}
		return this;
	}

	public HomeScreen wrongidpass(String wusername, String wpassword) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(wusername);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(wpassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		return this;
	}

	public HomeScreen checkwrongidpass() {
		String expected = "Invalid Login details or Your Password might have expired. Click here to reset your password";
		String actual = driver
				.findElement(By.xpath("//b[text()='Invalid Login details or Your Password might have expired. ']"))
				.getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.println("The invalid login test is passed : ");
		} else {
			System.out.println("The invalid login is failed : ");
		}

		return this;
	}

	public BookHotel switchtoSearchhotelscreen() {
		return new BookHotel();
	}

	public ForgotpasswordCheck returnsforgotpassword() {
		return new ForgotpasswordCheck();
	}

	public BookedItinerary returntobookitinerary() {
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		return new BookedItinerary();
	}

	public ChangePassword changepass() {
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		return new ChangePassword();
	}

	public SearchingOrder searchorder() {
		return new SearchingOrder();
	}
}