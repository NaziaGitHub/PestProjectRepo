package com.Desk.Root.Pest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestNGClass 
{
  @Test
  public void f() throws Exception
  {
	  DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"R9ZN60WKQ6R");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		caps.setCapability("chromedriverExecutable","D:\\Desktop and Download Data\\Backup Data\\Chrome Driver New\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
      //caps.setCapability("appPackage","com.touchboarder.android.api.demos");
      //caps.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity");
      AppiumDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
      Thread.sleep(5000);
      driver.get("https://www.facebook.com");
      Thread.sleep(3000);
      driver.findElementByXPath("//input[@name='email']").sendKeys("test");
      driver.findElementByXPath("//input[@name='pass']").sendKeys("test");
      
  }
}
