package mobileTesting;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Amazon {

	static AppiumDriver driver;
	WebDriver driver2;
	AndroidDriver driver3;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub;

		try {
			openAmazonWebsite();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.printStackTrace());
			System.out.println(e.getCause());
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}


	}
	public static void openAmazonWebsite() throws URISyntaxException

	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "MiA2VCS");
		cap.setCapability("udid", "4b1b7b2");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");

		cap.setCapability("appWaitPackage", "com.android.chrome");
		cap.setCapability("appPackage", "com.android.chrome");

		cap.setCapability("appWaitActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");




		URI url = new URI("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(cap);

		System.out.println("Chrome Browser Started");



	}

}
