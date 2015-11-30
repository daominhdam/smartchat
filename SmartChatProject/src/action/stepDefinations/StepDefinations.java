package stepDefinations;

import org.junit.Assert;
import common.AbstractTest;
import common.Constant;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.LoginPage;
import page.PageFactory;
import page.RegisterPage;
import page.ChatPage;

public class StepDefinations extends AbstractTest{
	
	String randomMessage = getRandomStringWithLength(10);
	@Given("^I am on the \"(.*?)\" page$")
	public void IAmOn(String page)
	{
		switch(page.toLowerCase())
		{
			case "login":
				driver = openApplication();	
				loginPage = pageFactory.getLoginPage(driver);
				break;
			case "register":
				IAmOn("login");
				loginPage.clickRegisterButton();
				registerPage = pageFactory.getRegisterPage(driver);
				break;
			case "home":
				IAmOn("login");
				loginPage.inputUserName(Constant.USERNAME);
				loginPage.inputPassword(Constant.PASSWORD);
				loginPage.clickLoginButton();
				break;
		}
			
	}
	@When("^I click on Register button on \"(.*?)\" page$")
	public void IClickOnRegisterButtonOnPage(String page)
	{
		switch(page.toLowerCase())
		{
			case "login":
			loginPage.clickRegisterButton();
			break;
			case "register":
	        registerPage.clickRegisterButton();
	        break;
		}
	}
	@When("^I leave all fields empty on \"(.*?)\" page$")
	public void ILeaveAllFieldsEmpty(String page)
	{
		switch (page.toLowerCase())
		{
			case "register":
				registerPage = pageFactory.getRegisterPage(driver);
				registerPage.leaveAllFieldsBlank();
				break;
			case "login":
				loginPage = pageFactory.getLoginPage(driver);
				loginPage.leaveAllFieldsEmpty();
				break;
		}

		
	}
	
	@When("^I fill in email textbox with \"(.*?)\"$")
	public void IFillInEmailTextbox(String email)
	{
		if(email.toLowerCase().equals("random email"))
		{
			email="testEmail"+getUniqueNumber()+"@yopmail.com";
		}
		registerPage.fillInEmailTextbox(email);
	}
	@When("^I fill in username textbox on \"(.*?)\" page with \"(.*?)\"$")
	public void IFillInUsernameTextbox(String page, String username)
	{
		if(page.toLowerCase().equals("login"))
		{
			loginPage.inputUserName(username);
		}
		if(page.toLowerCase().equals("register"))
		{
			if(username.toLowerCase().equals("random user"))
			{
				username="testUser"+getUniqueNumber();
			}
		
			registerPage.fillInUserNameTextbox(username);
		}
	}
	@When("^I fill in password textbox on \"(.*?)\" page with \"(.*?)\"$")
	public void IFillInPasswordTextbox(String page, String password)
	{
		if(page.toLowerCase().equals("login"))
		{
			loginPage.inputPassword(password);
		}
		if(page.toLowerCase().equals("register"))
		{
			registerPage.fillInPasswordTextbox(password);
		}
	}
	@When("^I click on Login button on Login page$")
	public void IClickOnLoginButtonOnLoginPage()
	{
		loginPage.clickLoginButton();
	}
	@When("^I select an user \"(.*?)\" from the chat list$")
	public void ISelectAnUserFormChatList(String userName)
	{
		homePage = pageFactory.getHomePage(driver);
		homePage.selectChatUser(userName);
		chatPage = pageFactory.getChatPage(driver);
	}
	@When("^I click on Send button on Chat page$")
	public void IClickOnSendButtonOnChatPage()
	{
		chatPage.clickSendMessageButton();
	}
	@When("^I fill in message textbox with \"(.*?)\"$")
	public void IFillInMessageTextbox(String message)
	{
		if(message.equals("random message"))
			message=randomMessage;
		chatPage.inputChatMessage(message);
	}
	@Then("^I should able to see Register button$")
	public void IShouldAbleToSeeRegister()
	{
		Assert.assertTrue(loginPage.doesRegisterButtonExist());
	}
	@Then("^The error \"(.*?)\" should be displayed on \"(.*?)\" page$")
	public void TheMessageShouldDispalyWithMessage(String message,String page)
	{
		switch(page.toLowerCase())
		{
			case "login":
				Assert.assertTrue(loginPage.doesMessageDisplayWithContent(message));
			break;
			case "register":
				Assert.assertTrue(registerPage.doesMessageDisplayWithContent(message));
			break;
		}
	}
	@Then("^The Home page should be displayed$")
	public void TheHomePageShouldBeDisplayed()
	{
		homePage = pageFactory.getHomePage(driver);
		Assert.assertTrue(homePage.doesHomePageDisplay());
	}
	@Then("^The Register page should be displayed$")
	public void TheRegisterPageShoudBeDisplayed()
	{
		registerPage = pageFactory.getRegisterPage(driver);
	}
	@Then("^The chat message should be displayed with \"(.*?)\"$")
	public void TheChatMessageShouldDisplay(String message)
	{
		if(message.equals("random message"))
			message= randomMessage;
		Assert.assertTrue(chatPage.doesChatMessageDisplay(message));
	}
	
	@After
	public void CloseDriver()
	{
		closeDriver(driver);
	}
	private RegisterPage registerPage;
	private PageFactory pageFactory;
	private LoginPage loginPage;
	private HomePage homePage;
	private ChatPage chatPage;
}
