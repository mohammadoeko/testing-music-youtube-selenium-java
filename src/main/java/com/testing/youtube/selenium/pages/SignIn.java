package com.testing.youtube.selenium.pages;

import com.testing.youtube.selenium.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    private WebDriver driver;

    public SignIn() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Sign In
    @FindBy(xpath = "//*[@id=\"right-content\"]/a")
    WebElement btnSignIn;

    @FindBy(id = "identifierId")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    WebElement btnNextEmail;

    @FindBy(name = "Passwd")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    WebElement btnNextPassword;

    @FindBy(xpath = "//*[@id=\"headingText\"]/span")
    WebElement txtSignIn;

    @FindBy(className = "o6cuMc")
    WebElement txtMessageError;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")
    WebElement txtMessageErrorPassword;

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[1]/yt-formatted-string")
    WebElement txtBeranda;


    public void btnSignIn() {
        btnSignIn.click();
    }

    public void inputEmail(String inputEmail){
        this.inputEmail.sendKeys(inputEmail);
    }

    public void btnNextEmail() {
        btnNextEmail.click();
    }

    public void inputPassword(String inputPassword) {
        this.inputPassword.sendKeys(inputPassword);
    }

    public void btnNextPassword() {
        btnNextPassword.click();
    }

    public String getTxtSignIn() {
        return txtSignIn.getText();
    }

    public String getTxtMessageError() {
        return  txtMessageError.getText();
    }
    
    public String getTxtMessageErrorPassword() {
        return txtMessageErrorPassword.getText();
    }

    public String getTxtBeranda() {
        return txtBeranda.getText();
    }
}
