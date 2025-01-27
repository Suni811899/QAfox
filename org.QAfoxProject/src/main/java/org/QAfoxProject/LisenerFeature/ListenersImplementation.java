package org.QAfoxProject.LisenerFeature;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.QAfoxProjectGenericUtility.WebDriverLibrary;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation extends BaseConfigaration implements ITestListener , IRetryAnalyzer{

	int count=1;
	private static final String Baseclass = null;

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("onTestStart...!!!",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess...!!!",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure...!!!",true);
		String name = result.getName();
		
		
		//Perform Typecasting
		TakesScreenshot ss = (TakesScreenshot) WebDriverLibrary.static_driver;
		
		
		// create temp path for the screenshot
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		//Use TimeStamp
		//String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());
		
		String methodname = null;
		// create permemant path
		File destination = new File("./TestScreenShort/"+methodname+".png");

		// copy the file from temp to permenant
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped...!!!",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage...!!!",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout...!!!",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart...!!!",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish...!!!",true);
	}

	@Override
	public boolean retry(ITestResult result) 
	{
			int retryuntil=5;
			boolean flag = false;
			
			if(count<=retryuntil)
			{
				Reporter.log("Retry...!!!",true);
				count++;
				flag=true;
			}
			return flag;
	}

	
	
}
