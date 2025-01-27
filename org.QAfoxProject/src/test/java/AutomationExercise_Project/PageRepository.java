package AutomationExercise_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageRepository extends BaseConfiguration
{
		@FindBy(xpath="//a[text()='Cart']") 
		private WebElement Cart;
		
		@FindBy(xpath="//h2[text()='Subscription']") 
		private WebElement Footer;


		@FindBy(xpath="//input[@id='susbscribe_email']")
		private WebElement Email;
		
		@FindBy(xpath="//button[@id='subscribe']")
		private WebElement Email_Submitbutton;
		
		@FindBy(xpath="//div[.=\"You have been successfully subscribed!\"]")
		private WebElement Successful_Message;
		
		
		
		/**
		 * @return the successful_Message
		 */
		public WebElement getSuccessful_Message() {
			return Successful_Message;
		}



		public PageRepository(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		/**
		 * @return the cart
		 */
		public WebElement getCart() {
			return Cart;
		}
		

		/**
		 * @return the footer
		 */
		public WebElement getFooter() {
			return Footer;
		}
		
		
		/**
		 * @return the email
		 */
		public WebElement getEmail() {
			return Email;
		}
		
		
		/**
		 * @return the email_Submitbutton
		 */
		public WebElement getEmail_Submitbutton() {
			return Email_Submitbutton;
		}





		
		
		
}
