package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage extends BasePage{

    public PayBillsPage(){ PageFactory.initElements(Driver.get(),this);}

    @FindBy(tagName = "//title")
    public WebElement title;

    @FindBy(xpath = "//div[@id='tabs']//li[2]")
    public WebElement AddNewPayee;

    @FindBy(id = "np_new_payee_name")
    public WebElement Payee_Name;

    @FindBy(id = "np_new_payee_address")
    public WebElement Payee_Address;

    @FindBy(id = "np_new_payee_account")
    public WebElement Account;

    @FindBy(id = "np_new_payee_details")
    public WebElement Payee_Details;

    @FindBy(xpath = "//div[@id='ui-tabs-2']//input[@type='submit']")
    public WebElement AddButton;

    @FindBy(css = "div#alert_content")
    public WebElement successMessage;

    public void setAddNewPayee(String name,String Address,String accountType, String details){

        Payee_Name.sendKeys(name);
        Payee_Address.sendKeys(Address);
        Account.sendKeys(accountType);
        Payee_Details.sendKeys(details);

        AddButton.click();
        BrowserUtils.waitFor(2);


    }













}
