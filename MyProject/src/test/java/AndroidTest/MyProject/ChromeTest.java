package AndroidTest.MyProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChromeTest {
	public static AndroidDriver driver;


	@Test
	public void test1() throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", "LGH650aa8dd089");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		if(driver.isDeviceLocked())
		driver.unlockDevice();
		driver.manage().timeouts().implicitlyWait(10L,  TimeUnit.SECONDS);	
		
		MobileElement accept = (MobileElement) driver.findElementById("com.android.chrome:id/terms_accept");
		accept.click();

		MobileElement neg = (MobileElement) driver.findElementById("com.android.chrome:id/negative_button");
		neg.click();
		MobileElement search = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
		search.click();
		
		MobileElement search2 = (MobileElement) driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
		search2.sendKeys("Wiadomości");
		search2.sendKeys(Keys.ENTER);
		


}
}