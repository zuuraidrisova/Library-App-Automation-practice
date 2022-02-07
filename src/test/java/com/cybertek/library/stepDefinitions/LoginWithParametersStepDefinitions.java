package com.cybertek.library.stepDefinitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LoginWithParametersStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        String url = ConfigurationReader.getProperties("url");

        Driver.getDriver().get(url);

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("Student enters username {string}")
    public void student_enters_username(String username) {

        loginPage.usernameInput.sendKeys(username);

    }

    @When("Student enters password {string}")
    public void student_enters_password(String password) {

       loginPage.passwordInput.sendKeys(password);

    }

    @When("Student clicks on signIn button")
    public void student_clicks_on_sign_in_button() {

        loginPage.signInButton.click();

    }

    @Then("Student should be able to see {string}")
    public void student_should_be_able_to_see(String expected) {

        String actual = loginPage.bookManagementText.getText();

        Assert.assertEquals(actual, expected);

        System.out.println("passed");

        Driver.closeDriver();

    }


    @When("Librarian enters username {string}")
    public void librarian_enters_username(String username) {

        loginPage.usernameInput.sendKeys(username);

    }

    @When("Librarian enters password  {string}")
    public void librarian_enters_password(String password) {

        loginPage.passwordInput.sendKeys(password);

    }

    @When("Librarian clicks on signIn button")
    public void librarian_clicks_on_sign_in_button() {

        loginPage.signInButton.click();

    }

    @Then("Librarian should be able to see {string}")
    public void librarian_should_be_able_to_see(String expected) {

        String actual = loginPage.dashBoardText.getText();

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();
    }

    //#-> Implement the same logic you created before. But you should handle login in one scenario step.
    //#-> Create new snippets and implement them in Login_StepDefinitions class and implement these 2 scenarios.
    //#Note: Follow POM for any web element locating in any page.

    @When("Student enters username {string} and password {string}")
    public void student_enters_username_and_password(String username, String password) {

       loginPage.usernameInput.sendKeys(username);

       loginPage.passwordInput.sendKeys(password);

       loginPage.signInButton.click();

    }

    @Then("Student should see {string}")
    public void student_should_see(String expected) {

        String actual = loginPage.bookManagementText.getText();

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();
    }

    @When("Librarian enters username {string} and password {string}")
    public void librarian_enters_username_and_password(String username, String password) {

        loginPage.usernameInput.sendKeys(username);

        loginPage.passwordInput.sendKeys(password);

        loginPage.signInButton.click();

    }

    @Then("Librarian should see {string}")
    public void librarian_should_see(String expected) {

        String actual = loginPage.dashBoardText.getText();

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();

    }

}
