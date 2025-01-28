package org.QAfoxProject.Desktops;

import org.QAfoxProject.PageRepository.HomePage;
import org.QAfoxProject.PageRepository.RegisterAccountPage;
import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.QAfoxProjectGenericUtility.WebDriverLibrary;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.BaseAnnotation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Desktops_PCTest extends BaseConfigaration {
	public Desktops_PCTest() {
		report = new ExtentReports();
	}

	@Test
	public void addProduct_Desktops_PCTest() {
		// Create test information
		ExtentTest test = super.report.createTest("Verify-AddProduct_Desktops_PC");

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perofrm mouse actions on desktop module
		webdriverobj.mouseHouseToElement(homeobj.getDesktop_Headertext());
		test.log(Status.PASS, "Step1:Perform mouse Hover Actions-Desktop");
		javautilityobj.pause(5000);

		// Perofrm mouse actions on desktop module
		webdriverobj.mouseHouseToElement(homeobj.getDesktop_PC_Headertext());
		test.log(Status.PASS, "Step2.1:Perform mouse Hover Actions-PC");
		javautilityobj.pause(5000);

		// perform click action to besktop mac
		homeobj.getDesktop_PC_Headertext().click();
		test.log(Status.PASS, "Step2.2:Perform click Action-PC");

		test.log(Status.PASS, "Dektops_mac_product added successfully");
		Reporter.log("Desktops_PC product added", true);
	}

}
