package StepDefinitions;

import Pages.CheckoutOverview;
import Pages.LoginPage;
import Utilities.DriverManager;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class CheckoutOverviewSteps {
    CheckoutOverview checkoutOverview = new CheckoutOverview(DriverManager.getDriver().driver);

    @Then("The item total should be {string}")
    public void verifyItemTotal(String expectedTotal) {
        String actualTotal = checkoutOverview.getItemTotalText();
        Assertions.assertEquals(expectedTotal, actualTotal);
        //prueba de que funciona el test
        //Assertions.assertEquals("Item total: $59.980000000000004", actualTotal);
    }

    @Then("I click on finish button")
    public void clickOnFinishButton()
    {
        checkoutOverview.clickFinishButton();
    }

    @Then("The purchase should be successful")
    public void verifyPurchaseSuccessful() {
        Assertions.assertTrue(checkoutOverview.isPurchaseSuccessful());
    }
}
