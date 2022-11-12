package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


        @FindBy(xpath = "//button[@class=\"button nav__item active\"]")
        public WebElement viewAllOrderButtonNav;

        @FindBy(css = "html > body > div:nth-of-type(1) > nav > div:nth-of-type(2) > a:nth-of-type(2) > button")
        public WebElement viewAllProductsButtonNav;

        @FindBy(xpath = "//*[text() = 'Order']")
        public WebElement orderButtonNavItem;

        @FindBy(xpath = "//button[@class=\"button __logout\"]")
        public WebElement logoutButton;

        public BasePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

}
