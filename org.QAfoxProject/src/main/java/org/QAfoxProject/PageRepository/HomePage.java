package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myaccountlink;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/li/a[text()='Login']")
	private WebElement Login_Hearderlink;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/li/a[text()='Register']")
	private WebElement Register_Hearderlink;
	
	@FindBy(xpath="//li/a[contains(text(),'Desktops')]")
	private WebElement Desktop_Headertext;
	
	@FindBy(xpath="//li/a[contains(text(),'Mac ')]")
	private WebElement Desktop_Mac_Headertext;
	
	@FindBy(xpath="//li/a[contains(text(),'PC')]")
	private WebElement Desktop_PC_Headertext;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/li/a[text()='Logout']")
	private WebElement Logout_headerlink;
	
	

	
	
	/**
	 * @return the logout_headerlink
	 */
	public WebElement getLogout_headerlink() {
		return Logout_headerlink;
	}

	/**
	 * @return the desktop_Mac_Headertext
	 */
	public WebElement getDesktop_Mac_Headertext() {
		return Desktop_Mac_Headertext;
	}

	/**
	 * @return the desktop_PC_Headertext
	 */
	public WebElement getDesktop_PC_Headertext() {
		return Desktop_PC_Headertext;
	}



	@FindBy(xpath="//li/a[contains(text(),'Components')]")
	private WebElement Components_Monitors_Headertext;
	
	@FindBy(xpath="//li/a[contains(text(),'Monitors (2)')]")
	private WebElement Components_Monitors;
	
	
	
	/**
	 * @return the components_Monitors
	 */
	public WebElement getComponents_Monitors() {
		return Components_Monitors;
	}




	/**
	 * @return the desktop_Headertext
	 */
	public WebElement getDesktop_Headertext() {
		return Desktop_Headertext;
	}




	/**
	 * @return the components_Monitors_Headertext
	 */
	public WebElement getComponents_Monitors_Headertext() {
		return Components_Monitors_Headertext;
	}


	/**
	 * @return the myaccountlink
	 */
	public WebElement getMyaccountlink() {
		return myaccountlink;
	}


	/**
	 * @return the login_Hearderlink
	 */
	public WebElement getLogin_Hearderlink() {
		return Login_Hearderlink;
	}


	/**
	 * @return the register_Hearderlink
	 */
	public WebElement getRegister_Hearderlink() {
		return Register_Hearderlink;
	}



	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button/span/i")
	private WebElement product_Cart;

	@FindBy(xpath = "//p/a/strong[text()='View Cart']")
	private WebElement view_Cart;

	public WebElement getProduct_Cart() {
		return product_Cart;
	}

	public WebElement getView_Cart() {
		return view_Cart;
	}

	
	
	
	
	
	
	
	
	




	@FindBy(xpath="//a[text()='Components']")
	private WebElement Componets_Hearderlink;
	
	@FindBy(xpath="//a[text()='Mice and Trackballs (0)']")
	private WebElement Componets_MiceandTrackballs;
	
	
	/**
	 * @return the componets_Hearderlink
	 */
	public WebElement getComponets_Hearderlink() {
		return Componets_Hearderlink;
	}

	/**
	 * @return the componets_MiceandTrackballs
	 */
	public WebElement getComponets_MiceandTrackballs() {
		return Componets_MiceandTrackballs;
		
		
	}
	
	
	

}
