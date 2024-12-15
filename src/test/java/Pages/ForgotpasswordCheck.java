package Pages;

import org.openqa.selenium.By;

import Base.SpecificationHotelBooking;

public class ForgotpasswordCheck extends SpecificationHotelBooking {

	public ForgotpasswordCheck forgotpasslinckcheck() {
		String actual = driver.findElement(By.xpath("//a[text()='Forgot Password?']")).getText();
		String expected = "Forgot Password?";
		if (expected.equals(actual)) {
			System.out.println("The Forgot password link is visible in home screen :");
		} else {
			System.out.println("The forgot password link is not visible in the home screen :");
		}
		return this;
	}

	public ForgotpasswordCheck switchtoforgotpasswordscreencheck() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();

		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		String expected = "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)";
		if (actual.equals(expected)) {
			System.out.println("The Switch to forgot password form is successfull :");
		} else {
			System.out.println("The Switch to forgot password form is not successfull :");

		}
		return this;
	}

	public ForgotpasswordCheck enteremailforgotpass(String cemail) {
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		driver.findElement(By.id("emailadd_recovery")).sendKeys(cemail);
		return this;
	}

	public ForgotpasswordCheck emailpassword() {
		driver.findElement(By.id("Submit")).click();
		return this;
	}

	public ForgotpasswordCheck emailcheckfail() {
		String failed = driver.findElement(By.xpath("//span[text()='Email Address does not exsit in database']"))
				.getText();
		String expected = "Email Address does not exsit in database";
		if (failed.equals(expected)) {
			System.out.println(
					"The email is not present in the database email is wrong so the forgot password email is not sent :");
		} else {
			System.out.println("The email is sent to the respected person :");
		}

		return this;
	}

	public ForgotpasswordCheck emailcheckpass() throws InterruptedException {
		Thread.sleep(4000);
		String success = driver.findElement(By.xpath("//a[text()='Click here to login']")).getText();
		String expected = "Click here to login";
		if (success.equals(expected)) {
			System.out.println("The email is sent to the respected person :");
		} else {
		System.out.println(	"The email is not present in the database email is wrong so the forgot password email is not sent :");
		}
		return this;
	}

}