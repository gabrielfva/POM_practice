package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationToPayPage {
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement txtFirstName;

    @FindBy(id = "last-name")
    WebElement txtLastName;

    @FindBy(id = "postal-code")
    WebElement txtPostalCode;

    @FindBy(id = "continue")
    WebElement btnContinue;

    public InformationToPayPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtFirstName() {
        return txtFirstName;
    }

    public WebElement getTxtLastName() {
        return txtLastName;
    }

    public WebElement getTxtPostalCode() {
        return txtPostalCode;
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }
}
