package org.QAfoxProjectGenericUtility;

import org.QAfoxProject.PageRepository.AccountLoginPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Alt+Shift+j---->For cammands This class is used for configure all
 * precondition and post condition for test script and also initializing all the
 * library utility class
 */

public class BaseConfigaration {

	public WebDriverLibrary webdriverobj;
	//public ExcelFileLibrary excelfileobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javautilityobj;
	public JavaScriptLibrary jsutilityobj;
	//public TakeScreenShortLibrary tsutilityobj;
	public WebDriver driver;

	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	/**
	 * This Method used to configure the browser Setup
	 * 
	 * @param
	 */
	@BeforeClass
	public void browserSetup() {
		// Initialize all the Libraries
		initobjects();

		String Browser = "chrome";
		String URL = "https://tutorialsninja.com/demo/";

		// PreCondition1:Launch the browser
		webdriverobj.launchBrowser(Browser);
		Reporter.log("Browser Launched Successfully", true);

		// PreCondition2:Nav to the apps
		webdriverobj.NavigateToApp(URL);
		Reporter.log("Nav to the apps Successfully", true);

		// PreCondition3:Maximize the browser
		webdriverobj.maximizeBrowser();
		Reporter.log("Maximize the browser Successfully", true);

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Click on "My Account" hearder link
		homeobj.getMyaccountlink().click();
		Reporter.log("Clicked on my account header link successful", true);

		// Click on login header link
		homeobj.getLogin_Hearderlink().click();
		Reporter.log("Clicked on login header link successful", true);

		// Click on Register header link
		// homeobj.getRegister_Hearderlink().click();
		// Reporter.log("Clicked on register header link successful", true);

	}

	/**
	 * This Method used to configure the browser Terminate
	 */
	@AfterClass
	public void browserTerminate() {
		// precondition1:close the browser
		webdriverobj.closeBrowser();
		// Test Log
		Reporter.log("Browser Terminate Successfully", true);
	}

	/**
	 * This Method used to perform Login activity
	 */
	@BeforeMethod
	public void browserLogin() {

		String Username = "peramsuneetha12@gmail.com";
		String password = "Suni@81189";

		// waiting statement
		webdriverobj.waitUntilElementFound();

		AccountLoginPage Loginobj = new AccountLoginPage(webdriverobj.driver);

		// Enter EmailAddress
		Loginobj.getEmailaddress().sendKeys(Username);

		// Enter Password
		Loginobj.getPassword().sendKeys(password);

		// Click on login button
		Loginobj.getLoginbutton().click();

		// Test Log
		Reporter.log("Login Successfully", true);
	}

	/**
	 * This Method used to perform Logout activity
	 */
	@AfterMethod(enabled = true)
	public void Logout() {

		HomePage logoutobj = new HomePage(webdriverobj.driver);

		logoutobj.getMyaccountlink().click();

		logoutobj.getLogout_headerlink().click();

		// Test Log
		Reporter.log("Logout Successfully", true);
	}

	/**
	 * This Method used to Get/configure the test runner level connection
	 */
	@BeforeTest
	public void getTestRunnerConnection() {
		// Test Log
		Reporter.log("Getting TestRunner Connection Successfully", true);
	}

	/**
	 * This Method used to Terminate/configure the test runner level connection
	 */
	@AfterTest
	public void terminateTestRunnerConnection() {
		// Test Log
		Reporter.log("Terminate Test Level Connection Successful", true);
	}

	/**
	 * This Method used to Get/configure the Database or Advance Report Connection
	 */
	@BeforeSuite
	public void getReportConnection() {

		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvnceReports/report.html");

		// Configure the sparkreport information
		spark.config().setDocumentTitle("FunctionalityTest||QAfox");
		spark.config().setReportName("FunctionalitySuite||Verify user can able to add desktop-mac-product ");
		spark.config().setTheme(Theme.STANDARD);

		// Create the extent report
		report = new ExtentReports();

		// Attach the spark report
		report.attachReporter(spark);

		// Configure the system information in extent report
		report.setSystemInfo("DeviceName:", "DESKTOP-S1VV6A4");
		report.setSystemInfo("Operating System:", "WINDOWS 11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion.", "Version 131.0.6778.265");

		// Test Log
		Reporter.log("Get Report Connection Successful", true);
	}

	/**
	 * This Method used to Terimnate the Database or Advance Report Connection
	 */
	@AfterSuite
	public void terminateReportConnection() {

		// Flush the report information
		report.flush();

		// Test Log
		Reporter.log("Terminate Report Connection Successful", true);
	}

	public void initobjects() {
		webdriverobj = new WebDriverLibrary();
		//excelfileobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javautilityobj = new JavaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		//tsutilityobj = new TakeScreenShortLibrary();

	}

}
