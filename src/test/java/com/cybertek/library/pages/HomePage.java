package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement UsersLink;

    //a[@class='nav-link dropdown-toggle']/span
    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountName;


}
