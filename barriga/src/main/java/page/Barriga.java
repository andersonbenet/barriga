package page;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Barriga {

	public static void main(String[] args) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		/*
		 * device capabilities.setCapability("platformName", "Android");
		 * capabilities.setCapability("deviceName", "LEY7A07330000504");
		 * capabilities.setCapability("automationName", "appium");
		 * capabilities.setCapability("appPackage", "com.android.calculator2");
		 * capabilities.setCapability("appActivity",
		 * "com.android.calculator2.Calculator");
		 */

		/* emulator */
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "@Nexus_5X");
		capabilities.setCapability("automationName", "appium");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		try {
			AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}