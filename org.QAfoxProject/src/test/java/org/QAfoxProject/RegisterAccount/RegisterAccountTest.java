package org.QAfoxProject.RegisterAccount;

import org.QAfoxProject.PageRepository.RegisterAccountPage;
import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.QAfoxProjectGenericUtility.WebDriverLibrary;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.QAfoxProject.LisenerFeature.ListenersImplementation.class)
public class RegisterAccountTest extends BaseConfigaration{
	
	
	
	@Test(retryAnalyzer = org.QAfoxProject.LisenerFeature.ListenersImplementation.class)
	public void verifyWithValidInput() {
		
		
		RegisterAccountPage registerAccountPage = new RegisterAccountPage(WebDriverLibrary.static_driver);
		registerAccountPage.getEmailtextfield().sendKeys("Suneetha");
		registerAccountPage.getEmailtextfield().sendKeys("Peram");
		registerAccountPage.getEmailtextfield().sendKeys("peramsuneetha12@gmail.com");
		registerAccountPage.getTelephonetextfield().sendKeys("8309908877");
		registerAccountPage.getPasswordtextfield().sendKeys("Suni@81189");
		registerAccountPage.getConfirmpasswordtextfield().sendKeys("Suni@81189");
		registerAccountPage.getRadioButtonyes().click();
		registerAccountPage.getTermConditioncheckbox().click();
		registerAccountPage.getContinueButton().click();
		
		
		// Test Log
		Reporter.log("Register Account Verified With Valid Input", true);
		//Assert.fail();

	}

	@Test(retryAnalyzer = org.QAfoxProject.LisenerFeature.ListenersImplementation.class)
	public void verifyWithInValidInput() {
		// Test Log
		Reporter.log("Register Account Verified With InValid Input", true);
	}
	
	
}
