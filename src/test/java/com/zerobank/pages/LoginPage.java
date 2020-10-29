package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button")
    public WebElement signIn;

    @FindBy(css = "input#user_login")
    public WebElement usernameBox;

    @FindBy(css = "input#user_password")
    public WebElement passwordBox;

    @FindBy(css = "input[name='submit']")
    public WebElement submit;




    public void signIn(String username, String password) {
       usernameBox.sendKeys(username);
       passwordBox.sendKeys(password);
       submit.click();
        BrowserUtils.waitFor(2);

    }
}
