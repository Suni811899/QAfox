package org.QAfoxProjectGenericUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 	This class contains reusable methods to perfome driver related operations
 * @author Suneetha
 */
public class WebDriverLibrary {
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions actions;
	public Select select;
	
	
	/**
	 * 	This class contains reusable methods to perfome driver related operations
	 */
	public WebDriver launchBrowser(String browser)
	{
	
		switch(browser) 
		{
		case "chrome":WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser Info");
			break;
		}
		
		static_driver=driver;
		return driver;
		
	}
	
	
	
	
	/**
	 * 	This class contains reusable methods to perfome driver related operations
	 */
	//Maximize the browser
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	
	
	
	/**
	 * 	This class contains reusable methods to perfome driver related operations
	 */
	//navigate to the app
	public void NavigateToApp(String url)
	{
		driver.get(url);
	}
	
	
	
	
	/**
	 * 	This method is used to close the browser
	 */
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	/**
	 * 	This method is used to close the all windows of the browser
	 */
	public void quiteBrowser()
	{
		driver.quit();
	}
	
	
	
	
	

	/**
	 * This Method is used to wait until element or element is found
	 * 
	 * @param time
	 * 
	 */
	public String getcurrenturl() {
		return driver.getCurrentUrl();
		
	}
	

	/**
	 * This Method is used to wait until element or element is found
	 * 
	 * @param time
	 * 
	 */
	public String getpagetitle() {
		return driver.getTitle();
		
	}
	
	/**
	 * This Method is used to wait until element or element is found
	 * 
	 * @param time
	 * 
	 */
	public int[] getsize(WebElement element) {
		
		Dimension dimention=element.getSize();
		int elementHeight = dimention.getHeight();
		int elementWidth = dimention.getWidth();
		int[]size= {elementHeight,elementWidth};
		return size;
		
	}
	
	
	
	
	
	
	
	/**
	 * This Method is used to wait until element or element is found
	 * 
	 * @param time
	 * 
	 */
	public void waitUntilElementFound() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.Duration));
	
	
	/**
	 * This Method is used to wait until element is visible on the web page
	 * 
	 * @param element
	 * 
	 */
	public void waitUntilElementFound(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	
	
	
	
	/**
	 * This Method is used to mouse hover on an element
	 * 
	 * @param element
	 * 
	 */
	public void mouseHouseToElement(WebElement element) 
	{
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	
	
	
	
	
	/**
	 * This Method is used to double click on an element
	 * 
	 * @param element
	 * 
	 */
	public void doubleClickOnElement(WebElement element) 
	{
		actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	
	
	
	
	
	
	/**
	 * This Method is used to right click on an element
	 * 
	 * @param element
	 * 
	 */
	public void rightClickOnElement(WebElement element) 
	{
		actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	
	
	
	
	
	
	/**
	 * This Method is used to drag and drop an element to target location
	 * 
	 * @param element
	 * @param target
	 * 
	 */
	public void dragAndDropElement(WebElement source, WebElement target) 
	{
		actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	
	
	
	
	
	

	/**
	 * This Method is used to select an element from drop down based on index
	 * 
	 * @param element
	 * @param index
	 * 
	 */
	public void selectFromDropDown(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}

	
	
	
	
	/**
	 * This Method is used to select an element from drop down based on value
	 * 
	 * @param element
	 * @param value
	 * 
	 */
	public void selectFromDropDown(WebElement element, String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	
	
	
	

	/**
	 * This Method is used to select an element from drop down based on visible text
	 * 
	 * @param element
	 * @param text
	 * 
	 */
	public void selectFromDropDown(String visibleText, WebElement element) 
	{
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	
	
	
	/**
	 * This Method is used to switch to frame based on index
	 * 
	 * @param element
	 * 
	 * 
	 */
	public void switchToFrame(int index) 
	{
		driver.switchTo().frame(index);
	}
	
	
	
	

	/**
	 * This Method is used to switch to frame based on id or name attribute value
	 * 
	 * @param idOrName
	 * 
	 * 
	 */
	public void switchToFrame(String idOrName) 
	{
		driver.switchTo().frame(idOrName);
	}

	
	
	/**
	 * This Method is used to switch to frame based on frame element
	 * 
	 * @param element
	 * 
	 * 
	 */
	public void switchToFrame(WebElement element) 
	{
		driver.switchTo().frame(element);
	}
	
	
	
	

	/**
	 * This Method is used to switch back to default window
	 * 
	 * 
	 */
	public void switchToDefaultWindow() 
	{
		driver.switchTo().defaultContent();
	}
	
	
	
	
	/**
	 * This Method is used to switch back to parent window
	 * 
	 * 
	 */
	public void switchToParentWindow() 
	{
		driver.switchTo().parentFrame();
	}

	
	
	
	
	
	/**
	 * This Method is used to handle alert pop up
	 * 
	 * @param status
	 * 
	 */
	public void handleAlert(String status)
	{
		Alert al = driver.switchTo().alert();
		if (status.equalsIgnoreCase("ok"))
		{
			al.accept();
		} else 
		{
			al.dismiss();
		}
	}
	
	
	
	
	
	
	

	/**
	 * This Method convert dynamic xpath to web element
	 * 
	 * @param commonpath
	 * @param replaceData
	 * @return
	 * 
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData) 
	{
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}




	public void mouseHouseToElement(Object click) {
		// TODO Auto-generated method stub
		
	}


}
