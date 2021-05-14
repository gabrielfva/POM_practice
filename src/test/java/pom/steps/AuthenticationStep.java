package pom.steps;

import co.com.sofka.automation.test.controller.BCLogin;
import co.com.sofka.automation.test.controller.DriverController;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.automation.test.utils.Constants.LBL_PRODUCTS;
import static co.com.sofka.automation.test.utils.Constants.URL_SAUCESTORE;

public class AuthenticationStep {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverController.getDriver();
    }

    @Given("that Nicolas is on Sauce Demo home page")
    public void thatNicolasIsOnSauceDemoHomePage() {
        BCLogin.openBrowser(URL_SAUCESTORE, driver);
    }

    @When("he enters his {string} and {string}")
    public void heEntersHisAnd(String user, String password) {
        BCLogin.login(driver, user, password);
    }

    @Then("he should log in correctly")
    public void heShouldLogInCorrectly() {
        Assert.assertEquals(BCLogin.getTitleHomePage(driver), LBL_PRODUCTS);
    }

    @Then("he should see the message: {string}")
    public void heShouldSeeTheMessage(String message) {
        Assert.assertEquals(message, BCLogin.getMessageBlockedUser(driver));
    }

    @After
    public void tearDown(){
        driver.close();
    }


}
