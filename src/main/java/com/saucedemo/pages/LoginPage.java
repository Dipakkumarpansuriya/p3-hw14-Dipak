package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By verifyProductText = By.xpath("//span[text()='Products']");


    public void enterUserName(String userNameText) {
        sendTextToElement(userNameField, userNameText);
    }

    public void enterPassword(String passwordText) {
        sendTextToElement(passwordField, passwordText);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(verifyProductText);
    }
}
