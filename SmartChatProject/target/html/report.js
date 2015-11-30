$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chatFunction.feature");
formatter.feature({
  "id": "chat-function",
  "description": "\r\nIn order to use SmartChat application\r\nAs a user\r\nI want to be able to send messages from an account to another",
  "name": "Chat function",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "chat-function;send-messages-from-an-account-to-another",
  "description": "",
  "name": "Send messages from an account to another",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Login\" page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I fill in username textbox on \"Login\" page with \"testing01\"",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "I fill in password textbox on \"Login\" page with \"123456\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I click on Login button on Login page",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I select an user \"testing02\" from the chat list",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I fill in message textbox with \"random message\"",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I click on Send button on Chat page",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "The chat message should be displayed with \"random string\"",
  "keyword": "Then ",
  "line": 15
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
formatter.result({
  "duration": 11920708039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "testing01",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInUsernameTextbox(String,String)"
});
formatter.result({
  "duration": 15068718752,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "123456",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInPasswordTextbox(String,String)"
});
formatter.result({
  "duration": 11056803760,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.IClickOnLoginButtonOnLoginPage()"
});
formatter.result({
  "duration": 2763062457,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing02",
      "offset": 18
    }
  ],
  "location": "StepDefinations.ISelectAnUserFormChatList(String)"
});
formatter.result({
  "duration": 3098773288,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random message",
      "offset": 32
    }
  ],
  "location": "StepDefinations.IFillInMessageTextbox(String)"
});
formatter.result({
  "duration": 11339314187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.IClickOnSendButtonOnChatPage()"
});
formatter.result({
  "duration": 1468912184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random string",
      "offset": 43
    }
  ],
  "location": "StepDefinations.TheChatMessageShouldDisplay(String)"
});
formatter.result({
  "duration": 1102610340,
  "status": "passed"
});
formatter.after({
  "duration": 761680013,
  "status": "passed"
});
formatter.uri("loginApplication.feature");
formatter.feature({
  "id": "log-in-application",
  "description": "\r\nIn order to use SmartChat application\r\nAs a user\r\nI want to be able to login to application",
  "name": "Log in application",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "log-in-application;login-by-leaving-all-fields-empty",
  "description": "",
  "name": "Login by leaving all fields empty",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Login\" page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I leave all fields empty on \"Login\" page",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "I click on Login button on Login page",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "The error \"Please fill all the fields\" should be displayed on \"Login\" page",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
formatter.result({
  "duration": 6391112804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 29
    }
  ],
  "location": "StepDefinations.ILeaveAllFieldsEmpty(String)"
});
formatter.result({
  "duration": 7698401426,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.IClickOnLoginButtonOnLoginPage()"
});
formatter.result({
  "duration": 2680897838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please fill all the fields",
      "offset": 11
    },
    {
      "val": "Login",
      "offset": 63
    }
  ],
  "location": "StepDefinations.TheMessageShouldDispalyWithMessage(String,String)"
});
formatter.result({
  "duration": 3681024161,
  "status": "passed"
});
formatter.after({
  "duration": 785202876,
  "status": "passed"
});
formatter.scenario({
  "id": "log-in-application;login-by-entering-incorrect-login-information",
  "description": "",
  "name": "Login by entering incorrect login information",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Login\" page",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "I fill in username textbox on \"Login\" page with \"invalid\"",
  "keyword": "When ",
  "line": 15
});
formatter.step({
  "name": "I fill in password textbox on \"Login\" page with \"invalid\"",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "I click on Login button on Login page",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "The error \"invalid login parameters\" should be displayed on \"Login\" page",
  "keyword": "Then ",
  "line": 18
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
formatter.result({
  "duration": 6398006470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "invalid",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInUsernameTextbox(String,String)"
});
formatter.result({
  "duration": 18839906127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "invalid",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInPasswordTextbox(String,String)"
});
formatter.result({
  "duration": 10475794402,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.IClickOnLoginButtonOnLoginPage()"
});
formatter.result({
  "duration": 2666807332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid login parameters",
      "offset": 11
    },
    {
      "val": "Login",
      "offset": 61
    }
  ],
  "location": "StepDefinations.TheMessageShouldDispalyWithMessage(String,String)"
});
formatter.result({
  "duration": 3987993818,
  "status": "passed"
});
formatter.after({
  "duration": 852747618,
  "status": "passed"
});
formatter.scenario({
  "id": "log-in-application;login-by-entering-correct-login-information",
  "description": "",
  "name": "Login by entering correct login information",
  "keyword": "Scenario",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Login\" page",
  "keyword": "Given ",
  "line": 21
});
formatter.step({
  "name": "I fill in username textbox on \"Login\" page with \"testing01\"",
  "keyword": "When ",
  "line": 22
});
formatter.step({
  "name": "I fill in password textbox on \"Login\" page with \"123456\"",
  "keyword": "And ",
  "line": 23
});
formatter.step({
  "name": "I click on Login button on Login page",
  "keyword": "And ",
  "line": 24
});
formatter.step({
  "name": "The Home page should be displayed",
  "keyword": "Then ",
  "line": 25
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
formatter.result({
  "duration": 7746141928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "testing01",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInUsernameTextbox(String,String)"
});
formatter.result({
  "duration": 25732827516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    },
    {
      "val": "123456",
      "offset": 49
    }
  ],
  "location": "StepDefinations.IFillInPasswordTextbox(String,String)"
});
formatter.result({
  "duration": 38307096769,
  "status": "failed",
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.45.0\u0027, revision: \u002732a636c\u0027, time: \u00272015-03-05 22:01:35\u0027\nSystem info: host: \u0027TanLe\u0027, ip: \u0027192.168.37.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.7.0_60\u0027\nDriver info: driver.version: AndroidDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:593)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:27)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:99)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:37)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat common.AutomationControl.findElement(AutomationControl.java:20)\r\n\tat page.AbstractPage.type(AbstractPage.java:150)\r\n\tat page.LoginPage.inputPassword(LoginPage.java:50)\r\n\tat stepDefinations.StepDefinations.IFillInPasswordTextbox(StepDefinations.java:104)\r\n\tat ✽.And I fill in password textbox on \"Login\" page with \"123456\"(loginApplication.feature:23)\r\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:4723 [/127.0.0.1] failed: Connection refused: connect\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:151)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:126)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:72)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:133)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:572)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:27)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:99)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:37)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat common.AutomationControl.findElement(AutomationControl.java:20)\r\n\tat page.AbstractPage.type(AbstractPage.java:150)\r\n\tat page.LoginPage.inputPassword(LoginPage.java:50)\r\n\tat stepDefinations.StepDefinations.IFillInPasswordTextbox(StepDefinations.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.PlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.SocksSocketImpl.connect(Unknown Source)\r\n\tat java.net.Socket.connect(Unknown Source)\r\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:134)\r\n\t... 68 more\r\n"
});
formatter.match({
  "location": "StepDefinations.IClickOnLoginButtonOnLoginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.TheHomePageShouldBeDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1014037609,
  "status": "passed"
});
formatter.uri("registerAccount.feature");
formatter.feature({
  "id": "register-account",
  "description": "\r\nIn order to use SmartChat application\r\nAs a user\r\nI want to be able to register new account",
  "name": "Register account",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "register-account;register-by-leaving-all-fields-empty",
  "description": "",
  "name": "Register by leaving all fields empty",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Login\" page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I should able to see Register button",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I click on Register button on \"Login\" page",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "The Register page should be displayed",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "I leave all fields empty on \"Register\" page",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "I click on Register button on \"Register\" page",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "The error \"Please fill all the fields\" should be displayed on \"Register\" page",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
formatter.result({
  "duration": 1023409962,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat common.AbstractTest.openApplication(AbstractTest.java:29)\r\n\tat stepDefinations.StepDefinations.IAmOn(StepDefinations.java:25)\r\n\tat ✽.Given I am on the \"Login\" page(registerAccount.feature:8)\r\n"
});
formatter.match({
  "location": "StepDefinations.IShouldAbleToSeeRegister()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 31
    }
  ],
  "location": "StepDefinations.IClickOnRegisterButtonOnPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.TheRegisterPageShoudBeDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 29
    }
  ],
  "location": "StepDefinations.ILeaveAllFieldsEmpty(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 31
    }
  ],
  "location": "StepDefinations.IClickOnRegisterButtonOnPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Please fill all the fields",
      "offset": 11
    },
    {
      "val": "Register",
      "offset": 63
    }
  ],
  "location": "StepDefinations.TheMessageShouldDispalyWithMessage(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 233697,
  "status": "passed"
});
formatter.scenario({
  "id": "register-account;register-by-entering-invalid-email-address",
  "description": "",
  "name": "Register by entering invalid email address",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the \"Register\" page",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "I fill in email textbox with \"invalid.com\"",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "I fill in username textbox on \"Register\" page with \"testuser\"",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "I fill in password textbox on \"Register\" page with \"testpassword\"",
  "keyword": "And ",
  "line": 20
});
formatter.step({
  "name": "I click on Register button on \"Register\" page",
  "keyword": "And ",
  "line": 21
});
formatter.step({
  "name": "The error \"invalid email address\" should be displayed on \"Register\" page",
  "keyword": "Then ",
  "line": 22
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 13
    }
  ],
  "location": "StepDefinations.IAmOn(String)"
});
