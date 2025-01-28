package org.QAfoxProject.Components;

import org.QAfoxProject.PageRepository.Components_MiceandTrackballsPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Components_MiceandTrackballs_Test extends BaseConfigaration {

	
	

	@Test(enabled = true, invocationCount = 2, priority = 0)
	public void verifyText_Components_MiceandTrackballs() {

		// Create test information
		ExtentTest test = report.createTest("Verify-AddProduct_Desktops_PC");

		HomePage homeobj = new HomePage(webdriverobj.driver);

		Assert.assertTrue(homeobj.getComponets_Hearderlink().isDisplayed());
		Reporter.log("Components headerlink displayed and enabled", true);

		Assert.assertTrue(homeobj.getComponets_Hearderlink().isEnabled());
		test.log(Status.PASS, "Components headerlink displayed and enabled");

		// Perofrm mouse actions on components module
		webdriverobj.mouseHouseToElement(homeobj.getComponets_Hearderlink());
		test.log(Status.PASS, "Step1:Perform mouse Hover Actions-Desktop");
		javautilityobj.pause(5000);

		Assert.assertTrue(homeobj.getComponets_MiceandTrackballs().isDisplayed());
		Reporter.log("MiceandTrackballs displayed and enabled", true);

		Assert.assertTrue(homeobj.getComponets_MiceandTrackballs().isEnabled());
		test.log(Status.PASS, "MiceandTrackballs displayed and enabled");

		// Perofrm mouse actions on components module and mouse action on mice and
		// trackballs component
		webdriverobj.mouseHouseToElement(homeobj.getComponets_MiceandTrackballs());
		test.log(Status.PASS, "Step1:Perform mouse Hover Actions-MIceandTrackballs");
		javautilityobj.pause(5000);

		// perform click action to components miceandtrackballs
		homeobj.getComponets_MiceandTrackballs().click();
		test.log(Status.PASS, "Step2.2:Perform click MiceandTrackballs");

		String curenturl = webdriverobj.getcurrenturl();
		String Excpetedurl = "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_29";

		String pageTitle = webdriverobj.getpagetitle();
		String ActualTitle = "Mice and Trackballs";

		Assert.assertEquals(curenturl, Excpetedurl);
		Assert.assertEquals(pageTitle, ActualTitle);

		test.log(Status.PASS, "There are no products to list in this category");
		Reporter.log("Components_miceandtrackballs", true);

		WebDriver driver = null;
		Components_MiceandTrackballsPage mt = new Components_MiceandTrackballsPage(driver);

		String MicePagetext = mt.getMiceandTrackballs_PageText().getText();
		String productText = mt.getMiceandTrackballs_ProductsText().getText();
		Assert.assertEquals(MicePagetext, "Mice and Trackballs");
		Assert.assertEquals(productText, "There are no products to list in this category.");

		// Getting the size of the element
		int[] Size = webdriverobj.getsize(mt.getMiceandTrackballs_ProductsText());

		System.out.println(Size);
		Reporter.log("" + Size, true);
	}
}
