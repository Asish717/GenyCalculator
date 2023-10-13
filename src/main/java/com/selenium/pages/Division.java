package com.selenium.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Division {
    AndroidDriver driver;
    @FindBy(id = "com.android.calculator2:id/digit_5")
    WebElement num1;
    @FindBy(id = "com.android.calculator2:id/op_div")
    WebElement div;
    @FindBy(id = "com.android.calculator2:id/digit_5")
    WebElement num2;
    @FindBy(id = "com.android.calculator2:id/eq")
    WebElement equal;
    @FindBy(id = "com.android.calculator2:id/result")
    WebElement check;
    public Division(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String divi(){
        num1.click();
        div.click();
        num2.click();
        equal.click();
        String checktext=check.getText();
        return checktext;
    }
}
