package pom.steps;

import co.com.sofka.automation.test.controller.BCLogin;
import io.cucumber.java.en.When;

import static pom.steps.Hooks.driver;

public class CommonSteps {

    @When("he enters his {string} and {string}")
    public void heEntersHisAnd(String user, String password) {
        BCLogin.login(driver, user, password);
    }
}
