package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "PRODUCTS NOT DISPLAYED");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        int expected = 6;
        //to find number of products displayed on page
        int sliderElementList = driver.findElements(By.xpath("//div[@class='inventory_item']")).size();

        Assert.assertEquals(expected, sliderElementList);
        System.out.println("Total number of Products displayed on page  :  " + sliderElementList);
    }
}

