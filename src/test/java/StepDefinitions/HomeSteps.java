package StepDefinitions;

import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomeSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);

    @And("I check the Facebook link")
    public void checkFacebookLink() {
        String expectedUrl = "https://www.facebook.com/saucelabs";
        String actualUrl = homePage.getFacebookLinkUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @And("I click on the Facebook link")
    public void clickOnFacebookLink() {
        homePage.clickOnFacebookLink();
        homePage.switchToNewWindow();
    }

    @Then("I should be redirected to the Sauce Labs Facebook page")
    public void verifyFacebookRedirect() {
        String expectedUrl = "https://www.facebook.com/saucelabs";
        String currentUrl = DriverManager.getDriver().driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, currentUrl);
    }

    @And("I sort the products by price from high to low")
    public void sortProductsByPriceHighToLow() {
        homePage.sortProductsByPriceHighToLow();
    }

    @And("The products should be sorted by price from high to low")
    public void verifyProductsSortedByPriceHighToLow() {
        Assertions.assertTrue(homePage.areProductsSortedByPriceHighToLow());
    }

    @And("I add Sauce Labs Bike Light and Sauce Labs Fleece Jacket to the cart")
    public void addItemsToCart() {
        homePage.addItemsToCart();
    }

    @And("I proceed to the cart")
    public void goToCart() {
        homePage.goToCart();
    }

    @When("I open the menu")
    public void openMenu() {
        homePage.openMenu();
    }

    @When("I click on the logout button")
    public void clickLogout() {
        homePage.clickLogout();
    }

    @Then("The login button should be displayed")
    public void verifyLoginButtonIsDisplayed() {
        Assertions.assertTrue(homePage.isLoginButtonDisplayed());
    }
}
