package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccActNavStepDefs {



    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String AccSumList) {

        System.out.println("AccSumList = " + AccSumList);

        List<WebElement> listOfDD = Driver.get().findElements(By.cssSelector("tbody>tr>td>a"));

        for (WebElement element : listOfDD) {

            if (element.getText().equals(AccSumList)) {
                BrowserUtils.waitFor(3);
                element.click();

                BrowserUtils.waitFor(2);
                break;

            }

        }

        System.out.println("*********");


    }
    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals("Zero - Account Activity", Driver.get().getTitle());
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedOption) {

        WebElement DDMenu = Driver.get().findElement(By.cssSelector("#aa_accountId"));
        Select select = new Select(DDMenu);
        BrowserUtils.waitFor(2);

        String actualOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Verify selected Dropdown",expectedOption,actualOption);


    }
}
