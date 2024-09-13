package StepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.Given;

public class EnterSauceDemoWeb {
    @Given("I am in sauce demo web page")
    public void goToSauceDemoPage(){
        DriverManager.getDriver().driver.get("https://www.saucedemo.com/");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
