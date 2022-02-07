package com.cybertek.library.stepDefinitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.lang.String;


public class ShowRecordsStepDefinitions {


    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    UsersPage usersPage = new UsersPage();

    @Given("User logs in as librarian")
    public void user_logs_in_as_librarian() {

        String url = ConfigurationReader.getProperties("url");

        Driver.getDriver().get(url);

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = ConfigurationReader.getProperties("librarian_email");

        String password = ConfigurationReader.getProperties("librarian_password");

        loginPage.usernameInput.sendKeys(username);

        loginPage.passwordInput.sendKeys(password);

        loginPage.signInButton.click();

    }

    @When("User clicks on Users link")
    public void user_clicks_on_link() {

        homePage.UsersLink.click();

    }


    @Then("User should be able to see show records dropdown value is {int}")
    public void user_should_be_able_to_see_show_records_dropdown_value_is(Integer expectedDefaultValue) {

        Select select = new Select(usersPage.showRecordsDropdown);

        String actual = select.getFirstSelectedOption().getText();

        Assert.assertTrue(actual.equals(String.valueOf(expectedDefaultValue)));

        System.out.println("passed");

    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<Integer> listOfExpectedOptions) {

        Select select = new Select(usersPage.showRecordsDropdown);

        List<WebElement> options = select.getOptions();

        Assert.assertTrue(options.size() == listOfExpectedOptions.size());

        System.out.println("passed");

        List<Integer> actualOptions = new ArrayList<>();

        for (WebElement each :  options){

            actualOptions.add(Integer.valueOf(each.getText()));
        }


        Assert.assertEquals(listOfExpectedOptions, actualOptions);

        System.out.println("passed");

        Driver.closeDriver();
    }
}
