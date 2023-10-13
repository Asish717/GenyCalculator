package com.selenium;

import com.selenium.base.BaseClass;
import com.selenium.pages.Addition;
import com.selenium.pages.Division;
import com.selenium.pages.Multiplication;
import com.selenium.pages.Subtraction;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GenyCalculatorTest extends BaseClass {
    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;
    @BeforeTest
    public void start() throws MalformedURLException {
        setup();
        addition=new Addition(driver);
        subtraction=new Subtraction(driver);
        division=new Division(driver);
        multiplication=new Multiplication(driver);
    }
    @Test(priority = 0)
    public void add(){
        String resultCheck=addition.add();
        Assert.assertEquals(resultCheck,"10");
    }
    @Test(priority = 1)
    public void sub(){
        String resultCheck=subtraction.sub();
        Assert.assertEquals(resultCheck,"0");
    }
    @Test(priority = 2)
    public void multi(){
        String resultCheck=multiplication.multi();
        Assert.assertEquals(resultCheck,"25");
    }
    @Test(priority = 3)
    public void div(){
        String resultCheck=division.divi();
        Assert.assertEquals(resultCheck,"1");
    }
}
