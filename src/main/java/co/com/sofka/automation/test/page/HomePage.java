package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@class='title']")
    private WebElement productsTitle;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getProductsTitle() {
        return productsTitle;
    }
}
