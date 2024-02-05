package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{

    public static String LOGIN_URL = Base_URL+"login";

    @FindBy (id="username") private WebElement usernameInput;
    @FindBy (id="password") private WebElement passwordInput;
    @FindBy (className="radius") private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String passwordd){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(passwordd);
        loginButton.click();
    }
}
