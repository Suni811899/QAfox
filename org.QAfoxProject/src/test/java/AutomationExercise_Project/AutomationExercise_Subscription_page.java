package AutomationExercise_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExercise_Subscription_page extends BaseConfiguration
{
	@Test
	public void subscriptionPage()
	{
		//Verify Homepage Title
		String homepagetitle = "Automation Exercise";
		Assert.assertEquals(homepagetitle, webdriverobj.getcurrenturl());
		
		PageRepository repo = new PageRepository(driver);
		
		//Verify Subscription Text In footer section
		String footerlink = "Subscription";
		Assert.assertEquals(repo.getFooter() ,footerlink);
		
		//Enter emailAddress in emailtextfield
		repo.getEmail().sendKeys("peramsuneetha12@gmail.com");
		
		//Click on submit button
		repo.getEmail_Submitbutton().click();
		
		//Verify "You have been successfully subscribed!'" message
		String Successfulmsg = "You have been successfully subscribed!";
		Assert.assertEquals(repo.getSuccessful_Message(), Successfulmsg);
	}

}
