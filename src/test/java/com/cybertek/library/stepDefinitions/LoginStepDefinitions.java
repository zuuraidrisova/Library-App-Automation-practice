package com.cybertek.library.stepDefinitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("User is on login page")
    public void user_is_on_login_page() {

        String url = ConfigurationReader.getProperties("url");

        Driver.getDriver().get(url);

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("Student enters correct username")
    public void student_enters_correct_username() {

        String username = ConfigurationReader.getProperties("student_email");

        loginPage.usernameInput.sendKeys(username);

    }

    @When("Student enters correct password")
    public void student_enters_correct_password() {

        String password = ConfigurationReader.getProperties("student_password");

        loginPage.passwordInput.sendKeys(password);

    }

    @When("Student clicks on sign in button")
    public void student_clicks_on_sign_in_button() {

        loginPage.signInButton.click();

    }

    @Then("Student should be able to see Dashboard")
    public void student_should_be_able_to_see_dashboard() throws InterruptedException{

       String actual =  loginPage.bookManagementText.getText();

       String expected = "Book Management";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Thread.sleep(2000);

        Driver.closeDriver();


    }

    @When("Librarian enters correct username")
    public void librarian_enters_correct_username() {

        String username = ConfigurationReader.getProperties("librarian_email");

        loginPage.usernameInput.sendKeys(username);

    }

    @When("Librarian enters correct password")
    public void librarian_enters_correct_password() {

        String password = ConfigurationReader.getProperties("librarian_password");

        loginPage.passwordInput.sendKeys(password);

    }

    @When("Librarian clicks on sign in button")
    public void librarian_clicks_on_sign_in_button() {


        loginPage.signInButton.click();
    }

    @Then("Librarian should be able to see Dashboard")
    public void librarian_should_be_able_to_see_dashboard() throws InterruptedException{

        String actual =  loginPage.dashBoardText.getText();

        String expected = "Dashboard";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Thread.sleep(2000);

        Driver.closeDriver();
    }


}
