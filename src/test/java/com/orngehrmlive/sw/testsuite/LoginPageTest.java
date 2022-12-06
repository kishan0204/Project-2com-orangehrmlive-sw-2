package com.orngehrmlive.sw.testsuite;


import com.orngehrmlive.sw.pages.ForgotPasswordPage;
import com.orngehrmlive.sw.pages.LoginPage;
import com.orngehrmlive.sw.testbase.BaseTest;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailIdField("Admin");
        loginPage.enterPasswordField("admin123");
        loginPage.clickOnLoginButton();
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPassword();
        forgotPasswordPage.verifyTextMessage();

    }
}