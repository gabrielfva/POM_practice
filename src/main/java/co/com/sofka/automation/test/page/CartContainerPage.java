package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartContainerPage {
    @FindBy(id = "checkout")
    WebElement btnCheckOut;

    public CartContainerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnCheckOut() {
        return btnCheckOut;
    }
}
