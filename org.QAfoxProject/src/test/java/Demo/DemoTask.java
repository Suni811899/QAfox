package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Test Utility(All we have reusable methods)
   Test Data()
   Test Script
   Test Suite
   Test Report
 */


public class DemoTask 
{
	
	//it should not effect the libraries and its just for our execution(Like rought notes)
	//Test Report(High level report)
	//some companies there are creating report in the form of html file
	
	
	
	@Test
	public void DemoTesting1() {
		
	//Create the SparkReport
	ExtentSparkReporter spark=new ExtentSparkReporter("./AdvnceReports/report.html");
	
	
	//Configure the sparkreport information
	spark.config().setDocumentTitle("FunctionalityTest||QAfox");
	spark.config().setReportName("FunctionalitySuite||Verify user can able to add desktop-mac-product ");
	spark.config().setTheme(Theme.STANDARD);
	
	
	//Create the extent report
	ExtentReports report = new ExtentReports();
	
	
	//Attach the spark report
	report.attachReporter(spark);
	
	
	//Configure the system information in extent report
	report.setSystemInfo("DeviceName:", "DESKTOP-S1VV6A4");
	report.setSystemInfo("Operating System:", "WINDOWS 11");
	report.setSystemInfo("Browser", "Chrome");
	report.setSystemInfo("BrowserVersion.", "Version 131.0.6778.265");
	
	
	
	//Create test information
	ExtentTest test = report.createTest("Functionality Test");
	
	
	//Steps information
	test.log(Status.INFO, "Step1:Launching the browser successfully");
	
	test.log(Status.INFO, "Navigating to the application via URL Successfully");
	
	test.log(Status.PASS, "Step3:Verified the webpage successully");
	
	
	
	if("DESKTOP-S1VV6A4".equals("DESKTOP-S1VV6A4"))
	{
		test.log(Status.PASS, "Step3:Verified the webelement displayed");
	}
	else
	{
		test.log(Status.FAIL, "Step3:Verified the webelement not displayed");
	}
	
	
	
	//Flush the report information
	report.flush();
	
	}
}
