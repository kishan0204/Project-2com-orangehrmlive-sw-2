package com.orngehrmlive.sw.pages;


import com.orngehrmlive.sw.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {


    By emailIdField = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By PasswordField = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By loginButton = (By.xpath("//button[normalize-space()='Login']"));

    public void enterEmailIdField(String email){sendTextToElement(emailIdField , email);}
    public void enterPasswordField(String password){sendTextToElement(PasswordField , password);}
    public void clickOnLoginButton(){clickOnElement(loginButton);}


}
