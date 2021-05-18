package co.com.sofka.automation.test.controller;

import co.com.sofka.automation.test.page.*;
import co.com.sofka.automation.test.utils.PurchaseLogic;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public class BCInventory {

    public static int seeProducts(WebDriver driver){
        InventoryPage inventoryPage = new InventoryPage(driver);
        return inventoryPage.getProducts().size();
    }

    public static void clickOnChoosedProductsToBuy(WebDriver driver, List<WebElement> selectedProducts){
        PurchaseLogic purchaseLogic = new PurchaseLogic();
        InventoryPage inventoryPage = new InventoryPage(driver);

        for (WebElement selectedProduct : selectedProducts){
            selectedProduct.click();
        }
    }

    public static void clickOnShoppingCart(WebDriver driver){
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.getShoppinCartContainer().click();
    }

    public static void clickOnCheckoutButton(WebDriver driver){
        CartContainerPage cartContainerPage = new CartContainerPage(driver);
        cartContainerPage.getBtnCheckOut().click();
    }

    public static void fillInformationForm(WebDriver driver){
        InformationToPayPage informationToPay = new InformationToPayPage(driver);
        Faker faker = Faker.instance(new Locale("es", "CO"), new SecureRandom());

        informationToPay.getTxtFirstName().sendKeys(faker.name().firstName());
        informationToPay.getTxtLastName().sendKeys(faker.name().lastName());
        informationToPay.getTxtPostalCode().sendKeys(faker.address().zipCode());
    }

    public static void clickOnContinueButton(WebDriver driver){
        InformationToPayPage informationToPay = new InformationToPayPage(driver);
        informationToPay.getBtnContinue().click();
    }

    public static void clickOnFinnishButton(WebDriver driver){
        CheckoutOverviewPage checkoutOverview = new CheckoutOverviewPage(driver);
        checkoutOverview.getBtnFinishPayment().click();
    }

    public static String orderConfirmed(WebDriver driver){
        CheckoutCompletePage checkoutComplete = new CheckoutCompletePage(driver);
        return checkoutComplete.getMsgPurchase().getText();
    }

    public static void scrollUp(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -3000)");
    }
}
