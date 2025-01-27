package AutomationExercise_Project;

import org.QAfoxProjectGenericUtility.WebDriverLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfiguration {
	public WebDriverLibrary webdriverobj;
	public WebDriver driver;

	@BeforeClass
	public void browerSetup() {
		String Browser = "chrome";
		String URL = "https://www.automationexercise.com/";

		// PreCondition1:Launch the browser
		webdriverobj.launchBrowser(Browser);
		Reporter.log("Browser Launched Successfull",true);
		
		//PreCondition1: Navigate to the application
		webdriverobj.NavigateToApp(URL);
		Reporter.log("Navigated To Application Succesful",true);
		
		//Precondition3: Maximize the Browser
		webdriverobj.maximizeBrowser();
		Reporter.log("Browser Maximized Succesful",true);
	}
	
	
	
	
	@AfterClass
	public void browserTermination() 
	{
		//PostCondition:Close the browser
		webdriverobj.closeBrowser();
	}
	
	
	
	

}
