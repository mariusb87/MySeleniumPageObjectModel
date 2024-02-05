package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage{
    public static String SECURE_URL = Base_URL+"secure";
    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="flash") private WebElement succesMessage;
    @FindBy(linkText="Logout") private WebElement logoutButton;

    public String getSuccesMessageText(){
        return succesMessage.getText();
    }

    public boolean isLogoutButtonDisplayed(){
        return logoutButton.isDisplayed();
    }


}
