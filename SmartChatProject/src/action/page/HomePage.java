package page;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

import smartchat.Interfaces;

public class HomePage extends AbstractPage{

	public HomePage(AndroidDriver<WebElement> driver) {
		control.setPage(this.getClass().getSimpleName());
		this.driver = driver;
	}
	/**
	 * Check existing of Home page
	 * @return
	 */
	public boolean doesHomePageDisplay()
	{
		waitForControl(driver, Interfaces.HomePage.HOME_ACTION_BAR_VIEW, timeWait);
		return isControlDisplayed(driver, Interfaces.HomePage.HOME_ACTION_BAR_VIEW);
	}
	/**
	 * Select a chat user
	 * @param userName
	 */
	public void selectChatUser(String userName)
	{
		waitForControl(driver, Interfaces.HomePage.DYNAMIC_HOME_CHAT_USER, userName,timeWait);
		click(driver, Interfaces.HomePage.DYNAMIC_HOME_CHAT_USER,userName);
	}
	
	private AndroidDriver<WebElement> driver;
	
}