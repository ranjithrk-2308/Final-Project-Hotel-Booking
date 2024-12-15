package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.SpecificationHotelBooking;

public class SearchingOrder extends SpecificationHotelBooking {
	
	public void searchroderusingID () {
		
		String orderid = driver.findElement(By.xpath("(//form[@id='booked_form']")).getText();
		
		System.out.println(orderid);
		
		//driver.findElement(By.id("order_id_text")).sendKeys(orderid);
		
		WebElement table = driver.findElement(By.xpath("//form[@id='booked_form']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		//row iteration
		for(int i=0; i<rows.size(); i++) {
		    //check column each in row, identification with 'td' tag
		    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

		    //column iteration
		    for(int j=0; j<cols.size(); j++) {
		        System.out.println(cols.get(j).getText());
		    }

		    //This is to get the cell value you want
		    ////get col no 2
		    System.out.println(cols.get(1).getText());
		    ////get col no 8
		    System.out.println(cols.get(7).getText());
		}
	}
}