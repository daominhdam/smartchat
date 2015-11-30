package page;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

import smartchat.Interfaces;

public class ChatPage extends AbstractPage{

	public ChatPage(AndroidDriver<WebElement> driver) {
		control.setPage(this.getClass().getSimpleName());
		this.driver = driver;
	}
	/**
	 * Input chat message
	 * @param message
	 */
	public void inputChatMessage(String message)
	{
		waitForControl(driver, Interfaces.ChatPage.CHAT_MESSAGE_TEXTBOX, timeWait);
		type(driver, Interfaces.ChatPage.CHAT_MESSAGE_TEXTBOX, message);
	}
	/**
	 * Click on Send message button
	 */
	public void clickSendMessageButton()
	{
		waitForControl(driver, Interfaces.ChatPage.CHAT_SEND_BUTTON, timeWait);
		click(driver, Interfaces.ChatPage.CHAT_SEND_BUTTON);
	}
	/**
	 * Return existing of chat message
	 * @param message
	 * @return
	 */
	public boolean doesChatMessageDisplay(String message)
	{
		waitForControl(driver, Interfaces.ChatPage.DYNAMIC_CHAT_MESSAGE_LABEL, message,timeWait);
		return isControlDisplayed(driver, Interfaces.ChatPage.DYNAMIC_CHAT_MESSAGE_LABEL, message);
	}
	private AndroidDriver<WebElement> driver;
}
