package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverview {
    WebDriver driver;

    public CheckoutOverview(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "summary_subtotal_label")
    WebElement itemTotalLabel;

    public String getItemTotalText() {
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(itemTotalLabel))
                .getText();
    }
    @FindBy(id = "finish")
    WebElement finishButton;

    public void clickFinishButton()
    {
        finishButton.click();
    }
    @FindBy(className = "pony_express")
    WebElement successfullyPurchaseImage;

    public boolean isPurchaseSuccessful() {
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(successfullyPurchaseImage))
                .isDisplayed();
    }
}
