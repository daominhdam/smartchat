package common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

import common.AutomationControl;
import common.Device;

import java.util.Random;
import java.util.UUID;

public abstract class AbstractTest {
	

	/**
	 * Initial Android Driver
	 * @return
	 * @throws MalformedURLException 
	 */
	protected AndroidDriver<WebElement> openApplication(){
		Device device = new Device();
		 
		AndroidDriver<WebElement> driver =  device.launch();
		driver.manage().timeouts();
	    return driver;
	}

	/**
	 * Close Driver
	 * @param driver
	 */
	protected void closeDriver(AppiumDriver<WebElement> driver) {
		try {
			driver.quit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * Return a random unique string
	 * 
	 * @return unique string
	 */
	protected String getUniqueName() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	/**
	 * get a random character
	 * 
	 * @return unique string
	 */
	protected char getRandomCharacter() {
		Random r = new Random();
		char random_3_Char = (char) (48 + r.nextInt(47));
		return random_3_Char;
	}
	
	/**
	 * get Random String With Length
	 */
	protected String getRandomStringWithLength(int length) {
		String returnString = "";
		char aChar;
		for(int i = 0; i<length; i++){
			aChar = getRandomCharacter();
			returnString = returnString + aChar;
		}
		return returnString;		
	}

	/**
	 * Return a random unique number
	 * 
	 * @return unique number
	 */
	protected String getUniqueNumber() {
		Random rand = new Random();

		int number = rand.nextInt(9000000) + 1;
		String numberString = Integer.toString(number);
		return numberString;
	}
	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}	
	
	protected final Log log;
	protected AndroidDriver<WebElement> driver;
	protected String ipClient;
	protected AutomationControl control = new AutomationControl();
}
