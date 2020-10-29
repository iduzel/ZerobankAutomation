package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTransactionsStepDefs {

    AccountActivityPage accountActivity = new AccountActivityPage();




    //find the Account Activity (here) or the other options
    @Given("the user accesses the {string}")
    public void the_user_accesses_the(String option) {
        System.out.println("option = " + option);

        List<WebElement> mainOptions = Driver.get().findElements(By.xpath("//ul[@class='nav nav-tabs']/li/a"));

        for (WebElement mainOption : mainOptions) {

            if (mainOption.getText().equals(option)) {
                System.out.println("mainOption.getText() = " + mainOption.getText());
                mainOption.click();
                break;
            }

            BrowserUtils.waitFor(2);


        }


    }

    //Find 'Find Transactions' and click
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        Driver.get().findElement(By.xpath("//*[text()='Find Transactions']")).click();
        BrowserUtils.waitFor(2);

    }

    //Find date boxes and clear and send the new dates
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String from, String to) {

        WebElement fromDateBox = Driver.get().findElement(By.id("aa_fromDate"));
        fromDateBox.clear();
        BrowserUtils.waitFor(1);
        fromDateBox.sendKeys(from);
        BrowserUtils.waitFor(1);

        WebElement toDateBox = Driver.get().findElement(By.id("aa_toDate"));
        toDateBox.clear();
        BrowserUtils.waitFor(1);
        toDateBox.sendKeys(to);
        BrowserUtils.waitFor(1);
    }


    @When("clicks search")
    public void clicks_search() {
        accountActivity.findButton.click();
        BrowserUtils.waitFor(2);
    }

    int ActualFromDate;
    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {

        //Convert dates from String to Integer
        fromDate = fromDate.replace("-", "");
        int expectedFromDate = Integer.parseInt(fromDate);
        System.out.println("expectedFromDate = " + expectedFromDate);

        toDate = toDate.replace("-", "");
        int expectedToDate = Integer.parseInt(toDate);
        System.out.println("ToDate = " + expectedToDate);

        //find the first date and convert it from String to Integer
        WebElement fromDateElement = Driver.get().findElement(By.xpath("//*[contains(@id,'filtered')]//tbody/tr[last()]/td[1]"));
        String act_FirstDate = fromDateElement.getText().replace("-", "");
        ActualFromDate = Integer.parseInt(act_FirstDate);
        System.out.println("ActualFromDate = " + ActualFromDate);

        //find the last date and convert it from String to Integer
        WebElement toDateElement = Driver.get().findElement(By.xpath("//*[contains(@id,'filtered')]//tbody/tr[1]/td[1]"));
        String act_LastDate = toDateElement.getText().replace("-", "");
        int ActualToDate = Integer.parseInt(act_LastDate);
        System.out.println("ToDate2 = " + ActualToDate);





        if ((ActualToDate <= expectedToDate) && (ActualFromDate >= expectedFromDate)) {
            System.out.println("Dates are correct");
        } else {
            System.out.println("Check the Dates!! Something is wrong");
        }


    }


    ArrayList<Integer> list = new ArrayList<>();
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

        //find the last date and convert it from String to Integer
        WebElement lastDate = Driver.get().findElement(By.xpath("//*[contains(@id,'filtered')]//tbody/tr[1]/td[1]"));
        String act_LastDate = lastDate.getText().replace("-", "");
        int lastToElement = Integer.parseInt(act_LastDate);
        System.out.println("lastToElement = " + lastToElement);


        //verify result is sorted by most recent date
        List<WebElement> elements = Driver.get().findElements(By.xpath("//*[contains(@id,'filtered')]//tbody/tr/td[1]"));
        System.out.println("elements.size() = " + elements.size());

        for (int i = 0; i < elements.size(); i++) {
            int date = Integer.parseInt(elements.get(i).getText().replace("-", ""));

            list.add(date);

        }

        BrowserUtils.waitFor(3);
        list.forEach(System.out::println);

        int biggestNumber = Collections.max(list);
        Assert.assertEquals(biggestNumber, lastToElement);


    }
    //verify not contain 2012-09-01
    List<Integer> dieListe = new ArrayList<>();
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String notContain) {
      int notContain2 = Integer.parseInt(notContain.replace("-",""));
      List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='ui-tabs-2']//tbody/tr/td[1]"));
        for (WebElement element : elements) {
            int i = Integer.parseInt(element.getText().replace("-",""));
            dieListe.add(i);
        }
        dieListe.forEach(System.out::println);
        Assert.assertTrue(!dieListe.contains(notContain2));

    }




    //find 'find Transaction'--> description and send the value
    @When("the user enters description {string}")
    public void the_user_enters_description(String description) {

        accountActivity.descriptionBox.clear();
        BrowserUtils.waitFor(1);
        accountActivity.descriptionBox.click();
        BrowserUtils.waitFor(1);
        accountActivity.descriptionBox.sendKeys(description);
        BrowserUtils.waitFor(1);
    }


    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {

        List<WebElement> dscrp = Driver.get().findElements(By.xpath("//div[@id='ui-tabs-2']//tbody/tr/td[2]"));
        for (WebElement element : dscrp) {
           Assert.assertTrue(element.getText().contains(string));

        }
    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        System.out.println("string = " + string);
        List<WebElement> dscrp = Driver.get().findElements(By.xpath("//div[@id='ui-tabs-2']//tbody/tr/td[2]"));
        for (WebElement element : dscrp) {
            Assert.assertFalse(element.getText().contains(string));

        }

    }


    List<String> depositWithdrawalList =new ArrayList<>();
    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) {

        //find Deposit / Withdrawal list
        List<WebElement> depositList = Driver.get().findElements(By.xpath("//div[@id='ui-tabs-2']//tbody/tr/td[2]"));
        for (WebElement element : depositList) {
           depositWithdrawalList.add(element.getText()) ;
        }
        Assert.assertTrue(depositList.size()>0);

    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {

        WebElement DD = Driver.get().findElement(By.id("aa_type"));
        Select select = new Select(DD);
        select.selectByVisibleText(string);
        BrowserUtils.waitFor(1);

    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String st) {
        if(st.equals("Deposit")){
            st="3";

        }else if(st.equals("Withdrawal")){
            st = "4";
        }

       List<WebElement> WD = Driver.get().findElements(By.xpath("//div[@id='ui-tabs-2']//tbody/tr/td["+st+"]"));
        System.out.println("WD.size() = " + WD.size());
        for (WebElement element : WD) {
            System.out.println("element.getText() = " + element.getText());
            Assert.assertTrue(element.getText().isEmpty());
        }


    }



}
