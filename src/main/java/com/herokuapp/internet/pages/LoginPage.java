package com.herokuapp.internet.pages;


import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By secureText = By.xpath("//h2[text()=' Secure Area']");
    By userErrorMessage = By.xpath("//div[@id='flash']");

    By passwordErrorMessage = By.xpath("(//div[@id='flash'])[1]");


    public void enterUsernameToUserNameField(String username) {
        sendTextToElement(userName, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);

    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureTextMessage() {
        return getTextFromElement(secureText);

    }

    public String getUserErrorMessage() {
        return getTextFromElement(userErrorMessage);
    }


    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordErrorMessage);

    }
}