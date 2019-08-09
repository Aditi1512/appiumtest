package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calculator_test {
static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) throws Exception {
		try {
			openCalculator();
		}catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
public static void openCalculator()throws Exception {
     DesiredCapabilities cap =  new DesiredCapabilities();
     cap.setCapability("deviceName","Honor 9N");
     cap.setCapability("platformName","Android");
     cap.setCapability("platformVersion","8.0");
     cap.setCapability("appPackage","com.android.calculator2");
     cap.setCapability("appActivity","com.android.calculator2.Calculator");
     
     driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application Started......");
//		MobileElement one = driver.findElement(By.id("digit_1"));
//		one.click();
		driver.findElement(By.id("digit_1")).click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("times");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
		el5.click();
	}

}
