package co.com.sofka.automation.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.ID, using = "user-name")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.ID, using = "login-button")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//div[@class='error-message-container error']/h3")
    WebElement msgBlockedUser;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtUserName() {
        return txtUserName;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getMsgBlockedUser() {
        return msgBlockedUser;
    }
}
