package smartchat;

public class Interfaces {

	public class AbstractPage{
		
	}
	public class LoginPage {
		public static final String LOGIN_LOGO_IMAGE = "//android.widget.ImageView[@resource-id='com.smartlink.smartchat:id/imageView1']";
		public static final String LOGIN_USERNAME_TEXTBOX = "//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/user']";
		public static final String LOGIN_PASSWORD_TEXTBOX = "//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/pwd']";
		public static final String LOGIN_LOGIN_BUTTON="//android.widget.Button[@resource-id='com.smartlink.smartchat:id/btnLogin']";
		public static final String LOGIN_REGISTER_BUTTON="//android.widget.Button[@resource-id='com.smartlink.smartchat:id/btnReg']";
		public static final String DYNAMIC_LOGIN_ERROR="//android.widget.TextView[@resource-id='android:id/message' and contains(@text,'%s')]";
		public static final String LOGIN_MESSAGE_OK_BUTTON="//android.widget.Button[@resource-id='android:id/button1']";

	}
	public class RegisterPage{
		public static final String REGISTER_EMAIL_TEXTBOX="//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/email']";
		public static final String REGISTER_USERNAME_TEXTBOX="//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/user']";
		public static final String REGISTER_PASSWORD_TEXTBOX="//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/pwd']";
		public static final String REGISTER_REGISTER_BUTTON="//android.widget.Button[@resource-id='com.smartlink.smartchat:id/btnReg']";
		public static final String DYNAMIC_REGISTER_ERROR="//android.widget.TextView[@resource-id='android:id/message' and contains(@text,'%s')]";
		public static final String REGISTER_MESSAGE_OK_BUTTON="//android.widget.Button[@resource-id='android:id/button1']";
	}
	public class HomePage
	{
		public static final String HOME_ACTION_BAR_VIEW="//android.view.View[@resource-id='android:id/action_bar']";
		public static final String DYNAMIC_HOME_CHAT_USER="//android.widget.TextView[@text='%s']";
	}
	public class ChatPage
	{
		public static final String CHAT_MESSAGE_TEXTBOX="//android.widget.EditText[@resource-id='com.smartlink.smartchat:id/txt']";
		public static final String CHAT_SEND_BUTTON="//android.widget.Button[@resource-id='com.smartlink.smartchat:id/btnSend']";
		public static final String DYNAMIC_CHAT_MESSAGE_LABEL="//android.widget.LinearLayout/android.widget.TextView[@resource-id='com.smartlink.smartchat:id/lbl2' and contains(@text,'%s')]";
	}
}