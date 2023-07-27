package userSettingScreen;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class NoResetCapabalities {

				AndroidDriver driver;
					
					@Test(priority = 1)
					public void splachScreen() throws  IOException, InterruptedException  {
						
						DesiredCapabilities dc = new DesiredCapabilities();
				
						dc.setCapability("automationName", "UiAutomator2");
					
						dc.setCapability("platformName", "Android");
					
						dc.setCapability("platformVersion", "13.0");
					
						dc.setCapability("deviceName", "RZ8T81PTRKN");
				
						dc.setCapability("noReset", "true");
						
						dc.setCapability("appPackage", "com.app.babybot");
						
						dc.setCapability("appActivity", "com.app.babybot.MainActivity");
						
						dc.setCapability("autoGrantPermissions", "true");
						
						URL url = new URL("http://127.0.0.1:4723/wd/hub");
						
						driver = new AndroidDriver(url,dc);
						
						Thread.sleep(10000);
	}

}
