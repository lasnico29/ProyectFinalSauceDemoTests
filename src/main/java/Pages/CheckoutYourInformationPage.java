package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage {

    WebDriver driver;

    public CheckoutYourInformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstNameTextBox;

    @FindBy(id = "last-name")
    WebElement lastNameTextBox;

    @FindBy(id = "postal-code")
    WebElement postalCodeTextBox;

    @FindBy(id = "continue")
    WebElement continueButton;

    public void fillCustomerInformation(String firstName, String lastName, String postalCode) {
        firstNameTextBox.sendKeys(firstName);
        lastNameTextBox.sendKeys(lastName);
        postalCodeTextBox.sendKeys(postalCode);
        continueButton.click();
    }
}
