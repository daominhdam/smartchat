package page;

import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.AutomationControl;

public class AbstractPage {
	/**
	 * sleep
	 */
	public void sleep() {
		sleep(timeSleep);
	}
	public void back(AndroidDriver<WebElement> driver) {
		driver.navigate().back();
	}
	/**
	 * sleep
	 * 
	 * @param timeout
	 */
	public void sleep(long timeout) {
		try {
			Thread.sleep(timeout * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Check control displayed
	 * 
	 * @param by
	 *            : By: id, name...
	 * @return
	 */
	public boolean isControlDisplayed(AndroidDriver<WebElement> driver, String controlName) {
		try {
			element = control.findElement(driver, controlName);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * check control is displayed
	 * 
	 * @param driver
	 * @param controlName
	 * @param value
	 * @return
	 */
	public boolean isControlDisplayed(AndroidDriver<WebElement> driver, String controlName,
			String value) {
		try {
			element = control.findElement(driver, controlName, value);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Wait for control is displayed
	 * 
	 * @param by
	 *            : By:id,name,xpath...
	 * @param timeout
	 */
	public void waitForControl(AndroidDriver<WebElement> driver, final String controlName,
			long timeout) {
		try {
			By by = control.getBy(driver, controlName);
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			log.debug("Element doesn't exist");
		}
	}

	/**
	 * Wait for control is displayed
	 * 
	 * @param driver
	 * @param controlName
	 * @param value
	 * @param timeout
	 */
	public void waitForControl(AndroidDriver<WebElement> driver, final String controlName,
			final String value, long timeout) {
		try {
			By by = control.getBy(driver, controlName, value);
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			log.debug("Element doesn't exist");
		}
	}

	/**
	 * Wait for control is closed
	 * 
	 * @param by
	 * @param timeout
	 */
	public void waitForControlNotDisplayed(AndroidDriver<WebElement> driver,
			final String controlName, long timeout) {
		try {
			By by = control.getBy(driver, controlName);
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		} catch (Exception e) {
			log.debug("Control does not close");
		}
	}

	/**
	 * Wait for control is closed
	 * 
	 * @param by
	 * @param timeout
	 */
	public void waitForControlNotDisplayed(AndroidDriver<WebElement> driver,
			final String controlName, final String value, long timeout) {
		try {
			By by = control.getBy(driver, controlName, value);
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		} catch (Exception e) {
			log.debug("Control does not close");
		}
	}
	/**
	 * enter value for element
	 * 
	 * @param driver
	 * @param controlName
	 * @param value
	 */
	public void type(AndroidDriver<WebElement> driver, String controlName, String value) {
		waitForControl(driver, controlName, timeWait);
		element = control.findElement(driver, controlName);
		element.clear();
		element.sendKeys(value);
	}
	/**
	 * clear text of control
	 * 
	 * @param driver
	 * @param controlName
	 */
	public void clear(AndroidDriver<WebElement> driver, String controlName) {
		waitForControl(driver, controlName, timeWait);
		element = control.findElement(driver, controlName);
		element.clear();
	}
	
	/**
	 * click on element
	 * 
	 * @param driver
	 * @param controlName
	 */
	public void click(AndroidDriver<WebElement> driver, String controlName) {
		waitForControl(driver, controlName, timeWait);
		element = control.findElement(driver, controlName);
		element.click();
	}
	/**
	 * click on element
	 * 
	 * @param driver
	 * @param controlName
	 */
	public void click(AndroidDriver<WebElement> driver, String controlName, String value) {
		waitForControl(driver, controlName, value, timeWait);
		element = control.findElement(driver, controlName, value);
		element.click();
	}
	
	protected AbstractPage() {
		log = LogFactory.getLog(getClass());
		log.debug("Created page abstraction for " + getClass().getName());
	}
	
	protected int timeWait = 20;
	protected int timeSleep = 2;
	protected WebElement element;
	protected AutomationControl control = new AutomationControl();
	protected final Log log;
	
}
