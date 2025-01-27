package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterAccountPage {
	
	//Declaration
		@FindBy(id="input-firstname")
		private WebElement firstNametextfield;
		
		@FindBy(id="input-lastname")
		private WebElement LastNametextfield;
		
		
		@FindBy(id="input-email")
		private WebElement Emailtextfield;
		
		
		@FindBy(id="input-telephone")
		private WebElement Telephonetextfield;
		
		
		@FindBy(id="input-password")
		private WebElement passwordtextfield;
		
		
		@FindBy(id="input-confirm")
		private WebElement Confirmpasswordtextfield;
		

		@FindBy(xpath="//label[text()='Yes']")
		private WebElement RadioButtonyes;
		
		
		@FindBy(xpath="//label[text()='No']")
		private WebElement RadioButtonno;
		
		
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement TermConditioncheckbox;
		
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement ContinueButton;


		
		
		
		
		
		
		//Initialization webelement-using constructor
		public RegisterAccountPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}



		
		
		
		
		
		//Utilization
		public WebElement getFirstNametextfield() {
			return firstNametextfield;
		}


		public WebElement getLastNametextfield() {
			return LastNametextfield;
		}


		public WebElement getEmailtextfield() {
			return Emailtextfield;
		}


		public WebElement getTelephonetextfield() {
			return Telephonetextfield;
		}


		public WebElement getPasswordtextfield() {
			return passwordtextfield;
		}


		public WebElement getConfirmpasswordtextfield() {
			return Confirmpasswordtextfield;
		}


		public WebElement getRadioButtonyes() {
			return RadioButtonyes;
		}


		public WebElement getRadioButtonno() {
			return RadioButtonno;
		}


		public WebElement getTermConditioncheckbox() {
			return TermConditioncheckbox;
		}


		public WebElement getContinueButton() {
			return ContinueButton;
		}



		
		
		
		
		
	
}
