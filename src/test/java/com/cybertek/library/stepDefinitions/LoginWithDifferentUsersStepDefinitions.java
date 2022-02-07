package com.cybertek.library.stepDefinitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginWithDifferentUsersStepDefinitions {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();


    @Given("As a user I should be on login page  to login with different users")
    public void as_a_user_i_should_be_on_login_page_to_login_with_different_users() {

        String url = ConfigurationReader.getProperties("url");

        Driver.getDriver().get(url);

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("User logins using username {string} and {string}")
    public void user_logins_using_username_and(String username, String password) {

        loginPage.usernameInput.sendKeys(username);

        loginPage.passwordInput.sendKeys(password);

        loginPage.signInButton.click();

    }

    @Then("User should be able to see {string} in the account section")
    public void user_should_be_able_to_see_in_the_account_section(String username)  {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.visibilityOf(homePage.accountName));

        Assert.assertTrue(homePage.accountName.isDisplayed());

        Assert.assertTrue(homePage.accountName.isEnabled());

        String actual = homePage.accountName.getText();

        System.out.println("actual = " + actual);

        String expected = "Test "+username;

        System.out.println("expected = " + expected);

       Assert.assertEquals( "I DONT KNOW WHY IT IS FAILING", expected,actual);

        System.out.println("passed");

        BrowserUtils.wait(2);

        Driver.closeDriver();

    }

}
