package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components_MiceandTrackballsPage 
{
	
	@FindBy(xpath="//a[text()='Mice and Trackballs']")
	private WebElement MiceandTrackballs_PageText;
	
	@FindBy(xpath="//p[text()='There are no products to list in this category.']")
	private WebElement MiceandTrackballs_ProductsText;

	@FindBy(xpath="//a[text()='Continue']")
	private WebElement MiceandTrackballs_Continuebutton;

	
	
	public Components_MiceandTrackballsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		
	/**
	 * @return the miceandTrackballs_PageText
	 */
	public WebElement getMiceandTrackballs_PageText() {
		return MiceandTrackballs_PageText;
	}

	/**
	 * @return the miceandTrackballs_ProductsText
	 */
	public WebElement getMiceandTrackballs_ProductsText() {
		return MiceandTrackballs_ProductsText;
	}

	/**
	 * @return the miceandTrackballs_Continuebutton
	 */
	public WebElement getMiceandTrackballs_Continuebutton() {
		return MiceandTrackballs_Continuebutton;
	}
	
	
	
	
}
