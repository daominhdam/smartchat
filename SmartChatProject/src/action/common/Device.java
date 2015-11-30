package common;

import java.io.File;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import config.ProviderConfiguration;

public class Device {

	public AndroidDriver<WebElement> getDriver() {
		return driver;
	}
	
	/*
	 * Lauch application
	 */
	public AndroidDriver<WebElement> launch()  {

		try {
			
		provider.loadInstance("SmartChat");
		
		final String applicationDir = ProviderConfiguration.getProvider().getInstance().getApplicationDir();
		final String applicationName = ProviderConfiguration.getProvider().getInstance().getApplicationName();
		final String deviceName = ProviderConfiguration.getProvider().getInstance().getDeviceName();
		final String devicePlatform = ProviderConfiguration.getProvider().getInstance().getDevicePlatform();
		final String applicationPackage = ProviderConfiguration.getProvider().getInstance().getApplicationPackage();
		final String applicationActivity = ProviderConfiguration.getProvider().getInstance().getApplicationActivity();
		final String appiumURL = ProviderConfiguration.getProvider().getInstance().getAppiumURL();
		
		File classpathRoot = new File(System.getProperty("user.dir"));
	    File appDir = new File(classpathRoot, applicationDir);
	    File app = new File(appDir, applicationName);
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName",deviceName);
	    capabilities.setCapability("platformVersion", devicePlatform);
	    capabilities.setCapability("app", app.getAbsolutePath());
	    capabilities.setCapability("appPackage", applicationPackage);
	    capabilities.setCapability("appActivity", applicationActivity);
	    driver = new AndroidDriver<>(new URL(appiumURL), capabilities);
	    
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return driver;
	}
	/**
	 * Close driver
	 */
	public void shutdown() {
		driver.quit();
	}

	
	private AndroidDriver<WebElement> driver = null;
	private static final Log log = LogFactory.getLog(Device.class);
	private final ProviderConfiguration provider = ProviderConfiguration.getProvider();

}
