package com.selenium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    public AndroidDriver driver;
    public void setup() throws MalformedURLException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","192.168.121.103:5555");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","9.0");
        obj.setCapability("appPackage","com.android.calculator2");
        obj.setCapability("appActivity","com.android.calculator2.Calculator");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
