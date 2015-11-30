package config;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



/**
 * The instance element brings together all of the testbed components to fully define everything
 * That a test needs to execute.
 *
 */
public class DataInstanceConfiguration extends DataConfiguration
{
    public String getApplicationDir()
    {
        return applicationDir;
    }

    public void setApplicationDir(String applicationDir)
    {
        this.applicationDir = applicationDir;
    }
    public String getApplicationName()
    {
        return applicationName;
    }

    public void setApplicationName(String applicationName)
    {
        this.applicationName = applicationName;
    }
    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }
    
    public String getDevicePlatform()
    {
        return devicePlatform;
    }

    public void setDevicePlatform(String devicePlatform)
    {
        this.devicePlatform = devicePlatform;
    }
    
    public String getApplicationPackage()
    {
        return applicationPackage;
    }

    public void setApplicationPackage(String applicationPackage)
    {
        this.applicationPackage = applicationPackage;
    }
    
    public String getApplicationActivity()
    {
        return applicationActivity;
    }

    public void setApplicationActivity(String applicationActivity)
    {
        this.applicationActivity = applicationActivity;
    }
    
    public String getAppiumURL()
    {
        return appiumURL;
    }

    public void setAppiumURL(String appiumURL)
    {
        this.appiumURL = appiumURL;
    }
    @Override
    public Element toElement(Document document) 
    {
        Element instance = document.createElement("customer");
        instance.setAttribute("tag", getTag());
        
        Element appDir = document.createElement("applicationDir");
        appDir.setTextContent(getApplicationDir());
        instance.appendChild(appDir);
        
        Element appName = document.createElement("applicationName");
        appName.setTextContent(getApplicationName());
        instance.appendChild(appName);
        
        Element dvName = document.createElement("deviceName");
        dvName.setTextContent(getDeviceName());
        instance.appendChild(dvName);
        
        Element dvPlatform = document.createElement("devicePlatform");
        dvPlatform.setTextContent(getDevicePlatform());
        instance.appendChild(dvPlatform);
        
        Element appPackage = document.createElement("applicationPackage");
        appPackage.setTextContent(getApplicationPackage());
        instance.appendChild(appPackage);
        
        Element appActivity = document.createElement("applicationActivity");
        appActivity.setTextContent(getApplicationActivity());
        instance.appendChild(appActivity);
        
        Element appiURL = document.createElement("appiumURL");
        appiURL.setTextContent(getAppiumURL());
        instance.appendChild(appiURL);
        
        return instance;
    }

    @Override
    public void fromElement(XmlHelper xml, Element base)
    {
        setTag(base.getAttribute("tag"));
        setApplicationDir(xml.getText(base, "applicationDir"));  
        setApplicationName(xml.getText(base,"applicationName"));
        setDeviceName(xml.getText(base,"deviceName"));
        setDevicePlatform(xml.getText(base,"devicePlatform"));
        setApplicationPackage(xml.getText(base,"applicationPackage"));
        setApplicationActivity(xml.getText(base,"applicationActivity"));
        setAppiumURL(xml.getText(base,"appiumURL"));
       
        
    }

	private String applicationDir,applicationName,deviceName,devicePlatform,applicationPackage,applicationActivity,appiumURL;
 
   
}
