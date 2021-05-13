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

public class AuthenticationStep {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverController.getDriver();
    }

    @Given("that Nicolas is on Souce Demo home page")
    public void thatNicolasIsOnSouceDemoHomePage() {
        BCLogin.openBrowser("https://www.saucedemo.com/", driver);
    }
    @When("he enters his {string} and {string}")
    public void heEntersHisAnd(String user, String password) {
        BCLogin.login(driver, user, password);
    }
    @Then("he should log in correctly")
    public void heShouldLogInCorrectly() {
        Assert.assertEquals(BCLogin.getTitleHomePage(driver), ("PRODUCTS"));
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
