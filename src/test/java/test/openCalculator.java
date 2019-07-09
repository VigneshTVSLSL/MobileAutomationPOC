package test;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class openCalculator {
	
	//static AppiumDriver driver;
	static WebDriver driver;
	//AndroidDriver driver3;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub;
		
		try {
			openCalculator();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.printStackTrace());
			System.out.println(e.getCause());
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}
		public static void openCalculator() throws URISyntaxException
		
		{
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "MiA2VCS");
			cap.setCapability("udid", "4b1b7b2");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion","9");
			
			cap.setCapability("appWaitPackage", "com.google.android.calculator");
			cap.setCapability("appPackage", "com.google.android.calculator");
			
			cap.setCapability("appWaitActivity", "com.android.calculator2.Calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
		
			
			URI url = new URI("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(cap);
			
			System.out.println("Mobile Calculator Started");
			
			MobileElement numberOne = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
			MobileElement plusSymbol = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
			MobileElement numberTwo = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
			MobileElement equalsSymbol = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
			MobileElement result = (MobileElement) driver.findElement(By.id("android.widget.TextView"));
			
			numberOne.click();
			
			System.out.println("One Clicked");
			plusSymbol.click();
			numberTwo.click();
			equalsSymbol.click();
			
			
			String finalResult = result.getText();
			
			System.out.println("Output is" +finalResult);
			
	}

}
