package AndroidTest.MyProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class MenuTest {
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

		MobileElement allCategories = (MobileElement) driver.findElementById("pl.xkom:id/categoryAll");
		allCategories.click();
		MobileElement fotoTvAudio = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[7]/android.widget.RelativeLayout");
		fotoTvAudio.click();
		//Assert.assertEquals("Foto,TV i audio",driver.findElement(By.className("_highlighter-box_619e8 _inspected-element-box_619e8")).getText());




}
}
