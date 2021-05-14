package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage {

    @FindBy(how = How.XPATH, using = "//*[@class='title']")
    private WebElement productsTitle;

    @FindBys(@FindBy(xpath = "//div[@class='pricebar']/button"))
    List<WebElement> products;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getProductsTitle() {
        return productsTitle;
    }

    public List<WebElement> getProducts() {
        return products;
    }
}
