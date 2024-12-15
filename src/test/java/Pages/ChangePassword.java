package Pages;

import org.openqa.selenium.By;

import Base.SpecificationHotelBooking;

public class ChangePassword extends SpecificationHotelBooking {

	public void changeswitchverification() {
		String actual = driver.findElement(By.xpath("//strong[text()='Change Password']")).getText();

		String expected = "Change Password";
		if (actual.equals(expected)) {
			System.out.println("The Switch to change password screen is successfull :");
		} else {
			System.out.println("The Switch to change password screen is not successfull :");

		}
	}

	public ChangePassword currentpass(String lpassword) {
		driver.findElement(By.id("current_pass")).sendKeys(lpassword);
		return this;

	}

	public ChangePassword newpass(String newpass) {
		driver.findElement(By.xpath("//input[@name='new_password']")).sendKeys(newpass);
		return this;

	}

	public ChangePassword wrongconfirmpass(String wrongconfirmpass) {
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(wrongconfirmpass);
		return this;
	}

	public ChangePassword confirmpass(String confirmpass) {
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(confirmpass);
		System.out.println("The new pass and confirm pass details are filled successfully :");
		return this;
	}

	public ChangePassword changepassSubmitbutton() {
		driver.findElement(By.xpath("//input[@name='change_password_Submit']")).click();
		return this;
	}
	
	public void passwordchangeConfirmtationText () {
		String expected = "Your Password is successfully updated!!!";
		String actual =	driver.findElement(By.xpath("//span[@class='reg_error']")).getText();
		if (actual.equals(expected)) {
			System.out.println("The password change is successull :");
		}else {
			System.out.println("The password change is not successull :");

		}
	}
	public ChangePassword logintest () {
		
		String actual=	driver.findElement(By.xpath("(//td[@class='welcome_menu'])[1]")).getText();
		System.out.println(actual);
		return this;
	}
}