package mobileTesting;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonApp {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub

		
		openAmazonApp();
	}


	public static void openAmazonApp() throws URISyntaxException

	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "MiA2VCS");
		cap.setCapability("udid", "4b1b7b2");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");

		cap.setCapability("appWaitPackage", "in.amazon.mShop.android,shoping");
		cap.setCapability("appPackage", "in.amazon.mShop.android,shoping");

		cap.setCapability("appWaitActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		
		cap.setCapability(MobileCapabilityType.APP, "path to ipa/apk file" );


		//cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");



		//cap.setCapability("appWaitActivity", "com.google.android.gms.common.api.GoogleApiActivity");


		//cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");


		//cap.setCapability("appActivities", "com.android.calculator2.Calculator");

		URI url = new URI("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(cap);

		System.out.println("Mobile Calculator Started");


	}

}
