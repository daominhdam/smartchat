package page;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

import smartchat.Interfaces;

public class LoginPage extends AbstractPage {

	public LoginPage(AndroidDriver<WebElement> driver) {
		control.setPage(this.getClass().getSimpleName());
		this.driver = driver;
	}
	/**
	 * Click Register button
	 */
	public void clickRegisterButton()
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_REGISTER_BUTTON, timeWait);
		click(driver, Interfaces.LoginPage.LOGIN_REGISTER_BUTTON);
		sleep();
	}
	/**
	 * Click Login button
	 */
	public void clickLoginButton()
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_LOGIN_BUTTON, timeWait);
		click(driver, Interfaces.LoginPage.LOGIN_LOGIN_BUTTON);
		sleep();
	}
	/**
	 * Input Username
	 * @param username
	 */
	public void inputUserName(String username)
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_USERNAME_TEXTBOX, timeWait);
		type(driver, Interfaces.LoginPage.LOGIN_USERNAME_TEXTBOX,username);
		sleep();
	}
	/**
	 * Input Password
	 * @param password
	 */
	public void inputPassword(String password)
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_PASSWORD_TEXTBOX, timeWait);
		type(driver, Interfaces.LoginPage.LOGIN_PASSWORD_TEXTBOX,password);
		sleep();
	}
	/**
	 * Check existing of Register button
	 * @return
	 */
	public boolean doesRegisterButtonExist()
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_REGISTER_BUTTON, timeWait);
		return isControlDisplayed(driver, Interfaces.LoginPage.LOGIN_REGISTER_BUTTON);
	}
	/**
	 * Leave all fields empty
	 */
	public void leaveAllFieldsEmpty()
	{
		waitForControl(driver, Interfaces.LoginPage.LOGIN_USERNAME_TEXTBOX, timeWait);
		clear(driver, Interfaces.LoginPage.LOGIN_USERNAME_TEXTBOX);
		clear(driver, Interfaces.LoginPage.LOGIN_PASSWORD_TEXTBOX);
	}
	/**
	 * Check if the message displays with content
	 * @param content
	 * @return
	 */
	public boolean doesMessageDisplayWithContent(String content)
	{
		waitForControl(driver, Interfaces.LoginPage.DYNAMIC_LOGIN_ERROR, content,timeWait);
		if(isControlDisplayed(driver, Interfaces.LoginPage.DYNAMIC_LOGIN_ERROR,content))
		{
			click(driver, Interfaces.LoginPage.LOGIN_MESSAGE_OK_BUTTON);
			return true;
		}
		return false;
	}
	private AndroidDriver<WebElement> driver;
}
