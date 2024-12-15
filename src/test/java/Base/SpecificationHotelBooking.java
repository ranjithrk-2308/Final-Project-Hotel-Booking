package Base;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

import utils.HotelBookingUtilities;

public class SpecificationHotelBooking  extends HotelBookingUtilities{
	
	@BeforeSuite
	public void reportinitial () {
		// Extends reports for the failed test cases : 
					//ExtentSparkReporter  -> To Create physical HTML report in given location. 
					//ExtentReport -> To Capture the automation data.
					//ExtentTest -> To Create the test case (Rows and column ) in the report and capture the test case status.   

		String filepath = "C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\FinalProjectHotelBooking\\Reports\\FinalProjectReport.html";
		//Create report in given location : 
		ExtentSparkReporter reporter = new ExtentSparkReporter(filepath); 
		reporter.config().setReportName("FinalProjectReport");
		
		// Capture the test data : 
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	
	}
	
	
	  @BeforeClass public void testdetails () {
		test = extent.createTest(testname, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
			
	  }
	 
	
	@BeforeMethod
	public void openBookingSite () {
		open(prop.getProperty("browser1"));
	}
	
	@AfterMethod
	public void closeBookingSite () {
		close();
	}
	
	@AfterSuite
	public void reportclose () {
		extent.flush();
	}
}