package co.com.sofka.automation.test.utils;

import co.com.sofka.automation.test.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PurchaseLogic {

    public static int foundElements(List<WebElement> products){
        return products.size();
    }

    public static int randomNumber(int size){
        int number;

        do{
            number = (int) (Math.random() * size);
        }while (number == 0);

        return number;
    }

    public static List<WebElement> chooseProducts(WebDriver driver){
        InventoryPage inventoryPage = new InventoryPage(driver);
        List<WebElement> products = inventoryPage.getProducts();
        int elementNumber = 0;
        int randomValue = 0;

        List<WebElement> selectedProducts = new ArrayList<>();

        elementNumber = randomNumber(products.size());

        for(int i = 0; i < elementNumber; i ++) {
            boolean foundProduct = false;

            randomValue = randomNumber(products.size());

            if(selectedProducts.isEmpty()){
                selectedProducts.add(products.get(randomValue));
                continue;
            }

            foundProduct = foundProduct(selectedProducts, products.get(randomValue));

            if (!foundProduct) {
                selectedProducts.add(products.get(randomValue));
            }
        }
        return selectedProducts;
    }

    public static boolean foundProduct (List<WebElement> selectedProducts, WebElement element){
        for (WebElement selectedProduct : selectedProducts) {
            if (selectedProduct == element) {
                return true;
            }
        }
        return false;
    }

    public double totalPrice (List<WebElement> webElementListPrices, WebElement taxes) {

        List<Double> doublePriceProduct = webElementsToDouble(webElementListPrices);
        double totalSum = 0;

        for (Double aDouble : doublePriceProduct) {
            totalSum += aDouble;
        }

        totalSum += taxesToDouble(taxes);

        return totalSum;
    }

    public List<Double> webElementsToDouble(List<WebElement> webElementListPrices) {

        WebElement element = null;
        List<Double> doublePriceProduct = new ArrayList<>();
        String value = "";

        for (WebElement webElementListPrice : webElementListPrices) {
            element = webElementListPrice;
            value = element.getText().replace("$", "");

            doublePriceProduct.add(Double.parseDouble(value));
        }
        return doublePriceProduct;
    }

    public double taxesToDouble(WebElement taxes){
        String value = "";

        value = taxes.getText().replace("Tax: $", "");

        return Double.parseDouble(value);
    }

    public double totalPriceToDouble(WebElement totalPrice){
        String stringTotalPrice = "";

        stringTotalPrice = totalPrice.getText().replace("Total: $", "");

        return Double.parseDouble(stringTotalPrice);
    }
}
