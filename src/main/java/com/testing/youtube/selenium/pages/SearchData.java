package com.testing.youtube.selenium.pages;

import com.testing.youtube.selenium.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchData {
    private WebDriver driver;

    public SearchData() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Search Data
    @FindBy(id = "placeholder")
    WebElement clickSearchMenu;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/input")
    WebElement inputSearch;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer/div[2]/div[1]/yt-formatted-string/a")
    WebElement txtResultSearch;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-message-renderer/yt-formatted-string[1]")
    WebElement txtResultNotFound;

    public void clickSearchMenu() {
        clickSearchMenu.click();
    }

    public void inputSearch(String inputSearch){
        this.inputSearch.sendKeys(inputSearch);
    }

    public String getTxtResultSearch() {
        return txtResultSearch.getText();
    }

    public String getTxtResultNotFound() {
        return txtResultNotFound.getText();
    }

    public String getTxtAttributeSearch() {
        return inputSearch.getAttribute("placeholder");
    }
}
