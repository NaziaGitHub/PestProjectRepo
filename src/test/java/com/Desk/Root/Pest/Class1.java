package com.Desk.Root.Pest;

import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Class1 
{

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"R9ZN60WKQ6R");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        caps.setCapability("appPackage","com.touchboarder.android.api.demos");
        caps.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Thread.sleep(3000);
        driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/button1").click();
        Thread.sleep(3000);
        driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
        Thread.sleep(3000);
        driver.findElementsById("android:id/text1").get(1).click();
        Thread.sleep(3000);
        driver.findElementsById("android:id/text1").get(12).click();
        Thread.sleep(3000);
        AndroidElement list=(AndroidElement)driver.findElementById("android:id/text1");
        MobileElement list1=list.findElement
       (MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Switches\"));"));
        Thread.sleep(3000);
        driver.findElementsById("android:id/text1").get(8).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
    }