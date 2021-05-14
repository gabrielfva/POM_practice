package co.com.sofka.automation.test.controller;

import co.com.sofka.automation.test.page.InventoryPage;
import org.openqa.selenium.WebDriver;

public class BCInventory {

    public static int seeProducts(WebDriver driver){
        InventoryPage inventoryPage = new InventoryPage(driver);
        return inventoryPage.getProducts().size();
    }
}
