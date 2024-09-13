package StepDefinitions;

import Pages.CheckoutYourInformationPage;
import Pages.LoginPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class CheckoutYourInformationSteps {
    CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(DriverManager.getDriver().driver);

    @And("I fill in the customer information with first name {string}, last name {string}, and postal code {string}")
    public void fillCustomerInformation(String firstName, String lastName, String postalCode) {
        checkoutYourInformationPage.fillCustomerInformation(firstName, lastName, postalCode);
    }
}
