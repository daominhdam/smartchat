package common;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationControl {

	/**
	 * make out By for find element control
	 * @param controlname: name of control 
	 */
	public WebElement findElement(AndroidDriver<WebElement> driver,String controlName) {
		WebElement element = null;
		element = driver.findElement(By.xpath(controlName));
		return element;
	}

	public WebElement findElement(AndroidDriver<WebElement> driver, String specialControl,String value) {
		WebElement element = null;
		String control = String.format(specialControl, value);
		element = driver.findElement(By.xpath(control));
		return element;
	}
	
	/**
	 * get by for element
	 * @param driver
	 * @param controlName
	 */
	public By getBy(AndroidDriver<WebElement> driver,String controlName) {
		By by = null;
		by = By.xpath(controlName);
		return by;
	}
	
	public By getBy(AndroidDriver<WebElement> driver, String specialControl,String value) {
		By by = null;
		String control = String.format(specialControl, value);
		by = By.xpath(control);
		return by;
	}
	
	public List<WebElement> findElements(AndroidDriver<WebElement> driver,String controlName) {
		List<WebElement> lstElement = null;
		lstElement = driver.findElements(By.xpath(controlName));
		return lstElement;
	}
	
	public List<WebElement> findElements(AndroidDriver<WebElement> driver,String controlName,String value) {
		List<WebElement> lstElement = null;
		String control = String.format(controlValue, value);
		lstElement = driver.findElements(By.xpath(control));
		return lstElement;
	}
	
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	private String page;
	private String controlValue;
	protected final Log log = LogFactory.getLog(AutomationControl.class);
}
