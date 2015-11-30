package page;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

import smartchat.Interfaces;

public class RegisterPage extends AbstractPage{
	public RegisterPage(AndroidDriver<WebElement> driver) {
		control.setPage(this.getClass().getSimpleName());
		this.driver = driver;
	}
	/**
	 * Leave all fields blank
	 */
	public void leaveAllFieldsBlank()
	{
		clear(driver, Interfaces.RegisterPage.REGISTER_EMAIL_TEXTBOX);
		clear(driver, Interfaces.RegisterPage.REGISTER_USERNAME_TEXTBOX);
		clear(driver, Interfaces.RegisterPage.REGISTER_PASSWORD_TEXTBOX);
	}
	/**
	 * Check if the message displays with content
	 * @param content
	 * @return
	 */
	public boolean doesMessageDisplayWithContent(String content)
	{
		waitForControl(driver, Interfaces.RegisterPage.DYNAMIC_REGISTER_ERROR, content,timeWait);
		if(isControlDisplayed(driver, Interfaces.RegisterPage.DYNAMIC_REGISTER_ERROR,content))
		{
			click(driver, Interfaces.RegisterPage.REGISTER_MESSAGE_OK_BUTTON);
			return true;
		}
		return false;
	}
	/**
	 * Click Register button
	 */
	public void clickRegisterButton()
	{
		waitForControl(driver, Interfaces.RegisterPage.REGISTER_REGISTER_BUTTON, timeWait);
		click(driver, Interfaces.RegisterPage.REGISTER_REGISTER_BUTTON);
		sleep();
	}
	/**
	 * Fill in email textbox
	 * @param email
	 */
	public void fillInEmailTextbox(String email)
	{
		waitForControl(driver, Interfaces.RegisterPage.REGISTER_EMAIL_TEXTBOX, timeWait);
		type(driver, Interfaces.RegisterPage.REGISTER_EMAIL_TEXTBOX, email);
	}
	/**
	 * Fill in username textbox
	 * @param username
	 */
	public void fillInUserNameTextbox(String username)
	{
		waitForControl(driver, Interfaces.RegisterPage.REGISTER_USERNAME_TEXTBOX, timeWait);
		type(driver, Interfaces.RegisterPage.REGISTER_USERNAME_TEXTBOX, username);
	}
	/**
	 * Fill in password textbox
	 * @param password
	 */
	public void fillInPasswordTextbox(String password)
	{
		waitForControl(driver, Interfaces.RegisterPage.REGISTER_PASSWORD_TEXTBOX, timeWait);
		type(driver, Interfaces.RegisterPage.REGISTER_PASSWORD_TEXTBOX, password);
	}
	/**
	 * Check that register page displays
	 * @return
	 */
	public boolean doesRegisterPageDisplay()
	{
		waitForControl(driver, Interfaces.RegisterPage.REGISTER_EMAIL_TEXTBOX, timeWait);
		return isControlDisplayed(driver, Interfaces.RegisterPage.REGISTER_EMAIL_TEXTBOX);
	}
	private AndroidDriver<WebElement> driver;
}
