package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    @FindBy(id = "finish")
    WebElement btnFinishPayment;

    public CheckoutOverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnFinishPayment() {
        return btnFinishPayment;
    }
}
