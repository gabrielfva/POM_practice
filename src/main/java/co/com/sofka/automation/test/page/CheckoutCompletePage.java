package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

    @FindBy(className = "complete-header")
    WebElement msgPurchase;

    public CheckoutCompletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getMsgPurchase() {
        return msgPurchase;
    }
}
