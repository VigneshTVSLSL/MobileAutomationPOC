package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Fb 
{
	
	AndroidDriver driver;

	DesiredCapabilities cap = new DesiredCapabilities();


	@BeforeClass
	public void setUp() throws MalformedURLException {
		cap.setCapability("deviceName", "MiA2VCS");
		cap.setCapability("udid", "4b1b7b2");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");

		cap.setCapability("appWaitPackage", "com.android.chrome");
		cap.setCapability("appPackage", "com.android.chrome");

		cap.setCapability("appWaitActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");


	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void testLaunchingDefaultBrowserAndroid() throws Exception {
	    driver.get("http://facebook.com");
	    System.out.println(driver.getTitle());
	    System.out.println();

	}

	@AfterClass
	public void tearDown() {
	    driver.quit();
	    System.out.println("Driver Session is closed");
	}
	}