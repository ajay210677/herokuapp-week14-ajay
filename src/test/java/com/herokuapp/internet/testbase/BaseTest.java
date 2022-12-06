package com.herokuapp.internet.testbase;


import com.herokuapp.internet.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "chrome";
    @BeforeMethod
    public  void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
