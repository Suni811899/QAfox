package org.QAfoxProject.PageRepository;

import org.QAfoxProjectGenericUtility.WebDriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {

	
		// Decleration
		
		@FindBy(xpath = "//input[@name='email']")
		private WebElement Emailaddress;

		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement password;

		@FindBy(xpath = "//input[@value='Login']")
		private WebElement loginbutton;

		
		
		
		
		// Initilization
		public AccountLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		/**
		 * @return the emailaddress
		 */
		public WebElement getEmailaddress() {
			return Emailaddress;
		}

		/**
		 * @return the password
		 */
		public WebElement getPassword() {
			return password;
		}
		/**
		 * @return the loginbutton
		 */
		public WebElement getLoginbutton() {
			return loginbutton;
		}


	}
	

