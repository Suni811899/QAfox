package org.QAfoxProject.Components;

import org.QAfoxProject.PageRepository.HomePage;
import org.QAfoxProjectGenericUtility.BaseConfigaration;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_Monitors_Test extends BaseConfigaration
{
	@Test
	public void addProduct_Components_Monitors_Test()
	{
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		
		webdriverobj.mouseHouseToElement(homeobj.getComponents_Monitors());
		
		javautilityobj.pause(5000);
		
		Reporter.log("Components_Monitors_Test added",true);
	}

}
