package utils;
import java.io.IOException;

import org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import Base.SpecificationHotelBooking;

public class ListnerClass extends SpecificationHotelBooking implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	// Method for the passed test case: 
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		test.pass(result.getThrowable());
		
		String filepath = null;
		
		 try {
			filepath = capturescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
	}
	// Method for the failed test cases : 
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String filepath = null;
		
			 try {
				filepath = capturescreenshot(result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
	// Method for Test Skipped : 
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : ");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}