package pom.steps;

import co.com.sofka.automation.test.controller.BCInventory;
import co.com.sofka.automation.test.controller.BCLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static co.com.sofka.automation.test.utils.Constants.URL_SAUCESTORE;
import static pom.steps.Hooks.driver;

public class BuyProductsStep {
    @Given("that Nicolas wants to buy a product from the store")
    public void thatNicolasWantsToBuyAProductFromTheStore() {
        BCLogin.openBrowser(URL_SAUCESTORE, driver);
    }

    @Then("he should see all the available products in the virtual store")
    public void heShouldSeeAllTheAvailableProductsInTheVirtualStore() {
        Assert.assertTrue(BCInventory.seeProducts(driver) > 0);
    }
}
