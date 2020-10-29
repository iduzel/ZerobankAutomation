package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("button#signin_button")).click();
        BrowserUtils.waitFor(1);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
    String actualTitle = Driver.get().getTitle();
    String expectedTitle = Driver.get().findElement(By.xpath("//title")).getText();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {


        String username = null;
        String password = null;

        if(userType.equals("user")){
            username=ConfigurationReader.get("userUsername");
            password=ConfigurationReader.get("userPassword");
        }else if(userType.equals("bankManager")){
            username=ConfigurationReader.get("bankManager");
            password=ConfigurationReader.get("bankManagerPassword");
        }else if(userType.equals("bankOfficer")){
            username=ConfigurationReader.get("bankOfficer");
            password = ConfigurationReader.get("bankOfficerPassword");
        }else{
           username = "";
           password ="";


        }
        new LoginPage().signIn(username,password);
        BrowserUtils.waitFor(2);
    }

}
