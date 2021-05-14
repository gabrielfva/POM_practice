package pom.steps;

import co.com.sofka.automation.test.controller.BCLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static co.com.sofka.automation.test.utils.Constants.LBL_PRODUCTS;
import static co.com.sofka.automation.test.utils.Constants.URL_SAUCESTORE;
import static pom.steps.Hooks.driver;

public class AuthenticationStep {

    @Given("that Nicolas is on Sauce Demo home page")
    public void thatNicolasIsOnSauceDemoHomePage() {
        BCLogin.openBrowser(URL_SAUCESTORE, driver);
    }

    @Then("he should log in correctly")
    public void heShouldLogInCorrectly() {
        Assert.assertEquals(LBL_PRODUCTS, BCLogin.getTitleHomePage(driver));
    }

    @Then("he should see the message: {string}")
    public void heShouldSeeTheMessage(String message) {
        Assert.assertEquals(message, BCLogin.getMessageBlockedUser(driver));
    }
}
