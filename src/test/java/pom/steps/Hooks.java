package pom.steps;

import co.com.sofka.automation.test.controller.DriverController;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverController.getDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

}
