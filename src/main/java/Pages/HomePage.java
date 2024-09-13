package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;
    @FindBy(linkText = "Facebook")
    WebElement facebookLink;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getFacebookLinkUrl() {
        return facebookLink.getAttribute("href");
    }

    public void clickOnFacebookLink() {
        facebookLink.click();
    }

    public void switchToNewWindow() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }


    @FindBy(className = "product_sort_container")
    WebElement sortComboBox;

    @FindBy(className = "inventory_item_price")
    List<WebElement> productPrices;


    public void sortProductsByPriceHighToLow() {
        Select selectObject = new Select(sortComboBox);
        selectObject.selectByVisibleText("Price (high to low)");
    }

    public boolean areProductsSortedByPriceHighToLow() {
        List<Double> actualProductsOrder = new ArrayList<>();
        for (WebElement element : productPrices) {
            String priceText = element.getText().replace("$", "");
            actualProductsOrder.add(Double.parseDouble(priceText));
        }

        List<Double> sortedList = new ArrayList<>(actualProductsOrder);
        sortedList.sort((a, b) -> Double.compare(b, a));
        return actualProductsOrder.equals(sortedList);
    }

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addBikeLightButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addFleeceJacketButton;

    @FindBy(className = "shopping_cart_link")
    WebElement cartLink;

    public void addItemsToCart() {
        addBikeLightButton.click();
        addFleeceJacketButton.click();
    }

    public void goToCart() {
        cartLink.click();
    }

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButtonMenu;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void openMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(menuButton))
                .click();
    }

    public void clickLogout() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(logoutButtonMenu))
                .click();
    }

    public boolean isLoginButtonDisplayed() {
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(loginButton))
                .isDisplayed();
    }


    public void addProductToCart(String productId) {
        WebElement addProductButton = driver.findElement(By.id(productId));
        addProductButton.click();
    }

}
