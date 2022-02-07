package com.cybertek.library.stepDefinitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchResultsStepDefinitions {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    UsersPage usersPage = new UsersPage();


    @Given("As a user, I should be able to login as librarian")
    public void as_a_user_i_should_be_able_to_login_as_librarian() {

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

    @When("As a user, I should be able to go Users page")
    public void as_a_user_i_should_be_able_to_go_users_page() {

        homePage.UsersLink.click();

    }

    @Then("Table should have following columns:")
    public void table_should_have_following_columns(List<String> expectedSearchResults) {

        List<String> actualSearchResults = new ArrayList<>() ;

        for (WebElement each : usersPage.tableHeaders){

            actualSearchResults.add(each.getText());

        }

        Assert.assertTrue(expectedSearchResults.size() == actualSearchResults.size());

        System.out.println("passed");

        Assert.assertEquals(expectedSearchResults, actualSearchResults);

        System.out.println("passed");

        Driver.closeDriver();
    }

}
