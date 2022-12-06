package com.herokuapp.internet.testsuite;


import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsernameToUserNameField("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Secure Area";
        String actualMessage = loginPage.getSecureTextMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "correct text");


    }


    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUsernameToUserNameField("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage="Your username is invalid!\n" + "×";
        String actualMessage = loginPage.getUserErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "correct text");



    }


    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUsernameToUserNameField("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedMessage="Your password is invalid!\n" + "×";
        String actualMessage = loginPage.getPasswordErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "correct text");

    }









}