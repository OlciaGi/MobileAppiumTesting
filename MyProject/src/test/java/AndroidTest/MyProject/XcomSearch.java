package AndroidTest.MyProject;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class XcomSearch {
	
	public static AndroidDriver driver;


	@Test
	public void test1() throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", "LGH650aa8dd089");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "pl.xkom");
		capabilities.setCapability("appActivity", "pl.xkom.view.activity.MainActivity");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		if(driver.isDeviceLocked())
		driver.unlockDevice();
		driver.manage().timeouts().implicitlyWait(10L,  TimeUnit.SECONDS);	

		

		MobileElement searchPanel = (MobileElement) driver.findElementById("pl.xkom:id/et_search_input");
		searchPanel.sendKeys("xiaomi");
		Thread.sleep(3000);
		driver.quit();
		

		
		
	
		}
	}