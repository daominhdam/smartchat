package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class PageFactory {
	
	/**
	 * Get login page
	 * @param driver
	 * @return Login page
	 */
	public static LoginPage getLoginPage(AndroidDriver<WebElement> driver)
	{
		return new LoginPage(driver);
	}	
	/**
	 * Get register page
	 * @param driver
	 * @return Register page
	 */
	public static RegisterPage getRegisterPage(AndroidDriver<WebElement> driver)
	{
		return new RegisterPage(driver);
	}
	/**
	 * Get home page
	 * @param driver
	 * @return Home page
	 */
	public static HomePage getHomePage(AndroidDriver<WebElement> driver)
	{
		return new HomePage(driver);
	}
	/**
	 * Get chat page
	 * @param driver
	 * @return Chat page
	 */
	public static ChatPage getChatPage(AndroidDriver<WebElement> driver)
	{
		return new ChatPage(driver);
	}
}
