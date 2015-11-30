package config;

import org.w3c.dom.Element;

import common.Constant;


public class ProviderConfiguration
{
    public static synchronized ProviderConfiguration getProvider()
    {
        if ( provider == null ) {
            provider = new ProviderConfiguration();
        }
        return provider;
    }
    
    public void loadInstance() 
    {
        loadInstance(Constant.AUTOMATION_CONFIG_XML, null);
    }

    public void loadInstance(String instance) 
    {
        loadInstance(Constant.AUTOMATION_CONFIG_XML, instance);
    }
    
    public void loadInstance(String filename, String instance)
    {
        try {
            provider.load(filename, instance);
        } catch (Exception e) {
            instance = null;
            System.out.println("Failed to load due to an XML problem." + e);
        }
    }
 
    public DataInstanceConfiguration getInstance()
    {
        return instance;
    }
    
    /**
     * Load all data from automation.config.xml
     * @param filename: file xml
     * @param instanceTag
     * @throws XmlException
     * @throws ConfigDataException
     */
	private void load(String filename, String instanceTag)  {
		XmlHelper xml = new XmlHelper();

		System.out.println("Loading configuration from file " + filename);
		xml.parseResource(filename);

		if (instanceTag == null) {
			instanceTag = xml.getStringAttribute(xml.getElement("/automation"),
					"instance");
			if (instanceTag == null) {
				System.out.println(
						"You must provide an instance name to the load function or define a default in the XML file <automation instance=\"DEFAULT INSTANCE NAME\"");
			}
		}

		System.out.println("Using the test configuration instance "
				+ instanceTag);

		instance = null;
		for (Element element : xml
				.getElements("/automation/instances/instance")) {
			instance = new DataInstanceConfiguration();
			instance.fromElement(xml, element);
			if (instance.getTag().equals(instanceTag) == false) {
				instance = null;
			} else {
				break;
			}
		}

		if (instance == null) {
			System.out.println("The test configuration instance "
					+ instanceTag + " has not been defined in " + filename);
		}

		System.out.println("Configuration loaded");
	}
    
    public String getApplicationDir() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/applicationDir");
    	return element.getTextContent();
    }
    public String getApplicationName() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/applicationName");
    	return element.getTextContent();
    }
    public String getDeviceName() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/deviceName");
    	return element.getTextContent();
    }
    public String getDevicePlatform() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/devicePlatform");
    	return element.getTextContent();
    }
    public String getApplicationPackage() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/applicationPackage");
    	return element.getTextContent();
    }
    public String getApplicationActivity() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/applicationActivity");
    	return element.getTextContent();
    }
    public String getAppiumURL() {
    	XmlHelper xml = new XmlHelper();
    	xml.parseResource(Constant.AUTOMATION_CONFIG_XML);
    	Element element = xml.getElement("/automation/instances/instance/appiumURL");
    	return element.getTextContent();
    }
     
    private ProviderConfiguration() {}
    private static ProviderConfiguration provider;
    private DataInstanceConfiguration instance = null;    
   
}
