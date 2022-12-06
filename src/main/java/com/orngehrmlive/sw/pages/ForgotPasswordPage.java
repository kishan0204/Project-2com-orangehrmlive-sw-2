package com.orngehrmlive.sw.pages;



import com.orngehrmlive.sw.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;


public class ForgotPasswordPage extends Utility {
    By forgotPassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");
    By textMessage =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]");

    public void clickOnForgotPassword(){clickOnElement(forgotPassword);}
    public void verifyTextMessage(){verifyTextFromElements(textMessage,"Reset Password");}


}
