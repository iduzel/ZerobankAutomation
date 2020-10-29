package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {

public AccountActivityPage(){ PageFactory.initElements(Driver.get(),this);}


    @FindBy (xpath = "//a[@href='#ui-tabs-1']")
    public WebElement showTransactions ;

    @FindBy(xpath ="//a[@href='#ui-tabs-2']" )
    public WebElement findTransactions;

    @FindBy (id = "aa_description")
    public WebElement descriptionBox;

    @FindBy(xpath = "//button")
    public WebElement findButton;


}

