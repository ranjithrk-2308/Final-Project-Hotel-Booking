package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class HotelBookingUtilities {
	
	// Declaring public variables for File reader and WedDriver : 
		public static WebDriver driver;
		public static Properties prop;
		public static ExtentReports extent;
		public static ExtentTest test;
		public String testname, testDescription , testCategory , testAuthor;
	
	// Opening the Hotel booking app : 
		public void open (String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void close () {
		driver.close();
	}
	
	// Method for reading the data from properties file : 
	public void readfilefrom () throws IOException {
		FileReader file = new FileReader("C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\FinalProjectHotelBooking\\src\\test\\resources\\dataprovider.properties");
		prop = new Properties();
		prop.load(file);
	}	
	// Code for taking screenshot : 
	
	public static String capturescreenshot (String name) throws IOException {
		String path = "C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\FinalProjectHotelBooking\\Screenshot"+name+".png";
		
		File src = ((TakesScreenshot)driver ).getScreenshotAs(OutputType .FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		
		return path;
	}
}