package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);
    }

    @When("user logs in as an authorized user")
    public void user_logs_in_as_an_authorized_user() {
        loginPage.login();
    }

    @Then("user should be able to see Account Summary page")
    public void user_should_be_able_to_see_Account_Summary_page() {
        String expectedTitle = "Zero - Account Summary";
        Assert.assertEquals(expectedTitle,driver.getTitle());
        driver.close();
;    }

}
