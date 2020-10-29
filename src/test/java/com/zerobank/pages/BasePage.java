package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li")
    public WebElement mainMenuList;
}
