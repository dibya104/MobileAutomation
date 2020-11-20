package learn.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class InstallApkEmulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	//	dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\gopab\\Desktop\\appium_setup\\dream-11-3-39-0.apk");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		//driver.quit();
		WebElement source;
		WebElement des;
		
		driver.findElementById("com.android.calculator2:id/digit_7").click();
		driver.findElementById("com.android.calculator2:id/op_add").click();
		driver.findElementById("com.android.calculator2:id/digit_8").click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		TouchAction action =new TouchAction((MobileDriver) driver);
		//action.longPress(ElementOption.element(source)).moveTo(moveToOptions)
		
		
		

	}

}
