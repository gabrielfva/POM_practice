package pom.steps;

import co.com.sofka.automation.test.controller.BCInventory;
import co.com.sofka.automation.test.controller.BCLogin;
import co.com.sofka.automation.test.utils.PurchaseLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static co.com.sofka.automation.test.utils.Constants.PURCHASE_MESSAGE;
import static co.com.sofka.automation.test.utils.Constants.URL_SAUCESTORE;
import static pom.steps.Hooks.driver;

public class BuyProductsStep {

    @Given("that Nicolas wants to buy a product from the store")
    public void thatNicolasWantsToBuyAProductFromTheStore() {
        BCLogin.openBrowser(URL_SAUCESTORE, driver);
    }

    @And("choose the products he wants to buy")
    public void chooseTheProductsHeWantsToBuy() {
        BCInventory.clickOnChoosedProductsToBuy(driver, PurchaseLogic.chooseProducts(driver));
        BCInventory.clickOnShoppingCart(driver);
        BCInventory.clickOnCheckoutButton(driver);
    }

    @And("provides his personal information")
    public void providesHisPersonalInformation() {
        BCInventory.fillInformationForm(driver);
        BCInventory.clickOnContinueButton(driver);
        BCInventory.clickOnFinnishButton(driver);
    }

    @Then("he should see all the available products in the virtual store")
    public void heShouldSeeAllTheAvailableProductsInTheVirtualStore() {
        Assert.assertTrue(BCInventory.seeProducts(driver) > 0);
    }

    @Then("he should be able to buy the products")
    public void heShouldBeAbleToBuyTheProducts() {
        BCInventory.scrollUp(driver);
        Assert.assertEquals(BCInventory.orderConfirmed(driver), PURCHASE_MESSAGE);;
    }
}
