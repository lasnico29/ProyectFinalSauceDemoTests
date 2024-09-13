package StepDefinitions;

import Pages.LoginPage;
import Pages.YourCartPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getDriver().driver);

    @And("I proceed to checkout")
    public void proceedToCheckout() {
        yourCartPage.proceedToCheckout();
    }
}
