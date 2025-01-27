package org.QAfoxProject.Desktops;

import org.QAfoxProject.PageRepository.Desktop_MacPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Desktops_MacTest extends BaseConfigaration {

	@Test
	public void addProduct_Desktops_Mac() {
		Desktop_MacPage macObj = new Desktop_MacPage(webdriverobj.driver);
	
		//Create test information
		ExtentTest test = report.createTest("Verify-AddProduct_Desktops_Mac");
		
		
		HomePage homeobj = new HomePage(webdriverobj.driver);
		// Perofrm mouse actions on desktop module
		webdriverobj.mouseHouseToElement(homeobj.getDesktop_Headertext());
		test.log(Status.PASS, "Step1:Perform mouse Hover Actions-Desktop");
		
		javautilityobj.pause(5000);

		// Perofrm mouse actions on desktop module
		webdriverobj.mouseHouseToElement(homeobj.getDesktop_Mac_Headertext());
		test.log(Status.PASS, "Step2.1:Perform mouse Hover Actions-Mac");
		//perform click action to besktop mac
		homeobj.getDesktop_Mac_Headertext().click();
		test.log(Status.PASS, "Step2.2:Perform click Action-Mac");
		
		javautilityobj.pause(5000);
		test.log(Status.PASS, "Dektops_mac_product added successfully");
		
		Reporter.log("Desktops_Mac product added", true);
		
		//added
		macObj.getImac().click();
		javautilityobj.pause(5000);

		String productTitle = macObj.getProduct_Title().getText();
		Reporter.log(productTitle, true);
		javautilityobj.pause(5000);

		String productBrand = macObj.getProduct_Brand().getText();
		Reporter.log(productBrand, true);
		javautilityobj.pause(5000);

		String productCode = macObj.getProduct_Code().getText();
		Reporter.log(productCode, true);
		javautilityobj.pause(5000);

		String productAvailability = macObj.getProduct_Availability().getText();
		Reporter.log(productAvailability, true);
		javautilityobj.pause(5000);

		String productActualPrice = macObj.getProduct_ActualPrice().getText();
		Reporter.log(productActualPrice, true);
		javautilityobj.pause(5000);
		String productDiscountPrice = macObj.getProduct_DiscountPrice().getText();
		Reporter.log(productDiscountPrice, true);
		javautilityobj.pause(5000);

		macObj.getProduct_Qty().sendKeys("5");
		Reporter.log("QTY is entered sucessfully",true);
		javautilityobj.pause(5000);

		macObj.getProduct_AddToCart().click();
		Reporter.log("add cart button click sucessfully ",true);
		javautilityobj.pause(5000);

		String productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javautilityobj.pause(5000);

		String productDescription = macObj.getProduct_Description().getText();
		Reporter.log(productDescription, true);
		javautilityobj.pause(5000);

		homeobj.getProduct_Cart().click();
		Reporter.log("shopping cart button click sucessfull", true);
		javautilityobj.pause(5000);
		
		homeobj.getView_Cart().click();
		Reporter.log("view cart button click sucessfull");
		javautilityobj.pause(5000);

		macObj.getProduct_CheckOut().click();
		Reporter.log("check out button click sucessfull");
		javautilityobj.pause(5000);

		productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javautilityobj.pause(5000);


	}

}
