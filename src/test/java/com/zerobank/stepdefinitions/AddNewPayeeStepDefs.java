package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddNewPayeeStepDefs {


    PayBillsPage payBills = new PayBillsPage();
    @Given("the user accesses the Add New Payee")
    public void the_user_accesses_the_Add_New_Payee() {

        payBills.AddNewPayee.click();
        BrowserUtils.waitFor(1);

    }

    @When("the user enters {string} and {string} and {string} and {string}")
    public void the_user_enters_and_and_and(String Payee_Name, String Payee_Address, String Account, String Payee_Details) {

        payBills.setAddNewPayee("The Law Offices of Hyde, Price & Scharks","100 Same st, Anytown, USA, 10001","Checking","XYZ account");

    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertTrue(string.equals(payBills.successMessage.getText()));
        Assert.assertTrue(payBills.successMessage.isDisplayed());
    }









}
