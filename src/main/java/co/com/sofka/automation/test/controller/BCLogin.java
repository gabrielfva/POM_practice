package co.com.sofka.automation.test.controller;

import co.com.sofka.automation.test.page.HomePage;
import co.com.sofka.automation.test.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class BCLogin {

    public static void openBrowser(String url, WebDriver driver){
        driver.get(url);
    }

    public static void login(WebDriver driver, String user, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getTxtUserName().sendKeys(user);
        loginPage.getTxtPassword().sendKeys(password);
        loginPage.getBtnLogin().click();
    }

    public static String getTitleHomePage(WebDriver driver){
        HomePage homePage = new HomePage(driver);
        return homePage.getProductsTitle().getText();
    }

    public static String getMessageBlockedUser(WebDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.getMsgBlockedUser().getText();
    }
}
